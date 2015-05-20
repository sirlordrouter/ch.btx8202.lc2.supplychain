package ui;

import bartender.BartenderGenerator;
import javafx.application.HostServices;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import model.entities.FilePathTreeItem;
import model.entities.OrderTreeItem;
import services.ErpClient;
import services.IDataSource;
import services.PropertiesReader;
import webservice.erp.Item;
import webservice.erp.Order;
import webservice.erp.Position;
import webservice.erp.Production;

import javax.xml.ws.WebServiceException;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.file.*;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis<br>
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
    public TreeView treeView;
    public Button processButton,refreshOrdersButton;
    public ObservableList<Item> data =  FXCollections.observableArrayList();
    List<Order> orderList=FXCollections.observableArrayList();
    private Desktop desktop = Desktop.getDesktop();

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
            dataSource = new ErpClient(prop.getProperty("currentGLN"));

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

    public void refreshOpenOrderTable(){
        orderList.clear();
        data.clear();
        setOpenOrderTable();
    }

    public void setOpenOrderTable(){
        Navigator.getInstance().getMainController().setStatusbarWaiting("getting open orders...");
         /*
         * *************************************************
         * Test data.
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    orderList = dataSource.getOpenOrdersByGLN(prop.getProperty("manufacturerGLN"));
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
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
                            quantityColumn.setPrefWidth(90);
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

                                    // convert selected treeitem back to an order object
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
                                        // start webservice request
                                        Production productionObject = dataSource.processOrder(order,prop.getProperty("manufacturerGLN"),prop.getProperty("stationGLN"));
                                        BartenderGenerator gen = new BartenderGenerator(productionObject);
                                        gen.createDataMatrixtriggerFile();
                                        gen.createShipmenttriggerFile();
                                        gen.createSSCCtriggerFile();
                                        // user information popups
                                        if(productionObject.isSuccess()){
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
                            Navigator.getInstance().getMainController().setStatusbarEmpty();
                        }
                    });
                }
                    }}).start();

        //setup the file browser root
        String folderName="Lieferscheine";
        TreeItem<String> rootNode=new TreeItem<>(folderName,new ImageView(new Image(Main.class.getResourceAsStream("/media/folder.png"))));

        DirectoryStream<Path> directoryStream = null;
        try {
            directoryStream = Files.newDirectoryStream(Paths.get(prop.getProperty("lieferscheinFolder")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Path path : directoryStream) {
            FilePathTreeItem treeNode=new FilePathTreeItem(path);
            rootNode.getChildren().add(treeNode);
        }
        rootNode.setExpanded(true);
        treeView.getSelectionModel().selectedItemProperty().addListener( new ChangeListener() {

            @Override
            public void changed(ObservableValue observable, Object oldValue,
                                Object newValue) {
                TreeItem<String> selectedItem = (TreeItem<String>) newValue;
                try {
                    desktop.open(new File(prop.getProperty("lieferscheinFolder")+selectedItem.getValue()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        });
        //create the tree view
        treeView.setRoot(rootNode);
        treeView.setShowRoot(true);


    }
}
