package services;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.time.format.DateTimeParseException;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: MediPrep
 * Package: services
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 22.05.15
 */
public class HelpersTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testParseDateFrom() throws Exception {
        String resultDate = "2015-05-20";
        String testDate1 = "20.05.2015";
        String testDate2 = "20/05/2015";
        String testDate3 = "20052015";
        String testDate4 = "200515";
        String testDate5 = "20150520";
        String testDate6 = "2015/05/20";
        String testDate7 = "2015-05-20";
        String testDate8 = "20-05-2015";
        String testDate9 = "20.05.2015";



        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate1));
        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate2));
        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate3));
        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate4));
        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate5));
        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate6));
        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate7));
        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate8));
        Assert.assertEquals("", resultDate,Helpers.parseDateFrom(testDate9));

        //wrong date => assert Exception

    }

    @Test(expected = DateTimeParseException.class)
    public void testParseDataFromWrongDate() {
        String wrongDate = "asdasd";
        Helpers.parseDateFrom(wrongDate);
    }
}