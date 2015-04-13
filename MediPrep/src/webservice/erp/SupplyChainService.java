
package webservice.erp;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SupplyChainService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SupplyChainService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorldFrom", targetNamespace = "http://service/", className = "webservice.erp.SayHelloWorldFrom")
    @ResponseWrapper(localName = "sayHelloWorldFromResponse", targetNamespace = "http://service/", className = "webservice.erp.SayHelloWorldFromResponse")
    @Action(input = "http://service/SupplyChainService/sayHelloWorldFromRequest", output = "http://service/SupplyChainService/sayHelloWorldFromResponse")
    public String sayHelloWorldFrom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns webservice.erp.WebServiceResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCheckedInItems", targetNamespace = "http://service/", className = "webservice.erp.GetCheckedInItems")
    @ResponseWrapper(localName = "getCheckedInItemsResponse", targetNamespace = "http://service/", className = "webservice.erp.GetCheckedInItemsResponse")
    @Action(input = "http://service/SupplyChainService/getCheckedInItemsRequest", output = "http://service/SupplyChainService/getCheckedInItemsResponse")
    public WebServiceResult getCheckedInItems(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns webservice.erp.WebServiceResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItemsByGSIN", targetNamespace = "http://service/", className = "webservice.erp.GetItemsByGSIN")
    @ResponseWrapper(localName = "getItemsByGSINResponse", targetNamespace = "http://service/", className = "webservice.erp.GetItemsByGSINResponse")
    @Action(input = "http://service/SupplyChainService/getItemsByGSINRequest", output = "http://service/SupplyChainService/getItemsByGSINResponse")
    public WebServiceResult getItemsByGSIN(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns webservice.erp.WebServiceResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkinItems", targetNamespace = "http://service/", className = "webservice.erp.CheckinItems")
    @ResponseWrapper(localName = "checkinItemsResponse", targetNamespace = "http://service/", className = "webservice.erp.CheckinItemsResponse")
    @Action(input = "http://service/SupplyChainService/checkinItemsRequest", output = "http://service/SupplyChainService/checkinItemsResponse")
    public WebServiceResult checkinItems(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Item> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setOrder", targetNamespace = "http://service/", className = "webservice.erp.SetOrder")
    @ResponseWrapper(localName = "setOrderResponse", targetNamespace = "http://service/", className = "webservice.erp.SetOrderResponse")
    @Action(input = "http://service/SupplyChainService/setOrderRequest", output = "http://service/SupplyChainService/setOrderResponse")
    public boolean setOrder(
        @WebParam(name = "arg0", targetNamespace = "")
        Order arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns webservice.erp.WebServiceResult
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkoutItems", targetNamespace = "http://service/", className = "webservice.erp.CheckoutItems")
    @ResponseWrapper(localName = "checkoutItemsResponse", targetNamespace = "http://service/", className = "webservice.erp.CheckoutItemsResponse")
    @Action(input = "http://service/SupplyChainService/checkoutItemsRequest", output = "http://service/SupplyChainService/checkoutItemsResponse")
    public WebServiceResult checkoutItems(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Item> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "insertTrackingItems", targetNamespace = "http://service/", className = "webservice.erp.InsertTrackingItems")
    @ResponseWrapper(localName = "insertTrackingItemsResponse", targetNamespace = "http://service/", className = "webservice.erp.InsertTrackingItemsResponse")
    @Action(input = "http://service/SupplyChainService/insertTrackingItemsRequest", output = "http://service/SupplyChainService/insertTrackingItemsResponse")
    public void insertTrackingItems(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Item> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.erp.Item>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItemsBySSCC", targetNamespace = "http://service/", className = "webservice.erp.GetItemsBySSCC")
    @ResponseWrapper(localName = "getItemsBySSCCResponse", targetNamespace = "http://service/", className = "webservice.erp.GetItemsBySSCCResponse")
    @Action(input = "http://service/SupplyChainService/getItemsBySSCCRequest", output = "http://service/SupplyChainService/getItemsBySSCCResponse")
    public List<Item> getItemsBySSCC(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns webservice.erp.Production
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "processOrder", targetNamespace = "http://service/", className = "webservice.erp.ProcessOrder")
    @ResponseWrapper(localName = "processOrderResponse", targetNamespace = "http://service/", className = "webservice.erp.ProcessOrderResponse")
    @Action(input = "http://service/SupplyChainService/processOrderRequest", output = "http://service/SupplyChainService/processOrderResponse")
    public Production processOrder(
        @WebParam(name = "arg0", targetNamespace = "")
        Order arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.erp.Quantity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuantities", targetNamespace = "http://service/", className = "webservice.erp.GetQuantities")
    @ResponseWrapper(localName = "getQuantitiesResponse", targetNamespace = "http://service/", className = "webservice.erp.GetQuantitiesResponse")
    @Action(input = "http://service/SupplyChainService/getQuantitiesRequest", output = "http://service/SupplyChainService/getQuantitiesResponse")
    public List<Quantity> getQuantities(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.erp.Order>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOpenOrdersByGLN", targetNamespace = "http://service/", className = "webservice.erp.GetOpenOrdersByGLN")
    @ResponseWrapper(localName = "getOpenOrdersByGLNResponse", targetNamespace = "http://service/", className = "webservice.erp.GetOpenOrdersByGLNResponse")
    @Action(input = "http://service/SupplyChainService/getOpenOrdersByGLNRequest", output = "http://service/SupplyChainService/getOpenOrdersByGLNResponse")
    public List<Order> getOpenOrdersByGLN(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns webservice.erp.Item
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItemByIdentifier", targetNamespace = "http://service/", className = "webservice.erp.GetItemByIdentifier")
    @ResponseWrapper(localName = "getItemByIdentifierResponse", targetNamespace = "http://service/", className = "webservice.erp.GetItemByIdentifierResponse")
    @Action(input = "http://service/SupplyChainService/getItemByIdentifierRequest", output = "http://service/SupplyChainService/getItemByIdentifierResponse")
    public Item getItemByIdentifier(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<webservice.erp.Item>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItemsByBatch", targetNamespace = "http://service/", className = "webservice.erp.GetItemsByBatch")
    @ResponseWrapper(localName = "getItemsByBatchResponse", targetNamespace = "http://service/", className = "webservice.erp.GetItemsByBatchResponse")
    @Action(input = "http://service/SupplyChainService/getItemsByBatchRequest", output = "http://service/SupplyChainService/getItemsByBatchResponse")
    public List<Item> getItemsByBatch(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrderForSSCC", targetNamespace = "http://service/", className = "webservice.erp.GetOrderForSSCC")
    @ResponseWrapper(localName = "getOrderForSSCCResponse", targetNamespace = "http://service/", className = "webservice.erp.GetOrderForSSCCResponse")
    @Action(input = "http://service/SupplyChainService/getOrderForSSCCRequest", output = "http://service/SupplyChainService/getOrderForSSCCResponse")
    public String getOrderForSSCC(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "resetTrackedItems", targetNamespace = "http://service/", className = "webservice.erp.ResetTrackedItems")
    @ResponseWrapper(localName = "resetTrackedItemsResponse", targetNamespace = "http://service/", className = "webservice.erp.ResetTrackedItemsResponse")
    @Action(input = "http://service/SupplyChainService/resetTrackedItemsRequest", output = "http://service/SupplyChainService/resetTrackedItemsResponse")
    public void resetTrackedItems();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductForSecondaryPackage", targetNamespace = "http://service/", className = "webservice.erp.GetProductForSecondaryPackage")
    @ResponseWrapper(localName = "getProductForSecondaryPackageResponse", targetNamespace = "http://service/", className = "webservice.erp.GetProductForSecondaryPackageResponse")
    @Action(input = "http://service/SupplyChainService/getProductForSecondaryPackageRequest", output = "http://service/SupplyChainService/getProductForSecondaryPackageResponse")
    public String getProductForSecondaryPackage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.erp.Station>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStations", targetNamespace = "http://service/", className = "webservice.erp.GetStations")
    @ResponseWrapper(localName = "getStationsResponse", targetNamespace = "http://service/", className = "webservice.erp.GetStationsResponse")
    @Action(input = "http://service/SupplyChainService/getStationsRequest", output = "http://service/SupplyChainService/getStationsResponse")
    public List<Station> getStations();

    /**
     * 
     * @return
     *     returns java.util.List<webservice.erp.Patient>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPatients", targetNamespace = "http://service/", className = "webservice.erp.GetPatients")
    @ResponseWrapper(localName = "getPatientsResponse", targetNamespace = "http://service/", className = "webservice.erp.GetPatientsResponse")
    @Action(input = "http://service/SupplyChainService/getPatientsRequest", output = "http://service/SupplyChainService/getPatientsResponse")
    public List<Patient> getPatients();

    /**
     * 
     * @param arg0
     * @return
     *     returns webservice.erp.Patient
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPatientByUUID", targetNamespace = "http://service/", className = "webservice.erp.GetPatientByUUID")
    @ResponseWrapper(localName = "getPatientByUUIDResponse", targetNamespace = "http://service/", className = "webservice.erp.GetPatientByUUIDResponse")
    @Action(input = "http://service/SupplyChainService/getPatientByUUIDRequest", output = "http://service/SupplyChainService/getPatientByUUIDResponse")
    public Patient getPatientByUUID(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.erp.Prescription>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPrescriptionsForPatient", targetNamespace = "http://service/", className = "webservice.erp.GetPrescriptionsForPatient")
    @ResponseWrapper(localName = "getPrescriptionsForPatientResponse", targetNamespace = "http://service/", className = "webservice.erp.GetPrescriptionsForPatientResponse")
    @Action(input = "http://service/SupplyChainService/getPrescriptionsForPatientRequest", output = "http://service/SupplyChainService/getPrescriptionsForPatientResponse")
    public List<Prescription> getPrescriptionsForPatient(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.erp.Prescription>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPrescriptionsWithPreparedMedicationsForPatient", targetNamespace = "http://service/", className = "webservice.erp.GetPrescriptionsWithPreparedMedicationsForPatient")
    @ResponseWrapper(localName = "getPrescriptionsWithPreparedMedicationsForPatientResponse", targetNamespace = "http://service/", className = "webservice.erp.GetPrescriptionsWithPreparedMedicationsForPatientResponse")
    @Action(input = "http://service/SupplyChainService/getPrescriptionsWithPreparedMedicationsForPatientRequest", output = "http://service/SupplyChainService/getPrescriptionsWithPreparedMedicationsForPatientResponse")
    public List<Prescription> getPrescriptionsWithPreparedMedicationsForPatient(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "savePreparedMedications", targetNamespace = "http://service/", className = "webservice.erp.SavePreparedMedications")
    @ResponseWrapper(localName = "savePreparedMedicationsResponse", targetNamespace = "http://service/", className = "webservice.erp.SavePreparedMedicationsResponse")
    @Action(input = "http://service/SupplyChainService/savePreparedMedicationsRequest", output = "http://service/SupplyChainService/savePreparedMedicationsResponse")
    public boolean savePreparedMedications(
        @WebParam(name = "arg0", targetNamespace = "")
        List<PreparedMedication> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.erp.PreparedMedication>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPreparedMedicationsForPatient", targetNamespace = "http://service/", className = "webservice.erp.GetPreparedMedicationsForPatient")
    @ResponseWrapper(localName = "getPreparedMedicationsForPatientResponse", targetNamespace = "http://service/", className = "webservice.erp.GetPreparedMedicationsForPatientResponse")
    @Action(input = "http://service/SupplyChainService/getPreparedMedicationsForPatientRequest", output = "http://service/SupplyChainService/getPreparedMedicationsForPatientResponse")
    public List<PreparedMedication> getPreparedMedicationsForPatient(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
