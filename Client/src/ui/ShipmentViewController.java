package ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.VBox;
import services.ErpClient;
import services.IDataSource;
import services.PropertiesReader;
import webservice.erp.Item;

import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>This class handles the gui elements of the ShipmentView.fxml.
 * Manufacturer has the possibility to process an open order (generate identifiers for products and
 * initialize them in the database.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 03-03-2015
 */
public class ShipmentViewController extends VBox implements Initializable,IPartialView {
    public TreeTableView orderTable;
    public Button processButton,refreshButton;
    public ObservableList<Item> data =  FXCollections.observableArrayList();



    IDataSource dataSource;
    Properties prop;

    public ShipmentViewController(String fxml) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        try {
            // get the properties
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
            // get a connection object to the webservice
            dataSource = new ErpClient(prop.getProperty("stationGLN"));

        } catch (ConnectException e ) {
            e.printStackTrace();
        } catch(WebServiceException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void nextPane(ActionEvent event) {
        Navigator.getInstance().loadVista(Navigator.HOME_VIEW);
    }


    @Override
    public void beforeLeaving() {

    }

    @Override
    public void beforeOpen() {

    }

    public void setOrderTable(){

    }
}
