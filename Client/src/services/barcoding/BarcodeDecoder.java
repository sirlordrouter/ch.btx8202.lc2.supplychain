package services.barcoding;

import java.util.HashMap;
import java.util.Map;

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
     * @param barcodeString
     *  information string contained in the barcode
     * @param identity
     *  type of barcode
     * @return
     *  a BarcodeInformation Object holding the deserialized Information
     * @throws NotImplementedBarcodeTypeException
     *  if none of the available types is identified
     */
    public static BarcodeInformation decode(String barcodeString, BarcodeGlobalListener.CODE_IDENTITY identity)
            throws NotImplementedBarcodeTypeException {
        switch (identity) {
            case BARCODE:
                return new BarcodeInformation(null, barcodeString);
            case DATAMATRIX:
                return deserializeBarcodeInformation(barcodeString);
            case GS1_128:
                if (barcodeString.length() == 20) {
                    return new BarcodeInformation(barcodeString.trim().substring(2));
                }
                else {
                    return deserializeBarcodeInformation(barcodeString);
                }

            default:
                throw new NotImplementedBarcodeTypeException();
        }
    }

    private static BarcodeInformation deserializeBarcodeInformation(String barcodeString) {
        BarcodeInformation barcodeInformation = new BarcodeInformation();
        String[] splitted = barcodeString.split( "\\)" );
        HashMap<Integer,String> info = new HashMap<Integer, String>();
        for (int i = 1; i < splitted.length; i++) {
            String part = splitted[i];
            int key = Integer.parseInt(part.substring(0, 2));
            String value = splitted[i].substring(3);
            info.put(key,value);
        }

        for (Map.Entry<Integer, String> entry : info.entrySet()) {
            switch (entry.getKey()) {
                case 0 :
                    barcodeInformation.setAI00_SSCC(entry.getValue());
                    break;
                case 1 :
                    barcodeInformation.setAI01_HANDELSEINHEIT(entry.getValue());
                    break;
                case 2:
                    barcodeInformation.setAI02_ENTHALTENE_EINHEIT(entry.getValue());
                    break;
                case 10 :
                    barcodeInformation.setAI10_CHARGENNUMMER(entry.getValue());
                    break;
                case 11:
                    barcodeInformation.setAI11_PRODUKTIONSDATUM(entry.getValue());
                    break;
                case 17:
                    barcodeInformation.setAI17_VERFALLSDATUM(entry.getValue());
                    break;
                case 21:
                    barcodeInformation.setAI21_SERIAL_NUMBER(entry.getValue());
                    break;
            }
        }

        return barcodeInformation;
    }

}
