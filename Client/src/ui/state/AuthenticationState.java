package ui.state;

import ui.Main;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>
 * Describes an abstract class for the different Authentication states the Application goes through.
 * The class is the base class for implementing the State Pattern.
 * The States context is the {@link //ch.bfh.btx8081.w2013.green.ui.start.MyVaadinUI} User Interface, whose content
 * differs for an authenticated User or an unauthenticated User.
 *
 * For the states have different <code>Views</code> that can change, the
 * class provides an {@link //com.vaadin.navigator.Navigator} reference.
 * </p>
 *
 * @author Johannes Gnaegi, gnaegj1@bfh.ch
 * @version 07-12-2013
 */
public abstract class AuthenticationState {

    /**
     * Context for the different states.
     */
    protected Main context = null;
    protected Object navigator = null;

    protected AuthenticationState(Main ui) {
        this.context = ui;
        this.navigator = null; //new Navigator(ui, ui);
    }

    /**
     * Provides an entry point for the specific state.
     */
    public final void entry() {
        entryState();
    }

    /**
     * Provides an exit point for the specific state.
     */
    public final void exit() {
        exitState();
    }

    /**
     * Provide the custom implementation on entering the specific state.
     */
    protected void entryState() {}

    /**
     * Provide the custom implementation on exit the specific state.
     */
    protected void exitState() {}

    public void handleLogin() {}
    public void handleLogout() {}
    /**
     * Handle other Buttons which result in a change of State.
     */
}
