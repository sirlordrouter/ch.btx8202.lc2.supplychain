package bartender;

import junit.framework.TestCase;
import webservice.erp.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>Test class for the BartenderGenerator.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 21-10-2014
 */
public class BartenderGeneratorTest extends TestCase {
    public void testGenerator() throws Exception {
        //BartenderGenerator gen = new BartenderGenerator();
        //gen.createSSCCtriggerFile("1234","Station","12345","BFH","12343523525");

        List<Item> items=new ArrayList<>();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setBeschreibung("Dafalgan");
        item2.setBeschreibung("Aspirin");
        item1.setExpiryDate("120190");
        item1.setGTIN("213213133122");
        item1.setLot("AS113323");
        item1.setSerial("ASDA34234242");
        item2.setExpiryDate("120190");
        item2.setGTIN("213213133122");
        item2.setLot("AS113323");
        item2.setSerial("ASDA34234242");
        items.add(item1);
        items.add(item2);

        //gen.createDataMatrixtriggerFile(items);
    }
}
