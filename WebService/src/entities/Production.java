package entities;

import java.util.List;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 10-03-2015
 */
public class Production {
    private Shipment shipment;
    private List<Position> positions;
    private List<Item> items;
    private boolean success;

    public Production(){

    }

    public Production(Shipment ship,List<Position> posList, List<Item> itemList,boolean Success){
        this.shipment=ship;
        this.positions=posList;
        this.items=itemList;
        this.success=Success;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
