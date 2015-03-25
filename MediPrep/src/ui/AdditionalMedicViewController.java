package ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import services.PropertiesReader;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Johannes on 25.03.15.
 */
public class AdditionalMedicViewController extends VBox implements IPartialView {

    public AdditionalMedicViewController(String fxml) {
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
        }
        catch (IOException e) {
            //TODO SHow Message
        }

    }

    @Override
    public void beforeLeaving() {

    }

    @Override
    public void beforeOpen() {

    }
}
