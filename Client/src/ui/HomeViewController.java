package ui;

import barcode.*;
import barcodeHook.Scanner;
import barcodeHook.ScannerEvent;
import barcodeHook.ScannerListener;
import exceptions.BarcodeNotDeserializeableException;
import exceptions.ConversionException;
import exceptions.NotCorrectEANLenghtException;
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
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import model.entities.SwissIndexResult;
import model.entities.TradeItem;
import services.ErpClient;
import services.IDataSource;
import services.PropertiesReader;
import services.SwissIndexClient;
import ui.state.IAuthenticationStateContext;
import webservice.erp.Item;
import webservice.erp.WebServiceResult;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>
 *     Controller class for the StockView.
 *     Webview: http://docs.oracle.com/javafx/2/webview/jfxpub-webview.htm (Medication Pictures from Compendium)
 *
 * </p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public class HomeViewController extends VBox implements ScannerListener,IPartialView {

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
    public javafx.scene.control.TableColumn tableColName;
    public javafx.scene.control.TableColumn tableColQuantity;
    public javafx.scene.control.TableColumn tableColGTIN;
    public javafx.scene.control.TableColumn tableColSerial;
    public TextField txtExpiryDate;
    public TextField txtBatch;
    public TextField txtSerial;
    public TextField txtGTIN;
    public TextField txtInput;
    public WebView medicationWebView;

    public ObservableList<Item> data =  FXCollections.observableArrayList();
    IDataSource dataSource;

    private IAuthenticationStateContext application;

    public HomeViewController(String fxml) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }


        Properties prop = null;
        try {
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
            dataSource = new ErpClient(prop.getProperty("currentGLN"));
        }
        catch (IOException e) {
            e.printStackTrace();
            locationField.setText("Configuration could not be read!");
        }

        final ObservableList columns = medList.getColumns();


        tableColName.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Name")
        );
        tableColQuantity.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Menge")
        );
        tableColGTIN.setCellValueFactory(
                new PropertyValueFactory<Item,String>("GTIN")
        );
        tableColSerial.setCellValueFactory(
                new PropertyValueFactory<Item,String>("Serial")
        );

        medList.setItems(data);

        medList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object o2) {
                if (medList.getSelectionModel().getSelectedItem() != null) {
                    txtareaMediInfo.setText(o2.toString());
                    WebEngine webEngine =medicationWebView.getEngine();
                    webEngine.load("http://pictures.documed.ch/wa_getphoto/wv_getPhoto.aspx?lang=de&query=pharmacode=" + ((TradeItem)o2).getPharmaCode());

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

        Navigator.getInstance().getMainController().setStatusbarWaiting("checking out items...");

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
            Navigator.getInstance().getMainController().setStatusbarEmpty();

            UserInformationPopup popup = new UserInformationPopup(userInformation, "Achtung.");
            popup.show();
        }
        Navigator.getInstance().getMainController().setStatusbarEmpty();

    }

    public void checkIn(ActionEvent actionEvent) {
        Navigator.getInstance().getMainController().setStatusbarWaiting("checking in items...");

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
            Navigator.getInstance().getMainController().setStatusbarEmpty();
            UserInformationPopup popup = new UserInformationPopup(userInformation, "Achtung.");
            popup.show();
        }
        Navigator.getInstance().getMainController().setStatusbarEmpty();
    }

    /**
     * Adds an item to the list f scanned items
     * @param actionEvent
     * button event
     */
    public void addItem(ActionEvent actionEvent) {
        Navigator.getInstance().getMainController().setStatusbarWaiting("adding found items...");

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
                        Navigator.getInstance().getMainController().setStatusbarEmpty();
                        UserInformationPopup popup = new UserInformationPopup(result.getMessage(), "Achtung");
                        popup.show();
                        return;
                    }

                    if (item != null) {
                        item.setGTIN(txtGTIN.getText());
                        item.setSerial(txtSerial.getText());
                        item.setLot(txtBatch.getText());
                        //Set Expiry Date when Service updated
                        txtareaMediInfo.setText(item.toString());
                        data.add(item);

                        WebEngine webEngine =medicationWebView.getEngine();
                        webEngine.load("http://pictures.documed.ch/wa_getphoto/wv_getPhoto.aspx?lang=de&query=pharmacode=" + item.getPharmaCode());

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
                    if (info != null && info.getAI00_SSCC() != null) {
                        if(dataSource == null ) {
                            System.out.println("No Webservice available.");
                        }
                        items = dataSource.getItemsBySSCC(info.getAI00_SSCC());
                        for (Item item : items) {
                            retrieveItemInformation(item);

 //                           WebEngine webEngine =medicationWebView.getEngine();
//                            webEngine.load("http://pictures.documed.ch/wa_getphoto/wv_getPhoto.aspx?lang=de&query=pharmacode=" + ((TradeItem)item).getPharmaCode());
                        }
                    }

                }

            }
            if (!txtGTIN.getText().equals("")) {
                TradeItem item = null;
                SwissIndexResult result = SwissIndexClient.getItemInformationFromGTIN(txtGTIN.getText());
                if(result.isResult()){
                    item = result.getTradeItems().get(0);
                }else{
                    Navigator.getInstance().getMainController().setStatusbarEmpty();
                    UserInformationPopup popup = new UserInformationPopup(result.getMessage(), "Achtung");
                    popup.show();
                    return;
                }

                if (item != null) {
                    item.setGTIN(txtGTIN.getText());
                    item.setSerial(txtSerial.getText());
                    item.setLot(txtBatch.getText());
                    txtareaMediInfo.setText(item.toString());
                    data.add(item);
                    clearItemInput();
                } else {
                    txtareaMediInfo.setText("Kein Item gefunden.");
                }

            }
            txtInput.setText("");
            txtGTIN.setText("");
        } catch (NotImplementedBarcodeTypeException e) {
            Navigator.getInstance().getMainController().setStatusbarEmpty();
            System.out.println("hello world");
        } catch (BarcodeNotDeserializeableException e) {
            Navigator.getInstance().getMainController().setStatusbarEmpty();
            e.printStackTrace();
        }
        Navigator.getInstance().getMainController().setStatusbarEmpty();
    }

    private void clearItemInput() {
        txtGTIN.setText("");
        txtSerial.setText("");
        txtBatch.setText("");
        txtExpiryDate.setText("");
        txtInput.setText("");
    }

    /**
     * Clears the list with scanned items
     * @param actionEvent
     *  button event
     */
    public void clearList(ActionEvent actionEvent) {
        data.clear();
        txtareaMediInfo.setText("Keine Einträge.");
    }

    /**
     * Deletes a specific item from the list of scanned items
     * @param actionEvent
     *  button event
     */
    public void deleteItem(ActionEvent actionEvent) {
        if (medList.getSelectionModel().getSelectedItem() != null) {
            data.remove(medList.getSelectionModel().getSelectedItem());
        }
    }

    /**
     *
     * @param evt
     *  an event generated from the scanner listening for barcodes.
     */
    @Override
    public void handleScannerEvent(ScannerEvent evt) {
        Navigator.getInstance().getMainController().setStatusbarWaiting("scanned item is evaluated...");

        List<Item> items;
        BarcodeInformation info = null;

        txtareaMediInfo.setText("Barcode " + evt.getBarCode() + " gescannt.");
        Barcode code = BarcodeDecoder.getBarcodeFrom(evt);
        info =  code.getBarcodeInformation();
        if(info != null) {
            txtareaMediInfo.appendText(info.toString());
            //TODO: in datamatrix 14 digit gtins were used, in this project (also swissindex) ist working with 13 digits, so change it if necessary
            if (info.getAI01_HANDELSEINHEIT()!= null && info.getAI01_HANDELSEINHEIT().length() == 14) {
                try {
                   if (info.getAI01_HANDELSEINHEIT() != null) {info.setAI01_HANDELSEINHEIT(GtinFormatConverter.ConvertEan14To13(info.getAI01_HANDELSEINHEIT()));}
                   if(info.getAI02_ENTHALTENE_EINHEIT() != null) {info.setAI02_ENTHALTENE_EINHEIT(GtinFormatConverter.ConvertEan14To13(info.getAI02_ENTHALTENE_EINHEIT()));}
                } catch (NotCorrectEANLenghtException e) {
                    e.printStackTrace();
                } catch (ConversionException e) {
                    e.printStackTrace();
                }
            }

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
                Navigator.getInstance().getMainController().setStatusbarEmpty();
                //Well then... no idea wwhat to do => there is no usable data stored here...
                System.out.println("No Data Found for Barcode...");
            }
        } else {
            Navigator.getInstance().getMainController().setStatusbarEmpty();
            System.out.println("Info was null");
            txtareaMediInfo.setText("Could not extract Information from Code: Info was null");
        }
        Navigator.getInstance().getMainController().setStatusbarEmpty();

    }

    private void retrieveItemInformation(Item item) {

        TradeItem tradeItem = null;
        SwissIndexResult swissIndexResult = null;
        if(item.getGTIN().length() > 10) {
            swissIndexResult = SwissIndexClient.getItemInformationFromGTIN(item.getGTIN());
        }
        if(swissIndexResult!=null && swissIndexResult.isResult()){
            tradeItem = swissIndexResult.getTradeItems().get(0);
            tradeItem.setExpiryDate(item.getExpiryDate());
            tradeItem.setLot(item.getLot());
            tradeItem.setSerial(item.getSerial());
            tradeItem.setCheckInDate(item.getCheckInDate());
        }else{
            System.out.println("Keine GTIN gefunden: " + item.getGTIN());
            tradeItem = SwissIndexClient.ItemConstructor("Keine Info", "Keine Info",
                    item.getGTIN(), item.getLot(), item.getSerial(),
                    "Keine Info", "Keine Info", "Keine Info",null, null);
        }

        if (tradeItem != null) {
            tradeItem.setExpiryDate(item.getExpiryDate());
            tradeItem.setCheckInDate(item.getCheckInDate());
            tradeItem.setLot(item.getLot());
            tradeItem.setSerial(item.getSerial());
            txtareaMediInfo.setText(tradeItem.toString());
            data.add(tradeItem);
        }else {
            txtareaMediInfo.setText("Kein Item gefunden.");
        }
    }

    /**
     * Resets the Database for a new Demonstration of the whole supply chain process
     * @param actionEvent
     * button event
     */
    public void resetTrackedItems(ActionEvent actionEvent) {
        dataSource.resetTrackedItems();
    }

    @Override
    public void beforeLeaving() {
        Scanner.removeScannerListener(this);
    }

    @Override
    public void beforeOpen() {
        Scanner.addScannerEventListener(this, "(/", 0);
    }
}
