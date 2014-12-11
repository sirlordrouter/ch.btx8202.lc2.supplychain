package ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author
 * https://gist.github.com/jewelsea/6460130
 */
public class MainController implements Initializable {
    public Label dateTimeField;
    public Label userField;
    public Label locationField;
    /** Holder of a switchable vista. */
    @FXML
    private StackPane vistaHolder;

    /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void setVista(Node node) {
        vistaHolder.getChildren().setAll(node);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String username = "Testuser";
        userField.setText("User: " + username);
        dateTimeField.setText("Datum: 11-11-2014, 10:00 Uhr");
        locationField.setText("Demo Station");

    }

}
