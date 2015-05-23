package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
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
}
