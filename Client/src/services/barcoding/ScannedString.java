package services.barcoding;

/**
 * Created by ph on 02.12.14.
 */
public class ScannedString {

    private String barcodeData;
    private BarcodeDecoder.CODE_IDENTITY codeIdentity;
    private int scannerId;

    public ScannedString(String barcodeData, BarcodeDecoder.CODE_IDENTITY codeIdentity, int scannerId) {
        this.barcodeData = barcodeData;
        this.codeIdentity = codeIdentity;
        this.scannerId = scannerId;
    }

    public String getBarcodeData() {
        return barcodeData;
    }

    public void setBarcodeData(String barcodeData) {
        this.barcodeData = barcodeData;
    }

    public BarcodeDecoder.CODE_IDENTITY getCodeIdentity() {
        return codeIdentity;
    }

    public void setCodeIdentity(BarcodeDecoder.CODE_IDENTITY codeIdentity) {
        this.codeIdentity = codeIdentity;
    }

    public int getScannerId() {
        return scannerId;
    }

    public void setScannerId(int scannerId) {
        this.scannerId = scannerId;
    }
}
