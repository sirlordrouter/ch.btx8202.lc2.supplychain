package services.barcoding;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * Modul </br>
 *
 *<p>Class Description</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 24-10-2014
 */
public class BarcodeInformation {

    private String AI00_SSCC;
    private String AI01_HANDELSEINHEIT;
    private String AI02_ENTHALTENE_EINHEIT;
    private String AI10_CHARGENNUMMER;
    private String AI11_PRODUKTIONSDATUM;
    private String AI17_VERFALLSDATUM;
    private String AI21_SERIAL_NUMBER;

    public BarcodeInformation(String AI00_SSCC) {
        this.AI00_SSCC = AI00_SSCC;
    }

    public BarcodeInformation(String AI00_SSCC, String AI01_HANDELSEINHEIT) {
        this.AI00_SSCC = AI00_SSCC;
        this.AI01_HANDELSEINHEIT = AI01_HANDELSEINHEIT;
    }

    public BarcodeInformation(String AI00_SSCC, String AI01_HANDELSEINHEIT, String AI02_ENTHALTENE_EINHEIT) {
        this.AI00_SSCC = AI00_SSCC;
        this.AI01_HANDELSEINHEIT = AI01_HANDELSEINHEIT;
        this.AI02_ENTHALTENE_EINHEIT = AI02_ENTHALTENE_EINHEIT;
    }

    public BarcodeInformation(String AI00_SSCC, String AI01_HANDELSEINHEIT, String AI02_ENTHALTENE_EINHEIT, String AI10_CHARGENNUMMER) {
        this.AI00_SSCC = AI00_SSCC;
        this.AI01_HANDELSEINHEIT = AI01_HANDELSEINHEIT;
        this.AI02_ENTHALTENE_EINHEIT = AI02_ENTHALTENE_EINHEIT;
        this.AI10_CHARGENNUMMER = AI10_CHARGENNUMMER;
    }

    public BarcodeInformation(String AI00_SSCC, String AI01_HANDELSEINHEIT, String AI02_ENTHALTENE_EINHEIT, String AI10_CHARGENNUMMER, String AI11_PRODUKTIONSDATUM) {
        this.AI00_SSCC = AI00_SSCC;
        this.AI01_HANDELSEINHEIT = AI01_HANDELSEINHEIT;
        this.AI02_ENTHALTENE_EINHEIT = AI02_ENTHALTENE_EINHEIT;
        this.AI10_CHARGENNUMMER = AI10_CHARGENNUMMER;
        this.AI11_PRODUKTIONSDATUM = AI11_PRODUKTIONSDATUM;
    }

    public BarcodeInformation(String AI00_SSCC, String AI01_HANDELSEINHEIT, String AI02_ENTHALTENE_EINHEIT, String AI10_CHARGENNUMMER, String AI11_PRODUKTIONSDATUM, String AI17_VERFALLSDATUM) {
        this.AI00_SSCC = AI00_SSCC;
        this.AI01_HANDELSEINHEIT = AI01_HANDELSEINHEIT;
        this.AI02_ENTHALTENE_EINHEIT = AI02_ENTHALTENE_EINHEIT;
        this.AI10_CHARGENNUMMER = AI10_CHARGENNUMMER;
        this.AI11_PRODUKTIONSDATUM = AI11_PRODUKTIONSDATUM;
        this.AI17_VERFALLSDATUM = AI17_VERFALLSDATUM;
    }

    public BarcodeInformation(String AI00_SSCC, String AI01_HANDELSEINHEIT, String AI02_ENTHALTENE_EINHEIT, String AI10_CHARGENNUMMER, String AI11_PRODUKTIONSDATUM, String AI17_VERFALLSDATUM, String AI21_SERIAL_NUMBER) {
        this.AI00_SSCC = AI00_SSCC;
        this.AI01_HANDELSEINHEIT = AI01_HANDELSEINHEIT;
        this.AI02_ENTHALTENE_EINHEIT = AI02_ENTHALTENE_EINHEIT;
        this.AI10_CHARGENNUMMER = AI10_CHARGENNUMMER;
        this.AI11_PRODUKTIONSDATUM = AI11_PRODUKTIONSDATUM;
        this.AI17_VERFALLSDATUM = AI17_VERFALLSDATUM;
        this.AI21_SERIAL_NUMBER = AI21_SERIAL_NUMBER;
    }

    public String getAI00_SSCC() {
        return AI00_SSCC;
    }

    public void setAI00_SSCC(String AI00_SSCC) {
        this.AI00_SSCC = AI00_SSCC;
    }

    public String getAI01_HANDELSEINHEIT() {
        return AI01_HANDELSEINHEIT;
    }

    public void setAI01_HANDELSEINHEIT(String AI01_HANDELSEINHEIT) {
        this.AI01_HANDELSEINHEIT = AI01_HANDELSEINHEIT;
    }

    public String getAI02_ENTHALTENE_EINHEIT() {
        return AI02_ENTHALTENE_EINHEIT;
    }

    public void setAI02_ENTHALTENE_EINHEIT(String AI02_ENTHALTENE_EINHEIT) {
        this.AI02_ENTHALTENE_EINHEIT = AI02_ENTHALTENE_EINHEIT;
    }

    public String getAI10_CHARGENNUMMER() {
        return AI10_CHARGENNUMMER;
    }

    public void setAI10_CHARGENNUMMER(String AI10_CHARGENNUMMER) {
        this.AI10_CHARGENNUMMER = AI10_CHARGENNUMMER;
    }

    public String getAI11_PRODUKTIONSDATUM() {
        return AI11_PRODUKTIONSDATUM;
    }

    public void setAI11_PRODUKTIONSDATUM(String AI11_PRODUKTIONSDATUM) {
        this.AI11_PRODUKTIONSDATUM = AI11_PRODUKTIONSDATUM;
    }

    public String getAI17_VERFALLSDATUM() {
        return AI17_VERFALLSDATUM;
    }

    public void setAI17_VERFALLSDATUM(String AI17_VERFALLSDATUM) {
        this.AI17_VERFALLSDATUM = AI17_VERFALLSDATUM;
    }

    public String getAI21_SERIAL_NUMBER() {
        return AI21_SERIAL_NUMBER;
    }

    public void setAI21_SERIAL_NUMBER(String AI21_SERIAL_NUMBER) {
        this.AI21_SERIAL_NUMBER = AI21_SERIAL_NUMBER;
    }
}
