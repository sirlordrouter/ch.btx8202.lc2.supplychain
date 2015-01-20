package ui;

import barcode.Barcode;
import barcode.BarcodeDecoder;
import barcode.BarcodeInformation;
import barcode.ScannedString;
import barcodeHook.Scanner;
import barcodeHook.ScannerEvent;
import barcodeHook.ScannerListener;
import data.IDataSource;
import exceptions.BarcodeNotDeserializeableException;
import exceptions.NotImplementedBarcodeTypeException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.entities.SwissIndexResult;
import model.entities.TradeItem;
import services.ErpClient;
import services.PropertiesReader;
import services.SwissIndexClient;
import ui.state.IAuthenticationStateChanger;
import ui.state.IAuthenticationStateContext;
import webservice.erp.Item;
import webservice.erp.WebServiceResult;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>Controller class for the StockView.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public class StockViewController extends ChangeableView implements ScannerListener, IAuthenticationStateChanger {

    public Label dateTimeField;
    public VBox mainFrame;
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
    public TextField txtInput;

    public ObservableList<Item> data =  FXCollections.observableArrayList();
    IDataSource dataSource;

    private IAuthenticationStateContext application;

    public StockViewController(String fxml) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        Scanner.addScannerEventListener(this, "(/", 0);
        Properties prop = null;
        try {
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
            dataSource = new ErpClient(prop.getProperty("stationGLN"));
        }
        catch (IOException e) {
            e.printStackTrace();
            locationField.setText("Configuration could not be read!");
        }

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
                new PropertyValueFactory<Item,String>("Serial")
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
        txtInput.requestFocus();
    }

    @FXML
    public void Event(ActionEvent actionEvent) {
        //labelItem.setText("Button clicked...please Scan item..");
    }


    public void checkOut(ActionEvent actionEvent) {
        WebServiceResult result = dataSource.checkoutItems(data);
        //clear list
        data.clear();
        //Ev. Log Information
        if(!result.getItems().isEmpty()){
            String userInformation = "Folgende Produkte konnten nicht ausgecheckt werden, da " +
                    "sie bis anhin nicht eingecheckt wurden:";
            for(Item item:result.getItems()){
                userInformation = userInformation + "\n";
                userInformation = userInformation + "GTIN: " + item.getGTIN();
                userInformation = userInformation + " - Serial: " + item.getSerial();
            }
            UserInformationPopup popup = new UserInformationPopup(userInformation, "Achtung.");
            popup.show();
        }

    }

    public void checkIn(ActionEvent actionEvent) {
        WebServiceResult result = dataSource.checkinItems(data);
        //clear list
        data.clear();
        //Ev. Log Information
        if(!result.getItems().isEmpty()){
            String userInformation = "Folgende Produkte konnten nicht eingecheckt werden, da keine Bestellung für sie vorliegt:";
            for(Item item:result.getItems()){
                userInformation = userInformation + "\n";
                userInformation = userInformation + "GTIN: " + item.getGTIN();
                userInformation = userInformation + " - Serial: " + item.getSerial();
            }
            UserInformationPopup popup = new UserInformationPopup(userInformation, "Achtung.");
            popup.show();
        }
    }

    public void processLogout(ActionEvent event) {
        Scanner.removeScannerListener(this);

        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            return;
        }

        application.userLogout();
    }

    public void loadCheckInView(ActionEvent event) {
        Scanner.removeScannerListener(this);
        Navigator.getInstance().loadVista(Navigator.CHECKED_IN_ITEMS_VIEW);
    }

    public void addItem(ActionEvent actionEvent) {
        try {
            List<Item> items;
            BarcodeInformation info = null;
            if (!txtInput.getText().equals("")) {
                if(txtInput.getText().trim().startsWith("(/F")) {
                    ScannedString ss = BarcodeDecoder.parseScannedString(txtInput.getText().trim().substring(2));
                    BarcodeInformation bi = BarcodeDecoder.decode(ss.getBarcodeData(), ss.getCodeIdentity());
                    TradeItem item = null;
                    SwissIndexResult result = SwissIndexClient.getItemInformationFromGTIN(bi.getAI01_HANDELSEINHEIT());
                    if(result.isResult()){
                        item = result.getTradeItems().get(0);
                    }else{
                        UserInformationPopup popup = new UserInformationPopup(result.getMessage(), "Achtung");
                        popup.show();
                        return;
                    }

                    if (item != null) {
                        item.setGTIN(txtGTIN.getText());
                        item.setSerial(txtSeriennummer.getText());
                        item.setLot(txtBatch.getText());
                        //Set Expiry Date when Service updated
                        txtareaMediInfo.setText(item.toString());
                        data.add(item);
                        clearItemInput();
                    } else {
                        txtareaMediInfo.setText("Kein Item gefunden.");
                    }
                }else if(txtInput.getText().trim().startsWith("(/D")){
                    ScannerEvent evt = new ScannerEvent(this,null,null,null,0);
                    evt.setBarCode(txtInput.getText().trim().substring(2));
                    Barcode code = BarcodeDecoder.getBarcodeFrom(evt);
                    info =  code.getBarcodeInformation();
                    if (info.getAI01_HANDELSEINHEIT() != null) {
                        Item i = dataSource.getItemByIdentifier(info.getAI01_HANDELSEINHEIT(), info.getAI21_SERIAL_NUMBER());
                        retrieveItemInformation(i);
                        }


                }else if(txtInput.getText().trim().startsWith("(/*")){
                    ScannerEvent evt = new ScannerEvent(this,null,null,null,0);
                    evt.setBarCode(txtInput.getText().trim().substring(2));
                    Barcode code = BarcodeDecoder.getBarcodeFrom(evt);
                    info =  code.getBarcodeInformation();
                    if (info.getAI00_SSCC() != null) {
                        if(dataSource == null ) {
                            System.out.println("No Webservice available.");
                        }
                        items = dataSource.getItemsBySSCC(info.getAI00_SSCC());
                        for (Item item : items) {
                            retrieveItemInformation(item);
                        }
                    }

                }
            }
            txtInput.setText("");
        } catch (NotImplementedBarcodeTypeException e) {
            System.out.println("hello world");
        } catch (BarcodeNotDeserializeableException e) {
            e.printStackTrace();
        }
    }

    private void clearItemInput() {
        txtGTIN.setText("");
        txtSeriennummer.setText("");
        txtBatch.setText("");
        txtExpiryDate.setText("");
        txtInput.setText("");
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

    @Override
    public void handleScannerEvent(ScannerEvent evt) {
        List<Item> items;
        BarcodeInformation info = null;

        txtareaMediInfo.setText("Barcode " + evt.getBarCode() + " gescannt.");
        Barcode code = BarcodeDecoder.getBarcodeFrom(evt);
        info =  code.getBarcodeInformation();
        if(info != null) {
            txtareaMediInfo.appendText(info.toString());


            if (info.getAI00_SSCC() != null) {
                if(dataSource == null ) {
                    System.out.println("No Webservice available.");
                }
                items = dataSource.getItemsBySSCC(info.getAI00_SSCC());
                for (Item item : items) {
                    retrieveItemInformation(item);
                }
            } else if(info.getAI01_HANDELSEINHEIT() != null) {
                Item i = dataSource.getItemByIdentifier(info.getAI01_HANDELSEINHEIT(), info.getAI21_SERIAL_NUMBER());
//                i.setGTIN(info.getAI01_HANDELSEINHEIT());
                retrieveItemInformation(i);
            } else {
                //Well then... no idea wwhat to do => there is no usable data stored here...
                System.out.println("No Data Found for Barcode...");
            }
        } else {
            System.out.println("Info was null");
        }

    }

    private void retrieveItemInformation(Item item) {
        TradeItem i = null;
        SwissIndexResult result = SwissIndexClient.getItemInformationFromGTIN(item.getGTIN());
        if(result.isResult()){
            i = result.getTradeItems().get(0);
        }else{
            UserInformationPopup popup = new UserInformationPopup(result.getMessage(), "Achtung");
            popup.show();
            return;
        }
        i.setSerial(item.getSerial());
        i.setLot(item.getLot());
        i.setExpiryDate(item.getExpiryDate());
        i.setCheckInDate(item.getCheckInDate());

        if (i != null) {
            txtareaMediInfo.setText(i.toString());
            data.add(i);
        }else {
            txtareaMediInfo.setText("Kein Item gefunden.");
        }
    }



    public void resetTrackedItems(ActionEvent actionEvent) {
        dataSource.resetTrackedItems();
    }

    @Override
    public void setApp(IAuthenticationStateContext context) {
        this.application = context;
    }
}
