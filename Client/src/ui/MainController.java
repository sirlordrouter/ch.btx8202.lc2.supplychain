package ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import services.PropertiesReader;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>Controller class for the main view.</p>
 * @credits https://gist.github.com/jewelsea/6460130
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public class MainController implements Initializable {
    public Label dateTimeField;
    public Label userField;
    public Label locationField;
    /** Holder of a switchable vista. */
    @FXML
    private StackPane vistaHolder;

     /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void setVista(Node node) {
        vistaHolder.getChildren().setAll(node);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Properties prop = null;
        try {
            // read properties
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();

            // get current date
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = new Date();

            // setup status bar
            String username = "Testuser";
            userField.setText("User: " + username);
            dateTimeField.setText("Datum: "+ dateFormat.format(date));
            locationField.setText(prop.getProperty("stationBezeichnung"));
        }
        catch (IOException e) {
            e.printStackTrace();
            locationField.setText("Configuration could not be read!");
        }


    }

}
