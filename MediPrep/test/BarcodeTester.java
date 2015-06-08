import entities.Prescription;
import services.BarcodeGenerator;

import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: MediPrep
 * Package: PACKAGE_NAME
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 08.06.15
 */
public class BarcodeTester {

    public static void main(String[] args) {
        BarcodeGenerator generator = new BarcodeGenerator();
        File outputFile = new File("out.png");

        Prescription prescription = new Prescription(false,null,"1","1", LocalDate.now(),
                "123", "Hanna", "Montana", "Nurse","Description","1001","p.p.");
        //generator.generate(outputFile,prescription);


        try {
            generator.printBarcode(prescription, "Brother QL-700", "");
        } catch (PrinterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
