package example;

import swissindex.PHARMA;
import swissindex.WsPharmaV101;
import swissindex.WsPharmaV101Soap;

import java.util.List;

/**
 * Created by Johannes on 13.10.14.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      swissindex.WsPharmaV101 pharma = new WsPharmaV101();
      WsPharmaV101Soap wsPharmaV101Soap = pharma.getWsPharmaV101Soap();
      PHARMA p = wsPharmaV101Soap.downloadAll("de");

      List<PHARMA.ITEM> item = p.getITEM();
      System.out.println("Hello");
  }
}
