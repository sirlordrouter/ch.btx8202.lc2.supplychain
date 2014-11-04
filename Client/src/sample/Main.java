package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import services.barcoding.BarcodeGlobalListener;

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

    @Override
    public void start(Stage primaryStage) throws Exception{

/*
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));

        Pane root = (Pane)fxmlLoader.load();
        Controller controller = fxmlLoader.getController();

        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 400, 270));
*/

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainView.fxml"));

        Pane root = (Pane)fxmlLoader.load();
        Controller controller = fxmlLoader.getController();

        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setFullScreen(true);


        //Nativehook code, für den globalen Keylistener
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }

        BarcodeGlobalListener listener = new BarcodeGlobalListener();
        GlobalScreen.getInstance().addNativeKeyListener(listener);

        listener.addListener(controller);

        controller.setBarcode("FË07680577870041".substring(3),"",0);

        primaryStage.show();
    }


    public static void main(String[] args) {

        System.setProperty("javafx.macosx.embedded", "true");
        java.awt.Toolkit.getDefaultToolkit();

        launch(args);
    }
}
