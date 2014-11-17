package ui;

import data.IDataSource;
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
import services.SwissIndexClient;
import services.barcoding.IBarcodeParsedEventListener;
import webservice.erp.Item;
import webservice.swissindex.PHARMAITEM;

import java.net.URL;
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
    IDataSource dataSource = new ErpClient();

    private Main application;

    @Override
    public void setBarcode(String barcode, String barcodeType, int id) {

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
                new PropertyValueFactory<PHARMAITEM,String>("Lot")
        );

        medList.setItems(data);
    }

    public void checkOut(ActionEvent actionEvent) {
        dataSource.checkoutItems(data);
        //clear list
        data.removeAll();
        //Ev. Log Information
    }

    public void checkIn(ActionEvent actionEvent) {
        dataSource.checkinItems(data);
        //clear list
        data.removeAll();
        //Ev. Log Information
    }

    public void setApp(Main main) {
        this.application = main;
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
            //Set Expiry Date
            txtareaMediInfo.setText(item.toString());
            data.add(item);
        }else {
            txtareaMediInfo.setText("Kein Item gefunden.");
        }

        clearItemInput();
    }

    private void clearItemInput() {
        txtGTIN.setText("");
        txtSeriennummer.setText("");
        txtBatch.setText("");
        txtExpiryDate.setText("");
    }

}
