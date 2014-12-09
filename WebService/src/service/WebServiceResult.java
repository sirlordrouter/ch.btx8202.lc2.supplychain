package service;

import entities.Item;

import java.util.List;

/**
 *
 * @author Patrizia Zehnder, patriziasusanna.zehnder@students.bfh.ch
 * @version 09-12-2014
 *
 * Container mit einer Liste von items als Antwort fuer einlesen einer SSCC beim Client.
 * Info ob Fehler, nicht gefunden oder erfolgreich (boolean)
 */
public class WebServiceResult {


    private List<Item> items;
    private boolean result;

    /**
     * Constructor
     * @param items
     * @param result
     */
    public WebServiceResult(List<Item> items, boolean result){
        this.items = items;
        this.result = result;
    }

    public WebServiceResult(){

    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
