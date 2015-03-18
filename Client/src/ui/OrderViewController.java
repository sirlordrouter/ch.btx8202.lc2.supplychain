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
import model.entities.StockTreeItem;
import model.entities.SwissIndexResult;
import model.entities.TradeItem;
import services.SwissIndexClient;
import webservice.erp.*;
import model.entities.OrderTreeItem;
import services.ErpClient;
import services.IDataSource;
import services.PropertiesReader;

import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.util.*;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis<br>
 *
 *<p>This class handles the gui elements of the OrderView.fxml. Based on database tables, order suggestions for medicaments are generated
 * in a treetableview. The entries are editable and removable.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 28-02-2015
 */
public class OrderViewController extends VBox implements Initializable,IPartialView {
    public TreeTableView orderTable;
    public Button editButton,addButton,removeButton,sendButton,refreshButton;
    public ObservableList<Item> data =  FXCollections.observableArrayList();

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
            // get the properties
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
            // get a connection object to the webservice
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

    public void refreshOrderTable() {
        data.clear();
        setOrderTable();
    }

    public void setOrderTable(){
        /*
         * *************************************************
         * Test data.
         */
        List<Order> orderList=new ArrayList<>();
        orderList.add(getOrderSuggestion());
        /*
         * *********************SETUP TREE NODES*****************************
         */
        // empty root element (will be set to invisible)
        final TreeItem<OrderTreeItem> root =
        new TreeItem<OrderTreeItem>(new OrderTreeItem("Orders", null, null));

        // iterate over the orders and fill the empty root element with tree items
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

        // GTIN Column
        TreeTableColumn<OrderTreeItem, String> gtinColumn =
                new TreeTableColumn<>("GTIN");
        gtinColumn.setPrefWidth(200);
        gtinColumn.setEditable(true);
        gtinColumn.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        gtinColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<OrderTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getGtin())
        );
        // provide modification functionality
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
        descColumn.setPrefWidth(200);
        descColumn.setEditable(true);
        descColumn.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        descColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<OrderTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getDescription())
        );
        // provide modification functionality
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
        // provide modification functionality
        quantityColumn.setOnEditCommit(new EventHandler<TreeTableColumn.CellEditEvent<OrderTreeItem, String>>()  {
            @Override
            public void handle(final TreeTableColumn.CellEditEvent<OrderTreeItem, String> event) {
                final OrderTreeItem item = event.getRowValue().getValue();
                item.setQuantity(event.getNewValue());
            }
        });

        /*
        *******************************SETUP BUTTONS********************************************************
         */

        // add button to add more positions to an existing order
        addButton.setOnAction( new EventHandler<ActionEvent>()
        {
            @Override
            public void handle( final ActionEvent event )
            {
                final TreeItem<OrderTreeItem> selectedItem = (TreeItem<OrderTreeItem>)orderTable.getSelectionModel().getSelectedItem();
                // check if the selected item is an order
                if(selectedItem.getValue().getDescription()==null){
                    final TreeItem<OrderTreeItem> newItem =
                    new TreeItem<>( new OrderTreeItem("", "","" ) );
                    // add an empty treeitem
                    selectedItem.getChildren().add( newItem );
                    selectedItem.expandedProperty().set( true );
                    final int rowIndex = orderTable.getRow(newItem);
                    orderTable.edit(rowIndex, gtinColumn );
                }
            }

        } );
        // edit button to modify existing tree items (no input validation)
        editButton.setOnAction( new EventHandler<ActionEvent>()
        {
            @Override
            public void handle( final ActionEvent event )
            {
                final TreeItem<OrderTreeItem> selectedItem = (TreeItem<OrderTreeItem>)orderTable.getSelectionModel().getSelectedItem();
                // check that the selected item isnt an order
                if(selectedItem.getValue().getDescription()!=null){
                    final int rowIndex = orderTable.getRow(selectedItem);
                    orderTable.edit(rowIndex, quantityColumn );
                }else{
                    // error popup
                    UserInformationPopup popup = new UserInformationPopup("You can only edit the quantity of an existing position.","Error");
                    popup.show();
                }

            }

        } );
        // remove button to remove entries of the tree table.
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
                Navigator.getInstance().getMainController().setStatusbarWaiting("send orders...");


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
                    boolean request = dataSource.setOrder(order,prop.getProperty("stationGLN"),prop.getProperty("manufacturerGLN"));
                    if(request){
                        selectedItem.getParent().getChildren().remove(selectedItem);
                        Navigator.getInstance().getMainController().setStatusbarEmpty();
                        UserInformationPopup popup = new UserInformationPopup("The order is successfully sent.","Information");
                        popup.show();
                    }else{
                        Navigator.getInstance().getMainController().setStatusbarEmpty();
                        UserInformationPopup popup = new UserInformationPopup("The order could not been sent. Please check your input data.","Error");
                        popup.show();
                    }
                }else{
                    Navigator.getInstance().getMainController().setStatusbarEmpty();
                    UserInformationPopup popup = new UserInformationPopup("You can only send whole orders, not single positions.","Error");
                    popup.show();
                }
            }
        } );
        // add the columns to the treetable
        orderTable.getColumns().setAll(gtinColumn, descColumn,quantityColumn);
        // set the root element
        orderTable.setRoot(root);
        // make the treetable editable
        orderTable.setEditable(true);
        // dont show the root element (invisible container)
        orderTable.setShowRoot(false);

    }

    /**
     * get order suggestion
     * @return an Order
     */
    public Order getOrderSuggestion() {

        Navigator.getInstance().getMainController().setStatusbarWaiting("getting order suggestions...");


        Order order = new Order();
        order.setName("Order Suggestion");
        order.setOrdered(false);
        // fetch checkedin items from the supply chain service
        WebServiceResult result = dataSource.getCheckedInItems(prop.getProperty("stationGLN"));
        ObservableList<Item> tempData = FXCollections.observableArrayList();
        tempData.setAll(result.getItems());

        // iterate over all checked in items and get item information from swissindex
        for(Item item:tempData){
            TradeItem tradeItem = null;
            SwissIndexResult swissIndexResult = SwissIndexClient.getItemInformationFromGTIN(item.getGTIN());
            if(result.isResult()){
                tradeItem = swissIndexResult.getTradeItems().get(0);
            }else{
                Navigator.getInstance().getMainController().setStatusbarEmpty();
                System.out.println(swissIndexResult.getMessage());
            }
            TradeItem tradeItem1 = new TradeItem();
            tradeItem1.setName(tradeItem.getName());
            tradeItem1.setBeschreibung(tradeItem.getBeschreibung());
            tradeItem1.setMenge(tradeItem.getMenge());
            tradeItem1.setGTIN(item.getGTIN());
            tradeItem1.setExpiryDate(item.getExpiryDate());
            tradeItem1.setLot(item.getLot());
            tradeItem1.setSerial(item.getSerial());
            tradeItem1.setCheckInDate(item.getCheckInDate());
            data.add(tradeItem1);
        }


        ArrayList<String> groupnames = new ArrayList<String>();
        // set an invisible root element as a container
        final TreeItem<StockTreeItem> root =
                new TreeItem<StockTreeItem>(new StockTreeItem("Stock", "", "", "", "", ""));
        for (Item i : data) {
            // create a new group, if the item name is a new one
            if (!groupnames.contains(i.getName())) {
                groupnames.add(i.getName());
                StockTreeItem treeGroup = new StockTreeItem(i.getName(), "", "", "", "", "");
                root.getChildren().add(new TreeItem<StockTreeItem>(treeGroup));
            }
            // fill all elements in the corresponding group
            for (TreeItem<StockTreeItem> item : root.getChildren()) {
                if (i.getName().equals(item.getValue().getDescription())) {
                    StockTreeItem treeItem = new StockTreeItem(i.getName(), i.getMenge(), i.getGTIN(), i.getExpiryDate(), i.getLot(), i.getSerial());
                    item.getChildren().add(new TreeItem<StockTreeItem>(treeItem));
                }
            }
        }
        // count the items for each group
        List<Quantity> quantities = dataSource.getQuantities(prop.getProperty("stationGLN"));

        for (TreeItem<StockTreeItem> item : root.getChildren()) {
            int count = item.getChildren().size();
            item.getValue().setQuantity(Integer.toString(count) + " pc.");
            // check for order suggestions
                for(Quantity quantity:quantities){
                    if(item.getChildren().get(0).getValue().getGtin().equals(quantity.getGtin())){
                        if(count<quantity.getMinQuantity()){
                            int orderQuantity = quantity.getOptQuantity() -count;
                            Position pos = new Position();
                            pos.setGtin(item.getChildren().get(0).getValue().getGtin());
                            pos.setDescription(item.getChildren().get(0).getValue().getDescription());
                            pos.setQuantity(orderQuantity);
                            order.getPositions().add(pos);
                        }
                    }
                }

        }
        Navigator.getInstance().getMainController().setStatusbarEmpty();
        return order;
    }
}
