package ui;

import SwissIndex.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import model.entities.Pharma;
import model.entities.User;
import services.barcoding.IBarcodeParsedEventListener;

import javax.xml.rpc.ServiceException;
import java.net.URL;
import java.rmi.RemoteException;
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

    public ObservableList<Pharma> data =  FXCollections.observableArrayList();

    private Main application;

    @Override
    public void setBarcode(String barcode, String barcodeType, int id) {

        Ws_Pharma_V101Locator locator = new Ws_Pharma_V101Locator();
        Ws_Pharma_V101Soap_PortType service = null;
        try {

            service = locator.getws_Pharma_V101Soap();

            PHARMA de = service.getByGTIN(barcode, "de");

            System.out.println("looking for GTIN: " + barcode);

            if (de.getITEM() != null) {
                for (PHARMAITEM pharmaitem : de.getITEM()) {
                    if (pharmaitem != null) {
                        PHARMAITEMCOMP comp = pharmaitem.getCOMP();
                        //labelItem.setText("EAN: "+ barcode + ", Firma: " + comp.getNAME() + ", GLN: " + comp.getGLN());
                        System.out.println("Firma: " + comp.getNAME() + ", GLN: " + comp.getGLN());
                        String info = "Beschreibung: " + pharmaitem.getDSCR() + "\n"
                                + "Zusatz: " + pharmaitem.getADDSCR() + "\n"
                                + "GTIN: " + barcode + "\n"
                                + "ATC Code:" + pharmaitem.getATC() + "\n\n"
                                + "Firma: " + comp.getNAME() + ", \nGLN: " + comp.getGLN();
                        txtareaMediInfo.setText(info);

                        data.add(new Pharma(pharmaitem.getDSCR(), pharmaitem.getADDSCR(), comp.getGLN(), comp.getNAME(), "123"));
                    } else {
                        txtareaMediInfo.setText("Artikel mit Code " + barcode + " nicht gefunden. Versuchen Sie einen erneuten Scan.");
                    }
                }
            } else {
                txtareaMediInfo.setText("Artikel mit Code " + barcode + " nicht gefunden. Versuchen Sie einen erneuten Scan.");
            }

        } catch (ServiceException e) {
            e.printStackTrace();
            txtareaMediInfo.setText("Keine Verbindung zu SwissINDEX.");
        } catch (RemoteException e) {
            e.printStackTrace();
            txtareaMediInfo.setText("Keine Verbindung zu SwissINDEX.");
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
                new PropertyValueFactory<Pharma,String>("Name")
        );
        tblColMenge.setCellValueFactory(
                new PropertyValueFactory<Pharma,String>("Menge")
        );
        tableColGLN.setCellValueFactory(
                new PropertyValueFactory<Pharma,String>("GLN")
        );
        tablColHrst.setCellValueFactory(
                new PropertyValueFactory<PHARMAITEM,String>("Lot")
        );

        medList.setItems(data);
    }

    public void checkOut(ActionEvent actionEvent) {
    }

    public void checkIn(ActionEvent actionEvent) {
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
}
