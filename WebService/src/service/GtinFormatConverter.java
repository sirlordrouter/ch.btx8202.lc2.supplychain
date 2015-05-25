package service;


import service.exceptions.ConversionException;
import service.exceptions.NotCorrectEANLenghtException;

/**
 * Created by Johannes on 17.03.15.
 */
public class GtinFormatConverter {

    /**
     * Generates the Checkdigit for any GTIN13/14 or SSCC
     * Verify SSCC/GTINs: https://www.gs1-germany.de/gs1-consult/services-tools/pruefziffernrechner/
     * @param digits
     * @return checkdigit
     */
    public static int calc_checksumDigit(int[] digits) {
        int sum = 0;
        int multiplier = 3;
        for (int i=digits.length-1; i>=0; i--) {
            sum += digits[i] * multiplier;
            multiplier = (multiplier == 3) ? 1 : 3;
        }

        return (10-sum % 10);
    }

    /**
     * Converts a 13 digit ean into a 14 digit by appending a 0 according to specification
     *
     * @param an 13 digit gtin
     * @return
     * @throws NotCorrectEANLenghtException
     */
    public static String ConvertEan13To14(String number) throws NotCorrectEANLenghtException {
        String newEan = "";
        if (number.length() != 13) {
            throw new NotCorrectEANLenghtException();
        }

        //append 0 and remove checkdigit
        newEan = "0" + number.substring(0,number.length()-1);
        int checkdigit = calc_checksumDigit(
                charToIntArray(
                        newEan.split("(?!^)")));
        newEan = newEan + checkdigit;
        return newEan;
    }

    public static String ConvertEan14To13(String number) throws NotCorrectEANLenghtException, ConversionException {
        String newEan = "";
        //Assert 0 on beginn and lenght 14
        if (number.length() != 14) {
            throw new NotCorrectEANLenghtException();
        }
        if(!number.startsWith("0")) {
            throw new ConversionException("Cannot convert EAN 14 to 13 digit EAN: No leading 0 suggests 14 digits only EAN");
        }

        //append 0 and remove checkdigit
        newEan = number.substring(1,number.length()-1);
        int checkdigit = calc_checksumDigit(
                charToIntArray(
                        newEan.split("(?!^)")));
        newEan = newEan + checkdigit;

        return newEan;
    }

    public static int[] charToIntArray(String[] chars) {
        int count = chars.length;
        int[] numbers = new int[count];

        for (int i = 0; i<count; i++) {
            numbers[i] = Integer.parseInt(chars[i]);
        }

        return numbers;

    }


}
