package service;

import data.DbConnectorLogistic;
import entities.Item;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * Modul </br>
 *
 *<p>
 * Provides a Service similar to an ERP. Checkin/out of items, searching items and orders
 * are Part of this service.
 * Identifications are Codes from GS1, especially:
 * <ul>
 *     <li>Serial Shipping Container Code (SSCC)</li>
 *     <li>Global Shipment IDetification Number (GSIN)</li>
 *     <li>Global Location Number (GLN)</li>
 *     <li>Global Trade Item Number (GTIN)</li>
 * </ul>
 * More Information about GS1 Identifications can be found under <a href="http://www.gs1.org/barcodes/technical/id_keys">GS1 Identification Reference</a>.
 * </p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 29-11-2014
 */
@WebService()
public class SupplyChainService {

    DbConnectorLogistic connectorLogistic = new DbConnectorLogistic();


  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

    @WebMethod
    public WebServiceResult getCheckedInItems(String gln) {

        List<Item> checkedInItems = null;
        boolean resultState = false;
        ResultSet rs;

        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "SELECT GTIN,SerialNr,Lot,ExpiryDate,ScanDate FROM TrackedItems WHERE GLNscan = ? AND StateNr = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, gln);
            ps.setInt(2, 2);
            rs =  ps.executeQuery();

            checkedInItems = addTrackedItemsFromResult(rs);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (checkedInItems.size() > 0){
            resultState=true;
        }

        WebServiceResult webServiceResult = new WebServiceResult(checkedInItems, resultState);
        return webServiceResult;
    }

    /**
     * checkinItems
     *
     * @param items
     *  a List of items to checkin by the webservice
     * @param gln
     *  GLN of Station
     */
    @WebMethod
    public void checkinItems(List<Item> items, String gln) {
        // check for checked-in items
        WebServiceResult checkedInItemsResult = getCheckedInItems(gln);
        List<Item> removedItems = new ArrayList<Item>();
        // check if the request was successful
        if(checkedInItemsResult.isResult()){
            List<Item> checkedInItemsList = checkedInItemsResult.getItems();
            for(Item item:items){
                for(Item checkedInItem:checkedInItemsList){
                    // check for every item if it is already in the checked in list
                    if(item.getGTIN().equals(checkedInItem.getGTIN()) &&
                       item.getSerial().equals(checkedInItem.getSerial()) &&
                       item.getLot().equals(checkedInItem.getLot())){
                       // item already checked in, remove it from checkin list
                        removedItems.add(item);
                    }
                }
            }

            items.removeAll(removedItems);
        }


        //State 2: Arrived
        insertTrackingItems(items, gln, 2);
    }

    /**
     * checkoutItems
     *
     * @param items
     *  a List of items to checkout by the webservice
     * @param gln
     *  GLN of Station
     */
    @WebMethod
    public void checkoutItems(List<Item> items, String gln) {
        // check for checked-in items
        WebServiceResult checkedInItemsResult = getCheckedInItems(gln);
        // check if the request was successful
        if(checkedInItemsResult.isResult()){
            List<Item> checkedInItemsList = checkedInItemsResult.getItems();
            for(Item item:items){
                //Check if there are all neded properties filled in in both, else handle error

                for(Item checkedInItem:checkedInItemsList){
                    // check for every item if it is NOT already in the checked in list
                    if(item.getGTIN().equals(checkedInItem.getGTIN()) &&
                            item.getSerial().equals(checkedInItem.getSerial()) &&
                            item.getLot().equals(checkedInItem.getLot())){
                        // item not yet checked in, remove it from check out list

                        List<Item> anItem = new ArrayList<Item>();
                        anItem.add(item);
                        insertTrackingItems(anItem, gln, 3);
                    }
                }
            }

        }


    }

    public void insertTrackingItems(List<Item> items, String gln, Integer trackingState )
    {
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "INSERT INTO TrackedItems (GTIN, SerialNr, ExpiryDate, GLNscan, ScanDate, StateNr, ScannedSSCC,Lot) VALUES (?,?,?,?,?,?,?,?)";
            for (Item item : items) {
                //TODO: Inhalt überprüfen ob stimmt, gerade Datum schwierig, muss auch Zeitstempel beinhalten
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, item.getGTIN());
                ps.setString(2, item.getSerial());
                ps.setString(3, item.getExpiryDate());
                ps.setString(4, gln);
                GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("de-CH"));
                java.sql.Timestamp timestamp = new Timestamp(cal.getTimeInMillis());
                ps.setTimestamp(5, timestamp);
                ps.setInt(6, trackingState);
                ps.setString(7, null); //ScannedSSCC
                ps.setString(8, item.getLot());
                int i = ps.executeUpdate();
                System.out.println(i);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Gibt eine Liste von Items zurück,
     * welche sich in dem LogisticPackge oder den darin enthaltenen LogisticPackages befinden.
     *
     * @param sscc
     *  an SSCC for Search Items in
     * @return
     *  List of items in container with this sscc
     */
    @WebMethod
    public List<Item> getItemsBySSCC(String sscc) {
        List<Item> items;
        return getAllItemsBySSCC(sscc);

    }

    private List<Item> getAllItemsBySSCC(String sscc) {
        List<Item> items;

        /**
         * going level up searching for sscc first, looking after items contained in this sscc,
         * if no items found, go top down
         */

        //1.Case is LP containing Products, whe have reached the lowest, return them.
        items = getProductsBySCC(sscc);
        if (items.size() > 0) {
            return items;
        } else {
            //Is there any Logistic Package with this sscc?
            if (getLogisticePackageSSCC(sscc).equals("")) {
                //there is no such sscc, maybe wrong?
                //raise Exception which is handled or what to do?
                //throw new NoSuchSSCCFoundException();
            } else { //Its asscc but no items in ith, so probably third-stage upwards.
                //Gte all sscc which are contained in this one
                List<String> containedInSSCC = getLogisticePackagesContainedInSSCC(sscc);
                if (containedInSSCC.size() > 0) {
                    for (String s : containedInSSCC) {
                        items.addAll(getAllItemsBySSCC(s));
                        return items;
                    }
                }
            }
        }

        return items;
    }

    /**
     * Is there a logisticPackage with this sscc?
     * @param sscc
     * @return
     */
    private String getLogisticePackageSSCC(String sscc) {

        ArrayList<String> packages = new ArrayList<String>();

        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        String query = "SELECT SSCC FROM LogisticPackage WHERE SSCC = ?";
        System.out.println(query);
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, sscc);
            rs =  ps.executeQuery();
            //TODO: was passiert wenn keine Row gefunden?
            rs.next();
            String r = rs.getString("SSCC");
            if (!rs.wasNull()) {
                return r;
            } else {
                return "";
            }

        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
    }

    /**
     *
     * @param containedInSSCC
     *  SSCC where may other SSCC are contained
     * @return
     *  list of Strings with SSCC's which are contained in containedInSCC
     */
    private List<String> getLogisticePackagesContainedInSSCC(String containedInSSCC) {
        ArrayList<String> packages = new ArrayList<String>();

        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        String query = "SELECT SSCC,ContainedInSSCC FROM LogisticPackage WHERE ContainedInSSCC = ?";
        System.out.println(query);
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, containedInSSCC);
            rs =  ps.executeQuery();

            while (rs.next()) {
                //Is there another LogisitcPackage contained?
                String r = rs.getString("SSCC");
                if (!rs.wasNull()) {
                    packages.add(r);
                }
            }

            return packages;
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
    }

    /**
     *
     * @param sscc
     * @return
     *  a List with Items Contained in this LogisitcPackge, empty List provided if no
     *  Products are contained, but maybe another logisticUnit
     */
    private List<Item> getProductsBySCC(String sscc) {
        List<Item> items =  null;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "SELECT GTINsek, SerialNr, BatchLot, ExpiryDate FROM SecondaryPackage WHERE SSCC = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, sscc);
            rs =  ps.executeQuery();

            items = addItemsFromResult(rs);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return items;
    }

    private List<Item> addItemsFromResult(ResultSet rs) throws SQLException {
        List<Item> items = new ArrayList<Item>();
        while (rs.next()) {
            Item item = new Item();
            item.setGTIN(rs.getString(1));
            item.setSerial(rs.getString(2));
            item.setLot(rs.getString(3));
            item.setExpiryDate(rs.getDate(4, new GregorianCalendar()).toString());
            items.add(item);
        }
        return items;
    }

    private List<Item> addTrackedItemsFromResult(ResultSet rs) throws SQLException {
        List<Item> items = new ArrayList<Item>();
        while (rs.next()) {
            Item item = new Item();
            item.setGTIN(rs.getString(1));
            item.setSerial(rs.getString(2));
            item.setLot(rs.getString(3));
            item.setExpiryDate(rs.getDate(4, new GregorianCalendar()).toString());
            item.setCheckInDate(rs.getDate(5, new GregorianCalendar()).toString());
            items.add(item);
        }
        return items;
    }


    /**
     * Gets an Item with corresponding GTIN and Serial Number
     *
     * @param gtin
     *  gtin to get item
     * @param serialNumber
     *  serialnumber of item
     * @return a Single Item - as identifiers should be unique
     */
    @WebMethod
    public Item getItemByIdentifier(String gtin, String serialNumber) { //noch lot + expiry date hinzufügen
        List<Item> items = null;
        ResultSet rs;

        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "SELECT GTINsek, SerialNr, BatchLot, ExpiryDate FROM SecondaryPackage WHERE GTINsek = ? AND SerialNr = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, gtin);
            ps.setString(2, serialNumber);
            rs =  ps.executeQuery();

            items = addItemsFromResult(rs);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (items == null) {
            //ERROR
            return null;
        } else if (items.size() > 1){
            //ERROR
            return null;
        } else if(items.size() == 1) {
            return items.get(0);
        } else {
            //ERROR
            return null;
        }
    }

    /**
     * Gets all trade items with a specific batch and expiry date
  (/Dm¨1)01=7680475040157)17=151231)10=ABCDEF123456)21=35722388370DBCDEF
     *
     * @param gtin
     *  gtin to get item
     * @param batchLot
     *  batchlot
     * @param expiryDate
     *  expiryDate
     * @return Items in this Batch
     */
    @WebMethod
    public List<Item> getItemsByBatch(String gtin, String batchLot, java.util.Date expiryDate) {
        List<Item> items =  null;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "SELECT GTINsek, SerialNr, BatchLot, ExpiryDate FROM SecondaryPackage WHERE gtinsek = ? AND BatchLot=? AND ExpiryDate=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, gtin);
            ps.setString(2, batchLot);
            ps.setDate(3, new Date(expiryDate.getTime()));
            rs =  ps.executeQuery();

            items = addItemsFromResult(rs);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return items;
    }

    /**
     * Looks for an order which hold a specific sscc
     *
     * @param sscc
     *  sscc to look to which order it belongs
     * @return
     *  String with order number
     */
    @WebMethod
    public String getOrderForSSCC(String sscc) {

        String order;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {

            /**
             * Nochmals überlegen = Wie kommen die Informationen in die DB???
             * Was ist auf dem elektronischen Lieferein was anschliessend übernommen werden kann?
             *
             *
             * SSCC suchen =>Order
             * ev falls order / shiptmentid nicht redundant
             *
             */

            String count = "SELECT Count(*) as Anzahl FROM LogisticPackage WHERE SSCC = ? OR ContainedInSSCC=?";

            PreparedStatement ps = connection.prepareStatement(count);
            ps.setString(1, sscc);
            ps.setString(2, sscc);
            rs =  ps.executeQuery();
            final ResultSetMetaData metaData = rs.getMetaData();
            System.out.println("Column Count: " + metaData.getColumnCount() + metaData.getColumnName(1));
            rs.next();
            int rows = rs.getInt("Anzahl");

            String query = "SELECT ShipmentIdGSIN,OrderNr FROM LogisticPackage WHERE SSCC = ?";
             ps = connection.prepareStatement(query);
            ps.setString(1, sscc);
            rs =  ps.executeQuery();

            if (rows == 1) {
                rs.next();
            } else {
                //ERROR ...or no Entry
                System.out.println("No Entry for SSCC " + sscc + "Row count: " + rows);
                return null;
            }

            if (rs.getFetchSize() == 1) {
                order = rs.getBigDecimal(1).toString();
            } else {
                //ERROR ...
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static void main(String[] argv) {
    Object implementor = new SupplyChainService();


    String address = "http://localhost:9000/SupplyChainService";
    Endpoint.publish(address, implementor);

    }
}
