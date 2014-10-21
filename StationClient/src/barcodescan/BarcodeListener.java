package barcodescan;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;



/**
 * This class is the Global Keyevent Listener, who watches for the Barcodes, we
 * have here a few Prefixes which makes sure that this incomming Keyevents will
 * be from the Barcode scanner, these are 4 prefixes, acctually its not clear
 * why those 4 because the scanner was programmed with those two: "*�", but in
 * the programme we just received those 4 KeyCodes. So we check the income,
 * untill we have this 4 received and then we read the numbers we receive until
 * there is a "enter" which is as a 10 so we know the code is complete. Then we
 * search for the patient and change the state and give an message. E voila
 *
 * @author Rafael Kapp
 *
 */
public class BarcodeListener implements NativeKeyListener {

    /*
     * This prefixes are for the JNativehook 1.2//1.1.4 Library
     */
//    private static final int PREFIX1 = 28;// 16; //Means Shift
//    private static final int PREFIX2 = 28;// 51; //Means 3
//    private static final int PREFIX3 = 42;// 16; //Means Shift
//    private static final int PREFIX4 = 4;// 52; //Means 4
//    private static final int END = 28;// 10; //Means Enter

    /*
     * This prefixes are for the JNativehook 1.2 RC Library (on a Mac)
     */
    private static final int PREFIX1 = 42;// 16; //Means Shift
    private static final int PREFIX2 = 4;// 51; //Means 3
    private static final int PREFIX3 = 42;// 16; //Means Shift
    private static final int PREFIX4 = 5;// 52; //Means 4
    private static final int END = 28;// 10; //Means Enter

    private static boolean prefix1 = false;
    private static boolean prefix2 = false;
    private static boolean prefix3 = false;
    private static boolean prefix4 = false;

    private String barcode = "";

    public BarcodeListener() {
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
    }

    /**
     * This is then the used method, it also checks if the patient check in or
     * check out
     */
    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        int keyCode = e.getKeyCode();

        if (prefix1 && prefix2 && prefix3 && prefix4) {
            if (keyCode == END) {

                // Bug fix, there is a additional sign in front of the code; cut
                // it away!

                // code is scanned
                long pid = Long.parseLong(this.barcode) % 10000000000000l;

                this.barcode = "";
                prefix1 = false;
                prefix2 = false;
                prefix3 = false;
                prefix4 = false;
            } else {
                // some character has been read, append it to "barcode cache"
                // The Keycode from the Listener is always the Number but just
                // one too high, and a zero is then a 11, so -1 modulo 10
                barcode = barcode + ((e.getKeyCode() - 1) % 10);
            }
        }

        if (prefix1 && prefix2 && prefix3 && (keyCode == PREFIX4)) {
            prefix4 = true;
        } else if (prefix1 && prefix2 && (keyCode == PREFIX3)) {
            prefix3 = true;
        } else if (prefix1 && (keyCode == PREFIX2)) {
            prefix2 = true;
            //searchView.disableFocus(); // After the "first" token we suppose to get a barcode
        } else if (keyCode == PREFIX1) {
            prefix1 = true;
        } else if (!(prefix1 && prefix2 && prefix3 && prefix4)) {
            prefix1 = false;
            prefix2 = false;
            prefix3 = false;
            prefix4 = false;
        }
    }
}
