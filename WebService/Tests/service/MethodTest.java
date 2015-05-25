package service;

import junit.framework.TestCase;
import org.junit.Assert;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
 * @version 20.05.15
 */
public class MethodTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testSayHelloWorldFrom() throws Exception {
        LocalDate dateTime = LocalDate.now();
        dateTime = dateTime.plusYears(1);
        LocalDateTime dateTime1 = dateTime.atTime(0, 0, 0, 0);
        java.sql.Timestamp timestamp = Timestamp.valueOf(dateTime1);
        Assert.assertTrue(dateTime.getYear() == 2016);
    }
}