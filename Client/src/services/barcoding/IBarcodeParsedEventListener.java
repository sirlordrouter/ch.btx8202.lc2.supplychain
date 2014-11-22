package services.barcoding;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * BTX8202 (Living Case 2), HS2014</br>
 *
 *<p>An Address Class</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public interface IBarcodeParsedEventListener {
     void setBarcode(String barcode, BarcodeGlobalListener.CODE_IDENTITY identity, int scannerId);
}
