package example;/**
 * Created by Johannes on 14.10.14.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          Ws_Pharma_V101Locator locator = new Ws_Pharma_V101Locator();
          Ws_Pharma_V101Soap_PortType service = locator.get();
          // If authorization is required
          //((Ws_Pharma_V101Soap12Stub)service).setUsername("user3");
          //((Ws_Pharma_V101Soap12Stub)service).setPassword("pass3");
          // invoke business method
          service.businessMethod();
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
