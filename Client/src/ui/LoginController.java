package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>Controller Class for the login view. Provides the method of the login button, to validate the user input.</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 14-11-2014
 */
public class LoginController extends AnchorPane implements Initializable {

    @FXML
    TextField userId;
    @FXML
    PasswordField password;
    @FXML
    Button login;
    @FXML
    Label errorMessage;

    private Main application;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errorMessage.setText("");
        userId.setPromptText("username");
        password.setPromptText("password");

        //TODO: Remove to enable login input
        userId.setText("test");
        password.setText("test");

    }

    public void processLogin(ActionEvent event) {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            errorMessage.setText("Hello " + userId.getText());
        } else {
            if (!application.authenticate(userId.getText(), password.getText())){
                errorMessage.setText("Username/Password is incorrect (hint: try test/test)");
            }
        }
    }

    public void setApp(Main main) {
        this.application = main;
        this.processLogin(new ActionEvent());
    }
}
