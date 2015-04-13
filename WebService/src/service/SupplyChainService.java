package service;

import data.DbConnectorLogistic;
import entities.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.intellij.lang.annotations.Language;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
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
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 06-04-2015
 */
@WebService()
public class SupplyChainService {

    DbConnectorLogistic connectorLogistic = new DbConnectorLogistic();


  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
      return result;
  }
    /**
     *  Returns a WebServiceResult object with a boolean and a list of all checked in items of a specific global location number (GLN).
     *  @param gln A Global Location Number (String)
     *  @return a WebServiceResult
     */
    @WebMethod
    public WebServiceResult getCheckedInItems(String gln) {

        List<Item> checkedInItems = null;
        boolean resultState = false;
        ResultSet rs;

        Connection connection = connectorLogistic.getConnection();

        try {
            @Language("DB2")
            String query = "SELECT i.GTIN,i.SerialNr,i.Lot,i.ExpiryDate,i.ScanDate, i.StateNr FROM TrackedItems i \n" +
                    "where not exists\n" +
                    "(\n" +
                    "Select i.GTIN From TrackedItems o\n" +
                    "where i.GTIN = o.GTIN and i.SerialNr = o.SerialNr and i.Lot = o.Lot and i.ExpiryDate = o.ExpiryDate and GLNscan = ? and StateNr = 3\n" +
                    ") and GLNscan = ? AND StateNr = ?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, gln);
            ps.setString(2, gln);
            ps.setInt(3, 2);
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
     *  Returns a WebServiceResult object with a boolean and a list of all checked in items of a specific global shipment identification number (GSIN).
     *  @param gsin A Global Shipment Identification Number (String)
     *  @return a WebServiceResult
     */
    @WebMethod
    public WebServiceResult getItemsByGSIN(String gsin) {

        List<Item> items = null;
        boolean resultState = false;
        ResultSet rs;

        Connection connection = connectorLogistic.getConnection();

        try {
            @Language("DB2")
            String query = "SELECT [GTINsek]\n" +
                    "      ,[SerialNr]\n" +
                    "      ,[BatchLot]\n" +
                    "      ,[ExpiryDate]\n" +
                    "      ,[GTINtert]\n" +
                    "      ,[LogisticPackage].[SSCC]\n" +
                    "FROM [dbo].[LogisticPackage] INNER JOIN [dbo].[SecondaryPackage] on\n" +
                    " [dbo].[LogisticPackage].SSCC=[dbo].[SecondaryPackage].SSCC\n" +
                    "WHERE ShipmentIdGSIN=?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, gsin);
            rs =  ps.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setGTIN(rs.getString(1));
                item.setSerial(rs.getString(2));
                item.setLot(rs.getString(3));
                item.setExpiryDate(rs.getDate(4, new GregorianCalendar()).toString());
                items.add(item);
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

        if (items.size() > 0){
            resultState=true;
        }

        WebServiceResult webServiceResult = new WebServiceResult(items, resultState);
        return webServiceResult;
    }

    /**
     * checkinItems
     *  @param items
     *  a List of items to checkin by the webservice
     * @param gln
     */
    @WebMethod
    public WebServiceResult checkinItems(List<Item> items, String gln) {
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


        //MedicationState 2: Arrived
        insertTrackingItems(items, gln, 2);
        return new WebServiceResult(removedItems,true);
    }

    /**
     * setOrder
     *  @param order
     *  An order to be created in the database.
     *  @param glnOrd
     *  GLN of the initiating location.
     *  @param glnDest
     *  GLN of the destination.
     */
    @WebMethod
    public boolean setOrder(Order order, String glnOrd,String glnDest) {
        boolean success=false;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            // get the identifier of the latest order entry in the database
            @Language("DB2")
            String query = "SELECT TOP 1 [OrderNr]\n" +
                    "  FROM [dbo].[Order]\n" +
                    "  ORDER BY OrderNr\n" +
                    "  DESC";

            PreparedStatement ps = connection.prepareStatement(query);
            rs =  ps.executeQuery();
            rs.next();
            int lastIndex = (int)(long)(Long)rs.getObject(1);

            // make a new order entry in the database at position lastindex + 1
            query = "INSERT INTO [dbo].[Order]\n" +
                    "           ([OrderNr]\n" +
                    "           ,[StateNr]\n" +
                    "           ,[GLNorderer]\n" +
                    "           ,[GLNdest]\n" +
                    "           ,[OrderDate])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,1\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)";
            ps = connection.prepareStatement(query);
            ps.setInt(1,lastIndex+1);
            ps.setString(2,glnOrd);
            ps.setString(3,glnDest);
            GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("de-CH"));
            java.sql.Timestamp timestamp = new Timestamp(cal.getTimeInMillis());
            ps.setTimestamp(4, timestamp);
            int update =  ps.executeUpdate();
            // fill all positions of the given order in the positions table
            query = "INSERT INTO [dbo].[Positions]\n" +
                    "           ([OrderNr]\n" +
                    "           ,[GTIN]\n" +
                    "           ,[Description]\n" +
                    "           ,[Quantity])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)";
            int answer=0;
            for(Position pos:order.getPositions()){
                ps = connection.prepareStatement(query);
                ps.setInt(1,lastIndex+1);
                ps.setString(2,pos.getGtin());
                ps.setString(3,pos.getDescription());
                ps.setInt(4,pos.getQuantity());

                answer =  ps.executeUpdate();
            }
            if(update==1&&answer==1){
                success=true;
            }else{success=false;}

        } catch (SQLException e) {
            e.printStackTrace();
            success = false;
            return success;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return success;
    }

    /**
     * checkoutItems
     *  @param items
     *  a List of items to checkout by the webservice
     * @param gln
     */
    @WebMethod
    public WebServiceResult checkoutItems(List<Item> items, String gln) {
        List<Item> notCheckedInItems= new ArrayList<Item>();
        // check for checked-in items
        WebServiceResult checkedInItemsResult = getCheckedInItems(gln);
        // check if the request was successful

        if(checkedInItemsResult.isResult()){
            List<Item> checkedInItemsList = checkedInItemsResult.getItems();

            List<Item> foundCheckedIn = new ArrayList<Item>();

            for(Item item:items){
                //Check if there are all neded properties filled in in both, else handle error

                for(Item checkedInItem:checkedInItemsList){
                    // check for every item if it is  already in the checked in list
                    if(item.getGTIN().equals(checkedInItem.getGTIN()) &&
                            item.getSerial().equals(checkedInItem.getSerial()) &&
                            item.getLot().equals(checkedInItem.getLot())){
                        // item checked in, ready to be checked out
                        foundCheckedIn.add(item);

                    }
                }
            }
            insertTrackingItems(foundCheckedIn, gln, 3);
            items.removeAll(foundCheckedIn);


        }
        return new WebServiceResult(items, true);


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
     * Returns a list of items referring to a SSCC.
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

    /**
     * Processes a given order and generates all identifiers for the
     * positions specified in the order.
     *
     * @param order
     *  an order to be processed
     * @param glnMan
     *  global location number of the manufacturer
     * @param glnStation
     *  global location number of the orderer
     * @return
     *  a boolean. (success=1)
     */
    @WebMethod
    public Production processOrder(Order order,String glnMan, String glnStation) {
        List<Item> items = new ArrayList<Item>();
        Production production = new Production();
        // extract digits from order name to get the order number
        String orderNr = order.getName().replaceAll("\\D+", "");


        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            insertShipment(Integer.parseInt(orderNr),glnStation,glnMan);
            // get the shipment identifier of the latest order entry in the database
            @Language("DB2")
            String query = "SELECT TOP 1 [ShipmentIdGSIN]\n" +
                    "  FROM [dbo].[Shipment]\n" +
                    "  ORDER BY ShipmentIdGSIN DESC";

            PreparedStatement ps = connection.prepareStatement(query);
            rs =  ps.executeQuery();
            rs.next();
            int lastShipmentId = (int)(long)(Long)rs.getObject(1);
            items=insertLogisticPackage(order,lastShipmentId, Integer.parseInt(orderNr));
        } catch (SQLException e) {
            e.printStackTrace();
            production.setSuccess(false);
            return production;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                production.setSuccess(false);
                return production;
            }
        }
// set order state to 3 (processed)
        setOrderState(orderNr,3);
        // build production output object
        production.setPositions(order.getPositions());
        production.setItems(items);
        production.setShipment(getProductionData(orderNr));
        production.setSuccess(true);
        return production;
    }

    private void insertShipment(int orderNr, String glnDest, String glnSender)
    {
        Connection connection = connectorLogistic.getConnection();

        try {
            // insert a new shipment in the table
            @Language("DB2")
            String query = "INSERT INTO [dbo].[Shipment]\n" +
                    "           ([OrderNr]\n" +
                    "           ,[GLNdest]\n" +
                    "           ,[GLNsender])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?)";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,orderNr);
            ps.setString(2, glnDest);
            ps.setString(3,glnSender);
            int success =  ps.executeUpdate();

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
    private List<Item> insertLogisticPackage(Order order,int shipmentID, int orderNr)
    {
        List<Item> items = new ArrayList<Item>();
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
             // get the identifier of the latest order entry in the database
            @Language("DB2")
            String query = "SELECT TOP 1 [SSCC]\n" +
                    "  FROM [SupplyChainLogistic].[dbo].[LogisticPackage] \n" +
                    "  ORDER BY SSCC DESC";

            PreparedStatement ps = connection.prepareStatement(query);
            rs =  ps.executeQuery();
            rs.next();
            long lastSSCC = Long.parseLong((String) rs.getObject(1));

            query = "INSERT INTO [dbo].[LogisticPackage]\n" +
                    "           ([SSCC]\n" +
                    "           ,[ShipmentIdGSIN]\n" +
                    "           ,[OrderNr]\n" +
                    "           ,[ContainedInSSCC])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,null)";

            ps = connection.prepareStatement(query);
            ps.setString(1, Long.toString(lastSSCC + 1));
            ps.setInt(2, shipmentID);
            ps.setInt(3, orderNr);
            int success =  ps.executeUpdate();
            items=insertSecondaryPackagesFromOrder(order,Long.toString(lastSSCC+1));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        return items;

    }
    private void setOrderState(String orderNr, int state)
    {
        Connection connection = connectorLogistic.getConnection();
        try {
            // update the order to state 3
            @Language("DB2")
            String query = "UPDATE [dbo].[Order]\n" +
                    "   SET [StateNr] = ?\n" +
                    " WHERE OrderNr=?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, state);
            ps.setInt(2, Integer.parseInt(orderNr));
            int success =  ps.executeUpdate();

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
    private List<Item> insertSecondaryPackagesFromOrder(Order order, String sscc)
    {
        Connection connection = connectorLogistic.getConnection();
        List<Item> items = new ArrayList<Item>();

        try {
            // get the identifier of the latest order entry in the database
            String batch = getBatch();
            Timestamp expdate = getExpDate();
            for(Position pos:order.getPositions()){
                for(int i= 0;i<pos.getQuantity();i++){
                    Item item = new Item();
                    @Language("DB2")
                    String query = "INSERT INTO [dbo].[SecondaryPackage]\n" +
                            "           ([GTINsek]\n" +
                            "           ,[SerialNr]\n" +
                            "           ,[BatchLot]\n" +
                            "           ,[ExpiryDate]\n" +
                            "           ,[GTINtert]\n" +
                            "           ,[SSCC])\n" +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,null\n" +
                            "           ,?)";
                    PreparedStatement ps = connection.prepareStatement(query);
                    ps.setString(1,pos.getGtin());
                    String serial = getSerial(batch,i+1);
                    ps.setString(2,serial);
                    ps.setString(3,batch);
                    ps.setTimestamp(4,expdate);
                    ps.setString(5,sscc);
                    item.setGTIN(pos.getGtin());
                    item.setSerial(serial);
                    item.setLot(batch);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyy");
                    String expDate  = dateFormat.format(expdate);
                    item.setExpiryDate(expDate);
                    item.setBeschreibung(pos.getDescription());
                    items.add(item);
                    int success =  ps.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        return items;
    }

    private String getBatch(){ //Beutel 9stellig
        java.util.Date date = new java.util.Date();
        DateFormat formatter = new SimpleDateFormat("ddMMyyHHm");
        return formatter.format(date);
    }
    private String getSerial(String batch, int objectNumber){ //17 stellig
        String serial = Integer.toString(objectNumber);
        while(serial.length()<8){
            serial = "0" + serial;
        }
        return batch+serial;
    }
    private Timestamp getExpDate(){
        GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("de-CH"));
        cal.add((GregorianCalendar.YEAR), 1);
        java.sql.Timestamp timestamp = new Timestamp(cal.getTimeInMillis());
        return timestamp;
    }



    /**
     * Returns a list of quantity objects.
     *
     * @param gln
     *  a global location number
     * @return
     *  List of quantity objects
     */
    @WebMethod
    public List<Quantity> getQuantities(String gln) {
        List<Quantity> quantities=new ArrayList<Quantity>();

        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            @Language("DB2")
            String query = "SELECT [GTIN]\n" +
                    "      ,[Description]\n" +
                    "      ,[MinQuantity]\n" +
                    "      ,[OptQuantity]\n" +
                    "  FROM [dbo].[StockQuantities]\n" +
                    "  WHERE [GLN] = ?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, gln);
            rs =  ps.executeQuery();

            while(rs.next()){
                quantities.add(new Quantity(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
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
        return quantities;
    }

    /**
     * Returns a list of quantity objects.
     *
     * @param orderNumber
     *  a valid order number
     * @return
     *  a production object
     */
    private Shipment getProductionData(String orderNumber) {
        Shipment shipment = new Shipment();

        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            @Language("DB2")
            String query = "SELECT a.[GLNdest]\n" +
                    "\t  ,d1.Name as 'DescDest'\n" +
                    "      ,a.[GLNsender]\n" +
                    "\t  ,d2.Name as 'DescSend'\n" +
                    "\t  ,p.SSCC\n,p.ShipmentIdGSIN\n" +
                    "  FROM [dbo].[Shipment] a\n" +
                    "  INNER JOIN LogisticPackage p On \n" +
                    "  p.OrderNr=a.OrderNr and \n" +
                    "  a.ShipmentIdGSIN = p.ShipmentIdGSIN\n" +
                    "  inner join [dbo].[Location] d1 on d1.GLN = a.GLNdest\n" +
                    "  inner join [dbo].[Location] d2 on d2.GLN = a.GLNsender\n" +
                    "Where p.OrderNr = ?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,Integer.parseInt(orderNumber));
            rs =  ps.executeQuery();
            rs.next();
            shipment.setOrderNr(orderNumber);
            shipment.setGlnDestination(rs.getString(1));
            shipment.setDescDestination(rs.getString(2));
            shipment.setGlnOrigin(rs.getString(3));
            shipment.setDescOrigin(rs.getString(4));
            shipment.setSscc(rs.getString(5));
            shipment.setGsin(Integer.toString((int)(long)(Long)rs.getObject(6)));

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
        return shipment;
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
     * returns a list of order objects for the specified gln with state 1
     * @param gln
     * a global location number
     * @return list of orders
     */
    @WebMethod
    public List<Order> getOpenOrdersByGLN(String gln) {

        List<Order> orders = new ArrayList();

        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        String query = "SELECT [Order].[OrderNr]\n" +
                "      ,[StateNr]\n" +
                "      ,[GLNorderer]\n" +
                "      ,[GLNdest]\n" +
                "\t  ,[GTIN]\n" +
                "\t  ,[Description]\n" +
                "\t  ,[Quantity]\n" +
                "  FROM [dbo].[Order] INNER JOIN [dbo].[Positions] on [dbo].[Order].OrderNr=[dbo].[Positions].OrderNr\n" +
                "  WHERE [dbo].[Order].GLNdest = ? AND [dbo].[Order].StateNr = 1\n" +
                "  ORDER BY [Order].[OrderNr] ASC";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, gln);
            rs =  ps.executeQuery();
            Order order = new Order("",null,false);
            while(rs.next()){
                String orderNr = Integer.toString((int) (long) (Long) rs.getObject(1));
                if(!order.getName().equals(orderNr)){
                    orders.add(order);
                    ObservableList<Position> positions = FXCollections.observableArrayList();
                    order = new Order("",positions,false);
                    order.setName(Integer.toString((int) (long) (Long) rs.getObject(1)));
                }
                order.getPositions().add(new Position(rs.getString(5),rs.getString(6),rs.getInt(7)));
            }
            orders.add(order);
            orders.remove(0);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return orders;
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

    /**
     * Resets the TrackedItems table.
     */
    @WebMethod
    public void resetTrackedItems() {
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "truncate table TrackedItems" +
                    " INSERT INTO [dbo].[TrackedItems]\n" +
                    "           ([GTIN]\n" +
                    "           ,[SerialNr]\n" +
                    "           ,[ExpiryDate]\n" +
                    "           ,[GLNscan]\n" +
                    "           ,[ScanDate]\n" +
                    "           ,[StateNr]\n" +
                    "           ,[ScannedSSCC]\n" +
                    "           ,[Lot])\n" +
                    "     VALUES\n" +
                    "           ('7680475040157'\n" +
                    "           ,'35722388370ABCDEF'\n" +
                    "           ,convert(datetime,'31-12-15 00:00:00 AM',5)\n" +
                    "           ,'7601001010703',\n" +
                    "           convert(datetime,'1-1-15 05:40:00 PM',5)\n" +
                    "           ,3\n" +
                    "           ,NULL\n" +
                    "           ,'ABCDEF123456'), --2. Item\n" +
                    "('7680475040157'\n" +
                    ",'35722388370BBCDEF'\n" +
                    ",convert(datetime,'31-12-15 00:00:00 AM',5)\n" +
                    ",'7601001010703'\n" +
                    ",convert(datetime,'1-1-15 05:40:00 PM',5)\n" +
                    ",3\n" +
                    ",NULL\n" +
                    ",'ABCDEF123456'),   --3. Item\n" +
                    "('7680475040157'\n" +
                    ",'35722388370CBCDEF'\n" +
                    ",convert(datetime,'31-12-15 00:00:00 AM',5)\n" +
                    ",'7601001010703'\n" +
                    ",convert(datetime,'1-1-15 05:40:00 PM',5)\n" +
                    ",3\n" +
                    ",NULL\n" +
                    ",'ABCDEF123456'),  --4. Item\n" +
                    "('7680475040157'\n" +
                    ",'35722388370DBCDEF'\n" +
                    ",convert(datetime,'31-12-15 00:00:00 AM',5)\n" +
                    ",'7601001010703'\n" +
                    ",convert(datetime,'1-1-15 05:40:00 PM',5)\n" +
                    ",3\n" +
                    ",NULL\n" +
                    ",'ABCDEF123456')\n";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.executeUpdate();
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

    public String getProductForSecondaryPackage(String secondaryGTIN) {



        return "";
    }

    /**
     * A list of all Station available for the Hospital.
     * @return a Collection of Stations
     */
    @WebMethod
    public List<Station> getStations() {
        List<Station> stations = null;

        return stations;
    }

    /**
     * A list of all Patients for the Hospital
     * @return a Collection of Patients
     */
    @WebMethod
    public List<TrspPatient> getPatients() {
        List<TrspPatient> trspPatients = null;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "SELECT PolyPointPID,UUID,Name, FirstName,Birthdate,Gender,Station From MediPrep_Patients";
            PreparedStatement ps = connection.prepareStatement(query);
            rs =  ps.executeQuery();

            trspPatients = getPatientsFromResult(rs);

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

        return trspPatients;
    }

    private List<TrspPatient> getPatientsFromResult(ResultSet rs) throws SQLException {
        int index = 1;
        List<TrspPatient> trspPatients = new ArrayList<>();

        while (rs.next()) {
            TrspPatient p = new TrspPatient();
            p.setPid(rs.getInt(1));
            p.setBeaconID(rs.getString(2));
            p.setLastname(rs.getString(3));
            p.setFirstname(rs.getString(4));
            p.setBirthDate(rs.getDate(5).toLocalDate());

            String gender = rs.getString(6);
            switch (gender) {
                case "m":
                    p.setGender(TrspPatient.Gender.male);
                    break;
                case "f":
                    p.setGender(TrspPatient.Gender.female);
                    break;
                default:
                    p.setGender(TrspPatient.Gender.undefined);
            }
            p.setStationName(rs.getString(7));

            /* Fake other items not in db*/
            p.setRoom("Zi 20" + index);
            p.setFid(index);
            p.setBloodGroup(TrspPatient.BloodGroup.Apositive);
            p.setReaState(false);

            index++;

            trspPatients.add(p);
        }

        return trspPatients;
    }

    /**
     * Returns the TrspPatient for given UUID
     * @return a  TrspPatient
     */
    @WebMethod
    public TrspPatient getPatientByMinorId(String minorid) {
        List<TrspPatient> trspPatients = null;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            String query = "SELECT PolyPointPID,UUID,Name, FirstName,Birthdate,Gender,Station From MediPrep_Patients WHERE UUID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, minorid);
            rs =  ps.executeQuery();

            trspPatients = getPatientsFromResult(rs);

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

        if( trspPatients.size() > 2 || trspPatients.size() == 0) {
            System.out.println("There have been more than one patient with UUID " + minorid);
            return null;
        } else {
            return trspPatients.get(0);
        }
    }

    @WebMethod
    public TrspPatient getPatientByPid(String pid) {
        return null;
    }

    @WebMethod
    public List<TrspPrescription> getPrescriptionsForPatient(String pid) {

        //All trspPrescriptions where state is open, paused, doseChanged
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        List<TrspPrescription> trspPrescriptions = new ArrayList<TrspPrescription>();

        try {
            String query =
                    "SELECT p.PolypointID, PatientPolypointID, DateCreated, State, CreatedByStaffGLN, \n" +
                        "Name, FirstName, Position, Description, Schedule, RouteOfAdministration " +
                    "FROM MediPrep_Prescription p \n" +
                    "LEFT JOIN MediPrep_Staff  s\n" +
                        "ON s.GLN = p.CreatedByStaffGLN  \n" +
                    "WHERE PatientPolypointID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(pid));
            rs =  ps.executeQuery();

            trspPrescriptions = getPrescriptionFromResult(rs);


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

        return trspPrescriptions;
    }

    private List<TrspPrescription> getPrescriptionFromResult(ResultSet rs) throws SQLException {
        List<TrspPrescription> trspPrescriptions = new ArrayList<TrspPrescription>();
        while (rs.next()) {
            TrspPrescription p = new TrspPrescription();

            p.setPolypointID(rs.getString(1));
            p.setPatientPolypointID(rs.getString(2));
            p.setDateCreated(rs.getDate(3).toLocalDate());
            p.setCreatedByStaffGLN(rs.getString(4));
            p.setName(rs.getString(5));
            p.setFirstName(rs.getString(6));
            p.setPosition(rs.getString(7));
            p.setDescription(rs.getString(8));
            p.setSchedule(rs.getString(9));
            p.setRouteOfAdministration(rs.getString(10));
            p.setMedications(getPreparedMedicationsForPrescription(p));

            trspPrescriptions.add(p);
        }
        return trspPrescriptions;
    }

    private List<TrspPreparedMedication> getPreparedMedicationsForPrescription(TrspPrescription p) {
        List<TrspPreparedMedication> medications = new ArrayList<TrspPreparedMedication>();

        //All prescriptions where state is open, paused, doseChanged
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {
            String query =
                    "SELECT\n" +
                            "  GTIN,\n" +
                            "  Name,\n" +
                            "  Pharmacode,\n" +
                            "  PrescriptionID,\n" +
                            "  Dosage,\n" +
                            "  DosageUnit,\n" +
                            "  State,\n" +
                            "  TimePrepared,\n" +
                            "  sp.GTINSek,\n" +
                            "  sp.SerialNr,\n" +
                            "  sp.ExpiryDate,\n" +
                            "  sp.BatchLot,\n" +
                            "  StaffGLN\n" +
                            "FROM MediPrep_PrescriptionDefinesMedication pdm\n" +
                            "LEFT JOIN Product p\n" +
                            "  ON GTINprim = GTIN\n" +
                            "Left JOIN MediPrep_PreparedMedication pm\n" +
                            " ON pm.UID = pdm.PreparedMedicationUID\n" +
                            "Left JOIN SecondaryPackage sp\n" +
                            " ON sp.GTINsek = pm.GTINSek AND sp.SerialNr = pm.SerialNr AND sp.ExpiryDate = pm.ExpiryDate\n" +
                            "WHERE PrescriptionID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, p.getPolypointID());
            rs =  ps.executeQuery();

            //TODO: Pattern für encapsulated Base Class (zuerst Basisklasse TrspMedication nutzen und dann beim vorbereiten der Medis auf die erweiterte Klasse TrspPreparedMedication wechseln) => nur falls sinnvoll
            medications = getMedicationFromResult(rs);

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

        return medications;

    }

    private List<TrspPreparedMedication> getMedicationFromResult(ResultSet rs) throws SQLException {
        List<TrspPreparedMedication> trspPreparedMedications = new ArrayList<>();

        while (rs.next()) {
            TrspPreparedMedication trspPreparedMedication = new TrspPreparedMedication();

            trspPreparedMedication.setGtin(rs.getString(1));
            trspPreparedMedication.setName(rs.getString(2));
            trspPreparedMedication.setDosage(rs.getString(3));
            trspPreparedMedication.setApplicationScheme("??");
            trspPreparedMedication.setDosageUnit(rs.getString(4));

            LocalDate localDate = this.getDateValue(rs,8);
            if (localDate != null) {
                LocalDateTime localDateTime = localDate.atTime(this.getTimeValue(rs, 8));
                trspPreparedMedication.setPreparationTime(localDateTime);
            }

            trspPreparedMedication.setSerial(rs.getString(10));
            trspPreparedMedication.setExpiryDate(rs.getString(11));
            trspPreparedMedication.setBatchLot(rs.getString(12));
            trspPreparedMedication.setStaffGln(rs.getString(13));

            trspPreparedMedications.add(trspPreparedMedication);
        }
        return trspPreparedMedications;
    }

    private String getStringValue(ResultSet rs, int index) throws SQLException {
        String col = rs.getString(index);
        if (rs.wasNull()) {
            return "";
        } else {
            return col;
        }
    }

    private LocalDate getDateValue(ResultSet rs, int index) throws SQLException {
        Date col = rs.getDate(index);
        if (rs.wasNull()) {
            return null;
        } else {
            return col.toLocalDate();
        }
    }

    private LocalTime getTimeValue(ResultSet rs, int index) throws SQLException {
        Time col = rs.getTime(index);
        if (rs.wasNull()) {
            return null;
        } else {
            return col.toLocalTime();
        }
    }


    @WebMethod
    public List<TrspPrescription> getPrescriptionsWithPreparedMedicationsForPatient(String pid) {
        List<TrspPrescription> trspPrescriptions = new ArrayList<TrspPrescription>();

        //Alle trspPrescriptions wo schedule für aktuelle Zeit => join mit allen vorbereiteneten und produkt columns nötig für matchen
        //für jede trspPrescriptions
        //Fall 1: ein medi: scanned code als gtin eines scanned items mit gtin vergleichen, falls nicht => ev. fall 2
        //Fall 2: x-Medis: code als prescription id behandlen und schauen ob vorhanden


        //All Prescriptions
        return trspPrescriptions;
    }

    @WebMethod
    public boolean savePreparedMedications(List<TrspPreparedMedication> trspPreparedMedications) {
        boolean wasSuccessful = false;


        return wasSuccessful;
    }

    public boolean updatePreparedMedications(List<TrspPreparedMedication> trspPreparedMedications, TrspPreparedMedication.MedicationState medicationState) {
        return false;
    }

    public boolean updatePrescriptions(List<TrspPrescription> trspPrescriptions, TrspPrescription.PrescriptionState prescriptionState) {
        return false;
    }

    @WebMethod
    public List<TrspPreparedMedication> getPreparedMedicationsForPatient(String pid) {

        List<TrspPreparedMedication> trspPreparedMedications = new ArrayList<TrspPreparedMedication>();

        return trspPreparedMedications;
    }

    public String getDosetForPatient(String pid) {
        return "";
    }


    public static void main(String[] argv) {
    Object implementor = new SupplyChainService();


    String address = "http://localhost:9000/SupplyChainService";
    Endpoint.publish(address, implementor);

    }
}
