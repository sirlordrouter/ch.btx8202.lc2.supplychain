package entities;

import javafx.collections.ObservableList;

import java.util.List;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 28-02-2015
 */
public class Order {
    private String name;
    private List<Position> positions;
    private boolean ordered;

    public Order(String aName, ObservableList<Position> aPositionList, boolean state){
        this.name = aName;
        this.positions = aPositionList;
        this.ordered=state;
    }
    public Order(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }
}
