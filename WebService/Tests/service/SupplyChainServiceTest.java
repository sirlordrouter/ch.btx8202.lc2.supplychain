package service;

import entities.Item;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

public class SupplyChainServiceTest extends TestCase {

    public void testSayHelloWorldFrom() throws Exception {

    }

    public void testGetCheckedInItems() throws Exception {

    }

    public void testCheckinItems() throws Exception {

    }

    public void testCheckoutItems() throws Exception {

    }

    public void testInsertTrackingItems() throws Exception {

    }

    public void testGetItemsBySSCC() throws Exception {

    }

    public void testGetItemByIdentifier() throws Exception {
        String sscc = "106141410000098764";
        List<Item> itemList;
        SupplyChainService service = new SupplyChainService();
        itemList = service.getItemsBySSCC(sscc);

        Assert.assertEquals("Count of items in db for sscc 106141410000098764 is 2.", 2, itemList.size());
    }

    public void testGetItemsByBatch() throws Exception {

    }

    public void testGetOrderForSSCC() throws Exception {
        String sscc = "106141410000098764";
        SupplyChainService service = new SupplyChainService();
        String order = service.getOrderForSSCC(sscc);
    }
}