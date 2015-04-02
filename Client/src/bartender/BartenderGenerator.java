package bartender;

import barcode.GtinFormatConverter;
import exceptions.NotCorrectEANLenghtException;
import services.PropertiesReader;
import webservice.erp.Item;
import webservice.erp.Position;
import webservice.erp.Production;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>Class for the generation of trigger text files to print labels with BarTender.
 * Configurations have to be made in the config.properties file.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 24-02-2015
 */
public class BartenderGenerator {
    private String printerNameSSCC, printerNameDataMatrix,printerNameLieferschein,labelTemplateSSCC, labelTemplateDataMatrix,labelTemplateLieferschein, fileNameSSCC, fileNameDataMatrix, fileNameLieferschein, separator;
    Properties prop;
    private Production production;

    public BartenderGenerator(Production prod){
        this.separator=System.getProperty("line.separator");
        this.production=prod;
        PropertiesReader reader = new PropertiesReader();
        try {
            prop = reader.getPropValues();
            //TODO: Better Handling, current working with 13 digits so convert to 14 digits due to matrix printing
            for (Item item : production.getItems()) {
                if (item.getGTIN().length() == 13) {
                    item.setGTIN(GtinFormatConverter.ConvertEan13To14(item.getGTIN()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotCorrectEANLenghtException e) {
            e.printStackTrace();
        }
        // read the user configuration
        printerNameSSCC=prop.getProperty("barcodePrinterSSCC");
        printerNameDataMatrix=prop.getProperty("barcodePrinterDataMatrix");
        printerNameLieferschein=prop.getProperty("barcodePrinterLieferschein");
        labelTemplateSSCC = prop.getProperty("bartenderLabelTemplateSSCC");
        labelTemplateDataMatrix=prop.getProperty("bartenderLabelTemplateDataMatrix");
        labelTemplateLieferschein=prop.getProperty("bartenderLabelTemplateLieferschein");
        fileNameSSCC=prop.getProperty("triggerTextFileNameSSCC");
        fileNameDataMatrix=prop.getProperty("triggerTextFileNameDataMatrix");
        fileNameLieferschein=prop.getProperty("triggerTextFileNameLieferschein");
    }

    public void createSSCCtriggerFile(){
        // build the trigger text field at the specified location
        try{
            // get todays date and format it
            java.util.Date date = new java.util.Date();
            DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateString = formatter.format(date);
            Writer output = null;
            // create the file in the specified file path (config.properties)
            File file = new File(fileNameSSCC);
            output = new BufferedWriter(new FileWriter(file));
            // write the commander script and add the custom data
            output.write("%BTW% /AF="+labelTemplateSSCC+" /D=<Trigger File" +
                    " Name> /PRN=\""+printerNameSSCC+"\" /R=3 /P /DD" + separator+
                    "%END%"+separator+ production.getShipment().getGlnOrigin()+","+
                    production.getShipment().getDescOrigin()+","+
                    production.getShipment().getGlnDestination()+","
                    +production.getShipment().getDescDestination()+","+dateString+","+
                    production.getShipment().getSscc());
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
            // create the file in the specified file path (config.properties)
            File file = new File(fileNameDataMatrix);
            output = new BufferedWriter(new FileWriter(file));
            // write the commander script
            output.write("%BTW% /AF="+labelTemplateDataMatrix+" /D=<Trigger File" +
                    " Name> /PRN=\""+printerNameDataMatrix+"\" /R=3 /P /DD" +separator+
                    "%END%");
            // add the custom data
            for(Item item:production.getItems()){
                output.append(separator + item.getGTIN() + "," + item.getExpiryDate() + "," + item.getLot() +
                        "," + item.getSerial() + "," + item.getBeschreibung());
            }

            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }
    }
    public void createShipmenttriggerFile(){
        // build the trigger text field at the specified location
        try{
            // get todays date and format it
            java.util.Date date = new java.util.Date();
            DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateString = formatter.format(date);
            Writer output = null;
            // create the file in the specified file path (config.properties)
            File file = new File(fileNameLieferschein);
            output = new BufferedWriter(new FileWriter(file));
            // write the commander script
            output.write("%BTW% /AF="+labelTemplateLieferschein+" /D=<Trigger File" +
                    " Name> /PRN=\""+printerNameLieferschein+"\" /R=3 /P /DD" +separator+
                    "%END%");
            // add the custom data
            output.append(separator+production.getShipment().getGsin()+","+production.getShipment().getOrderNr()+","+
            production.getShipment().getDescOrigin()+","+
            production.getShipment().getGlnOrigin()+","+
            production.getShipment().getDescDestination()+","+
            production.getShipment().getGlnDestination()+","+
            dateString + ","+production.getShipment().getSscc());
            int count = 1;
            for(Position pos:production.getPositions()){
                output.append(","+Integer.toString(count)+","+pos.getGtin()+","+
                pos.getDescription()+","+pos.getQuantity());
                count++;
            }
            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }
    }

}
