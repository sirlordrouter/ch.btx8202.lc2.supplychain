package ui;

import javafx.application.Platform;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import services.PropertiesReader;
import ui.state.IAuthenticationStateContext;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>Controller class for the main view. Credits: https://gist.github.com/jewelsea/6460130</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public class MainController implements Initializable {
    public Label dateTimeField;
    public Label userField;
    public Label locationField;
    public Image imgProfilePicture;

    public Label statusLineLabel;
    public ProgressIndicator statusLineIndicator;

    public ObservableValue<Boolean> getIsShowing() {
        return isShowing;
    }

    public void SetisShowingProperty(SimpleBooleanProperty val) {
        isShowing = val;
    }

    private ObservableValue<Boolean> isShowing = new SimpleBooleanProperty(false);

    /** Holder of a switchable vista. */
    @FXML
    private VBox vistaHolder;

    private IAuthenticationStateContext application;

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

        Platform.runLater(() -> this.setStatusbarEmpty());

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


    public void openStockView(ActionEvent actionEvent) {
        Navigator.getInstance().loadVista(Navigator.STOCK_VIEW);
    }

    public void openHomeView(ActionEvent actionEvent) {
        Navigator.getInstance().loadVista(Navigator.HOME_VIEW);
    }

    public void openOrderView(ActionEvent actionEvent) {
        Navigator.getInstance().loadVista(Navigator.ORDER_VIEW);
    }

    public void openPendingOrdersView(ActionEvent actionEvent) {

    }

    public void logout(ActionEvent actionEvent) {
        Navigator.getInstance().logout();
    }

    public void openShipmentView(ActionEvent actionEvent) {Navigator.getInstance().loadVista(Navigator.SHIPMENT_VIEW);}

    public void openTrackerView(ActionEvent actionEvent) {Navigator.getInstance().loadVista(Navigator.TRACKER_VIEW);}

    public void setStatusbarWaiting(String infotext) {
        statusLineIndicator.setVisible(true);
        //SetisShowingProperty(new SimpleBooleanProperty(true));
        statusLineLabel.setText(infotext);
    }

    public void setStatusbarEmpty() {
   //     statusLineIndicator.setVisible(false);
    //    statusLineLabel.setText("");
    }

    public void setStatusbarText(String infotext) {

        SetisShowingProperty(new SimpleBooleanProperty(false));
        statusLineLabel.setText(infotext);
    }
}
