package entities;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 10-03-2015
 */
public class Shipment {
    private String orderNr, glnOrigin, glnDestination, descOrigin, descDestination, sscc;

    public Shipment(){

    }

    public Shipment(String OrderNr, String GlnOrigin, String GlnDest, String DescOrigin, String DescDest, String SSCC){
        this.orderNr=OrderNr;
        this.glnOrigin=GlnOrigin;
        this.glnDestination=GlnDest;
        this.descOrigin=DescOrigin;
        this.descDestination=DescDest;
        this.sscc=SSCC;
    }

    public String getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(String orderNr) {
        this.orderNr = orderNr;
    }

    public String getGlnOrigin() {
        return glnOrigin;
    }

    public void setGlnOrigin(String glnOrigin) {
        this.glnOrigin = glnOrigin;
    }

    public String getGlnDestination() {
        return glnDestination;
    }

    public void setGlnDestination(String glnDestination) {
        this.glnDestination = glnDestination;
    }

    public String getDescOrigin() {
        return descOrigin;
    }

    public void setDescOrigin(String descOrigin) {
        this.descOrigin = descOrigin;
    }

    public String getDescDestination() {
        return descDestination;
    }

    public void setDescDestination(String descDestination) {
        this.descDestination = descDestination;
    }

    public String getSscc() {
        return sscc;
    }

    public void setSscc(String sscc) {
        this.sscc = sscc;
    }
}
