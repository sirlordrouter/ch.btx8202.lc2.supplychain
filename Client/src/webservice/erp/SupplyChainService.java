
package webservice.erp;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
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
     * @throws NoSuchGLNFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCheckedInItems", targetNamespace = "http://service/", className = "webservice.erp.GetCheckedInItems")
    @ResponseWrapper(localName = "getCheckedInItemsResponse", targetNamespace = "http://service/", className = "webservice.erp.GetCheckedInItemsResponse")
    @Action(input = "http://service/SupplyChainService/getCheckedInItemsRequest", output = "http://service/SupplyChainService/getCheckedInItemsResponse", fault = {
        @FaultAction(className = NoSuchGLNFoundException_Exception.class, value = "http://service/SupplyChainService/getCheckedInItems/Fault/NoSuchGLNFoundException")
    })
    public WebServiceResult getCheckedInItems(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws NoSuchGLNFoundException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "checkinItems", targetNamespace = "http://service/", className = "webservice.erp.CheckinItems")
    @ResponseWrapper(localName = "checkinItemsResponse", targetNamespace = "http://service/", className = "webservice.erp.CheckinItemsResponse")
    @Action(input = "http://service/SupplyChainService/checkinItemsRequest", output = "http://service/SupplyChainService/checkinItemsResponse")
    public void checkinItems(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Item> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "checkoutItems", targetNamespace = "http://service/", className = "webservice.erp.CheckoutItems")
    @ResponseWrapper(localName = "checkoutItemsResponse", targetNamespace = "http://service/", className = "webservice.erp.CheckoutItemsResponse")
    @Action(input = "http://service/SupplyChainService/checkoutItemsRequest", output = "http://service/SupplyChainService/checkoutItemsResponse")
    public void checkoutItems(
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

}
