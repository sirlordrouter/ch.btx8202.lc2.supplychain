package bartender;

import services.PropertiesReader;

import java.io.*;
import java.util.Properties;

/**
 * Created by ph on 15.02.15.
 */
public class BartenderGenerator {
    private String printerName;
    Properties prop;

    public BartenderGenerator(){
        PropertiesReader reader = new PropertiesReader();
        try {
            prop = reader.getPropValues();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printerName=prop.getProperty("barcodePrinter");
    }

    public void createSSCCtriggerFile(){
        try{
            Writer output = null;
            File file = new File("/Users/ph/Desktop/gs1.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write("%BTW% /AF=c:\\command\\HardwareInvoice.btw /D=%Trigger File" +
                    " Name% /PRN=\""+printerName+"\" /R=3 /P /DD\n" +
                    "%END%\n");

            //TODO Barcode Daten /AF angaben anpassen auf formatfiles

            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }


    }
    public void createGTINtriggerFile(){
        try{
            Writer output = null;
            File file = new File("/Users/ph/Desktop/gs1.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write("%BTW% /AF=c:\\command\\HardwareInvoice.btw /D=%Trigger File" +
                    " Name% /PRN=\""+printerName+"\" /R=3 /P /DD\n" +
                    "%END%\n");

            //TODO Barcode Daten /AF angaben anpassen auf formatfiles

            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }
    }

}
