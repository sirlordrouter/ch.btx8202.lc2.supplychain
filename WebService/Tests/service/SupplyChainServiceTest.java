package service;

import entities.*;
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

//    public void testSetOrder() throws Exception {
//        SupplyChainService service = new SupplyChainService();
//        Order order = new Order("Order",null,true);
//        ObservableList<Position> positions = FXCollections.observableArrayList();
//        positions.add(new Position("21342431", "Aspirin", 10));
//        positions.add(new Position("2341341355", "Dafalgan", 10));
//        order.setPositions(positions);
//        service.setOrder(order,null,null);
//    }

    public void testGetQuantities() throws Exception {
        SupplyChainService service = new SupplyChainService();
        Order order = new Order("Order 7",null,true);
      ObservableList<Position> positions = FXCollections.observableArrayList();
       positions.add(new Position("21342431", "Aspirin", 10));
        positions.add(new Position("2341341355", "Dafalgan", 10));
        order.setPositions(positions);
        service.processOrder(order,"1234567890124","1234567890125");
    }

    public void testProcessOrder() throws Exception {
        SupplyChainService service = new SupplyChainService();
        List<Quantity> itemList = service.getQuantities("1234567890124");
        Assert.assertEquals("Count of quantity items in db for gln 1234567890124", 1, itemList.size());
    }

    public void testGetOrderForSSCC() throws Exception {
        String sscc = "106141410000098764";
        SupplyChainService service = new SupplyChainService();
        String order = service.getOrderForSSCC(sscc);
    }

    public void testGetOpenOrdersByGLN() throws Exception {
        String gln = "1234567890125";
        SupplyChainService service = new SupplyChainService();
        List<Order> orderList = service.getOpenOrdersByGLN(gln);
        Assert.assertEquals("Count of order items in db for gln 1234567890125", 1, orderList.size());
    }


    public void testGetItemsByGSIN() throws Exception {

    }

    public void testSetOrder() throws Exception {

    }

    public void testResetTrackedItems() throws Exception {

    }

    public void testGetProductForSecondaryPackage() throws Exception {

    }

    public void testGetStations() throws Exception {

    }

    public void testGetPatients() throws Exception {
        SupplyChainService service = new SupplyChainService();
        List<TrspPatient> trspPatients = service.getPatients();

        Assert.assertNotNull(trspPatients);
        Assert.assertTrue(trspPatients.size() >= 2);

    }

    public void testGetPatientByUUID() throws Exception {

    }

    public void testGetPrescriptionsForPatient() throws Exception {
        SupplyChainService service = new SupplyChainService();
        List<TrspPrescription> p = service.getPrescriptionsForPatient("1");

        for (TrspPrescription trspPrescription : p) {
            Assert.assertTrue(trspPrescription.getMedications().size() == 2);
        }
    }

    public void testGetPrescriptionsWithPreparedMedicationsForPatient() throws Exception {

    }

    public void testSavePreparedMedications() throws Exception {

    }

    public void testGetPreparedMedicationsForPatient() throws Exception {

    }
}