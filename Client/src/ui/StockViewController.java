package ui;

import data.IDataSource;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import model.entities.TradeItem;
import model.entities.User;
import services.ErpClient;
import services.PropertiesReader;
import services.SwissIndexClient;
import services.barcoding.BarcodeGlobalListener;
import services.barcoding.IBarcodeParsedEventListener;
import webservice.erp.Item;
import webservice.swissindex.PHARMAITEM;

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
 *<p>An Address Class</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public class StockViewController implements IBarcodeParsedEventListener, Initializable {


    public Label dateTimeField;
    public AnchorPane mainFrame;
    public Pane infoPane;
    public Label userField;
    public Label locationField;
    public AnchorPane mediInfoPane;
    public ImageView mediPicture;
    public Label mediName;
    public Pane medInfoField;
    public TableView medList;
    public Button checkOutButton;
    public Button CheckInButton;
    public ImageView produktionImage;
    public ImageView transportImage;
    public ImageView grossistImage;
    public ImageView transportImageOut;
    public ImageView stationImage;
    public ImageView bettImage;
    public TextArea txtareaMediInfo;
    public javafx.scene.control.TableColumn tblColName;
    public javafx.scene.control.TableColumn tblColMenge;
    public javafx.scene.control.TableColumn tableColGLN;
    public javafx.scene.control.TableColumn tablColHrst;
    public TextField txtExpiryDate;
    public TextField txtBatch;
    public TextField txtSeriennummer;
    public TextField txtGTIN;


    public ObservableList<Item> data =  FXCollections.observableArrayList();
    IDataSource dataSource;

    private Main application;

    @Override
    public void setBarcode(String barcode, BarcodeGlobalListener.CODE_IDENTITY barcodeType, int id) {

        //HACK
        if (barcode.startsWith("0")) {
            barcode = barcode.substring(1);
        }

        txtareaMediInfo.setText("Barcode " + barcode + " gescannt.");
        TradeItem i = SwissIndexClient.getItemInformationFromGTIN(barcode);

        if (i != null) {
            txtareaMediInfo.setText(i.toString());
            data.add(i);
        }else {
            txtareaMediInfo.setText("Kein Item gefunden.");
        }
    }

    @FXML
    public void Event(ActionEvent actionEvent) {
        //labelItem.setText("Button clicked...please Scan item..");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String username = "Testuser";
        userField.setText("User: " + username);
        dateTimeField.setText("Datum: 11-11-2014, 10:00 Uhr");
        locationField.setText("Demo Station");

        final ObservableList columns = medList.getColumns();
        tblColName.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Name")
        );
        tblColMenge.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Menge")
        );
        tableColGLN.setCellValueFactory(
                new PropertyValueFactory<Item,String>("GTIN")
        );
        tablColHrst.setCellValueFactory(
                new PropertyValueFactory<PHARMAITEM,String>("Serial")
        );

        medList.setItems(data);

        medList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object o2) {
                if (medList.getSelectionModel().getSelectedItem() != null) {
                    txtareaMediInfo.setText(o2.toString());
                }
            }
        });
    }

    public void checkOut(ActionEvent actionEvent) {
        dataSource.checkoutItems(data);
        //clear list
        data.clear();
        //Ev. Log Information
    }

    public void checkIn(ActionEvent actionEvent) {
        dataSource.checkinItems(data);
        //clear list
        data.clear();
        //Ev. Log Information
    }

    public void setApp(Main main) {
        this.application = main;
        Properties prop = null;
        try {
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
            locationField.setText(prop.getProperty("stationBezeichnung"));
            dataSource = new ErpClient(prop.getProperty("stationGLN"));
        } catch (ConnectException e ) {
            locationField.setText("No Connection to ERP WebService");
        } catch(WebServiceException e) {
            locationField.setText("No Connection to ERP WebService");
        }
        catch (IOException e) {
            e.printStackTrace();
            locationField.setText("Configuration could not be read!");
        }

        User loggedUser = application.getLoggedUser();
        userField.setText(loggedUser.getId());
    }

    public void processLogout(ActionEvent event) {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            return;
        }

        application.userLogout();
    }

    public void addItem(ActionEvent actionEvent) {
        TradeItem item = SwissIndexClient.getItemInformationFromGTIN(txtGTIN.getText());

        if (item != null) {
            item.setGTIN(txtGTIN.getText());
            item.setSerial(txtSeriennummer.getText());
            item.setLot(txtBatch.getText());
            //Set Expiry Date when Service updated
            txtareaMediInfo.setText(item.toString());
            data.add(item);
            clearItemInput();
        }else {
            txtareaMediInfo.setText("Kein Item gefunden.");
        }
    }

    private void clearItemInput() {
        txtGTIN.setText("");
        txtSeriennummer.setText("");
        txtBatch.setText("");
        txtExpiryDate.setText("");
    }

    public void clearList(ActionEvent actionEvent) {
        data.clear();
        txtareaMediInfo.setText("Keine Einträge.");
    }

    public void deleteItem(ActionEvent actionEvent) {
        if (medList.getSelectionModel().getSelectedItem() != null) {
            data.remove(medList.getSelectionModel().getSelectedItem());
        }
    }
}
