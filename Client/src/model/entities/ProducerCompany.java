package model.entities;

import webservice.erp.Company;

/**
 * Created by Johannes on 17.11.14.
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
