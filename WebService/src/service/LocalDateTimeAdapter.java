package service;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * Serializer and Deserializer for the LocalDateTime Class.
 * </p>
 * Project: WebService
 * Package: service
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 13.04.15
 */
public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    @Override
    public LocalDateTime unmarshal(String dateString) throws Exception {
        return LocalDateTime.parse(dateString, DateTimeFormatter.ISO_DATE);
    }

    @Override
    public String marshal(LocalDateTime localDate) throws Exception {
        return DateTimeFormatter.ISO_DATE.format(localDate);
    }

}
