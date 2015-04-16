package service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: WebService
 * Package: service
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 16.04.15
 */
public class TimeConverter {

    public static Timestamp fromLocalDateTime(LocalDateTime localDateTime) {
        Timestamp timestamp = Timestamp.valueOf(localDateTime);

        return timestamp;
    }
}
