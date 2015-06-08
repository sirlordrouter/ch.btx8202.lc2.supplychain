package services;

import webservice.erp.MediPrepResult;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis<br>
 * <p>
 * <p></p>
 * Project: MediPrep
 * Package: services
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 22.05.15
 */
public class Helpers {

    public static String parseDateFrom(String aDate) throws DateTimeParseException{

        List<String> patterns = Arrays.asList("dd/MM/yyyy", "dd-MM-yyyy", "dd.MM.yyyy", "yyMMdd",
                "ddMMyyyy", "yyyy-MM-dd", "yyyyMMdd", "yyyy/MM/dd", "yyyy.MM.dd");
        String parsed ="";
        for (String pattern : patterns) {
            try {
                LocalDate localDate = LocalDate.parse(aDate, DateTimeFormatter.ofPattern(pattern));
                parsed = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
                return parsed;
            } catch (DateTimeParseException e) { }
        }
        throw new DateTimeParseException("Datumformat wurde nicht gefunden.", aDate, -1);
    }

    public static String getWebserviceErrorCode(MediPrepResult mediPrepResult) {
        if (!mediPrepResult.isResult()) {
            /**
             * -1: Unbekannt
             * 0:
             * 1:
             * 2: DateTime Parse Exception
             * 3: No Data found to update
             * 4: Item Content is 0
             * 547: Integrity Contraint error => Product does not match stock item
             */
            switch (mediPrepResult.getErrorCode()) {
                case 0:
                    return "Fehler 0 nicht spezifiziert.";

                case 1:
                    return "Fehler 1 nicht spezifiziert.";

                case 2:
                    return "Das Ablaufdatum ist nicht analysierbar,\n " +
                            "bitte halten SIe sich an die Form ddmmyyyy";

                case 3:
                    return "Fehler 3 nicht spezifiziert.";

                case 4:
                    return "Das Produkt enthält laut Bestand keinen Inhalt mehr.\n " +
                            "Nehmen Sie eine andere Pckung";

                case 547:
                    return "Das eingegebene Produkt passt nicht zu einem Produkt im Bestand!\n" +
                            "Überprüfen Sie noch einmal das Medikament\n (Seriennummer, Batch, Ablaufdatum).";

                default:
                    return "Fehler im Webservice: Dieser Fall wurde nicht behandelt.";

            }
        } else {
            //TODO: get inserted data and set also state to controlled
            return "";
        }
    }
}
