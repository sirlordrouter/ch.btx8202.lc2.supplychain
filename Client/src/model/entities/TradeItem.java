package model.entities;

import webservice.erp.Item;

/**
 * Created by Johannes on 17.11.14.
 */
public class TradeItem extends Item {

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
