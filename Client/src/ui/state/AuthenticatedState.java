package ui.state;


import barcodeHook.Scanner;
import barcodeHook.ScannerEvent;
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
            //super.context.loadMainPane();
            controller = (MainController) super.context.replaceSceneContent(Navigator.MAIN);

//            controller.setApp(super.context);
//
//            Scanner.addScannerEventListener(controller, "(/",0); //Special character excaped by \\
            ScannerEvent evt = new ScannerEvent(this, "*¨C100106141410000098764", "(/","",0);
//            controller.handleScannerEvent(evt);
//            //controller.setBarcode("FË07680577870041".substring(3), BarcodeGlobalListener.CODE_IDENTITY.BARCODE,0);

            loadProtectedUserResources();
            loadProtectedSettingsResources();

//        } catch (NativeHookException ex) {
//            System.err.println("There was a problem registering the native hook.");
//            System.err.println(ex.getMessage());
//            System.exit(1);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	/**
	 * Remove everything on exiting the authenticated state.
	 */
	@Override
	protected void exitState() {
        Scanner.endStream();
 //       Scanner.removeScannerListener(controller);
//        GlobalScreen.unregisterNativeHook();
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
