package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: MediPrep
 * Package: ui
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 13.04.15
 */
public class AddMedDialog extends Stage implements Initializable {

    /**
     * Sample Skeleton for 'AddMedDialog.fxml' Controller Class
     */

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtLot"
    private TextField txtLot; // Value injected by FXMLLoader

    @FXML // fx:id="txtExpiryDate"
    private TextField txtExpiryDate; // Value injected by FXMLLoader

    @FXML // fx:id="txtSerial"
    private TextField txtSerial; // Value injected by FXMLLoader

    @FXML // fx:id="txtGtin"
    private TextField txtGtin; // Value injected by FXMLLoader$

    @FXML
    private Label lblName;
    private boolean canceled = false;

    public AddMedDialog(Parent parent, String gtin, String name)
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddMedDialog.fxml"));
        fxmlLoader.setController(this);


        try {
            setScene(new Scene((Parent) fxmlLoader.load()));
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        this.txtGtin.setText(gtin);
        this.lblName.setText(name);
        this.txtGtin.setEditable(false);
    }


    @FXML
    void save(ActionEvent event) {
        close();
    }

    @FXML
    void cancel(ActionEvent event) {

        this.canceled = true;
        close();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert txtLot != null : "fx:id=\"txtLot\" was not injected: check your FXML file 'AddMedDialog.fxml'.";
        assert txtExpiryDate != null : "fx:id=\"txtExpiryDate\" was not injected: check your FXML file 'AddMedDialog.fxml'.";
        assert txtSerial != null : "fx:id=\"txtSerial\" was not injected: check your FXML file 'AddMedDialog.fxml'.";
        assert txtGtin != null : "fx:id=\"txtGtin\" was not injected: check your FXML file 'AddMedDialog.fxml'.";
    }

    public TextField getTxtLot() {
        return txtLot;
    }

    public void setTxtLot(TextField txtLot) {
        this.txtLot = txtLot;
    }

    public TextField getTxtExpiryDate() {
        return txtExpiryDate;
    }

    public void setTxtExpiryDate(TextField txtExpiryDate) {
        this.txtExpiryDate = txtExpiryDate;
    }

    public TextField getTxtSerial() {
        return txtSerial;
    }

    public void setTxtSerial(TextField txtSerial) {
        this.txtSerial = txtSerial;
    }

    public TextField getTxtGtin() {
        return txtGtin;
    }

    public void setTxtGtin(TextField txtGtin) {
        this.txtGtin = txtGtin;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
