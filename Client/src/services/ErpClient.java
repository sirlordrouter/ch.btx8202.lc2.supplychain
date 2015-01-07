package services;

import data.IDataSource;
import webservice.erp.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.soap.SOAPFaultException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * BTX8202 (Living Case 2), HS2014</br>
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

    @Override
    public void resetTrackedItems() {

        try{
            supplyChainServicePort.resetTrackedItems();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
