package ui;


import javafx.scene.Node;
import javafx.scene.layout.VBox;
import ui.state.IAuthenticatedStateContext;

import java.util.HashMap;

/**
 * Utility class for controlling navigation between vistas.
 *
 * All methods on the navigator are static to facilitate
 * simple access from anywhere in the application.
 *
 * @author
 *  https://gist.github.com/jewelsea/6460130
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 *
 *
 */
public class Navigator {
    /**
     * Convenience constants for fxml layouts managed by the navigator.
     */
    public static final String MAIN = "main.fxml";
    public static final String CHECKED_IN_ITEMS_VIEW = "CheckedInItemsView.fxml";
    public static final String STOCK_VIEW = "StockView.fxml";

    private HashMap<String, ChangeableView> views;

    /** The main application layout controller. */
    private MainController mainController;
    private IAuthenticatedStateContext context;

    /** Singleton **/

    private static Navigator ourInstance = new Navigator();

    /***
     * Interface to get the instance of this navigator.
     * @return
     */
    public static Navigator getInstance() {
        return ourInstance;
    }
    private Navigator() {
        views = new HashMap<String, ChangeableView>();
        views.put(STOCK_VIEW, new StockViewController(Main.instance, STOCK_VIEW));
        views.put(CHECKED_IN_ITEMS_VIEW, new CheckedInItemsViewController(Main.instance, CHECKED_IN_ITEMS_VIEW));
    }

    /**
     * Stores the main controller for later use in navigation tasks.
     *
     * @param mainController the main application layout controller.
     */
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    /**
     * Loads the vista specified by the fxml file into the
     * vistaHolder pane of the main application layout.
     *
     * Previously loaded vista for the same fxml file are not cached.
     * The fxml is loaded anew and a new vista node hierarchy generated
     * every time this method is invoked.
     *
     * A more sophisticated load function could potentially add some
     * enhancements or optimizations, for example:
     * cache FXMLLoaders
     * cache loaded vista nodes, so they can be recalled or reused
     * allow a user to specify vista node reuse or new creation
     * allow back and forward history like a browser
     *
     * @param fxml the fxml file to be loaded.
     */
    public void loadVista(String fxml) {


        StockViewController ui = new StockViewController(Main.instance, STOCK_VIEW);
        Node node = (Node) ui;

       mainController.setVista(node);

    }
}
