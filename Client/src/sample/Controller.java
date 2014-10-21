package sample;

import SwissIndex.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import services.barcoding.IBarcodeParsedEventListener;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Berner Fachhochschule</br>
 * Medizininformatik BSc</br>
 * BTX8202 (Living Case 2), HS2014</br>
 *
 *<p>An Address Class</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21-10-2014
 */
public class Controller implements IBarcodeParsedEventListener {

    public Label MedInfo;
    public Label labelItem;

    public Controller () {}

    @Override
    public void setBarcode(long barcode) {

        Ws_Pharma_V101Locator locator = new Ws_Pharma_V101Locator();
        Ws_Pharma_V101Soap_PortType service = null;
        try {

            service = locator.getws_Pharma_V101Soap();

            PHARMA de = service.getByGTIN(String.valueOf(barcode), "de");

            for (PHARMAITEM pharmaitem : de.getITEM()) {
                PHARMAITEMCOMP comp = pharmaitem.getCOMP();
                labelItem.setText("EAN: "+ barcode + ", Firma: " + comp.getNAME() + ", GLN: " + comp.getGLN());
                System.out.println("Firma: " + comp.getNAME() + ", GLN: " + comp.getGLN());
            }

        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void Event(ActionEvent actionEvent) {
        MedInfo.setText("Button clicked...please Scan item..");
    }
}
