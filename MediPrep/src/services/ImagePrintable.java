package services;

import org.krysalis.barcode4j.impl.datamatrix.DataMatrixBean;
import org.krysalis.barcode4j.impl.datamatrix.SymbolShapeHint;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;

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
public class ImagePrintable implements Printable {

    public static int PRINT_LABEL_WITH = 300;
    public static int PRINT_LABEL_HEIGT = 100;

    private double          x, y, width;
    private int             orientation;
    private BufferedImage   image;

    public ImagePrintable(PrinterJob printJob, BufferedImage image) {
        PageFormat pageFormat = printJob.defaultPage();
        this.x = pageFormat.getImageableX();
        this.y = pageFormat.getImageableY();
        this.width = pageFormat.getImageableWidth();
        this.orientation = pageFormat.getOrientation();
        this.image = image;
    }

    @Override
    public int print(Graphics g, PageFormat pageFormat, int pageIndex)
            throws PrinterException {
        if (pageIndex == 0) {
            int pWidth = 0;
            int pHeight = 0;

            String msg = "1";
            String content = "Natriumchlorid 0.9% Ceftriaxon OrPha 2g";
        /*
        for (PreparedMedication preparedMedication : basedOnPrescription.getMedications()) {
            content += preparedMedication.getName().get() + ", ";
        }*/


            String[] paramArr = new String[] {
                    "Prescription ID: 1" ,
                    "Beschreibung: ",
                    "Inhalt: Natriumchlorid 0.9%",
                    "Ceftriaxon OrPha 2g"
            };

            //Create the barcode bean
            DataMatrixBean bean = new DataMatrixBean();

            final int dpi = 200;

            //Configure the barcode generator
            bean.setModuleWidth(UnitConv.in2mm(8.0f / dpi)); //makes a dot/module exactly eight pixels
            bean.doQuietZone(false);
            bean.setShape(SymbolShapeHint.FORCE_SQUARE);

            boolean antiAlias = false;
            int orientation = 0;
            //Set up the canvas provider to create a monochrome bitmap
            BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                    dpi, BufferedImage.TYPE_BYTE_BINARY, antiAlias, orientation);

            //Generate the barcode
            bean.generateBarcode(canvas, msg);

            //Signal end of generation
            try {
                canvas.finish();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Get generated bitmap
            BufferedImage symbol = canvas.getBufferedImage();

            int fontSize = 14; //pixels
            int lineHeight = (int)(fontSize * 1.2);
            Font font = new Font("Arial", Font.PLAIN, fontSize);
            Font font1 = new Font("Arial", Font.BOLD, fontSize);
            int width = 5;
            int height = symbol.getHeight();
            FontRenderContext frc = new FontRenderContext(new AffineTransform(), antiAlias, true);
            for (int i = 0; i < paramArr.length; i++) {
                String line = paramArr[i];
                Rectangle2D bounds = font.getStringBounds(line, frc);
                width = (int)Math.ceil(Math.max(width, bounds.getWidth())) >= width ? (int)Math.ceil(Math.max(width, bounds.getWidth())) : width;
                height += lineHeight;
            }

            //Add padding
            int padding = 5;
            width += 4 * padding;
            height += 2 * padding;

            BufferedImage bitmap = new BufferedImage(PRINT_LABEL_WITH, PRINT_LABEL_HEIGT, BufferedImage.TYPE_BYTE_BINARY);
            Graphics2D g2d = (Graphics2D)bitmap.getGraphics();

            g2d.setBackground(Color.white);
            g2d.setColor(Color.black);
            g2d.clearRect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            g2d.setFont(font);

            //Place the barcode symbol
            AffineTransform symbolPlacement = new AffineTransform();
            symbolPlacement.translate(padding, padding);
            g2d.drawRenderedImage(symbol, symbolPlacement);

            //Add text lines (or anything else you might want to add)
            int y = padding;
            int x = padding + symbol.getWidth() + 20 + padding;
            for (int i = 0; i < paramArr.length; i++) {
                String line = paramArr[i];
                y += lineHeight;
                g2d.drawString(line, x, y);
            }

            if (orientation == PageFormat.PORTRAIT) {
                pWidth = (int) Math.min(width, (double) image.getWidth());
                pHeight = pWidth * image.getHeight() / image.getWidth();
            } else {
                pHeight = (int) Math.min(width, (double) image.getHeight());
                pWidth = pHeight * image.getWidth() / image.getHeight();
            }

            g.drawString("Hello", 10, 10);

            //g.drawImage(image, (int) x, (int) y, pWidth, pHeight, null);

            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }

}
