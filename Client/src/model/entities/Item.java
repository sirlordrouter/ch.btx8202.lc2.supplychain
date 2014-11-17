package model.entities;

/**
 * Created by Johannes on 04.11.14.
 */
public class Item {
    private String Name;
    private String Menge;
    private String GLN;
    private String Lot;
    private String Serial;

    public Item(){
    }

    public Item(String name, String menge, String GLN, String lot, String serial) {
        Name = name;
        Menge = menge;
        this.GLN = GLN;
        Lot = lot;
        Serial = serial;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMenge() {
        return Menge;
    }

    public void setMenge(String menge) {
        Menge = menge;
    }

    public String getGLN() {
        return GLN;
    }

    public void setGLN(String GLN) {
        this.GLN = GLN;
    }

    public String getLot() {
        return Lot;
    }

    public void setLot(String lot) {
        Lot = lot;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }
}
