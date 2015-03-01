package ui;


import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.layout.VBox;
import webservice.erp.Order;
import model.entities.OrderTreeItem;
import webservice.erp.Position;
import services.ErpClient;
import services.IDataSource;
import services.PropertiesReader;

import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.util.*;

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
public class OrderViewController extends VBox implements Initializable,IPartialView {
    public TreeTableView orderTable;
    public Button editButton,addButton,removeButton,sendButton;


    IDataSource dataSource;
    Properties prop;

    public OrderViewController(String fxml) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        try {
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
            dataSource = new ErpClient(prop.getProperty("stationGLN"));

        } catch (ConnectException e ) {
            e.printStackTrace();
        } catch(WebServiceException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
           setOrderTable();


    }



    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void nextPane(ActionEvent event) {
        Navigator.getInstance().loadVista(Navigator.HOME_VIEW);
    }


    @Override
    public void beforeLeaving() {

    }

    @Override
    public void beforeOpen() {

    }

    public void setOrderTable(){
        List<Order> orderList=new ArrayList<>();
        ObservableList<Position> positions1 = FXCollections.observableArrayList();
        ObservableList<Position> positions2 = FXCollections.observableArrayList();
        Order order1 = new Order();
        order1.setName("Order 1");
        order1.setOrdered(false);
        Position pos1 = new Position();
        Position pos2 = new Position();
        pos1.setGtin("21342431");
        pos1.setDescription("Aspirin");
        pos1.setQuantity(10);
        positions1.add(pos1);
        pos2.setGtin("2341341355");
        pos2.setDescription("Dafalgan");
        pos2.setQuantity(20);
        positions1.add(pos2);
        order1.getPositions().addAll(positions1);
        orderList.add(order1);
        final TreeItem<OrderTreeItem> root =
        new TreeItem<OrderTreeItem>(new OrderTreeItem("Orders", null, null));

        for(Order order:orderList){
            TreeItem<OrderTreeItem> tempItem = new TreeItem<OrderTreeItem>(new OrderTreeItem(order.getName(), null, null));
            for(Position position:order.getPositions()){
                tempItem.getChildren().add(new TreeItem<OrderTreeItem>(new OrderTreeItem(position.getGtin(), position.getDescription(), Integer.toString(position.getQuantity()))));
            }
            root.getChildren().add(tempItem);
        }


        /*
        ***************************SETUP TABLE COLUMNS********************************************************
         */
        // Name Column
        TreeTableColumn<OrderTreeItem, String> gtinColumn =
                new TreeTableColumn<>("GTIN");
        gtinColumn.setPrefWidth(200);
        gtinColumn.setEditable(true);
        gtinColumn.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        gtinColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<OrderTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getGtin())
        );
        gtinColumn.setOnEditCommit(new EventHandler<TreeTableColumn.CellEditEvent<OrderTreeItem, String>>()  {
            @Override
            public void handle(final TreeTableColumn.CellEditEvent<OrderTreeItem, String> event) {
                final OrderTreeItem item = event.getRowValue().getValue();
                item.setGtin(event.getNewValue());
            }
        });

        // Description Column
        TreeTableColumn<OrderTreeItem, String> descColumn =
                new TreeTableColumn<>("Description");
        descColumn.setPrefWidth(80);
        descColumn.setEditable(true);
        descColumn.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        descColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<OrderTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getDescription())
        );
        descColumn.setOnEditCommit(new EventHandler<TreeTableColumn.CellEditEvent<OrderTreeItem, String>>()  {
            @Override
            public void handle(final TreeTableColumn.CellEditEvent<OrderTreeItem, String> event) {
                final OrderTreeItem item = event.getRowValue().getValue();
                item.setDescription(event.getNewValue());
            }
        });
        // Quantity Column
        TreeTableColumn<OrderTreeItem, String> quantityColumn =
                new TreeTableColumn<>("Quantity");
        quantityColumn.setPrefWidth(80);
        quantityColumn.setEditable(true);
        quantityColumn.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        quantityColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<OrderTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getQuantity())
        );
        quantityColumn.setOnEditCommit(new EventHandler<TreeTableColumn.CellEditEvent<OrderTreeItem, String>>()  {
            @Override
            public void handle(final TreeTableColumn.CellEditEvent<OrderTreeItem, String> event) {
                final OrderTreeItem item = event.getRowValue().getValue();
                item.setQuantity(event.getNewValue());
            }
        });

        /*
        ***************************************************************************************
         */

        addButton.setOnAction( new EventHandler<ActionEvent>()
        {
            @Override
            public void handle( final ActionEvent event )
            {
                final TreeItem<OrderTreeItem> selectedItem = (TreeItem<OrderTreeItem>)orderTable.getSelectionModel().getSelectedItem();
                if(selectedItem.getValue().getDescription()==null){
                    final TreeItem<OrderTreeItem> newItem =
                    new TreeItem<>( new OrderTreeItem("", "","" ) );
                    selectedItem.getChildren().add( newItem );
                    selectedItem.expandedProperty().set( true );
                    final int rowIndex = orderTable.getRow(newItem);
                    orderTable.edit(rowIndex, gtinColumn );
                }
            }

        } );
        editButton.setOnAction( new EventHandler<ActionEvent>()
        {
            @Override
            public void handle( final ActionEvent event )
            {
                final TreeItem<OrderTreeItem> selectedItem = (TreeItem<OrderTreeItem>)orderTable.getSelectionModel().getSelectedItem();
                if(selectedItem.getValue().getDescription()!=null){
                    final int rowIndex = orderTable.getRow(selectedItem);
                    orderTable.edit(rowIndex, quantityColumn );
                }else{
                    UserInformationPopup popup = new UserInformationPopup("You can only edit the quantity of an existing position.","Error");
                    popup.show();
                }

            }

        } );
        removeButton.setOnAction( new EventHandler<ActionEvent>()
        {
            @Override
            public void handle( final ActionEvent event )
            {
                final TreeItem<OrderTreeItem> selectedItem = (TreeItem<OrderTreeItem>)orderTable.getSelectionModel().getSelectedItem();
                selectedItem.getParent().getChildren().remove(selectedItem);

            }

        } );
        sendButton.setOnAction( new EventHandler<ActionEvent>()
        {
            @Override
            public void handle( final ActionEvent event )
            {
                final TreeItem<OrderTreeItem> selectedItem = (TreeItem<OrderTreeItem>)orderTable.getSelectionModel().getSelectedItem();
                if(selectedItem.getValue().getDescription()==null){
                    ObservableList<Position> positions = FXCollections.observableArrayList();
                    Order order = new Order();
                    order.setName("Order");
                    order.setOrdered(true);
                    for(TreeItem<OrderTreeItem> item:selectedItem.getChildren()){
                        Position pos = new Position();
                        pos.setGtin(item.getValue().getGtin());
                        pos.setDescription(item.getValue().getDescription());
                        pos.setQuantity(Integer.parseInt(item.getValue().getQuantity()));
                        positions.add(pos);
                    }
                    order.getPositions().addAll(positions);
                    boolean request = dataSource.setOrder(order,null,null);
                    if(request){
                        selectedItem.getParent().getChildren().remove(selectedItem);
                        UserInformationPopup popup = new UserInformationPopup("The order is successfully sent.","Information");
                        popup.show();
                    }else{
                        UserInformationPopup popup = new UserInformationPopup("The order could not been sent. Please check your input data.","Error");
                        popup.show();
                    }
                }else{
                    UserInformationPopup popup = new UserInformationPopup("You can only send whole orders, not single positions.","Error");
                    popup.show();
                }

            }

        } );
        // add the columns to the treetable
        orderTable.getColumns().setAll(gtinColumn, descColumn,quantityColumn);
        orderTable.setRoot(root);
        orderTable.setEditable(true);
        // dont show the root element (invisible container)
        orderTable.setShowRoot(false);

    }
}
