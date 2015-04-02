package services;


import java.util.Date;

import webservice.erp.*;

import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>Interface for the ErpClient Connection Class.</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 17-11-2014
 */
public interface IDataSource {

    WebServiceResult checkinItems(List<Item> items);
    WebServiceResult checkoutItems(List<Item> items);
    List<Item> getItemsBySSCC(String sscc);
    Item getItemByIdentifier(String gtin, String serialNumber);
    List<Item> getItemsByBatch(String gtin, String batchLot, Date expiryDate);
    WebServiceResult getCheckedInItems(String gln);
    void resetTrackedItems();
    boolean setOrder(Order order, String glnOrd, String glnDest);
    List<Quantity> getQuantities(String gln);
    List<Order> getOpenOrdersByGLN(String gln);
    Production processOrder(Order order,String glnMan, String glnStation);
}
