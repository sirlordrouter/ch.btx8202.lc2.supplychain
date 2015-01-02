package data;


import webservice.erp.Item;
import webservice.erp.NoSuchGLNFoundException_Exception;
import webservice.erp.WebServiceResult;

import java.util.Date;
import java.util.List;

/**
 * Created by Johannes on 17.11.14.
 */
public interface IDataSource {

    void checkinItems(List<Item> items);
    void checkoutItems(List<Item> items);
    List<Item> getItemsBySSCC(String sscc);
    Item getItemByIdentifier(String gtin, String serialNumber);
    List<Item> getItemsByBatch(String gtin, String batchLot, Date expiryDate);
    WebServiceResult getCheckedInItems(String gln) throws NoSuchGLNFoundException_Exception;
}
