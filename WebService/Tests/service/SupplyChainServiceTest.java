package service;

import entities.Item;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

public class SupplyChainServiceTest extends TestCase {

    public void testSayHelloWorldFrom() throws Exception {

    }

    public void testGetCheckedInItems() throws Exception {
        String gln = "1234567890123";
        SupplyChainService service = new SupplyChainService();
        WebServiceResult result = service.getCheckedInItems(gln);
        //Assert.assertEquals("Count of TrackedItems in db for gln 1234567890123 is 1.", 1, result.getItems().size());
    }

    public void testCheckinItems() throws Exception {

    }

    public void testCheckoutItems() throws Exception {

    }

    public void testInsertTrackingItems() throws Exception {

    }

    public void testGetItemsBySSCC() throws Exception {
        String sscc = "106141410000098764";
        List<Item> itemList;
        SupplyChainService service = new SupplyChainService();
        itemList = service.getItemsBySSCC(sscc);

        Assert.assertEquals("Count of items in db for sscc 106141410000098764 is 4.", 4, itemList.size());
    }

    public void testGetItemByIdentifier() throws Exception {

    }

    public void testGetItemsByBatch() throws Exception {

    }

    public void testGetOrderForSSCC() throws Exception {
        String sscc = "106141410000098764";
        SupplyChainService service = new SupplyChainService();
        String order = service.getOrderForSSCC(sscc);
    }


}