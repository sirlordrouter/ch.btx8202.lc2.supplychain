package service;

import data.DbConnectorLogistic;
import entities.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import junit.framework.TestCase;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SupplyChainServiceTest extends TestCase {

    public static final String TESTSTATION_C_GLN = "7640166731092";
    public static final String TEST_PRODUCER_GLN = "1234567890124";
    public static final String TEST_APOTHEKE_GLN = "7640166731061";

    public static final String ASPIRIN_TEST_GTIN = "21342431";
    public static final String DAFALGAN_TEST_GTIN = "2341341355";

    public static final String TEST_PATIENT_ID = "6";
    public static final String TEST_PRESC_KIS_ID_ASPIRINE = "12";
    public static final String TEST_PRESC_KIS_ID_DAFALGAN = "13";


    public static String aGeneratedSSCC;
    public static SupplyChainService service;
    public static ObservableList<Position> positions;
    public static Order testOrder;

    @BeforeClass
    @Override
    public void setUp() {
        service = new SupplyChainService();
    }



    //Single Tests
    /**
    public void testGetCheckedInItems() throws Exception {
        String gln = "1234567890124";
        SupplyChainService service = new SupplyChainService();
        WebServiceResult result = service.getCheckedInItems(gln);
        Assert.assertEquals("Count of TrackedItems in db for gln 1234567890123 is 4.", 4, result.getItems().size());
    }

    public void testGetItemsBySSCC() throws Exception {
        String sscc = "106141410000098765";
        List<Item> itemList;
        SupplyChainService service = new SupplyChainService();
        itemList = service.getItemsBySSCC(sscc);

        Assert.assertEquals("Count of items in db for sscc 106141410000098764 is 4.", 4, itemList.size());
    }

    public void testSetOrder() throws Exception {
        Order order = new Order("Order",null,true);
        ObservableList<Position> positions = FXCollections.observableArrayList();
        positions.add(new Position("21342431", "Aspirin", 10));
        positions.add(new Position("2341341355", "Dafalgan", 10));
        order.setPositions(positions);
        service.setOrder(order, null, null);
    }

    public void testGetQuantities() throws Exception {
        Order order = new Order("Order 7",null,true);
      ObservableList<Position> positions = FXCollections.observableArrayList();
       positions.add(new Position("21342431", "Aspirin", 10));
        positions.add(new Position("2341341355", "Dafalgan", 10));
        order.setPositions(positions);
        service.processOrder(order, "1234567890124", "1234567890125");
    }

    public void testProcessOrder() throws Exception {
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

    public void testGetPatients() throws Exception {
        List<TrspPatient> trspPatients = service.getPatients();
        Assert.assertNotNull(trspPatients);
        Assert.assertTrue(trspPatients.size() == 5);

    }


    public void testGetPreparedPrescriptionsCountForPatient() throws Exception {
        SupplyChainService service = new SupplyChainService();
        List<TrspPatient> patients = service.getPatients();
        for (TrspPatient patient : patients) {
            System.out.println(patient.getFirstname() + " " + patient.getLastname() + " | prepared prescription count:" + service.getPreparedPrescriptionsCountForPatient(Integer.toString(patient.getPid())));
        }
    }

    public void testUpdateDispensedMedication() throws Exception {
        SupplyChainService service = new SupplyChainService();
        List<TrspPrescription> prescriptions = service.getPreparedPrescriptionsForPatient("1");

        //service.updateDispensedMedication(prescriptions.get(0), "1");
    }

     */


    /*

    Testitem mit minimalem Bestand 1 und Optimalem bestand 2

    1.Bestellung machen von Mindestbestand 0

    Lieferung erstellen

    Lieferung Hersteller auschecken (Kontrolle ob in Tracked Item Tabelle: Produziert und Ausgechecked)

    Einchecken Spital (Kontrolle TrackedItem eingechecked)

    Auschecken Spitalapotheke (Kontrolle Tracked Item ausgechecked)

    Einchecken Stationsapotheke (Kontrolle TrackedItem eingechecked)

    Loop bis Bestand 0 des Medikaments {
    Medikament richten (Kontrolle anzahl gerichtete Medikamente für patient)

    Medikament abgaben (Kontrolle anzahl Medikamente gerichtet, abgegeben, Trackeditems, Menge Produkteinheiten)

    }

    Kontrolle Bestand weniger als Optimaler Bestand

    Wiederholen bei 1 (Gesamthaft 3 mal Durchgang)

     */

    //Teststation A: GLN 7640166731078


    @Test
    public void testAOrderWithMinunitsZero() {
        //Bestand in der Apotheke kontrollieren
        WebServiceResult result = service.getCheckedInItems(TEST_APOTHEKE_GLN);
        List<Item> checkedInItems =  result.getItems().stream()
                .filter(i ->
                        i.getGTIN().equals(ASPIRIN_TEST_GTIN)
                                || i.getGTIN().equals(DAFALGAN_TEST_GTIN)).collect(Collectors.toList());
        HashMap<String, Integer> checkedInItemsCount = new HashMap<>();
        testOrder = new Order("TestOrder 7", null, false);
        positions = FXCollections.observableArrayList();

        Assert.assertTrue("Assert that there is no Stock of Testitems", checkedInItems.size() == 0);

        for (Item checkedInItem : checkedInItems) {
            if (checkedInItemsCount.containsKey(checkedInItem.getGTIN())) {
                checkedInItemsCount.replace(
                        checkedInItem.getGTIN(),
                        checkedInItemsCount.get(checkedInItem.getGTIN())+1
                );
            } else {
                checkedInItemsCount.put(checkedInItem.getGTIN(),1);
            }
        }

        List<Quantity> quantities =  service.getQuantities(TEST_APOTHEKE_GLN).stream()
                .filter(i ->
                        i.getGtin().equals(ASPIRIN_TEST_GTIN)
                                || i.getGtin().equals(DAFALGAN_TEST_GTIN)).collect(Collectors.toList());
        for (Quantity quantity : quantities) {
            int count = checkedInItemsCount.size() > 0 ? checkedInItemsCount.get(quantity.getGtin()) : 0;

            Assert.assertTrue("There should be no Quantity yet in Stock", count == 0);

            if (quantity.getMinQuantity() >= count) {
                positions.add(
                        new Position(quantity.getGtin(), quantity.getDescription(), quantity.getOptQuantity()));
            }
        }

        testOrder.setPositions(positions);

        Assert.assertTrue("For each testItem not in Stock, a new Position should be generated", positions.size() == 2);
        Assert.assertTrue("The Quantity ordered should be 2", positions.get(0).getQuantity() == 2);
        Assert.assertTrue("The Quantity ordered should be 2", positions.get(1).getQuantity() == 2);

    }

    @Test
    public void testBCreateOrder() {


        service.setOrder(testOrder, TEST_APOTHEKE_GLN, TEST_APOTHEKE_GLN);
        List<Order> openOrdersByGLN = service.getOpenOrdersByGLN(TEST_APOTHEKE_GLN);

        Assert.assertTrue("Es gibt nur 1 Testorder", openOrdersByGLN.size() == 1);
        testOrder = openOrdersByGLN.get(0);

        Production production = service.processOrder(testOrder, TEST_PRODUCER_GLN, TESTSTATION_C_GLN);

        Shipment s = production.getShipment();
        aGeneratedSSCC = s.getSscc();

        Assert.assertTrue("The SSCC should not be empty", !aGeneratedSSCC.equals(""));


        //wird beim Produzieren ware auf eingechecked gesetzt?
        List<Item> producedItems = production.getItems();

        WebServiceResult result = service.getCheckedInItems(TEST_PRODUCER_GLN);
        boolean allMatch = result.getItems().parallelStream().allMatch(i ->
                        producedItems.parallelStream().anyMatch(
                                p -> i.getGTIN().equals(p.getGTIN()) &&
                                        i.getExpiryDate().equals(p.getExpiryDate()) &&
                                        i.getLot().equals(p.getLot()) &&
                                        i.getSerial().equals(p.getSerial())

                        )
        );

        Assert.assertTrue("There should be no more Items from the produced and checkout items", allMatch);

    }

    @Test
    public void testCCheckoutItemsProducer() {

        List<Item> producedItems =  service.getItemsBySSCC(aGeneratedSSCC);
        WebServiceResult result = service.checkoutItems(producedItems, TEST_PRODUCER_GLN);

        Assert.assertTrue("Checkout should be successfull", result.isResult());
        Assert.assertTrue("All Items should be sucessfully checked out,", result.getItems().size() == 0);

        result = service.getCheckedInItems(TEST_PRODUCER_GLN);
        boolean anyMatch = result.getItems().parallelStream().anyMatch(i ->
                        producedItems.parallelStream().anyMatch(
                                p -> i.getGTIN().equals(p.getGTIN()) &&
                                        i.getExpiryDate().equals(p.getExpiryDate()) &&
                                        i.getLot().equals(p.getLot()) &&
                                        i.getSerial().equals(p.getSerial())

                        )
        );

        Assert.assertFalse("There should be no more Items from the produced and checkout items", anyMatch);
    }

    //optionally test for checkin/checkout Hospital Logistics
    @Test
    public void testDCheckinHospitalPharmacy() {
        List<Item> itemsToCheckin =  service.getItemsBySSCC(aGeneratedSSCC);
        WebServiceResult result = service.checkinItems(itemsToCheckin, TEST_APOTHEKE_GLN);
        Assert.assertTrue("Checkin should be successfull", result.isResult());
        Assert.assertTrue("All Items should be sucessfully checked in,", result.getItems().size() == 0);

        result = service.getCheckedInItems(TEST_APOTHEKE_GLN);
        boolean allMatch = result.getItems().parallelStream().allMatch(i ->
                        itemsToCheckin.parallelStream().anyMatch(
                                p -> i.getGTIN().equals(p.getGTIN()) &&
                                        i.getExpiryDate().equals(p.getExpiryDate()) &&
                                        i.getLot().equals(p.getLot()) &&
                                        i.getSerial().equals(p.getSerial())

                        )
        );

        Assert.assertTrue("There should be no more Items from the produced and checkout items", allMatch);

    }

    @Test
    public void testECheckoutHospitalPharmacy() {
        List<Item> checkoutedItems =  service.getItemsBySSCC(aGeneratedSSCC);
        WebServiceResult result = service.checkoutItems(checkoutedItems, TEST_APOTHEKE_GLN);

        Assert.assertTrue("Checkout should be successfull", result.isResult());
        Assert.assertTrue("All Items should be sucessfully checked out,", result.getItems().size() == 0);

        result = service.getCheckedInItems(TEST_APOTHEKE_GLN);
        boolean anyMatch = result.getItems().parallelStream().anyMatch(i ->
                        checkoutedItems.parallelStream().anyMatch(
                                p -> i.getGTIN().equals(p.getGTIN()) &&
                                        i.getExpiryDate().equals(p.getExpiryDate()) &&
                                        i.getLot().equals(p.getLot()) &&
                                        i.getSerial().equals(p.getSerial())

                        )
        );

        Assert.assertFalse("There should be no more Items from the produced and checkout items", anyMatch);
    }
    @Test
    public void testFCheckinStation() {
        WebServiceResult result = service.getCheckedInItems(TESTSTATION_C_GLN);
        List<Item> checkedInItems =  result.getItems().stream()
                .filter(i ->
                        i.getGTIN().equals(ASPIRIN_TEST_GTIN)
                                || i.getGTIN().equals(DAFALGAN_TEST_GTIN)).collect(Collectors.toList());
        HashMap<String, Integer> checkedInItemsCount = new HashMap<>();
        testOrder = new Order("TestOrder", null, false);
        positions = FXCollections.observableArrayList();

        Assert.assertTrue("Assert that there is no Stock of Testitems", checkedInItems.size() == 0);


        List<Item> itemsToCheckin =  service.getItemsBySSCC(aGeneratedSSCC);
        result = service.checkinItems(itemsToCheckin, TESTSTATION_C_GLN);
        Assert.assertTrue("Checkin should be successfull", result.isResult());
        Assert.assertTrue("All Items should be sucessfully checked in,", result.getItems().size() == 0);

        result = service.getCheckedInItems(TESTSTATION_C_GLN);
        boolean allMatch = result.getItems().parallelStream().allMatch(i ->
                        itemsToCheckin.parallelStream().anyMatch(
                                p -> i.getGTIN().equals(p.getGTIN()) &&
                                        i.getExpiryDate().equals(p.getExpiryDate()) &&
                                        i.getLot().equals(p.getLot()) &&
                                        i.getSerial().equals(p.getSerial())

                        )
        );

        Assert.assertTrue("There should be no more Items from the produced and checkout items", allMatch);

        //Mengen sollten den Beständen entsprechend, da Stationsbestand = Apothekenbestand und der bestelle Bestand
        // weitergereicht wurde.

    }

    @Test
    public void testGPrepareFirstRound() {

        //Prerequisites: Testprescription with dafalgan &  testprescription with asprine
        //Prepare

        int prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        int preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);

        Assert.assertTrue("Es gibt 2 Veordnungen", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 0 vorbereitete Verordnungen", preparedPrescriptionsCountForPatient == 0);

        List<TrspPrescription> prescriptions = service.getPrescriptionsForPatient(TEST_PATIENT_ID);
        WebServiceResult result = service.getCheckedInItems(TESTSTATION_C_GLN);
        Item anAspirine = result.getItems().parallelStream().filter(i -> i.getGTIN().equals(ASPIRIN_TEST_GTIN))
                .findFirst().get();
        Item aDafalagn = result.getItems().parallelStream().filter(i -> i.getGTIN().equals(DAFALGAN_TEST_GTIN))
                .findFirst().get();

        Assert.assertNotNull("Aspirin ist nicht NULL", anAspirine);
        Assert.assertNotNull("Dafalgan ist nicht NULL", aDafalagn);

        //prepare one: there should be 1 open prescription

        TrspPrescription aspririnPrescription = prescriptions.stream().filter(p -> p.getPolypointID().equals(TEST_PRESC_KIS_ID_ASPIRINE))
                .findFirst().get();
        Assert.assertTrue("Verordnung enthält Aspirin",
                aspririnPrescription.getMedications().get(0).getGtinA().equals(ASPIRIN_TEST_GTIN));

        TrspPreparedMedication medication = aspririnPrescription.getMedications().get(0);
        medication.setState(TrspPreparedMedication.MedicationState.controlled);
        medication.setGtinFromAssignedItem(anAspirine.getGTIN());
        medication.setExpiryDate(anAspirine.getExpiryDate());
        medication.setBatchLot(anAspirine.getLot());
        medication.setSerial(anAspirine.getSerial());
        medication.setPreparationTime(LocalDateTime.now());

        service.updatePreparedMedications(aspririnPrescription.getMedications(),
                TrspPreparedMedication.MedicationState.prepared, TESTSTATION_C_GLN);

        prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es gibt 2 Veordnungen", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 1 vorbereitete Verordnungen", preparedPrescriptionsCountForPatient == 1);

        //prepare second: there should be 2 open prescriptions
        TrspPrescription dafalganPrescription = prescriptions.stream().filter(p -> p.getPolypointID().equals(TEST_PRESC_KIS_ID_DAFALGAN))
                .findFirst().get();
        Assert.assertTrue("Verordnung enthält Dafalgan",
                dafalganPrescription.getMedications().get(0).getGtinA().equals(DAFALGAN_TEST_GTIN));
        medication = dafalganPrescription.getMedications().get(0);
        medication.setState(TrspPreparedMedication.MedicationState.controlled);
        medication.setGtinFromAssignedItem(aDafalagn.getGTIN());
        medication.setExpiryDate(aDafalagn.getExpiryDate());
        medication.setBatchLot(aDafalagn.getLot());
        medication.setSerial(aDafalagn.getSerial());
        medication.setPreparationTime(LocalDateTime.now());

        service.updatePreparedMedications(dafalganPrescription.getMedications(),
                TrspPreparedMedication.MedicationState.prepared, TESTSTATION_C_GLN);

        prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es gibt 2 Veordnungen", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 2 vorbereitete Verordnungen", preparedPrescriptionsCountForPatient == 2);

    }

    @Test
    public void testHServeFirstRound() {
        //Serve

        //serve one: there should be 1 open prescription
        List<TrspPrescription> preparedPrescriptionsForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es wurden 2 vorbereitete Verordnungen gefunden.", preparedPrescriptionsForPatient.size() == 2);

        preparedPrescriptionsForPatient.get(0).getMedications().get(0).setState(TrspPreparedMedication.MedicationState.served);
        service.updateDispensedMedication(preparedPrescriptionsForPatient.get(0), TESTSTATION_C_GLN);

        int prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        int preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es gibt 2 Veordnungen.", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 1 vorbereitete Verordnungen.", preparedPrescriptionsCountForPatient == 1);

        //serve second: there should be 0 open prescriptions
        preparedPrescriptionsForPatient = service.getPreparedPrescriptionsForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es wurde nur 1 vorbereitete Verordnung geladen.", preparedPrescriptionsForPatient.size() == 1);

        preparedPrescriptionsForPatient.get(0).getMedications().get(0).setState(TrspPreparedMedication.MedicationState.served);
        service.updateDispensedMedication(preparedPrescriptionsForPatient.get(0), TESTSTATION_C_GLN);

        prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es gibt 2 Veordnungen.", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 0 vorbereitete Verordnungen.", preparedPrescriptionsCountForPatient == 0);
    }

    @Test
    public void testIPrepareSecondRound() {
//Prerequisites: Testprescription with dafalgan &  testprescription with asprine
        //Prepare

        //Prerequisites: Testprescription with dafalgan &  testprescription with asprine
        //Prepare

        int prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        int preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);

        Assert.assertTrue("Es gibt 2 Veordnungen", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 0 vorbereitete Verordnungen", preparedPrescriptionsCountForPatient == 0);

        List<TrspPrescription> prescriptions = service.getPrescriptionsForPatient(TEST_PATIENT_ID);
        WebServiceResult result = service.getCheckedInItems(TESTSTATION_C_GLN);
        Item anAspirine = result.getItems().parallelStream().filter(i -> i.getGTIN().equals(ASPIRIN_TEST_GTIN))
                .findFirst().get();
        Item aDafalagn = result.getItems().parallelStream().filter(i -> i.getGTIN().equals(DAFALGAN_TEST_GTIN))
                .findFirst().get();

        Assert.assertNotNull("Aspirin ist nicht NULL", anAspirine);
        Assert.assertNotNull("Dafalgan ist nicht NULL", aDafalagn);

        //prepare one: there should be 1 open prescription

        TrspPrescription aspririnPrescription = prescriptions.stream().filter(p -> p.getMedications().get(0).getGtinA().equals(ASPIRIN_TEST_GTIN))
                .findFirst().get();
        Assert.assertTrue("Verordnung enthält Aspirin",
                aspririnPrescription.getMedications().get(0).getGtinA().equals(ASPIRIN_TEST_GTIN));

        TrspPreparedMedication medication = aspririnPrescription.getMedications().get(0);
        medication.setState(TrspPreparedMedication.MedicationState.controlled);
        medication.setGtinFromAssignedItem(anAspirine.getGTIN());
        medication.setExpiryDate(anAspirine.getExpiryDate());
        medication.setBatchLot(anAspirine.getLot());
        medication.setSerial(anAspirine.getSerial());
        medication.setPreparationTime(LocalDateTime.now());

        service.updatePreparedMedications(aspririnPrescription.getMedications(),
                TrspPreparedMedication.MedicationState.prepared, TESTSTATION_C_GLN);

        prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es gibt 2 Veordnungen", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 1 vorbereitete Verordnungen", preparedPrescriptionsCountForPatient == 1);

        //prepare second: there should be 2 open prescriptions
        TrspPrescription dafalganPrescription = prescriptions.stream().filter(p -> p.getMedications().get(0).getGtinA().equals(DAFALGAN_TEST_GTIN))
                .findFirst().get();
        Assert.assertTrue("Verordnung enthält Dafalgan",
                dafalganPrescription.getMedications().get(0).getGtinA().equals(DAFALGAN_TEST_GTIN));
        medication = dafalganPrescription.getMedications().get(0);
        medication.setState(TrspPreparedMedication.MedicationState.controlled);
        medication.setGtinFromAssignedItem(aDafalagn.getGTIN());
        medication.setExpiryDate(aDafalagn.getExpiryDate());
        medication.setBatchLot(aDafalagn.getLot());
        medication.setSerial(aDafalagn.getSerial());
        medication.setPreparationTime(LocalDateTime.now());

        service.updatePreparedMedications(dafalganPrescription.getMedications(),
                TrspPreparedMedication.MedicationState.prepared, TESTSTATION_C_GLN);

        prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es gibt 2 Veordnungen", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 2 vorbereitete Verordnungen", preparedPrescriptionsCountForPatient == 2);
    }

    @Test
    public void testJServeSecondRound() {
        //Serve

        //serve one: there should be 1 open prescription
        List<TrspPrescription> preparedPrescriptionsForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es wurden 2 vorbereitete Verordnungen gefunden.", preparedPrescriptionsForPatient.size() == 2);

        preparedPrescriptionsForPatient.get(0).getMedications().get(0).setState(TrspPreparedMedication.MedicationState.served);
        service.updateDispensedMedication(preparedPrescriptionsForPatient.get(0), TESTSTATION_C_GLN);

        int prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        int preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es gibt 2 Veordnungen.", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 1 vorbereitete Verordnungen.", preparedPrescriptionsCountForPatient == 1);

        //serve second: there should be 0 open prescriptions
        preparedPrescriptionsForPatient = service.getPreparedPrescriptionsForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es wurde nur 1 vorbereitete Verordnung geladen.", preparedPrescriptionsForPatient.size() == 1);

        preparedPrescriptionsForPatient.get(0).getMedications().get(0).setState(TrspPreparedMedication.MedicationState.served);
        service.updateDispensedMedication(preparedPrescriptionsForPatient.get(0), TESTSTATION_C_GLN);

        prescriptionsCountForPatient = service.getPrescriptionsForPatient(TEST_PATIENT_ID).size();
        preparedPrescriptionsCountForPatient = service.getPreparedPrescriptionsCountForPatient(TEST_PATIENT_ID);
        Assert.assertTrue("Es gibt 2 Veordnungen.", prescriptionsCountForPatient == 2);
        Assert.assertTrue("Es gibt 0 vorbereitete Verordnungen.", preparedPrescriptionsCountForPatient == 0);

    }

    @Test
    public void testKOrderWithMinunitsOne() {

        //Nach 2 mailiger Abgabe: Bestand von beiden Medikamenten sollten um 1 abnehmen,
        // da inhalt 1 und somit vergabe 1 inhalt = abnahme bestand 1

        //beim erneuten start der ganzen tests sollte dann effektiv nur noch je 1 bestellt werden (min = 1, optimal 2)
        //Bestellung erfolgt aufgrund verglich <= mindesmenge

        service = new SupplyChainService();
        WebServiceResult result = service.getCheckedInItems(TESTSTATION_C_GLN);
        List<Item> checkedInItems =  result.getItems().stream()
                .filter(i ->
                        i.getGTIN().equals(ASPIRIN_TEST_GTIN)
                                || i.getGTIN().equals(DAFALGAN_TEST_GTIN)).collect(Collectors.toList());
        HashMap<String, Integer> checkedInItemsCount = new HashMap<>();
        testOrder = new Order("TestOrder", null, false);
        positions = FXCollections.observableArrayList();

        Assert.assertTrue("Assert that there is no Stock of Testitems", checkedInItems.size() == 0);

        for (Item checkedInItem : checkedInItems) {
            if (checkedInItemsCount.containsKey(checkedInItem.getGTIN())) {
                checkedInItemsCount.replace(
                        checkedInItem.getGTIN(),
                        checkedInItemsCount.get(checkedInItem.getGTIN())+1
                );
            } else {
                checkedInItemsCount.put(checkedInItem.getGTIN(),1);
            }
        }

        List<Quantity> quantities =  service.getQuantities(TESTSTATION_C_GLN).stream()
                .filter(i ->
                        i.getGtin().equals(ASPIRIN_TEST_GTIN)
                                || i.getGtin().equals(DAFALGAN_TEST_GTIN)).collect(Collectors.toList());
        for (Quantity quantity : quantities) {
            int count = checkedInItemsCount.size() > 0 ? checkedInItemsCount.get(quantity.getGtin()) : 0;

            Assert.assertTrue("There should be no Quantity yet in Stock", count == 0);

            if (quantity.getMinQuantity() >= count) {
                positions.add(
                        new Position(quantity.getGtin(), quantity.getDescription(), quantity.getOptQuantity()));
            }
        }

        Assert.assertTrue("For each testItem not in Stock, a new Position should be generated", positions.size() == 2);
        Assert.assertTrue("The Quantity ordered should be 2", positions.get(0).getQuantity() == 1);
        Assert.assertTrue("The Quantity ordered should be 2", positions.get(1).getQuantity() == 1);

    }



    public void testZ() {
        /*Delete Testdata from database:
        - Tracked Items
        - Secondary Items
        - orders
        - shipments
        -
        -
        -
        -
        */

        DbConnectorLogistic connectorLogistic = new DbConnectorLogistic();
        Connection connection = connectorLogistic.getConnection();
        ResultSet rs;

        String orderDelete = "delete from [SupplyChainLogistic].[dbo].[Order]\n" +
                "where OrderNr >= 7";

        String testPrescriptionDelete = "delete from MediPrep_Prescription\n" +
                "where PatientPolypointID=6 AND PolypointID > 13";

        try {

            java.sql.Statement st = connection.createStatement();
            st.execute(orderDelete);
            st.execute(testPrescriptionDelete);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //Test if only secondary packes could be moved inside hospital

}