package entities;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>A Company class.</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 17-11-2014
 */
public class Company {

    private String GLN;
    private String Abteilung;
    private String Name;

    public Company () {}

    public Company(String GLN, String abteilung, String name) {
        this.GLN = GLN;
        Abteilung = abteilung;
        Name = name;
    }

    public String getGLN() {
        return GLN;
    }

    public void setGLN(String GLN) {
        this.GLN = GLN;
    }

    public String getAbteilung() {
        return Abteilung;
    }

    public void setAbteilung(String abteilung) {
        Abteilung = abteilung;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "GLN: " + GLN + '\n' +
                "Abteilung: " + Abteilung + '\n' +
                "Name: " + Name + '\n';
    }
}
