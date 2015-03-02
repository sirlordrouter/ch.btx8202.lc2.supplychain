package service;

import entities.Item;
import entities.Order;
import entities.Position;
import entities.Quantity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

public class SupplyChainServiceTest extends TestCase {

    public void testSayHelloWorldFrom() throws Exception {

    }

    public void testGetCheckedInItems() throws Exception {
        String gln = "1234567890124";
        SupplyChainService service = new SupplyChainService();
        WebServiceResult result = service.getCheckedInItems(gln);
        Assert.assertEquals("Count of TrackedItems in db for gln 1234567890123 is 4.", 4, result.getItems().size());
    }

    public void testCheckinItems() throws Exception {

    }

    public void testCheckoutItems() throws Exception {

    }

    public void testInsertTrackingItems() throws Exception {

    }

    public void testGetItemsBySSCC() throws Exception {
        String sscc = "106141410000098765";
        List<Item> itemList;
        SupplyChainService service = new SupplyChainService();
        itemList = service.getItemsBySSCC(sscc);

        Assert.assertEquals("Count of items in db for sscc 106141410000098764 is 4.", 4, itemList.size());
    }

    public void testGetItemByIdentifier() throws Exception {

    }

    public void testGetItemsByBatch() throws Exception {

    }
    public void testSetOrder() throws Exception {
        SupplyChainService service = new SupplyChainService();
        Order order = new Order("Order",null,true);
        ObservableList<Position> positions = FXCollections.observableArrayList();
        positions.add(new Position("21342431", "Aspirin", 10));
        positions.add(new Position("2341341355", "Dafalgan", 10));
        order.setPositions(positions);
        service.setOrder(order,null,null);
    }

    public void testGetQuantities() throws Exception {
        SupplyChainService service = new SupplyChainService();
        List<Quantity> itemList = service.getQuantities("1234567890124");
        Assert.assertEquals("Count of quantity items in db for gln 1234567890124", 1, itemList.size());
    }

    public void testGetOrderForSSCC() throws Exception {
        String sscc = "106141410000098764";
        SupplyChainService service = new SupplyChainService();
        String order = service.getOrderForSSCC(sscc);
    }


}