package services;

import model.entities.ProducerCompany;
import model.entities.TradeItem;
import webservice.erp.Company;
import webservice.swissindex.*;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created by Johannes on 17.11.14.
 */
public class SwissIndexClient {

    public static TradeItem getItemInformationFromGTIN(String gtin) {

        Ws_Pharma_V101Locator locator = new Ws_Pharma_V101Locator();
        Ws_Pharma_V101Soap_PortType service = null;
        try {

            service = locator.getws_Pharma_V101Soap();
            PHARMA de = service.getByGTIN(gtin, "de");

            if (de.getITEM() != null) {
                for (PHARMAITEM pharmaitem : de.getITEM()) {

                    if (pharmaitem != null) {
                        PHARMAITEMCOMP comp = pharmaitem.getCOMP();
                        Company c = CompanyConstructor(comp.getNAME(),comp.getGLN(), "ABTEILUNG");
                        return ItemConstructor(pharmaitem.getDSCR(), pharmaitem.getADDSCR(),gtin, "BATCH/LOT", "SERIAL", "DESC", "Zusatz",
                                pharmaitem.getATC(), c);

                    } else {
                        return null;
                    }
                }
            } else {
                return null;
            }

            return null;

        } catch (ServiceException e) {
            e.printStackTrace();
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static TradeItem ItemConstructor(String name, String menge, String gtin, String lot,
                                       String serial, String beschreibung, String zusatz, String atc, Company company) {
        TradeItem i = new TradeItem();
        i.setName(name);
        i.setATC(atc);
        i.setBeschreibung(beschreibung);
        i.setGTIN(gtin);
        i.setLot(lot);
        i.setMenge(menge);
        i.setProducer(company);
        i.setSerial(serial);
        i.setZusatz(zusatz);

        return i;
    }

    public static ProducerCompany CompanyConstructor(String name, String gln, String abteilung) {
        ProducerCompany c = new ProducerCompany();
        c.setName(name);
        c.setGLN(gln);
        c.setAbteilung(abteilung);

        return c;
    }

}
