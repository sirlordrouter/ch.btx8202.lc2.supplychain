package services;

import data.IDataSource;
import webservice.erp.Item;
import webservice.erp.SupplyChainService;
import webservice.erp.SupplyChainServiceService;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Johannes on 17.11.14.
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
    public void checkinItems(List<Item> items) {
        supplyChainServicePort.checkinItems(items, stationGLN);

    }

    @Override
    public void checkoutItems(List<Item> items) {
        supplyChainServicePort.checkoutItems(items, stationGLN);
    }

    @Override
    public List<Item> getItemsBySSCC(String sscc) {

        return supplyChainServicePort.getItemsBySSCC(sscc);
    }

    @Override
    public Item getItemByIdentifier(String gtin, String serialNumber) {

        return supplyChainServicePort.getItemByIdentifier(gtin, serialNumber);
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

        return supplyChainServicePort.getItemsByBatch(gtin, batchLot, tempDate);
    }
}
