package ui.state;


import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import services.barcoding.BarcodeGlobalListener;
import ui.Main;
import ui.StockViewController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Berner Fachhochschule</br> Medizininformatik BSc</br> Modul 8081, HS2013</br>
 * 
 * <p>
 * Class that describes the authenticated state of the Application.
 * </p>
 * 
 * @author Johannes Gnaegi, gnagj1@bfh.ch
 * @version 07-12-2013
 */
public class AuthenticatedState extends AuthenticationState {

    private BarcodeGlobalListener listener;
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
            StockViewController controller = (StockViewController) super.context.replaceSceneContent("StockView.fxml");
            controller.setApp(super.context);

            listener = new BarcodeGlobalListener();
            GlobalScreen.getInstance().addNativeKeyListener(listener);
            listener.addListener(controller);
            controller.setBarcode("FË07680577870041".substring(3), BarcodeGlobalListener.CODE_IDENTITY.BARCODE,0);

            loadProtectedUserResources();
            loadProtectedSettingsResources();

        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	/**
	 * Remove everything on exiting the authenticated state.
	 */
	@Override
	protected void exitState() {

        GlobalScreen.getInstance().removeNativeKeyListener(listener);
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
