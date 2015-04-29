package services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

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
 * @version 25.04.15
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BarcodeGeneratorTest.class,
        WebServiceObjectFactoryTest.class
})
public class SuiteTest {
}
