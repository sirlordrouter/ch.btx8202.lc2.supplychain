package bartender;

import services.PropertiesReader;

import java.io.*;
import java.util.Properties;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>Class for the generation of trigger text files to print labels with BarTender.
 * Configurations have to be made in the config.properties file.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 24-02-2015
 */
public class BartenderGenerator {
    private String printerNameSSCC, printerNameDataMatrix,labelTemplateSSCC, labelTemplateDataMatrix, fileNameSSCC, fileNameDataMatrix;
    Properties prop;

    public BartenderGenerator(){
        PropertiesReader reader = new PropertiesReader();
        try {
            prop = reader.getPropValues();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // read the user configuration
        printerNameSSCC=prop.getProperty("barcodePrinterSSCC");
        printerNameDataMatrix=prop.getProperty("barcodePrinterDataMatrix");
        labelTemplateSSCC = prop.getProperty("bartenderLabelTemplateSSCC");
        labelTemplateDataMatrix=prop.getProperty("bartenderLabelTemplateDataMatrix");
        fileNameSSCC=prop.getProperty("triggerTextFileNameSSCC");
        fileNameDataMatrix=prop.getProperty("triggerTextFileNameDataMatrix");
    }

    public void createSSCCtriggerFile(){
        // build the trigger text field at the specified location
        try{
            Writer output = null;
            File file = new File(fileNameSSCC);
            output = new BufferedWriter(new FileWriter(file));
            output.write("%BTW% /AF="+labelTemplateSSCC+" /D=%Trigger File" +
                    " Name% /PRN=\""+printerNameSSCC+"\" /R=3 /P /DD\n" +
                    "%END%\n");

            //TODO Barcode Daten /AF angaben anpassen auf formatfiles

            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }


    }
    public void createDataMatrixtriggerFile(){
        // build the trigger text field at the specified location
        try{
            Writer output = null;
            File file = new File(fileNameDataMatrix);
            output = new BufferedWriter(new FileWriter(file));
            output.write("%BTW% /AF="+labelTemplateDataMatrix+" /D=%Trigger File" +
                    " Name% /PRN=\""+printerNameDataMatrix+"\" /R=3 /P /DD\n" +
                    "%END%\n");

            //TODO Barcode Daten /AF angaben anpassen auf formatfiles

            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }
    }

}
