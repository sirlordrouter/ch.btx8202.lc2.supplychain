package barcodescan;

import javax.usb.UsbDevice;
import javax.usb.UsbDeviceDescriptor;
import javax.usb.UsbHub;
import java.util.List;

/**
 * Created by Johannes on 14.10.14.
 */
public class TestUsb {

    /** The vendor ID of the missile launcher. */
    private static final short VENDOR_ID = 0x05f9;
    /** The product ID of the missile launcher. */
    private static final short PRODUCT_ID = 0x2602;

//    public UsbDevice findDevice(UsbHub hub, short vendorId, short productId)
//    {
//        for (UsbDevice device : (List<UsbDevice>) hub.getAttachedUsbDevices())
//        {
//            UsbDeviceDescriptor desc = device.getUsbDeviceDescriptor();
//            if (desc.idVendor() == vendorId && desc.idProduct() == productId) return device;
//            if (device.isUsbHub())
//            {
//                device = findDevice((UsbHub) device, vendorId, productId);
//                if (device != null) return device;
//            }
//        }
//        return null;
//    }

    /**
     * Dumps the specified device and its sub devices.
     *
     * @param device
     * The USB device to dump.
     * @param level
     * The indentation level.
     */
    public void dump(UsbDevice device, int level)
    {
        for (int i = 0; i < level; i += 1)
            System.out.print(" ");
            System.out.println(device);
        if (device.isUsbHub())
        {
            final UsbHub hub = (UsbHub) device;

            if (findUsbScanner(hub) != null) {
                int count = ((UsbHub) device).getNumberOfPorts();
            }

            for (UsbDevice child: (List<UsbDevice>) hub.getAttachedUsbDevices())
            {
                dump(child, level + 1);
            }
        }
    }

    /**
     * Recursively searches for the missile launcher device on the specified USB
     * hub and returns it. If there are multiple missile launchers attached then
     * this simple demo only returns the first one.
     *
     * @param hub
     * The USB hub to search on.
     * @return The missile launcher USB device or null if not found.
     */
    public UsbDevice findUsbScanner(UsbHub hub)
    {
        UsbDevice launcher = null;
        for (UsbDevice device: (List<UsbDevice>) hub.getAttachedUsbDevices())
        {
            if (device.isUsbHub())
            {
                launcher = findUsbScanner((UsbHub) device);
                if (launcher != null) return launcher;
            }
            else
            {
                UsbDeviceDescriptor desc = device.getUsbDeviceDescriptor();
                System.out.println("V: " + desc.idVendor() + ", P: " + desc.idProduct() );
                if (desc.idVendor() == VENDOR_ID &&
                        desc.idProduct() == PRODUCT_ID) return device;
            }
        }
        return null;
    }

}
