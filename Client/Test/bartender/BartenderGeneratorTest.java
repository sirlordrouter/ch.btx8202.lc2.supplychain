package bartender;

import junit.framework.TestCase;

/**
 * Created by ph on 15.02.15.
 */
public class BartenderGeneratorTest extends TestCase {
    public void testGenerator() throws Exception {
        BartenderGenerator gen = new BartenderGenerator();
        gen.createSSCCtriggerFile();
    }
}
