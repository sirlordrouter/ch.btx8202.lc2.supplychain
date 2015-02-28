package ui;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.VBox;
import model.entities.StockTreeItem;
import model.entities.SwissIndexResult;
import model.entities.TradeItem;
import services.ErpClient;
import services.IDataSource;
import services.PropertiesReader;
import services.SwissIndexClient;
import webservice.erp.Item;
import webservice.erp.WebServiceResult;

import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>This class handles the data provided of the TrackedItems Table in the Logistic Database.
 * The goal is to show all checked in Items of a specific global location number.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 10-12-2014
 */
public class StockViewController extends VBox implements Initializable,IPartialView {
    public TreeTableView itemList;
    public ObservableList<Item> data =  FXCollections.observableArrayList();

    IDataSource dataSource;
    Properties prop;

    public StockViewController(String fxml) {

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

    @FXML
    public void Event(ActionEvent actionEvent) {
        //labelItem.setText("Button clicked...please Scan item..");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

    public void checkOut(ActionEvent actionEvent) {
        // TODO?
    }


    /**
     * update the checked in items list.
     * @param event
     */
    public void searchCheckedInItems(ActionEvent event) {
        data.removeAll(data);
        getCheckedInItems();
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

    /**
     * get checked in items from the webservice and add product informations from the swissindex webservice
     */
    public void getCheckedInItems(){
        // fetch checkedin items from the supply chain service
        WebServiceResult result = dataSource.getCheckedInItems(prop.getProperty("stationGLN"));
        ObservableList<Item> tempData =  FXCollections.observableArrayList();

        tempData.setAll(result.getItems());

        // iterate over all checked in items and get item information from swissindex
        for(Item item:tempData){
            TradeItem tradeItem = null;
            SwissIndexResult swissIndexResult = SwissIndexClient.getItemInformationFromGTIN(item.getGTIN());
            if(result.isResult()){
                tradeItem = swissIndexResult.getTradeItems().get(0);
            }else{
                System.out.println(swissIndexResult.getMessage());
                return;
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
        for(Item i:data){
            // create a new group, if the item name is a new one
            if(!groupnames.contains(i.getName())){
                groupnames.add(i.getName());
                StockTreeItem treeGroup = new StockTreeItem(i.getName(), "", "", "", "", "");
                root.getChildren().add(new TreeItem<StockTreeItem>(treeGroup));
            }
            // fill all elements in the corresponding group
            for(TreeItem<StockTreeItem> item:root.getChildren()){
                if(i.getName().equals(item.getValue().getDescription())){
                    StockTreeItem treeItem = new StockTreeItem(i.getName(), i.getMenge(), i.getGTIN(), i.getExpiryDate(), i.getLot(), i.getSerial());
                    item.getChildren().add(new TreeItem<StockTreeItem>(treeItem));
                }
            }
        }
        // count the items for each group
        for(TreeItem<StockTreeItem> item:root.getChildren()){
            item.getValue().setQuantity(Integer.toString(item.getChildren().size())+ " pc.");
        }
        // if there are no checkedin items, alert user!
        if(data.isEmpty()){
            UserInformationPopup popup = new UserInformationPopup("Aktuell sind keine Objekte eingecheckt.", "Keine Objekte gefunden.");
            popup.show();
        }

        /*
        ***************************SETUP TABLE COLUMNS********************************************************
         */
        // Name Column
        TreeTableColumn<StockTreeItem, String> nameColumn =
                new TreeTableColumn<>("Name");
        nameColumn.setPrefWidth(200);
        nameColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<StockTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getDescription())
        );
        // Quantity Column
        TreeTableColumn<StockTreeItem, String> quantityColumn =
                new TreeTableColumn<>("Quantity");
        quantityColumn.setPrefWidth(80);
        quantityColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<StockTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getQuantity())
        );
        // GTIN Column
        TreeTableColumn<StockTreeItem, String> gtinColumn =
                new TreeTableColumn<>("GTIN");
        gtinColumn.setPrefWidth(150);
        gtinColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<StockTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getGtin())
        );
        // ExpiryDate Column
        TreeTableColumn<StockTreeItem, String> expColumn =
                new TreeTableColumn<>("Expiry Date");
        expColumn.setPrefWidth(150);
        expColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<StockTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getExpdate())
        );
        // Batch Lot Column
        TreeTableColumn<StockTreeItem, String> batchlotColumn =
                new TreeTableColumn<>("Batch/Lot");
        batchlotColumn.setPrefWidth(150);
        batchlotColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<StockTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getBatchlot())
        );
        // Serial Column
        TreeTableColumn<StockTreeItem, String> serialColumn =
                new TreeTableColumn<>("Serial");
        serialColumn.setPrefWidth(150);
        serialColumn.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<StockTreeItem, String> param) ->
                        new ReadOnlyStringWrapper(param.getValue().getValue().getSerial())
        );
        /*
        ***************************************************************************************
         */

        // add the columns to the treetable
        itemList.getColumns().setAll(nameColumn, quantityColumn,gtinColumn,expColumn,batchlotColumn,serialColumn);
        itemList.setRoot(root);
        // dont show the root element (invisible container)
        itemList.setShowRoot(false);

    }

    @Override
    public void beforeLeaving() {

    }

    @Override
    public void beforeOpen() {

    }
}
