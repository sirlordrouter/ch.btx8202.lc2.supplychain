
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

    private final static QName _GetItemsByBatchResponse_QNAME = new QName("http://service/", "getItemsByBatchResponse");
    private final static QName _SayHelloWorldFrom_QNAME = new QName("http://service/", "sayHelloWorldFrom");
    private final static QName _SayHelloWorldFromResponse_QNAME = new QName("http://service/", "sayHelloWorldFromResponse");
    private final static QName _GetItemsBySSCCResponse_QNAME = new QName("http://service/", "getItemsBySSCCResponse");
    private final static QName _GetItemByIdentifier_QNAME = new QName("http://service/", "getItemByIdentifier");
    private final static QName _CheckinItemsResponse_QNAME = new QName("http://service/", "checkinItemsResponse");
    private final static QName _GetItemsByBatch_QNAME = new QName("http://service/", "getItemsByBatch");
    private final static QName _GetItemsBySSCC_QNAME = new QName("http://service/", "getItemsBySSCC");
    private final static QName _CheckinItems_QNAME = new QName("http://service/", "checkinItems");
    private final static QName _GetItemByIdentifierResponse_QNAME = new QName("http://service/", "getItemByIdentifierResponse");
    private final static QName _CheckoutItemsResponse_QNAME = new QName("http://service/", "checkoutItemsResponse");
    private final static QName _CheckoutItems_QNAME = new QName("http://service/", "checkoutItems");

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
     * Create an instance of {@link GetItemByIdentifierResponse }
     * 
     */
    public GetItemByIdentifierResponse createGetItemByIdentifierResponse() {
        return new GetItemByIdentifierResponse();
    }

    /**
     * Create an instance of {@link CheckinItems }
     * 
     */
    public CheckinItems createCheckinItems() {
        return new CheckinItems();
    }

    /**
     * Create an instance of {@link GetItemsBySSCC }
     * 
     */
    public GetItemsBySSCC createGetItemsBySSCC() {
        return new GetItemsBySSCC();
    }

    /**
     * Create an instance of {@link GetItemsByBatch }
     * 
     */
    public GetItemsByBatch createGetItemsByBatch() {
        return new GetItemsByBatch();
    }

    /**
     * Create an instance of {@link CheckinItemsResponse }
     * 
     */
    public CheckinItemsResponse createCheckinItemsResponse() {
        return new CheckinItemsResponse();
    }

    /**
     * Create an instance of {@link GetItemByIdentifier }
     * 
     */
    public GetItemByIdentifier createGetItemByIdentifier() {
        return new GetItemByIdentifier();
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
     * Create an instance of {@link SayHelloWorldFrom }
     * 
     */
    public SayHelloWorldFrom createSayHelloWorldFrom() {
        return new SayHelloWorldFrom();
    }

    /**
     * Create an instance of {@link GetItemsByBatchResponse }
     * 
     */
    public GetItemsByBatchResponse createGetItemsByBatchResponse() {
        return new GetItemsByBatchResponse();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sayHelloWorldFrom")
    public JAXBElement<SayHelloWorldFrom> createSayHelloWorldFrom(SayHelloWorldFrom value) {
        return new JAXBElement<SayHelloWorldFrom>(_SayHelloWorldFrom_QNAME, SayHelloWorldFrom.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemByIdentifier")
    public JAXBElement<GetItemByIdentifier> createGetItemByIdentifier(GetItemByIdentifier value) {
        return new JAXBElement<GetItemByIdentifier>(_GetItemByIdentifier_QNAME, GetItemByIdentifier.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsByBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsByBatch")
    public JAXBElement<GetItemsByBatch> createGetItemsByBatch(GetItemsByBatch value) {
        return new JAXBElement<GetItemsByBatch>(_GetItemsByBatch_QNAME, GetItemsByBatch.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkinItems")
    public JAXBElement<CheckinItems> createCheckinItems(CheckinItems value) {
        return new JAXBElement<CheckinItems>(_CheckinItems_QNAME, CheckinItems.class, null, value);
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

}
