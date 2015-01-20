package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.entities.User;
import services.Authenticator;
import ui.state.AuthenticationState;
import ui.state.IAuthenticatedStateContext;
import ui.state.UnauthenticatedState;

import java.io.IOException;
import java.io.InputStream;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>Main class (entry point) for the java client application used to simulate an erp system for medical products
 based on gs1 identifiers.</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public class Main extends Application implements IAuthenticatedStateContext {

    private final double LOGIN_MINIMUM_WINDOW_WIDTH = 500.0;
    private final double LOGIN_MINIMUM_WINDOW_HEIGHT = 320.0;

    private final double MINIMUM_WINDOW_WIDTH = 1000;
    private final double MINIMUM_WINDOW_HEIGHT = 800.0;

    private Stage stage;

    private model.entities.User loggedUser;
    private AuthenticationState state = null;
    public static Main instance;

    public static void main(String[] args) {
        System.out.println("javafx.runtime.version: " + System.getProperties().get("javafx.runtime.version"));


        System.setProperty("javafx.macosx.embedded", "true");
        java.awt.Toolkit.getDefaultToolkit();

//        if (!GlobalScreen.isNativeHookRegistered()) {
//            try {
//                GlobalScreen.registerNativeHook();
//            } catch (NativeHookException e) {
//                e.printStackTrace();
//            }
//        }

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        instance = this;

        stage = primaryStage;
        stage.setMinWidth(LOGIN_MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(LOGIN_MINIMUM_WINDOW_HEIGHT);
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

    /**
     * Checks the login.
     *
     * @param userId UserID
     * @param password Password
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
    void userLogout(){
        stage.setMinWidth(LOGIN_MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(LOGIN_MINIMUM_WINDOW_HEIGHT);
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
        Scene scene;
        if(fxml.equals("main.fxml")) {
            scene = new Scene(page, MINIMUM_WINDOW_WIDTH, MINIMUM_WINDOW_HEIGHT);

            MainController mainController = loader.getController();

            Navigator.setMainController(mainController);
            Navigator.loadVista(Navigator.STOCK_VIEW, this);

        } else {
            scene = new Scene(page, LOGIN_MINIMUM_WINDOW_WIDTH, LOGIN_MINIMUM_WINDOW_HEIGHT);
        }

        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }

    /**
     * Loads the main fxml layout.
     * Sets up the vista switching VistaNavigator.
     * Loads the first vista into the fxml layout.
     *
     * @return the loaded pane.
     * @throws IOException if the pane could not be loaded.
     */
    public Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        Pane mainPane = (Pane) loader.load(
                getClass().getResourceAsStream(
                        Navigator.MAIN
                )
        );

        MainController mainController = loader.getController();

        Navigator.setMainController(mainController);
        Navigator.loadVista(Navigator.STOCK_VIEW,this);

        return mainPane;
    }
}
