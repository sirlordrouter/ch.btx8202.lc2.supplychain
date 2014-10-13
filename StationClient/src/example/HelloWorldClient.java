package example;/**
 * Created by Johannes on 13.10.14.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      swissindex.WsPharmaV101Soap service = new WsPharmaV101().getPort();
      //invoke business method
      service.downloadAll();  
  }
}
