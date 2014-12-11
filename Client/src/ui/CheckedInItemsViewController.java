package ui;

import data.IDataSource;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.ErpClient;
import services.PropertiesReader;
import webservice.erp.Item;
import webservice.erp.WebServiceResult;

import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * BTX8202 (Living Case 2), HS2014</br>
 *
 *<p></p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 10-12-2014
 */
public class CheckedInItemsViewController implements Initializable{
    public TableView itemList;
    public javafx.scene.control.TableColumn tableColName;
    public javafx.scene.control.TableColumn tableColMenge;
    public javafx.scene.control.TableColumn tableColGTIN;
    public javafx.scene.control.TableColumn tableColSerial;
    public javafx.scene.control.TableColumn tableColLot;
    public javafx.scene.control.TableColumn tableColAblauf;
    public javafx.scene.control.TableColumn tableColCheckInDate;
    public ObservableList<Item> data =  FXCollections.observableArrayList();

    IDataSource dataSource;
    Properties prop;

    private Main application;

    @FXML
    public void Event(ActionEvent actionEvent) {
        //labelItem.setText("Button clicked...please Scan item..");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setApp(Main.instance);
        getCheckedInItems();
    }

    public void checkOut(ActionEvent actionEvent) {

    }
    public void processLogout(ActionEvent event) {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            return;
        }

        application.userLogout();
    }
    public void backToStockView(ActionEvent event) {
        Navigator.loadVista(Navigator.STOCK_VIEW, Main.instance);
    }

    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void nextPane(ActionEvent event) {
        Navigator.loadVista(Navigator.STOCK_VIEW, Main.instance);
    }

    public void setApp(Main main) {
        this.application = main;
        try {
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
            dataSource = new ErpClient(prop.getProperty("stationGLN"));

        } catch (ConnectException e ) {
            e.printStackTrace();
        } catch(WebServiceException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void getCheckedInItems() {
        WebServiceResult result = dataSource.getCheckedInItems(prop.getProperty("stationGLN"));
        data.setAll(result.getItems());

        final ObservableList columns = itemList.getColumns();
        tableColName.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Name")
        );
        tableColMenge.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Menge")
        );
        tableColGTIN.setCellValueFactory(
                new PropertyValueFactory<Item,String>("GTIN")
        );
        tableColSerial.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Serial")
        );
        tableColLot.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Lot")
        );
        tableColAblauf.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Ablaufdatum")
        );
        tableColCheckInDate.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Check-In")
        );


        itemList.setItems(data);

        itemList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object o2) {
                if (itemList.getSelectionModel().getSelectedItem() != null) {
                }
            }
        });

    }
}
