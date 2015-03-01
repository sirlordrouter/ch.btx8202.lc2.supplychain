package entities;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

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
    private SimpleStringProperty name;
    private SimpleListProperty<Position> positions;
    private SimpleBooleanProperty ordered;

    public Order(String aName, ObservableList<Position> aPositionList, boolean state){
        this.name = new SimpleStringProperty(aName);
        this.positions = new SimpleListProperty(aPositionList);
        this.ordered=new SimpleBooleanProperty(state);
    }
    public Order(){

    }

    public ObservableList<Position> getPositions() {
        return positions.get();
    }

    public SimpleListProperty<Position> positionsProperty() {
        return positions;
    }

    public void setPositions(ObservableList<Position> positionList) {
        this.positions.set(positionList);
    }

    public boolean getOrdered() {
        return ordered.get();
    }

    public SimpleBooleanProperty orderedProperty() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered.set(ordered);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String aName) {
        this.name.set(aName);
    }
}
