package ui;


import javafx.scene.Node;

import java.util.HashMap;

/**
 * Utility class for controlling navigation between vistas.
 *
 * All methods on the navigator are static to facilitate
 * simple access from anywhere in the application.
 *
 * To use this navigator class, every view made accessible through the views-list must extend the class {@link ui.ChangeableView}.
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

    /** Singleton **/

    private static Navigator ourInstance;

    /***
     * Interface to get the instance of this navigator.
     * @return the instance of the navigator
     */
    public static Navigator getInstance() {

        if (ourInstance == null) {
            ourInstance = new Navigator();
        }
        return ourInstance;
    }

    private Navigator() {
        views = new HashMap<String, ChangeableView>();
        views.put(STOCK_VIEW, new StockViewController(STOCK_VIEW));
        views.put(CHECKED_IN_ITEMS_VIEW, new CheckedInItemsViewController(CHECKED_IN_ITEMS_VIEW));
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

       Node node = views.get(fxml);
       mainController.setVista(node);

    }
}
