package services;

import data.IDataSource;
import webservice.erp.Item;

import java.util.Date;
import java.util.List;

/**
 * Created by Johannes on 17.11.14.
 */
public class ErpClient implements IDataSource{

    private String stationGLN;

    public ErpClient(String stationGLN) {
        this.stationGLN = stationGLN;
    }

    @Override
    public void checkinItems(List<Item> items) {

    }

    @Override
    public void checkoutItems(List<Item> items) {

    }

    @Override
    public List<Item> getItemsBySSCC(String sscc) {
        return null;
    }

    @Override
    public Item getItemByIdentifier(String gtin, String serialNumber) {
        return null;
    }

    @Override
    public List<Item> getItemsByBatch(String gtin, String batchLot, Date expiryDate) {
        return null;
    }
}
