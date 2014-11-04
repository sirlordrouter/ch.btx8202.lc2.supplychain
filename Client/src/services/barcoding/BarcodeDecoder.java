package services.barcoding;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * Modul </br>
 *
 *<p>
 * BarcodeDecoder for the DataLogic 3200 VSI.
 * Decodes a Barcode string without post- and prefix. The AIM ID (Automatic Identified Manufacturers ID) must be
 * in front of the string (something like "] F modifier").
 * Please refer to the DataLogic Product Reference Guide to program this option on (by default AIM is disabled)
 * http://www.datalogic.com/tools/download.aspx?iddwnfile=11877&path=%2fupload%2fmarketlit%2fmanuals%2f820037314.pdf&name=820037314
 *</p>
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 23-10-2014
 */
public class BarcodeDecoder {

    /**
     *
     */
    public static final int GS1_128 = 0;
    /**
     * GS1
     */
    public static final int EAN = 1;
    /**
     *
     */
    public static final int DATAMATRIX = 2;
    /**
     *
     */
    public static final int DATABAR = 3;

    /**
     *
     * @param barcodeString
     */
    public static Barcode decode(String barcodeString) {

        return new Barcode();
    }

}
