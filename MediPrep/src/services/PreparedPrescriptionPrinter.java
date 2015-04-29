package services;

import entities.Prescription;
import org.krysalis.barcode4j.impl.datamatrix.DataMatrixBean;
import org.krysalis.barcode4j.impl.datamatrix.SymbolShapeHint;
import org.krysalis.barcode4j.output.java2d.Java2DCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

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
public class PreparedPrescriptionPrinter implements Printable {

    public static int PRINT_LABEL_WITH = 300;
    public static int PRINT_LABEL_HEIGT = 100;

    private Prescription prescription;
    BarcodeGenerator generator;

    public PreparedPrescriptionPrinter(Prescription prescription) {
        generator = new BarcodeGenerator();
        this.prescription = prescription;

    }

    public PreparedPrescriptionPrinter() {}

    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        // We have only one page, and 'page'
        // is zero-based
        if (page > 0) {
            return NO_SUCH_PAGE;
        }

        String[] paramArr = new String[] {
                "Prescription ID: 1" ,
                "Beschreibung: ",
                "Inhalt: Natriumchlorid 0.9%",
                "Ceftriaxon OrPha 2g"
        };

        // User (0,0) is typically outside the
        // imageable area, so we must translate
        // by the X and Y values in the PageFormat
        // to avoid clipping.
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,
                RenderingHints.VALUE_FRACTIONALMETRICS_ON);

        Java2DCanvasProvider provider = new Java2DCanvasProvider(g2d, 0);
        g2d.scale(12, 12);

        DataMatrixBean bean = new DataMatrixBean();

        bean.generateBarcode(provider, "1");
        final int dpi = 200;

        //Configure the barcode generator
        bean.setModuleWidth(UnitConv.in2mm(8.0f / dpi)); //makes a dot/module exactly eight pixels
        bean.doQuietZone(false);
        bean.setShape(SymbolShapeHint.FORCE_SQUARE);

        BufferedImage bitmap = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphicsText = (Graphics2D)bitmap.getGraphics();

        boolean antiAlias = false;
        int orientation = 0;

        //Get generated bitmap
        //BufferedImage symbol = provider. provider.getBufferedImage();

        int fontSize = 14; //pixels
        int lineHeight = (int)(fontSize * 1.2);
        Font font = new Font("Arial", Font.PLAIN, fontSize);
        Font font1 = new Font("Arial", Font.BOLD, fontSize);
        int width = 1;
        int height = 1;
        FontRenderContext frc = new FontRenderContext(new AffineTransform(), antiAlias, true);
        for (int i = 0; i < paramArr.length; i++) {
            String line = paramArr[i];
            Rectangle2D bounds = font.getStringBounds(line, frc);
            width = (int)Math.ceil(Math.max(width, bounds.getWidth())) >= width ? (int)Math.ceil(Math.max(width, bounds.getWidth())) : width;
            height += lineHeight;
        }

        //Add padding
        int padding = 1;
        width += 1 * padding;
        height += 1 * padding;


        graphicsText.setBackground(Color.white);
        graphicsText.setColor(Color.black);
        graphicsText.clearRect(0, 0, 50, 50);
        graphicsText.setFont(font);

        //Add text lines (or anything else you might want to add)
        int y = padding;
        int x = 0;
        for (int i = 0; i < paramArr.length; i++) {
            String line = paramArr[i];
            y += lineHeight;
            graphicsText.drawString(line, 0, i);
        }

        graphicsText.dispose();

        g.drawImage(bitmap,0,4,null);


        /*try {
        //    generator.generate(new File("out.png"), prescription);
            RenderedImage image = toBufferedImage(ImageIO.read(new File("/Users/Johannes/05_Projekte/Java/production/ch.btx8202.lc2.supplychain/MediPrep/src/resources/image/Bett.png")));
            ((Graphics2D) g).drawRenderedImage(image, symbolPlacement);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // tell the caller that this page is part
        // of the printed document
        return PAGE_EXISTS;
    }

    /**
     * Converts a given Image into a BufferedImage
     *
     * @param img The Image to be converted
     * @return The converted BufferedImage
     */
    public static BufferedImage toBufferedImage(Image img)
    {
        if (img instanceof BufferedImage)
        {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }
}
