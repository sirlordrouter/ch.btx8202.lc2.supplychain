package model.entities;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.Observable;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>This class provides the initialization and modification of order objects. An order object consists of a name (String), a
 * list of positions and a boolean to mark if the order is already sent (true) or not (false).</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 28-02-2015
 */
public class Order {
    // Instance variables
    private SimpleStringProperty name;
    private SimpleListProperty<Position> positions;
    private SimpleBooleanProperty ordered;

    // Constructor
    public Order(String aName, ObservableList<Position> aPositionList, boolean state){
        this.name = new SimpleStringProperty(aName);
        this.positions = new SimpleListProperty<>(aPositionList);
        this.ordered=new SimpleBooleanProperty(state);
    }
    // getter and setter
    public ObservableList<Position> getPositions() {
        return positions.get();
    }

    public SimpleListProperty<Position> positionsProperty() {
        return positions;
    }

    public void setPositions(ObservableList<Position> positions) {
        this.positions.set(positions);
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
