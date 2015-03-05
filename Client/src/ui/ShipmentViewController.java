package ui;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.layout.VBox;
import model.entities.OrderTreeItem;
import services.ErpClient;
import services.IDataSource;
import services.PropertiesReader;
import webservice.erp.Item;
import webservice.erp.Order;
import webservice.erp.Position;

import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>This class handles the gui elements of the ShipmentView.fxml.
 * Manufacturer has the possibility to process an open order (generate identifiers for products and
 * initialize them in the database.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 03-03-2015
 */
public class ShipmentViewController extends VBox implements Initializable,IPartialView {
    public TreeTableView orderTable;
    public Button processButton,refreshOrdersButton;
    public ObservableList<Item> data =  FXCollections.observableArrayList();



    IDataSource dataSource;
    Properties prop;

    public ShipmentViewController(String fxml) {

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

    public void setOpenOrderTable(){
         /*
         * *************************************************
         * Test data.
         */
        List<Order> orderList=dataSource.getOpenOrdersByGLN(prop.getProperty("manufacturerGLN"));
        /*
         * *********************SETUP TREE NODES*****************************
         */
        // empty root element (will be set to invisible)
        final TreeItem<OrderTreeItem> root =
                new TreeItem<OrderTreeItem>(new OrderTreeItem("Orders", null, null));

        // iterate over the orders and fill the empty root element with tree items
        if(orderList!=null){
            for(Order order:orderList){
                TreeItem<OrderTreeItem> tempItem = new TreeItem<OrderTreeItem>(new OrderTreeItem("Order "+order.getName(), null, null));
                for(Position position:order.getPositions()){
                    tempItem.getChildren().add(new TreeItem<OrderTreeItem>(new OrderTreeItem(position.getGtin(), position.getDescription(), Integer.toString(position.getQuantity()))));
                }
                root.getChildren().add(tempItem);
            }
        }

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

        /*
        ********************** Button ************************************
         */
        processButton.setOnAction( new EventHandler<ActionEvent>()
        {
            @Override
            public void handle( final ActionEvent event )
            {
                final TreeItem<OrderTreeItem> selectedItem = (TreeItem<OrderTreeItem>)orderTable.getSelectionModel().getSelectedItem();
                if(selectedItem.getValue().getDescription()==null){
                    ObservableList<Position> positions = FXCollections.observableArrayList();
                    Order order = new Order();
                    order.setName(selectedItem.getValue().getGtin());
                    order.setOrdered(true);
                    for(TreeItem<OrderTreeItem> item:selectedItem.getChildren()){
                        Position pos = new Position();
                        pos.setGtin(item.getValue().getGtin());
                        pos.setDescription(item.getValue().getDescription());
                        pos.setQuantity(Integer.parseInt(item.getValue().getQuantity()));
                        positions.add(pos);
                    }
                    order.getPositions().addAll(positions);
                   boolean request = dataSource.processOrder(order,prop.getProperty("manufacturerGLN"),prop.getProperty("stationGLN"));
                   if(request){
                        selectedItem.getParent().getChildren().remove(selectedItem);
                       UserInformationPopup popup = new UserInformationPopup("The order is successfully processed.","Information");
                       popup.show();
                   }else{
                        UserInformationPopup popup = new UserInformationPopup("The order could not been processed. Please check your input data.","Error");
                        popup.show();
                    }
                }else{
                    UserInformationPopup popup = new UserInformationPopup("You can only process whole orders, not single positions.","Error");
                    popup.show();
                }
            }
        } );
        /*
        ********************** General ************************************
         */
        // add the columns to the treetable
        orderTable.getColumns().setAll(gtinColumn, descColumn,quantityColumn);
        // set the root element
        orderTable.setRoot(root);
        // make the treetable editable
        orderTable.setEditable(true);
        // dont show the root element (invisible container)
        orderTable.setShowRoot(false);

    }
}
