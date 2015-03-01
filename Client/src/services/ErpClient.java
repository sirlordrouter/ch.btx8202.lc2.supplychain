package services;

import webservice.erp.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.soap.SOAPFaultException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>
 *     Connection Class to the erp webservice.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 21-10-2014
 */
public class ErpClient implements IDataSource{

    private String stationGLN;
    private SupplyChainServiceService supplyChainService;
    private SupplyChainService supplyChainServicePort;

    public ErpClient(String stationGLN) {

        this.stationGLN = stationGLN;

        supplyChainService = new SupplyChainServiceService();
        supplyChainServicePort = supplyChainService.getSupplyChainServicePort();
    }
    /**
     * Makes an entry in the TrackedItems table (state arrived) for every item specified in the list.
     * @param items A List of Items that has to be checked in.
     * @return WebServiceResult
     */
    @Override
    public WebServiceResult checkinItems(List<Item> items) {
        try{
            return supplyChainServicePort.checkinItems(items, stationGLN);
        } catch (SOAPFaultException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Makes an entry in the TrackedItems table (state processed) for every item specified in the list.
     * @param items A List of Items that has to be checked in.
     * @return WebServiceResult
     */
    @Override
    public WebServiceResult checkoutItems(List<Item> items) {
        try{
            return supplyChainServicePort.checkoutItems(items, stationGLN);
        } catch (SOAPFaultException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Returns a list of items referring to the specified sscc.
     * @param sscc A Serial Shipping Container Code.
     * @return List<Item>
     */
    @Override
    public List<Item> getItemsBySSCC(String sscc) {
        try{
            return supplyChainServicePort.getItemsBySSCC(sscc);
        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    /**
     * Returns the item with the corresponding gtin and serial number.
     * @param gtin A global trade item number (GTIN).
     * @param serialNumber A Serial Number.
     * @return Item
     */
    @Override
    public Item getItemByIdentifier(String gtin, String serialNumber) {
        try{
            return supplyChainServicePort.getItemByIdentifier(gtin, serialNumber);
        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    /**
    * Returns a List of items with the corresponding gtin, batch/lot and expiry date.
    * @param gtin A global trade item number (GTIN).
    * @param batchLot A BatchLot.
    * @param expiryDate An Expiry Date.
    * @return List<Item>
    */
    @Override
    public List<Item> getItemsByBatch(String gtin, String batchLot, Date expiryDate) {
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(expiryDate);
        XMLGregorianCalendar tempDate = null;
        try {
            tempDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        try{
            return supplyChainServicePort.getItemsByBatch(gtin, batchLot, tempDate);
        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
    * Returns a WebServiceResult with a list of all checked in items of the corresponding gln and a boolean.
    * @param gln A global location number (GLN).
    * @return WebServiceResult
    */
    @Override
    public WebServiceResult getCheckedInItems(String gln) {

        try{
            return supplyChainServicePort.getCheckedInItems(gln);
        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    /**
    * Resets all entries in the TrackedItems table.
    */
    @Override
    public void resetTrackedItems() {
        try{
            supplyChainServicePort.resetTrackedItems();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the order in the database.
     */
    @Override
    public boolean setOrder(Order order, String glnOrd, String glnDest) {
        try{
            boolean success = supplyChainServicePort.setOrder(order, glnOrd, glnDest);
            if(success){
                return true;
            }else return false;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
