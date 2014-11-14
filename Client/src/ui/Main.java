package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.entities.User;
import services.Authenticator;
import ui.state.AuthenticationState;
import ui.state.UnauthenticatedState;

import java.io.InputStream;

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
public class Main extends Application {

    private final double MINIMUM_WINDOW_WIDTH = 800.0;
    private final double MINIMUM_WINDOW_HEIGHT = 600.0;

    private Stage stage;

    private model.entities.User loggedUser;
    private AuthenticationState state = null;
    private static Main instance;

    public static void main(String[] args) {

        System.setProperty("javafx.macosx.embedded", "true");
        java.awt.Toolkit.getDefaultToolkit();

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        stage = primaryStage;
        stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
        primaryStage.setTitle("ERP-Sim");

        setState(new UnauthenticatedState(this));
        primaryStage.show();
    }

    /**
     * Sets a new State to the application.
     *
     * @param state = new State of the application to be set
     */
    public void setState(AuthenticationState state) {
        this.state = state;
        this.state.entry();
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public boolean authenticate(String userId, String password){
        if (Authenticator.validate(userId, password)) {
            loggedUser = User.of(userId);
            this.state.exit();
            this.state.handleLogin();
            return true;
        } else {
            return false;
        }
    }

    /*
     * at the end of a session the user can logout properly and receives an infomation about the successful logout
     */
    void userLogout(){
        loggedUser = null;
        this.state.exit();
        this.state.handleLogout();
    }

    public Initializable replaceSceneContent(String fxml) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        InputStream in = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
           in.close();
        }
        Scene scene = new Scene(page, 800, 600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}
