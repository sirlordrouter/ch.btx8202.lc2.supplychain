package services.barcoding;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * Modul </br>
 *
 *<p>GS1 Datenbezeichner gemäss 2025_datenbezeichnerkonzept</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 23-10-2014
 */
public enum BarcodeDataelements {
    SSCC ("00"),
    GTIN_HANDELSEINHEIT("01"),
    GTIN_ENTHALTENE_EINHEIT ("02"),
    CHARCHE_LOS ("10");



    private final String number;
    BarcodeDataelements(String number) {
        this.number = number;
    }
}
