
package webservice.erp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.erp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetItemByIdentifierResponse_QNAME = new QName("http://service/", "getItemByIdentifierResponse");
    private final static QName _ResetTrackedItemsResponse_QNAME = new QName("http://service/", "resetTrackedItemsResponse");
    private final static QName _GetItemsBySSCC_QNAME = new QName("http://service/", "getItemsBySSCC");
    private final static QName _ResetTrackedItems_QNAME = new QName("http://service/", "resetTrackedItems");
    private final static QName _GetCheckedInItemsResponse_QNAME = new QName("http://service/", "getCheckedInItemsResponse");
    private final static QName _GetItemsByBatch_QNAME = new QName("http://service/", "getItemsByBatch");
    private final static QName _GetOrderForSSCC_QNAME = new QName("http://service/", "getOrderForSSCC");
    private final static QName _CheckoutItemsResponse_QNAME = new QName("http://service/", "checkoutItemsResponse");
    private final static QName _CheckoutItems_QNAME = new QName("http://service/", "checkoutItems");
    private final static QName _InsertTrackingItemsResponse_QNAME = new QName("http://service/", "insertTrackingItemsResponse");
    private final static QName _CheckinItemsResponse_QNAME = new QName("http://service/", "checkinItemsResponse");
    private final static QName _SayHelloWorldFrom_QNAME = new QName("http://service/", "sayHelloWorldFrom");
    private final static QName _GetItemByIdentifier_QNAME = new QName("http://service/", "getItemByIdentifier");
    private final static QName _SayHelloWorldFromResponse_QNAME = new QName("http://service/", "sayHelloWorldFromResponse");
    private final static QName _GetItemsBySSCCResponse_QNAME = new QName("http://service/", "getItemsBySSCCResponse");
    private final static QName _GetCheckedInItems_QNAME = new QName("http://service/", "getCheckedInItems");
    private final static QName _GetItemsByBatchResponse_QNAME = new QName("http://service/", "getItemsByBatchResponse");
    private final static QName _SetOrderResponse_QNAME = new QName("http://service/", "setOrderResponse");
    private final static QName _GetOrderForSSCCResponse_QNAME = new QName("http://service/", "getOrderForSSCCResponse");
    private final static QName _SetOrder_QNAME = new QName("http://service/", "setOrder");
    private final static QName _CheckinItems_QNAME = new QName("http://service/", "checkinItems");
    private final static QName _InsertTrackingItems_QNAME = new QName("http://service/", "insertTrackingItems");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.erp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckoutItems }
     * 
     */
    public CheckoutItems createCheckoutItems() {
        return new CheckoutItems();
    }

    /**
     * Create an instance of {@link CheckoutItemsResponse }
     * 
     */
    public CheckoutItemsResponse createCheckoutItemsResponse() {
        return new CheckoutItemsResponse();
    }

    /**
     * Create an instance of {@link GetCheckedInItemsResponse }
     * 
     */
    public GetCheckedInItemsResponse createGetCheckedInItemsResponse() {
        return new GetCheckedInItemsResponse();
    }

    /**
     * Create an instance of {@link GetItemsByBatch }
     * 
     */
    public GetItemsByBatch createGetItemsByBatch() {
        return new GetItemsByBatch();
    }

    /**
     * Create an instance of {@link GetOrderForSSCC }
     * 
     */
    public GetOrderForSSCC createGetOrderForSSCC() {
        return new GetOrderForSSCC();
    }

    /**
     * Create an instance of {@link ResetTrackedItems }
     * 
     */
    public ResetTrackedItems createResetTrackedItems() {
        return new ResetTrackedItems();
    }

    /**
     * Create an instance of {@link GetItemsBySSCC }
     * 
     */
    public GetItemsBySSCC createGetItemsBySSCC() {
        return new GetItemsBySSCC();
    }

    /**
     * Create an instance of {@link GetItemByIdentifierResponse }
     * 
     */
    public GetItemByIdentifierResponse createGetItemByIdentifierResponse() {
        return new GetItemByIdentifierResponse();
    }

    /**
     * Create an instance of {@link ResetTrackedItemsResponse }
     * 
     */
    public ResetTrackedItemsResponse createResetTrackedItemsResponse() {
        return new ResetTrackedItemsResponse();
    }

    /**
     * Create an instance of {@link GetItemsBySSCCResponse }
     * 
     */
    public GetItemsBySSCCResponse createGetItemsBySSCCResponse() {
        return new GetItemsBySSCCResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFromResponse }
     * 
     */
    public SayHelloWorldFromResponse createSayHelloWorldFromResponse() {
        return new SayHelloWorldFromResponse();
    }

    /**
     * Create an instance of {@link GetItemByIdentifier }
     * 
     */
    public GetItemByIdentifier createGetItemByIdentifier() {
        return new GetItemByIdentifier();
    }

    /**
     * Create an instance of {@link SayHelloWorldFrom }
     * 
     */
    public SayHelloWorldFrom createSayHelloWorldFrom() {
        return new SayHelloWorldFrom();
    }

    /**
     * Create an instance of {@link CheckinItemsResponse }
     * 
     */
    public CheckinItemsResponse createCheckinItemsResponse() {
        return new CheckinItemsResponse();
    }

    /**
     * Create an instance of {@link InsertTrackingItemsResponse }
     * 
     */
    public InsertTrackingItemsResponse createInsertTrackingItemsResponse() {
        return new InsertTrackingItemsResponse();
    }

    /**
     * Create an instance of {@link SetOrder }
     * 
     */
    public SetOrder createSetOrder() {
        return new SetOrder();
    }

    /**
     * Create an instance of {@link GetOrderForSSCCResponse }
     * 
     */
    public GetOrderForSSCCResponse createGetOrderForSSCCResponse() {
        return new GetOrderForSSCCResponse();
    }

    /**
     * Create an instance of {@link GetItemsByBatchResponse }
     * 
     */
    public GetItemsByBatchResponse createGetItemsByBatchResponse() {
        return new GetItemsByBatchResponse();
    }

    /**
     * Create an instance of {@link SetOrderResponse }
     * 
     */
    public SetOrderResponse createSetOrderResponse() {
        return new SetOrderResponse();
    }

    /**
     * Create an instance of {@link GetCheckedInItems }
     * 
     */
    public GetCheckedInItems createGetCheckedInItems() {
        return new GetCheckedInItems();
    }

    /**
     * Create an instance of {@link InsertTrackingItems }
     * 
     */
    public InsertTrackingItems createInsertTrackingItems() {
        return new InsertTrackingItems();
    }

    /**
     * Create an instance of {@link CheckinItems }
     * 
     */
    public CheckinItems createCheckinItems() {
        return new CheckinItems();
    }

    /**
     * Create an instance of {@link WebServiceResult }
     * 
     */
    public WebServiceResult createWebServiceResult() {
        return new WebServiceResult();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdentifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemByIdentifierResponse")
    public JAXBElement<GetItemByIdentifierResponse> createGetItemByIdentifierResponse(GetItemByIdentifierResponse value) {
        return new JAXBElement<GetItemByIdentifierResponse>(_GetItemByIdentifierResponse_QNAME, GetItemByIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetTrackedItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "resetTrackedItemsResponse")
    public JAXBElement<ResetTrackedItemsResponse> createResetTrackedItemsResponse(ResetTrackedItemsResponse value) {
        return new JAXBElement<ResetTrackedItemsResponse>(_ResetTrackedItemsResponse_QNAME, ResetTrackedItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsBySSCC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsBySSCC")
    public JAXBElement<GetItemsBySSCC> createGetItemsBySSCC(GetItemsBySSCC value) {
        return new JAXBElement<GetItemsBySSCC>(_GetItemsBySSCC_QNAME, GetItemsBySSCC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetTrackedItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "resetTrackedItems")
    public JAXBElement<ResetTrackedItems> createResetTrackedItems(ResetTrackedItems value) {
        return new JAXBElement<ResetTrackedItems>(_ResetTrackedItems_QNAME, ResetTrackedItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckedInItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCheckedInItemsResponse")
    public JAXBElement<GetCheckedInItemsResponse> createGetCheckedInItemsResponse(GetCheckedInItemsResponse value) {
        return new JAXBElement<GetCheckedInItemsResponse>(_GetCheckedInItemsResponse_QNAME, GetCheckedInItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsByBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsByBatch")
    public JAXBElement<GetItemsByBatch> createGetItemsByBatch(GetItemsByBatch value) {
        return new JAXBElement<GetItemsByBatch>(_GetItemsByBatch_QNAME, GetItemsByBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderForSSCC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getOrderForSSCC")
    public JAXBElement<GetOrderForSSCC> createGetOrderForSSCC(GetOrderForSSCC value) {
        return new JAXBElement<GetOrderForSSCC>(_GetOrderForSSCC_QNAME, GetOrderForSSCC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkoutItemsResponse")
    public JAXBElement<CheckoutItemsResponse> createCheckoutItemsResponse(CheckoutItemsResponse value) {
        return new JAXBElement<CheckoutItemsResponse>(_CheckoutItemsResponse_QNAME, CheckoutItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkoutItems")
    public JAXBElement<CheckoutItems> createCheckoutItems(CheckoutItems value) {
        return new JAXBElement<CheckoutItems>(_CheckoutItems_QNAME, CheckoutItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTrackingItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "insertTrackingItemsResponse")
    public JAXBElement<InsertTrackingItemsResponse> createInsertTrackingItemsResponse(InsertTrackingItemsResponse value) {
        return new JAXBElement<InsertTrackingItemsResponse>(_InsertTrackingItemsResponse_QNAME, InsertTrackingItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkinItemsResponse")
    public JAXBElement<CheckinItemsResponse> createCheckinItemsResponse(CheckinItemsResponse value) {
        return new JAXBElement<CheckinItemsResponse>(_CheckinItemsResponse_QNAME, CheckinItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sayHelloWorldFrom")
    public JAXBElement<SayHelloWorldFrom> createSayHelloWorldFrom(SayHelloWorldFrom value) {
        return new JAXBElement<SayHelloWorldFrom>(_SayHelloWorldFrom_QNAME, SayHelloWorldFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemByIdentifier")
    public JAXBElement<GetItemByIdentifier> createGetItemByIdentifier(GetItemByIdentifier value) {
        return new JAXBElement<GetItemByIdentifier>(_GetItemByIdentifier_QNAME, GetItemByIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sayHelloWorldFromResponse")
    public JAXBElement<SayHelloWorldFromResponse> createSayHelloWorldFromResponse(SayHelloWorldFromResponse value) {
        return new JAXBElement<SayHelloWorldFromResponse>(_SayHelloWorldFromResponse_QNAME, SayHelloWorldFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsBySSCCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsBySSCCResponse")
    public JAXBElement<GetItemsBySSCCResponse> createGetItemsBySSCCResponse(GetItemsBySSCCResponse value) {
        return new JAXBElement<GetItemsBySSCCResponse>(_GetItemsBySSCCResponse_QNAME, GetItemsBySSCCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckedInItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCheckedInItems")
    public JAXBElement<GetCheckedInItems> createGetCheckedInItems(GetCheckedInItems value) {
        return new JAXBElement<GetCheckedInItems>(_GetCheckedInItems_QNAME, GetCheckedInItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsByBatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsByBatchResponse")
    public JAXBElement<GetItemsByBatchResponse> createGetItemsByBatchResponse(GetItemsByBatchResponse value) {
        return new JAXBElement<GetItemsByBatchResponse>(_GetItemsByBatchResponse_QNAME, GetItemsByBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "setOrderResponse")
    public JAXBElement<SetOrderResponse> createSetOrderResponse(SetOrderResponse value) {
        return new JAXBElement<SetOrderResponse>(_SetOrderResponse_QNAME, SetOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderForSSCCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getOrderForSSCCResponse")
    public JAXBElement<GetOrderForSSCCResponse> createGetOrderForSSCCResponse(GetOrderForSSCCResponse value) {
        return new JAXBElement<GetOrderForSSCCResponse>(_GetOrderForSSCCResponse_QNAME, GetOrderForSSCCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "setOrder")
    public JAXBElement<SetOrder> createSetOrder(SetOrder value) {
        return new JAXBElement<SetOrder>(_SetOrder_QNAME, SetOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkinItems")
    public JAXBElement<CheckinItems> createCheckinItems(CheckinItems value) {
        return new JAXBElement<CheckinItems>(_CheckinItems_QNAME, CheckinItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTrackingItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "insertTrackingItems")
    public JAXBElement<InsertTrackingItems> createInsertTrackingItems(InsertTrackingItems value) {
        return new JAXBElement<InsertTrackingItems>(_InsertTrackingItems_QNAME, InsertTrackingItems.class, null, value);
    }

}
