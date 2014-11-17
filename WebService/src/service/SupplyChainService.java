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

    @WebMethod
    public void checkinItems(List<Item> items) {

    }

    @WebMethod
    public void checkoutItems(List<Item> items) {

    }

    @WebMethod
    public List<Item> getItemsBySSCC(String sscc) {
        return null;
    }

    @WebMethod
    public Item getItemByIdentifier(String gtin, String serialNumber) {
        return null;
    }

    @WebMethod
    public List<Item> getItemsByBatch(String gtin, String batchLot, Date expiryDate) {
        return null;
    }


    public static void main(String[] argv) {
    Object implementor = new SupplyChainService();
    String address = "http://localhost:9000/SupplyChainService";
    Endpoint.publish(address, implementor);
  }
}
