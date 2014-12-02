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
    public static enum CODE_IDENTITY { BARCODE, DATAMATRIX, GS1_128 };
    /*
    * Different Prefixes are possbile for the different types
    * */
    public static final String BARCODE = "FË0";
    public static final String DATAMATRIX01 = "Dm¨d1";
    public static final String DATAMATRIX02 = "Dm1";
    public static final String DATAMATRIX03 = "Dm¨¨d1";
    public static final String GS1_128 = "*¨C1";
    public static HashMap barcodeTypes;

    static {
        barcodeTypes = new HashMap<Integer, String>();

        barcodeTypes.put(BARCODE, CODE_IDENTITY.BARCODE);
        barcodeTypes.put(DATAMATRIX01,CODE_IDENTITY.DATAMATRIX);
        barcodeTypes.put(DATAMATRIX02,CODE_IDENTITY.DATAMATRIX);
        barcodeTypes.put(DATAMATRIX03,CODE_IDENTITY.DATAMATRIX);
        barcodeTypes.put(GS1_128,CODE_IDENTITY.GS1_128);
    }


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
    public static BarcodeInformation decode(String barcodeString, CODE_IDENTITY identity)
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

    public static ScannedString parseScannedString(String scannedString) throws NotImplementedBarcodeTypeException {
        for (Object key: barcodeTypes.keySet() ) {
            String k = (String) key;
            //are the first chars according to the length of the current key equal?
            if (scannedString.trim().substring(0,k.length()).equals(k)) {
                //matches a key, so probably a valid barcode entered
                 return new ScannedString(scannedString.trim().substring(k.length()), (CODE_IDENTITY)barcodeTypes.get(key), 0);
            }
        }

        throw new NotImplementedBarcodeTypeException();
    }

}
