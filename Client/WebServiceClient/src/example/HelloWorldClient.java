package example;

import SwissIndex.*;

/**
 * Created by Johannes on 21.10.14.
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
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
