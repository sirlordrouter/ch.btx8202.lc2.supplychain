package model.entities;

import webservice.erp.Company;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>A ProducerCompany Class</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @author Patrizia Zehnder, patriziasusanna.zehnder@students.bfh.ch
 * @version 17-11-2014
 */
public class ProducerCompany extends Company {

    public ProducerCompany() {
        super();
    }


    @Override
    public String toString() {
        return "GLN: " + getGLN() + '\n' +
                "Abteilung: " + getAbteilung() + '\n' +
                "Name: " + getName() + '\n';
    }
}
