package service;

import data.DbConnectorLogistic;
import entities.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.intellij.lang.annotations.Language;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
import java.time.format.DateTimeParseException;
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

            //TODO: was passiert mit Items in Secondary Package wo Inhalt = 0?
            /*
                All Tracked Items which are not marked checked out in the same institution
             */
            @Language("DB2")
            String query = "SELECT i.GTIN,i.SerialNr,i.Lot,i.ExpiryDate,i.ScanDate, i.StateNr, s.ProductQuantity \n" +
                    "FROM TrackedItems i\n" +
                    "left join SecondaryPackage s on \n" +
                    "s.GTINsek = i.GTIN AND s.BatchLot = i.Lot \n" +
                    "AND s.ExpiryDate = i.ExpiryDate AND s.SerialNr = i.SerialNr\n" +
                    "where not exists \n" +
                    "( \n" +
                    "Select i.GTIN From TrackedItems o \n" +
                    "where i.GTIN = o.GTIN and i.SerialNr = o.SerialNr and i.Lot = o.Lot and i.ExpiryDate = o.ExpiryDate and GLNscan = ? and StateNr = 3 \n" +
                    ") \n" +
                    "and GLNscan = ? AND StateNr = ?";

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
            connection.setAutoCommit(false);
            // get the identifier of the latest order entry in the database
            @Language("DB2")
            String query = "SELECT TOP 1 [OrderNr]\n" +
                    "  FROM [dbo].[Order]\n" +
                    "  ORDER BY OrderNr\n" +
                    "  DESC";

            PreparedStatement ps = connection.prepareStatement(query);
            rs =  ps.executeQuery();
            connection.commit();

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
            connection.commit();
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
                connection.commit();
            }
            if(update==1&&answer==1){
                success=true;
            }else{success=false;}

        } catch (SQLException e) {
            e.printStackTrace();
            success = false;
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            return success;
        } finally {
            try {
                connection.setAutoCommit(true);
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

    @WebMethod
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
            items=insertLogisticPackage(order,lastShipmentId, Integer.parseInt(orderNr), glnMan);
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

    private List<Item> insertLogisticPackage(Order order, int shipmentID, int orderNr, String glnMan)
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
            items=insertSecondaryPackagesFromOrder(order,Long.toString(lastSSCC+1), glnMan);
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

    private List<Item> insertSecondaryPackagesFromOrder(Order order, String sscc, String glnMan)
    {
        Connection connection = connectorLogistic.getConnection();
        List<Item> items = new ArrayList<Item>();
        Map<String, LogisticInformation> GtinbContainesA = getProductInformation();
        //TODO: fetch quantity from product

        try {
            // get the identifier of the latest order entry in the database
            connection.setAutoCommit(false);
            String batch = getBatch();
            Timestamp expdate = getExpDate();

            for(Position pos:order.getPositions()){
                for(int i= 0;i<pos.getQuantity();i++){
                    Item item = new Item();
                    @Language("DB2")
                    String secondaryQuery = "INSERT INTO [dbo].[SecondaryPackage]\n" +
                            "           ([GTINsek]\n" +
                            "           ,[SerialNr]\n" +
                            "           ,[BatchLot]\n" +
                            "           ,[ExpiryDate]\n" +
                            "           ,[GTINtert]\n" +
                            "           ,[SSCC]\n" +
                            "           ,[ProductQuantity]) " +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,null\n" +
                            "           ,?" +
                            "           ,?)";

                    String primaryQuery = "INSERT INTO [dbo].[PrimaryPackage]\n" +
                            "           ([GTINsek]\n" +
                            "           ,[GTINprim]\n" +
                            "           ,[BatchLot]\n" +
                            "           ,[ExpiryDate]\n" +
                            "           ,[Type]\n" +
                            "           ,[GLNman]\n" +
                            "           ,[SerialNr]) \n" +
                            "     VALUES\n" +
                            "           (?" +
                            "           ,?" +
                            "           ,?" +
                            "           ,?" +
                            "           ,?" +
                            "           ,?" +
                            "           ,?)";


                    PreparedStatement ps = connection.prepareStatement(secondaryQuery);
                    ps.setString(1,pos.getGtin());
                    String serial = getSerial(batch,i+1);
                    ps.setString(2,serial);
                    ps.setString(3, batch);
                    ps.setTimestamp(4, expdate);
                    ps.setString(5, sscc);
                    ps.setInt(6, GtinbContainesA.get(pos.getGtin()).LogisticQuantity);

                    item.setGTIN(pos.getGtin());
                    item.setSerial(serial);
                    item.setLot(batch);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyy");
                    String expDate  = dateFormat.format(expdate);
                    item.setExpiryDate(expDate);
                    item.setBeschreibung(pos.getDescription());
                    items.add(item);
                    int success =  ps.executeUpdate();
                    connection.commit();

                    ps = connection.prepareStatement(primaryQuery);
                    ps.setString(1,pos.getGtin());
                    ps.setString(2, GtinbContainesA.get(pos.getGtin()).GtinA);
                    ps.setString(3, batch);
                    ps.setTimestamp(4, expdate);
                    ps.setString(5, "");
                    ps.setString(6, GtinbContainesA.get(pos.getGtin()).Manufacturer);
                    ps.setString(7, serial);

                    success = ps.executeUpdate();
                    connection.commit();

                    insertTrackingItems(items, glnMan,  1);
                    connection.commit();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            return null;
        } finally {
            try {
                connection.setAutoCommit(true);
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        return items;
    }

    private Map<String, LogisticInformation> getProductInformation() {
        Connection connection = connectorLogistic.getConnection();
        Map<String, LogisticInformation> GtinbContainesA = new HashMap<>();
        @Language("DB2")
        String query = "SELECT \n" +
                "[GTINB],\n" +
                "[GTINA],\n" +
                "[Manufacturer],\n" +
                "[ContainedUnits] \n" +
                "FROM \n" +
                "ProductionGtinBContainesA";

        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                GtinbContainesA.put(
                        rs.getString(1),
                        new LogisticInformation(rs.getString(2), rs.getString(3), rs.getInt(4))
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                connection.close();
                return GtinbContainesA;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

    }

    private String getBatch(){ //Beutel 9stellig
        java.util.Date date = new java.util.Date();
        DateFormat formatter = new SimpleDateFormat("ddMMyyHHm");
        return formatter.format(date).substring(1,10);
    }
    private String getSerial(String batch, int objectNumber){ //17 stellig
        String serial = Integer.toString(objectNumber);
        while(serial.length()<8){
            serial = "0" + serial;
        }
        return batch+serial;
    }
    private Timestamp getExpDate(){
        LocalDate dateTime = LocalDate.now();
        LocalDateTime dateTime1 = dateTime.atTime(0, 0, 0, 0);
        java.sql.Timestamp timestamp = Timestamp.valueOf(dateTime1);
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

    @WebMethod
    public List<String> getLogisticUnitsForProduct(String productGTIN) {

        List<String> secondaryGTINs = new ArrayList<>();
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        try {

            String query = "SELECT  prim.GTINsek \n" +
                    "FROM Product p\n" +
                    "LEFT JOIN PrimaryPackage prim ON p.GTINprim = prim.GTINprim\n" +
                    "WHERE p.GTINprim = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, productGTIN);
            rs =  ps.executeQuery();

            while (rs.next()) {
                secondaryGTINs.add(rs.getString(1));
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

        return secondaryGTINs;
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

    //    /**
//     * Returns the TrspPatient for given UUID
//     * @return a  TrspPatient
//     */
//    @WebMethod
//    public TrspPatient getPatientByMinorId(String minorid) {
//        List<TrspPatient> trspPatients = null;
//        ResultSet rs;
//        Connection connection = connectorLogistic.getConnection();
//
//        try {
//            String query = "SELECT PolyPointPID,UUID,Name, FirstName,Birthdate,Gender,Station From MediPrep_Patients WHERE UUID = ?";
//            PreparedStatement ps = connection.prepareStatement(query);
//            ps.setString(1, minorid);
//            rs =  ps.executeQuery();
//
//            trspPatients = getPatientsFromResult(rs);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if( trspPatients.size() > 2 || trspPatients.size() == 0) {
//            System.out.println("There have been more than one patient with UUID " + minorid);
//            return null;
//        } else {
//            return trspPatients.get(0);
//        }
//    }
//
//    @WebMethod
//    public TrspPatient getPatientByPid(String pid) {
//        return null;
//    }

    /**
     * Gets all Prescriptions for a Patient which are valid
     * @param pid
     * @return
     *  a list of prescriptions with perscribed medications defined for this prescription
     */
    @WebMethod
    public List<TrspPrescription> getPrescriptionsForPatient(String pid) {

        //All trspPrescriptions where state is open, paused, doseChanged
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        List<TrspPrescription> trspPrescriptions = new ArrayList<TrspPrescription>();

        try {
            String query =
                    "SELECT \n" +
                            "distinct(p.PolypointID), \n" +
                            "PatientPolypointID,  \n" +
                            "DateCreated,  \n" +
                            "p.State,  \n" +
                            "CreatedByStaffGLN, \n" +
                            "s.Name,  \n" +
                            "s.FirstName,  \n" +
                            "s.Position,  \n" +
                            "Description,  \n" +
                            "Schedule,  \n" +
                            "RouteOfAdministration, \n" +
                            "Notes,  \n" +
                            "ValidUntil ,\n" +
                            "pm.State  \n" +
                            "FROM MediPrep_Prescription p   \n" +
                            "LEFT JOIN MediPrep_Staff  s  \n" +
                            "ON s.GLN = p.CreatedByStaffGLN   \n" +
                            "INNER JOIN MediPrep_PrescriptionDefinesMedication m \n" +
                            "ON p.PolypointID = m.PrescriptionID \n" +
                            "LEFT JOIN MediPrep_PreparedMedication pm \n" +
                            "ON m.PrescriptionID = pm.PresciriptionID \n" +
                            "AND m.GTIN = pm.GtinPrescribedMedic  \n" +
                            "WHERE PatientPolypointID = ? \n" +
                            "AND ValidUntil >= GETDATE()  \n" +
                            "AND pm.State is null";
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

    @WebMethod
    public List<TrspPrescription> getPreparedPrescriptionsForPatient(String pid) {
        //Alle trspPrescriptions wo schedule für aktuelle Zeit => join mit allen vorbereiteneten und produkt columns nötig für matchen
        //für jede trspPrescriptions
        //Fall 1: ein medi: scanned code als gtin eines scanned items mit gtin vergleichen, falls nicht => ev. fall 2
        //Fall 2: x-Medis: code als prescription id behandlen und schauen ob vorhanden
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();

        List<TrspPrescription> trspPrescriptions = new ArrayList<TrspPrescription>();

        try {
            String query =
                    "SELECT \n" +
                            "\t DISTINCT(p.PolypointID),\n" +
                            "    PatientPolypointID, \n" +
                            "    DateCreated, \n" +
                            "    p.State, \n" +
                            "    CreatedByStaffGLN,\n" +
                            "    s.Name, \n" +
                            "    s.FirstName, \n" +
                            "    s.Position, \n" +
                            "    Description, \n" +
                            "    Schedule, \n" +
                            "    RouteOfAdministration,\n" +
                            "    Notes, \n" +
                            "    ValidUntil  \n" +
                            "FROM MediPrep_Prescription p  \n" +
                            "LEFT JOIN MediPrep_Staff  s \n" +
                            "\tON s.GLN = p.CreatedByStaffGLN  \n" +
                            "INNER JOIN MediPrep_PrescriptionDefinesMedication m\n" +
                            "\tON p.PolypointID = m.PrescriptionID\n" +
                            "INNER JOIN MediPrep_PreparedMedication pm\n" +
                            "\tON m.PrescriptionID = pm.PresciriptionID\n" +
                            "\tAND m.GTIN = pm.GtinPrescribedMedic\t \n" +
                            "WHERE PatientPolypointID = ? \n" +
                            "\tAND ValidUntil >= GETDATE() \n" +
                            "\tAND pm.State = 3\n" +
                            "\tAND NOT EXISTS (\n" +
                            "\t\tselect * \n" +
                            "\t\tfrom MediPrep_PrescriptionDefinesMedication a\n" +
                            "\t\tLEFT JOIN MediPrep_PreparedMedication b\n" +
                            "\t\t\tON a.GTIN = b.GtinPrescribedMedic\n" +
                            "\t\t\tAND a.PrescriptionID = b.PresciriptionID\n" +
                            "\t\tWHERE (b.State IS NULL OR b.State < 3) \n" +
                            "\t\t\tAND a.PrescriptionID =p.PolypointID\n" +
                            "\t)";
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
            p.setVaildUntil(rs.getDate(13).toLocalDate());
            p.setCreatedByStaffGLN(rs.getString(5));
            p.setName(rs.getString(6));
            p.setFirstName(rs.getString(7));
            p.setPosition(rs.getString(8));
            p.setDescription(rs.getString(9));
            p.setSchedule(rs.getString(10));
            p.setRouteOfAdministration(rs.getString(11));
            p.setNotes(rs.getString(12));
            p.setMedications(getPreparedMedicationsForPrescription(p));
            p.setPrescriptionState(TrspPrescription.PrescriptionState.open); //TODO: change to db value, value 4

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
                    "SELECT\n " +
            "GTIN,\n" +
                    "Name," +
                    "Pharmacode," +
                    "pdm.PrescriptionID," +
                    "Dosage," +
                    "DosageUnit," +
                    "State," +
                    "TimePrepared," +
                    "sp.GTINSek," +
                    "sp.SerialNr," +
                    "sp.ExpiryDate," +
                    "sp.BatchLot," +
                    "StaffGLN," +
                    "pm.UID," +
                    "pdm.isAdditionalMedic "  +
                    "FROM MediPrep_PrescriptionDefinesMedication pdm " +
                    "LEFT JOIN Product p\n" +
                    "ON GTINprim = GTIN\n" +
                    "Left JOIN MediPrep_PreparedMedication pm\n" +
                    "ON pm.PresciriptionID = pdm.PrescriptionID AND pm.GtinPrescribedMedic = pdm.GTIN\n" +
                    "Left JOIN SecondaryPackage sp\n" +
                    "ON sp.GTINsek = pm.GTINSek AND sp.SerialNr = pm.SerialNr AND sp.ExpiryDate = pm.ExpiryDate\n" +
                    "WHERE PrescriptionID = ? and (pm.State < 4 OR pm.State is null)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, p.getPolypointID());
            rs =  ps.executeQuery();

            //TODO: Pattern für encapsulated Base Class (zuerst Basisklasse TrspMedication nutzen und dann beim vorbereiten der Medis auf die erweiterte Klasse TrspPreparedMedication wechseln) => nur falls sinnvoll
            medications = getMedicationFromResult(rs, p);

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

    private List<TrspPreparedMedication> getMedicationFromResult(ResultSet rs, TrspPrescription p) throws SQLException {
        List<TrspPreparedMedication> trspPreparedMedications = new ArrayList<>();

        while (rs.next()) {
            TrspPreparedMedication trspPreparedMedication = new TrspPreparedMedication();


            trspPreparedMedication.setGtinA(rs.getString(1));
            trspPreparedMedication.setGtinBs(getLogisticUnitsForProduct(rs.getString(1)));
            trspPreparedMedication.setName(rs.getString(2));
            trspPreparedMedication.setDosage(rs.getString(5));
            trspPreparedMedication.setDosageUnit(rs.getString(6));
            int stateIndex = rs.getInt(7)-1;

            if (stateIndex > 0) {
                trspPreparedMedication.setState(TrspPreparedMedication.MedicationState.values()[stateIndex]);
            }

            LocalDate localDate = this.getDateValue(rs,8);
            if (localDate != null) {
                LocalDateTime localDateTime = localDate.atTime(this.getTimeValue(rs, 8));
                trspPreparedMedication.setPreparationTime(localDateTime);
            }

            trspPreparedMedication.setGtinFromAssignedItem(rs.getString(9));
            trspPreparedMedication.setSerial(rs.getString(10));
            trspPreparedMedication.setExpiryDate(rs.getString(11));
            trspPreparedMedication.setBatchLot(rs.getString(12));
            trspPreparedMedication.setStaffGln(rs.getString(13));
            trspPreparedMedication.setPreparedMedicationId(rs.getInt(14));
            trspPreparedMedication.setIsReserve(rs.getBoolean(15));
            trspPreparedMedication.setBasedOnPrescription(p);

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

    public MediPrepResult updateDispensedMedication(TrspPrescription p, String stationGLN) {

        MediPrepResult result ;

        if (
                p.getMedications().size()           == 0 &&
                p.getMedicationsMorning().size()    == 0 &&
                p.getMedicationsNoon().size()       == 0 &&
                p.getMedicationsEvening().size()    == 0 &&
                p.getMedicationsNight().size()      == 0 ) {
            return new MediPrepResult(false, 3);

        }

        if (p.getMedications().size() > 0) {
            result = updatePreparedMedications(p.getMedications(),
                    TrspPreparedMedication.MedicationState.served, stationGLN);
            if (!result.isResult()) {
                return result;
            }
        }
        if (p.getMedicationsMorning().size() > 0) {
            result = updatePreparedMedications(p.getMedicationsMorning(),
                    TrspPreparedMedication.MedicationState.served, stationGLN);
            if (!result.isResult()) {
                return result;
            }
        }
        if (p.getMedicationsNoon().size() > 0) {
            result = updatePreparedMedications(p.getMedicationsNoon(),
                    TrspPreparedMedication.MedicationState.served, stationGLN);
            if (!result.isResult()) {
                return result;
            }
        }
        if (p.getMedicationsEvening().size() > 0) {
            result = updatePreparedMedications(p.getMedicationsEvening(),
                    TrspPreparedMedication.MedicationState.served, stationGLN);
            if (!result.isResult()) {
                return result;
            }
        }
        if (p.getMedicationsNight().size() > 0) {
            result = updatePreparedMedications(p.getMedicationsNight(),
                    TrspPreparedMedication.MedicationState.served, stationGLN);
            if (!result.isResult()) {
                return result;
            }
        }
        return new MediPrepResult(true, -1);


    }

    @WebMethod
    public MediPrepResult updatePreparedMedications(List<TrspPreparedMedication> trspPreparedMedications, TrspPreparedMedication.MedicationState medicationState, String stationGLN) {

        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();
       String query = "";

        try{
            connection.setAutoCommit(false);

            switch (medicationState) {
                case open:  //no change
                    break;
                case prepared: //initalize
                    query = "INSERT INTO MediPrep_PreparedMedication\n" +
                            "           ([State]\n" +
                            "           ,[TimePrepared]\n" +
                            "           ,[GTINSek]\n" +
                            "           ,[SerialNr]\n" +
                            "           ,[ExpiryDate]\n" +
                            "           ,[PresciriptionID]\n" +
                            "           ,[GtinPrescribedMedic]\n" +
                            "           ,[StaffGLN])\n" +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,?\n" +
                            "           ,?)";
                    String queryUpdate = "Update " +
                            "SecondaryPackage " +
                            "SET ProductQuantity = ProductQuantity-1 " +
                            "WHERE GTINSek = ? " +
                            "AND SerialNr = ? " +
                            "AND ExpiryDate = ?";
                    //Ev hier noch ergänzen dass nur Einträge ageupdated werden können wo Quantity > 0
                    //Sonst fehler und Meldung an Client.

                    for (TrspPreparedMedication trspPreparedMedication : trspPreparedMedications) {

                        LocalDate expDate = LocalDate.parse(trspPreparedMedication.getExpiryDate()); //Parse Exception
                        LocalDateTime expDateTime = expDate.atTime(0, 0, 0, 0);
                        Timestamp expiryDate = Timestamp.valueOf(expDateTime);
                        PreparedStatement ps = connection.prepareStatement(query);
                        int state = trspPreparedMedication.getState().ordinal()+1;
                        ps.setInt(1,state);
                        ps.setTimestamp(2, Timestamp.valueOf(trspPreparedMedication.getPreparationTime()));
                        ps.setString(3, trspPreparedMedication.getGtinFromAssignedItem());
                        ps.setString(4, trspPreparedMedication.getSerial());
                        ps.setTimestamp(5, expiryDate);
                        ps.setInt(6, Integer.valueOf(trspPreparedMedication.getBasedOnPrescription().getPolypointID()));
                        ps.setString(7, trspPreparedMedication.getGtinA());
                        ps.setString(8, trspPreparedMedication.getStaffGln());

                        ps.executeUpdate();
                        connection.commit();

                        ps = connection.prepareStatement(queryUpdate);
                        ps.setString(1, trspPreparedMedication.getGtinFromAssignedItem());
                        ps.setString(2, trspPreparedMedication.getSerial());
                        ps.setTimestamp(3, expiryDate);

                        ps.executeUpdate();
                        connection.commit();

                    }



                    break;
                case controlled: //update

                    query = "Update MediPrep_PreparedMedication " +
                            "SET State = 3 " +
                            "WHERE UID = ?";

                    for (TrspPreparedMedication trspPreparedMedication : trspPreparedMedications) {

                        PreparedStatement ps = connection.prepareStatement(query);
                        ps.setInt(1, trspPreparedMedication.getPreparedMedicationId());
                        ps.executeUpdate();

                    }

                    connection.commit();
                    break;
                case served: //update and tracker input as well as quantity decrement

                    Set<TrspPrescription> prescriptionsSet = new HashSet<>();

                    query =  "Update MediPrep_PreparedMedication " +
                            "SET State = 4 " +
                            "WHERE UID = ?";

                    String queryTracking = "INSERT INTO TrackedItems " +
                            "(GTIN, SerialNr, ExpiryDate, GLNscan, ScanDate, StateNr, ScannedSSCC,Lot) " +
                            "VALUES (?,?,?,?,?,?,?,?)";



                    for (TrspPreparedMedication trspPreparedMedication : trspPreparedMedications) {

                        if (trspPreparedMedication.getBasedOnPrescription() != null) {
                            prescriptionsSet.add(trspPreparedMedication.getBasedOnPrescription());
                        } else {
                            throw new SQLException();
                        }

                        PreparedStatement psUpdate = connection.prepareStatement(query);
                        PreparedStatement  psTracking = connection.prepareStatement(queryTracking);

                        psUpdate.setInt(1, trspPreparedMedication.getPreparedMedicationId());
                        psUpdate.executeUpdate();

                        connection.commit();

                        psTracking.setString(1, trspPreparedMedication.getGtinFromAssignedItem());
                        psTracking.setString(2, trspPreparedMedication.getSerial());
                        psTracking.setString(3, trspPreparedMedication.getExpiryDate());
                        psTracking.setString(4, stationGLN);
                        java.sql.Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
                        psTracking.setTimestamp(5,timestamp);
                        psTracking.setInt(6, 3); //Set item to processed
                        psTracking.setString(7, null);
                        psTracking.setString(8, trspPreparedMedication.getBatchLot());
                        psTracking.executeUpdate();

                        connection.commit();

                        //Make new Prescription "clone" if < Valid Unti new,
                        // else new Prescription with valid until now + 1 year

                    }

                    String clonePresc = "INSERT INTO [dbo].[MediPrep_Prescription]\n" +
                            "           ([PolypointID]\n" +
                            "           ,[PatientPolypointID]\n" +
                            "           ,[DateCreated]\n" +
                            "           ,[ValidUntil]\n" +
                            "           ,[State]\n" +
                            "           ,[CreatedByStaffGLN]\n" +
                            "           ,[Description]\n" +
                            "           ,[Schedule]\n" +
                            "           ,[RouteOfAdministration]\n" +
                            "           ,[Notes])\n" +
                            "     SELECT (SELECT MAX(PolypointID) + 1 FROM MediPrep_Prescription),\n" +
                            "\t [PatientPolypointID] + 1\n" +
                            "      ,[DateCreated]\n" +
                            "      ,DATEADD(YEAR,1,GETDATE())\n" +
                            "      ,[State]\n" +
                            "      ,[CreatedByStaffGLN]\n" +
                            "      ,[Description]\n" +
                            "      ,[Schedule]\n" +
                            "      ,[RouteOfAdministration]\n" +
                            "      ,[Notes]\n" +
                            "  FROM [SupplyChainLogistic].[dbo].[MediPrep_Prescription]\n" +
                            "  WHERE PolypointID=? \n" +
                            "  AND ValidUntil > GETDATE()";

                    String clonePrescMedi = "INSERT INTO [dbo].[MediPrep_PrescriptionDefinesMedication]\n" +
                            "           ([GTIN]\n" +
                            "           ,? \n" +
                            "           ,[Dosage]\n" +
                            "           ,[isAdditionalMedic]\n" +
                            "           ,[DosageUnit])\n" +
                            "SELECT [GTIN]\n" +
                            "      ,[PrescriptionID]\n" +
                            "      ,[Dosage]\n" +
                            "      ,[isAdditionalMedic]\n" +
                            "      ,[DosageUnit]\n" +
                            "  FROM [dbo].[MediPrep_PrescriptionDefinesMedication]\n" +
                            "  WHERE PrescriptionID = ?";

                    for (TrspPrescription trspPrescription : prescriptionsSet) {
                        PreparedStatement psClonePresc = connection.prepareStatement(clonePresc);
                        PreparedStatement psClonePrescMedi = connection.prepareStatement(clonePrescMedi);

                        psClonePresc.setString(1,trspPrescription.getPolypointID());
                        psClonePresc.executeUpdate();

                        int autoIncKeyFromApi = -1;
                        rs = psClonePresc.getGeneratedKeys();
                        if (rs.next()) {
                            autoIncKeyFromApi = rs.getInt(1);

                            psClonePrescMedi.setString(1, Integer.toString(autoIncKeyFromApi));
                            psClonePrescMedi.setString(2, trspPrescription.getPolypointID());
                        } else {
                            throw new SQLException();
                        }

                        connection.commit();

                    }



                    break;
            }
        } catch (SQLException e) {
            try {
                connection.rollback();
                connection.setAutoCommit(true);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            return new MediPrepResult(false, e.getErrorCode());
        } catch (DateTimeParseException e) {
            return new MediPrepResult(false, 2);
        }

        return new MediPrepResult(true, -1);

    }

    @WebMethod
    public int getPreparedPrescriptionsCountForPatient(String pid) {
        int result = -1;
        ResultSet rs;
        Connection connection = connectorLogistic.getConnection();
        String query =
                "select COUNT(*) AS PrescriptionCount \n" +
                        "FROM (\n" +
                        "\tSELECT \n" +
                        "\t\tDISTINCT(p.PolypointID)\n" +
                        "\tFROM MediPrep_Prescription p  \n" +
                        "\tLEFT JOIN MediPrep_Staff  s \n" +
                        "\t\tON s.GLN = p.CreatedByStaffGLN  \n" +
                        "\tINNER JOIN MediPrep_PrescriptionDefinesMedication m\n" +
                        "\t\tON p.PolypointID = m.PrescriptionID\n" +
                        "\tINNER JOIN MediPrep_PreparedMedication pm\n" +
                        "\t\tON m.PrescriptionID = pm.PresciriptionID\n" +
                        "\t\tAND m.GTIN = pm.GtinPrescribedMedic\t \n" +
                        "\tWHERE PatientPolypointID = ? \n" +
                        "\t\tAND ValidUntil >= GETDATE() \n" +
                        "\t\tAND pm.State = 3\n" +
                        "\t\tand not exists (\n" +
                        "\t\t\tselect * \n" +
                        "\t\t\tfrom MediPrep_PrescriptionDefinesMedication a\n" +
                        "\t\t\tleft join MediPrep_PreparedMedication b\n" +
                        "\t\t\tON a.GTIN = b.GtinPrescribedMedic\n" +
                        "\t\t\tAND a.PrescriptionID = b.PresciriptionID\n" +
                        "\t\t\tWHERE (b.State is null or b.State < 3) and a.PrescriptionID =p.PolypointID\n" +
                        "\t\t)\n" +
                        ") as prescriptions";
        // noch anpassen dass wenn ein medi noch nicht vorbereitet ist, prescription nicht als prepared angezeigt wird

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, pid);
            rs =  ps.executeQuery();

            rs.next();
            int count = 0;
            count = rs.getInt(1);
            return count;


        } catch (SQLException e) {
            return -1;
        }
    }

    @WebMethod
    public ToDoListPrescriptions getToDoListPrescriptions() {

        List<TrspPrescription> scheduldedPrescriptionsMorning = new ArrayList<>();
        List<TrspPrescription> scheduldedPrescriptionsNoon  = new ArrayList<>();
        List<TrspPrescription> scheduldedPrescriptionsEvening  = new ArrayList<>();
        List<TrspPrescription> scheduldedPrescriptionsNight  = new ArrayList<>();

        List<TrspPatient> trspPatients = getPatients();

        for (TrspPatient trspPatient : trspPatients) {
            List<TrspPrescription> tempPresc = getPrescriptionsForPatient(Integer.toString(trspPatient.getPid()));
            for (TrspPrescription trspPrescription : tempPresc) {
                String schedule = trspPrescription.getSchedule();
                for (int i = 0; i < schedule.length(); i++) {
                    if (Integer.valueOf(schedule.substring(i,i+1)) == 1 ) {
                        switch (i) {
                            case 0:
                                scheduldedPrescriptionsMorning.add(trspPrescription);
                                break;
                            case 1:
                                scheduldedPrescriptionsNoon.add(trspPrescription);
                                break;
                            case 2:
                                scheduldedPrescriptionsEvening.add(trspPrescription);
                                break;
                            case 3:
                                scheduldedPrescriptionsNight.add(trspPrescription);
                                break;
                        }
                    }
                }
            }
        }

        return new ToDoListPrescriptions(
                scheduldedPrescriptionsMorning,
                scheduldedPrescriptionsNoon,
                scheduldedPrescriptionsEvening,
                scheduldedPrescriptionsNight);
    }

    public String getDosetForPatient(String pid) {

        throw new NotImplementedException();
    }

    public static void main(String[] argv) {
    Object implementor = new SupplyChainService();


    String address = "http://localhost:9000/SupplyChainService";
    Endpoint.publish(address, implementor);

    }
}
