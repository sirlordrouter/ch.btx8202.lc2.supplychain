package services;

import entities.Prescription;
import org.junit.Test;

import java.io.File;
import java.time.LocalDate;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: MediPrep
 * Package: services
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 28.04.15
 */
public class BarcodeGeneratorTest {


    @Test
    public void testGenerate() throws Exception {

        BarcodeGenerator generator = new BarcodeGenerator();
        File outputFile = new File("out.png");

        Prescription prescription = new Prescription(false,null,"1","1", LocalDate.now(),
                "123", "Hanna", "Montana", "Nurse","Description","1001","p.p.");
        //generator.generate(outputFile,prescription);


        generator.printBarcode(prescription, "Brother QL-700");

    }
}