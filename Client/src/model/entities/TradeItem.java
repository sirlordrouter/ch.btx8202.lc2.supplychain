package model.entities;

import webservice.erp.Item;

import java.math.BigInteger;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>A TradeItem Class</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @author Patrizia Zehnder, patriziasusanna.zehnder@students.bfh.ch
 * @version 17-11-2014
 */
public class TradeItem extends Item {

    public BigInteger getPharmaCode() {
        return pharmaCode;
    }

    public void setPharmaCode(BigInteger pharmaCode) {
        this.pharmaCode = pharmaCode;
    }

    private BigInteger pharmaCode;

    public TradeItem() {
        super();
    }



    @Override
    public String toString() {
        return  "Name: " + getName() + '\n' +
                "Menge: " + getMenge() + '\n' +
                "GTIN: " + getGTIN() + '\n' +
                "Lot: " + getLot() + '\n' +
                "Serial: " + getSerial() + '\n' +
                "Beschreibung: " + getBeschreibung() + '\n' +
                "Zusatz='" + getZusatz() + '\n' +
                "ATC: " + getATC() + '\n' +
                "Hersteller: " + producer;
    }
}
