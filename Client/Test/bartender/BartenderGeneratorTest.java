package bartender;

import junit.framework.TestCase;

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
        BartenderGenerator gen = new BartenderGenerator();
        gen.createSSCCtriggerFile();
    }
}
