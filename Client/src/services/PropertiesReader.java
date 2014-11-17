package services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * Modul </br>
 *
 *<p>Class Description</p>
 * @credits: http://crunchify.com/java-properties-file-how-to-read-config-properties-values-in-java/
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 17-11-2014
 */
public class PropertiesReader {

    public Properties getPropValues() throws IOException {

        Properties prop = new Properties();
        String propFileName = "resources/config.properties";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        prop.load(inputStream);
        if (inputStream == null) {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }

        return prop;
    }
}
