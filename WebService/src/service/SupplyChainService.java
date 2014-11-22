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

/**
 * Created by Johannes on 17.11.14.
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
        //State 3: Processed
        System.out.println(items.toArray() + " " + gln);
        insertTrackingItems(items, gln, 3);
    }

    public void insertTrackingItems(List<Item> items, String gln, Integer trackingState )
    {
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "INSERT INTO TrackedItems (GTIN, SerialNr, ExpiryDate, GLNscan, Date, StateNr) VALUES (?,?,?,?,?,?)";
            for (Item item : items) {
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, item.getGTIN());
                ps.setString(2, item.getSerial());
                ps.setString(3, item.getExpiryDate());
                ps.setString(4, gln);
                ps.setDate(5, new Date(new java.util.Date().getTime()));
                ps.setInt(6, trackingState);
                ps.executeQuery();
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
     * getItemsBySSCC
     *
     * @param sscc
     *  an SSCC for Search Items in
     * @return
     *  List of items in container with this sscc
     */
    @WebMethod
    public List<Item> getItemsBySSCC(String sscc) {

        //LogisticPackage  => SSCC ?
        /**
         * Contained SSCC?
         */
        String ssccSecPack = getSSCCcontainingSecondaryPackage(sscc);

        List<Item> items =  null;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "SELECT GTINsek, SerialNr, BatchLot, ExpiryDate FROM SecondaryPackage WHERE SSCC = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, ssccSecPack);
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

    private String getSSCCcontainingSecondaryPackage(String sscc) {
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        String count = "SELECT Count(*) as 'Anzahl' FROM LogisticPackage WHERE SSCC = ? OR ContainedSSCC=?";
        System.out.println(count);
        String query = "SELECT SSCC,ContainedSSCC FROM LogisticPackage WHERE SSCC = ? OR ContainedSSCC=?";
        System.out.println(query);
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(count);
            ps.setString(1, sscc);
            ps.setString(2, sscc);
            rs =  ps.executeQuery();
            final ResultSetMetaData metaData = rs.getMetaData();
            System.out.println("Column Count: " + metaData.getColumnCount() + metaData.getColumnName(1));
            rs.next();
            int rows = rs.getInt("Anzahl");

            ps = connection.prepareStatement(query);

            ps.setString(1, sscc);
            ps.setString(2, sscc);
            rs =  ps.executeQuery();


            if (rows == 1) {
                rs.next();
                //Is there another LogisitcPackage contained?
                String r = rs.getString("SSCC");
               if (rs.wasNull()) {
                   return getSSCCcontainingSecondaryPackage(rs.getString("ContainedSSCC"));
               } else { //If SSCC probably contains Items, return
                   return r;
               }
            } else {
                //ERROR ...or no Entry
                System.out.println("No Entry for SSCC " + sscc + "Row count: " + rows);
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
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


    /**
     * getItemByIdentifier
     * @param gtin
     *  gtin to get item
     * @param serialNumber
     *  serialnumber of items
     * @return a Single Item
     */
    @WebMethod
    public Item getItemByIdentifier(String gtin, String serialNumber) {
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
        } else {
            return items.get(0);
        }
    }

    /**
     * getItemsByBatch
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
     *
     * @param sscc
     *  sscc to look for an order
     * @return
     *  String with order number
     */
    @WebMethod
    public String getOrderForSSCC(String sscc) {

        String order;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "SELECT ShipmentId,OrderNr FROM LogisticPackage WHERE SSCC = ? OR ContainedSSCC=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, sscc);
            ps.setString(2, sscc);
            rs =  ps.executeQuery();

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

    //TODO wenn möglich
    /**
     * Auflisten von Eingechekten items
     *
     */

    public static void main(String[] argv) {
    Object implementor = new SupplyChainService();


    String address = "http://localhost:9000/SupplyChainService";
    Endpoint.publish(address, implementor);

    }
}
