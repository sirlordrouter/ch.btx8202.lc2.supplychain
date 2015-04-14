package ui;

import barcodeHook.Scanner;
import entities.User;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import services.Authenticator;
import ui.state.AuthenticationState;
import ui.state.IAuthenticationStateContext;
import ui.state.UnauthenticatedState;

import java.io.InputStream;


/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>Main class (entry point) for the java client application used to simulate an erp system for medical products
 based on gs1 identifiers.</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public class Main extends Application implements IAuthenticationStateContext {

    private final double LOGIN_MINIMUM_WINDOW_WIDTH = 500.0;
    private final double LOGIN_MINIMUM_WINDOW_HEIGHT = 320.0;

    private final double MINIMUM_WINDOW_WIDTH = 1228;
    private final double MINIMUM_WINDOW_HEIGHT = 850.0;

    private Stage stage;

    private entities.User loggedUser;
    private AuthenticationState state = null;
    public static Main instance;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        instance = this;

        stage = primaryStage;
        stage.setMinWidth(LOGIN_MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(LOGIN_MINIMUM_WINDOW_HEIGHT);
        primaryStage.setTitle("MediPrep - elektronische Richtstation");

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                Scanner.endStream();
                System.out.println("Scanner has been unregistered");
            }
        });

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

    /**
     * Checks the login.
     *
     * @param userId UserID
     * @param password Password
     * @return a boolean
     */
    public boolean authenticate(String userId, String password){
        if (Authenticator.validate(userId, password)) {
            stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
            stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);

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
    public void userLogout(){
        stage.setMinWidth(LOGIN_MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(LOGIN_MINIMUM_WINDOW_HEIGHT);
        loggedUser = null;
        this.state.exit();
        this.state.handleLogout();
    }

    /**
     * Needed to replace the login view with the Main container view, when switching states.
     * @param fxml
     *  new fxml to place into the whole container
     * @return
     *  an initializable Item
     * @throws Exception
     *  when Anchor pain could not load the fxml
     */
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
        Scene scene;
        if(fxml.equals(Navigator.MAIN)) {
            scene = new Scene(page, MINIMUM_WINDOW_WIDTH, MINIMUM_WINDOW_HEIGHT);
        } else {
            scene = new Scene(page, LOGIN_MINIMUM_WINDOW_WIDTH, LOGIN_MINIMUM_WINDOW_HEIGHT);
        }

        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}
