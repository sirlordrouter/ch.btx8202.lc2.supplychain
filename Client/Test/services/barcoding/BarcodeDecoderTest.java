package services.barcoding;

import junit.framework.TestCase;
import org.junit.Assert;

public class BarcodeDecoderTest extends TestCase {

    public void testDecode() throws Exception {

        String datamatrix = ")01=7680475040157)17=151231)10=ABCDEF123456)21=35722388370DBCDEF";
        String gs1_128 = "00106141410000098764";
        String gs1_13 = "7680475040157";
        String gs1_128_ext = ")00=106141410000098765)17=151231";

        BarcodeInformation dataMatrixInformation = new BarcodeInformation(null, "7680475040157", null, "ABCDEF123456", null, "151231", "35722388370DBCDEF");
        BarcodeInformation gs1128Information = new BarcodeInformation("106141410000098764");
        BarcodeInformation gs1128Information_2 = new BarcodeInformation("106141410000098765", null, null, null,null,"151231");
        BarcodeInformation gs113Information = new BarcodeInformation(null, "7680475040157");

        BarcodeInformation dataMatrixInformationDecoded;
        BarcodeInformation gs1128InformationDecoded;
        BarcodeInformation gs113InformationDecoded;
        BarcodeInformation gs1128_2_InformationDecoded;

        try {
            dataMatrixInformationDecoded = BarcodeDecoder.decode(datamatrix, BarcodeGlobalListener.CODE_IDENTITY.DATAMATRIX);
            gs1128InformationDecoded = BarcodeDecoder.decode(gs1_128, BarcodeGlobalListener.CODE_IDENTITY.GS1_128);
            gs113InformationDecoded = BarcodeDecoder.decode(gs1_13, BarcodeGlobalListener.CODE_IDENTITY.BARCODE);
            gs1128_2_InformationDecoded = BarcodeDecoder.decode(gs1_128_ext, BarcodeGlobalListener.CODE_IDENTITY.GS1_128);
        } catch (NotImplementedBarcodeTypeException e) {
            throw new AssertionError("No valid code identity provided");
        }

        Assert.assertNotNull(dataMatrixInformationDecoded);
        Assert.assertNotNull(gs1128InformationDecoded);
        Assert.assertNotNull(gs113InformationDecoded);
        Assert.assertNotNull(gs1128_2_InformationDecoded);

        Assert.assertEquals("Is decoded matrix information equal.", dataMatrixInformation, dataMatrixInformationDecoded);
        Assert.assertEquals("Is decoded gs1 128 information equal.", gs1128Information, gs1128InformationDecoded);
        Assert.assertEquals("Is decoded gs1 13 information equal.", gs113Information, gs113InformationDecoded);
        Assert.assertEquals("Is decoded gs1 128 information equal.", gs1128Information_2, gs1128_2_InformationDecoded);

    }
}