package example;

import barcodescan.BarcodeListener;
import barcodescan.TestUsb;
import swissindex.*;

import javax.usb.*;
import javax.usb.event.UsbDeviceDataEvent;
import javax.usb.event.UsbDeviceErrorEvent;
import javax.usb.event.UsbDeviceEvent;
import javax.usb.event.UsbDeviceListener;
import java.io.IOException;

/**
 * Created by Johannes on 14.10.14.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      try {

          Ws_Pharma_V101Locator locator = new Ws_Pharma_V101Locator();
          Ws_Pharma_V101Soap_PortType service = locator.getws_Pharma_V101Soap();
          final PHARMA de = service.getByGTIN("7680340960153", "de");

        for (PHARMAITEM pharmaitem : de.getITEM()) {
            PHARMAITEMCOMP comp = pharmaitem.getCOMP();
            System.out.println("Firma: " + comp.getNAME() + ", GLN: " + comp.getGLN());
        }

          BarcodeListener listener = new BarcodeListener();


//          TestUsb testUsb = new TestUsb();
//          UsbServices services = UsbHostManager.getUsbServices();
//          UsbHub device = services.getRootUsbHub();
//           testUsb.dump(device, 0);
//
//          UsbDevice usbScanner = testUsb.findUsbScanner(device);
//
//          if(usbScanner == null) {
//              System.err.println("Missile launcher not found.");
//              System.exit(1);
//              return;
//          }

//          // Claim the interface
//          UsbConfiguration configuraç
// tion = device.getUsbConfiguration((byte) 1);
//          UsbInterface iface = configuration.getUsbInterface((byte) 1);
//          iface.claim(new UsbInterfacePolicy()
//          {
//              @Override
//              public boolean forceClaim(UsbInterface usbInterface)
//              {
//                  return true;
//              }
//          });

//          usbScanner.addUsbDeviceListener(
//              new UsbDeviceListener() {
//                      @Override
//                      public void usbDeviceDetached(UsbDeviceEvent usbDeviceEvent) {
//                          usbDeviceEvent.getUsbDevice();
//                      }
//
//                      @Override
//                      public void errorEventOccurred(UsbDeviceErrorEvent usbDeviceErrorEvent) {
//
//                      }
//
//                      @Override
//                      public void dataEventOccurred(UsbDeviceDataEvent usbDeviceDataEvent) {
//                          byte[] data = usbDeviceDataEvent.getData();
//                          System.out.println(data);
//                      }
//                  }
//          );

      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }


}
