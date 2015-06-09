package services;

import entities.Prescription;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.awt.print.*;
import java.io.File;
import java.io.IOException;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis<br>
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
    private String barcode_Image_path = "out.png";

    private Prescription prescription;
    BarcodeGenerator generator;

    public PreparedPrescriptionPrinter(Prescription prescription, String filePath) {
        generator = new BarcodeGenerator();
        this.prescription = prescription;
        this.barcode_Image_path = filePath + barcode_Image_path;
    }

    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        // We have only one page, and 'page'
        // is zero-based
        if (page > 0) {
            return NO_SUCH_PAGE;
        }

        double pageWidth = pf.getImageableWidth();


        try {
            AffineTransform symbolPlacement = new AffineTransform();
            symbolPlacement.setToTranslation(pf.getImageableX(),pf.getImageableY());
            generator.generate(new File(barcode_Image_path), prescription);
            System.out.println("File generated");
            RenderedImage image = toBufferedImage(ImageIO.read(new File(barcode_Image_path)));
            int imageWidth = image.getWidth();

            double scaleFactorWidth =  imageWidth > pageWidth ?
                    pageWidth / imageWidth : imageWidth / pageWidth;
            double scaleFactorHeight = image.getHeight() > pf.getImageableHeight() ?
                    image.getHeight() / pf.getImageableHeight() : pf.getImageableHeight() / image.getHeight();
            double scaleFactor = scaleFactorHeight > scaleFactorWidth ? scaleFactorWidth : scaleFactorHeight;
            symbolPlacement.scale(scaleFactor,scaleFactor);

            ((Graphics2D) g).drawRenderedImage(image, symbolPlacement);
        } catch (IOException e) {
            e.printStackTrace();
        }

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
/*
    @Override
    public int getNumberOfPages() {
        return 1;
    }

    @Override
    public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
        return this;
    }
    */
}
