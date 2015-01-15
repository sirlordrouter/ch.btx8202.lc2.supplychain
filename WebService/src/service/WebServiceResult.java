package service;

import entities.Item;

import java.util.List;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 * <p>Container with a List of Items and a Boolean for the state. (true = is result, false = no result)</p>
 *
 * @author Patrizia Zehnder, patriziasusanna.zehnder@students.bfh.ch
 * @version 09-12-2014
 */

public class WebServiceResult {


    private List<Item> items;
    private boolean result;

    /**
     * Constructor
     * @param items A List of items
     * @param result A Boolean to mark the state
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
