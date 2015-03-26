package ui;


import javafx.scene.Node;
import javafx.scene.layout.VBox;
import ui.state.IAuthenticationStateContext;

import java.util.HashMap;

/**
 * Utility class for controlling navigation between vistas.
 *
 * All methods on the navigator are static to facilitate
 * simple access from anywhere in the application.
 *
 * To use this navigator class, every view made accessible through the views-list must derive from {@link javafx.scene.layout.VBox}.
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
    public static final String HOME_VIEW = "HomeView.fxml";
    public static final String DOSETPREP_VIEW = "DosetPrepView.fxml";
    public static final String DOSETCONTROL_VIEW = "DosetControlView.fxml";
    public static final String ADDITIONALMEDIC_VIEW = "AdditionalMedicView.fxml";


    private HashMap<String, VBox> views;

    /** The main application layout controller. */
    private MainController mainController;
    private IAuthenticationStateContext contex;

    /** Singleton **/

    private static Navigator ourInstance;
    private IPartialView currentView;

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
        views = new HashMap<String, VBox>();
        views.put(HOME_VIEW, new HomeViewController(HOME_VIEW));
//        views.put(DOSETPREP_VIEW, new StockViewController(STOCK_VIEW));
//        views.put(DOSETCONTROL_VIEW, new OrderViewController(ORDER_VIEW));
        views.put(ADDITIONALMEDIC_VIEW, new AdditionalMedicViewController(ADDITIONALMEDIC_VIEW));
    }

    public MainController getMainController() {
        return mainController;
    }

    /**
     * Stores the main controller for later use in navigation tasks.
     *
     * @param mainController the main application layout controller.
     */
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
        ((PatientChanger)views.get(HOME_VIEW)).addListener(mainController);
    }

    public void setNavigationContext(IAuthenticationStateContext context) {
        this.contex = context;
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

        VBox partialView = views.get(fxml);
        if (partialView instanceof IPartialView) {
            if (currentView != null) { //On first run always null
                currentView.beforeLeaving();
            }
            ((IPartialView)partialView).beforeOpen();
            currentView = (IPartialView)partialView;
        } else {
            System.out.println("This is no partial view.");
        }

        Node node = partialView;
        mainController.setVista(node);
    }

    /**
     * Logout from the Main Windows. Remove listeners to Barcodescanner eventually set up in a view
     */
    public void logout() {
        currentView.beforeLeaving();
        this.contex.userLogout();
    }

    private class NoPartialViewException extends Throwable {
    }
}
