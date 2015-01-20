package data;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>This Class establishes a connection to the Database specified in the properties file.</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 18-11-2014
 */
public class DbConnectorLogistic {

    private Properties props;

    public DbConnectorLogistic() {
        PropertiesReader reader = new PropertiesReader();
        try {
            props = reader.getPropValues();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            // load the driver
            Class.forName("net.sourceforge.jtds.jdbc.Driver");

            return DriverManager.getConnection(
                    props.getProperty("dbStringLogistic"),
                    props.getProperty("username"),
                    props.getProperty("password"));

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
