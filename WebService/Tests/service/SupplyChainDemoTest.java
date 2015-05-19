package service;

import entities.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: WebService
 * Package: service
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 27.04.15
 */
public class SupplyChainDemoTest {

    public static final String TESTSTATION_C_GLN = "7640166731099";
    public static final String TEST_PRODUCER_GLN = "1234567890124";
    public static final String TEST_APOTHEKE_GLN = "1234567890125";

    public static final String ASPIRIN_TEST_GTIN = "21342431";
    public static final String DAFALGAN_TEST_GTIN = "2341341355";

    public static final String TEST_PATIENT_ID = "4";
    public static final String TEST_PRESC_KIS_ID_ASPIRINE = "12";
    public static final String TEST_PRESC_KIS_ID_DAFALGAN = "13";


    public static String aGeneratedSSCC;
    public static SupplyChainService service;
    public static ObservableList<Position> positions;
    public static Order testOrder;

    public SupplyChainDemoTest() {
        service = new SupplyChainService();
    }



}
