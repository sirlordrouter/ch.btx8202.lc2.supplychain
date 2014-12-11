package ui;

import data.IDataSource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import services.ErpClient;
import services.PropertiesReader;

import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.URL;
import java.net.ConnectException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by ph on 10.12.14.
 */
public class CheckedInItemsViewController implements Initializable{

    IDataSource dataSource;

    private Main application;

    @FXML
    public void Event(ActionEvent actionEvent) {
        //labelItem.setText("Button clicked...please Scan item..");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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

    }

    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void nextPane(ActionEvent event) {
        Navigator.loadVista(Navigator.STOCK_VIEW);
    }

    public void setApp(Main main) {
        this.application = main;
        Properties prop = null;
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

    }
}
