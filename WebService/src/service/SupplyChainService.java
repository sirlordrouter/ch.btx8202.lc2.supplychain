package service;

import entities.Item;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Date;
import java.util.List;

/**
 * Created by Johannes on 17.11.14.
 */
@WebService()
public class SupplyChainService {

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
        System.out.println(items.toArray() + " " + gln);
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
        System.out.println(items.toArray() + " " + gln);
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
        System.out.println("SSCC: " + sscc);
        return null;
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
        System.out.println("GTIN: " + gtin + ", " + "Seriennumer: " + serialNumber);
        return null;
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
    public List<Item> getItemsByBatch(String gtin, String batchLot, Date expiryDate) {
        System.out.println("GTIN: " + gtin + ", " + "batchlot: " + batchLot+ ", ExpiryDate: " + expiryDate);
        return null;
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
        System.out.println("SSCC: " + sscc);
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
