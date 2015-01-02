package ui.state;

import ui.LoginController;
import ui.Main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * Modul 8081, HS2013</br>
 *
 *<p>Class describes the unathenticated State of the Application</p>
 *
 * @author Johannes Gnaegi, gnaegj1@bfh.ch
 * @version 07-12-2013s
 */
public class UnauthenticatedState extends AuthenticationState {

    /**
     * Constructor for this state implementation.
     * @param ui the UI as context for the state pattern.
     */
    public UnauthenticatedState(Main ui) {
        super(ui);
    }

    /**
     * Login View ist configured on entering the Unauthenticated state.
     * To prevent Error-View when manipulation url, the login view
     * is set as Error-View.
     */
    @Override
    public void entryState() {
        try {
            LoginController login = (LoginController) super.context.replaceSceneContent("Login.fxml");
            login.setApp(super.context);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Do before handle login...
     */
    @Override
    public void exitState() {
    }

    /**
     * handles the correct login and moves to the authenticated state.
     */
    @Override
    public void handleLogin() {

        super.context.setState(new AuthenticatedState(context));
    }
}
