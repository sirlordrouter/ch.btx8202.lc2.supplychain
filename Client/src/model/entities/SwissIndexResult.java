package model.entities;

import java.util.List;

/**
 * Created by ph on 05.01.15.
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
