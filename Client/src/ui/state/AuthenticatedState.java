package ui.state;


import barcodeHook.Scanner;
import org.jnativehook.GlobalScreen;
import ui.Main;
import ui.MainController;
import ui.Navigator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 * 
 * <p>
 * Class that describes the authenticated state of the Application.
 * </p>
 * 
 * @author Johannes Gnaegi, gnagj1@bfh.ch
 * @version 07-12-2013
 */
public class AuthenticatedState extends AuthenticationState {

    private Scanner scn;
    private MainController controller;

    /**
	 * Constructor for this state implementation.
	 * 
	 * @param ui
	 *            the UI as context for the state pattern.
	 */
	public AuthenticatedState(Main ui) {
		super(ui);
	}

	/**
	 * loads global used components for both, patient and care staff when
	 * entering the authenticated state.
	 */
	@Override
	protected void entryState() {
        try {
            Scanner.initStream();

            controller = (MainController) super.context.replaceSceneContent(Navigator.MAIN);
            /**
             * Set up Navigator
             * - MainCOntroller (Changable view holder)
             * - Application context for login state change
             */
            Navigator.getInstance().setMainController(controller);
            Navigator.getInstance().setNavigationContext(super.context);
            Navigator.getInstance().loadVista(Navigator.STOCK_VIEW);

            //For Testing Purposes: ScannerEvent evt = new ScannerEvent(this, "*¨C100106141410000098764", "(/","",0);


            loadProtectedUserResources();
            loadProtectedSettingsResources();

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	/**
	 * Remove everything on exiting the authenticated state.
	 */
	@Override
	protected void exitState() {
        if (GlobalScreen.isNativeHookRegistered()) {
            Scanner.endStream();
        }

        storeDataPersistent();
	}

    /**
	 * handles the correct logout and moves to the unauthenticated state.
	 */
	@Override
	public void handleLogout() {
        super.context.setState(new UnauthenticatedState(super.context));
	}

	/**
	 * loads user specific data and views.
	 */
	private void loadProtectedUserResources() {

	}

	/**
	 * loads ui specific data and views.
	 */
	private void loadProtectedSettingsResources() {

	}

    /**
     * Store everything needed
     */
    private void storeDataPersistent() {

    }
}
