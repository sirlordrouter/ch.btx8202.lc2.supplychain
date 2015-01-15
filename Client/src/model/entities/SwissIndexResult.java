package model.entities;

import java.util.List;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>This class is used to handle the results of a request to the SwissINDEX Webservice.
 * A List of TradeItems, a result (boolean) and a message (String) can be specified.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 05-01-2015
 */
public class SwissIndexResult {
    private List<TradeItem> tradeItems;
    private boolean result;
    private String message;

    public SwissIndexResult(List<TradeItem> aTradeItemList, boolean aResult, String aMessage){
        this.tradeItems = aTradeItemList;
        this.result = aResult;
        this.message= aMessage;
    }
    public SwissIndexResult(){

    }

    public List<TradeItem> getTradeItems() {
        return tradeItems;
    }

    public void setTradeItems(List<TradeItem> tradeItem) {
        this.tradeItems = tradeItem;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
