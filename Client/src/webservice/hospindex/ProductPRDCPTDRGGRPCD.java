/**
 * ProductPRDCPTDRGGRPCD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ProductPRDCPTDRGGRPCD implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductPRDCPTDRGGRPCD(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AN = "AN";
    public static final java.lang.String _CL = "CL";
    public static final java.lang.String _HM = "HM";
    public static final java.lang.String _MD = "MD";
    public static final java.lang.String _PT = "PT";
    public static final java.lang.String _TE = "TE";
    public static final java.lang.String _VE = "VE";
    public static final java.lang.String _LM = "LM";
    public static final ProductPRDCPTDRGGRPCD AN = new ProductPRDCPTDRGGRPCD(_AN);
    public static final ProductPRDCPTDRGGRPCD CL = new ProductPRDCPTDRGGRPCD(_CL);
    public static final ProductPRDCPTDRGGRPCD HM = new ProductPRDCPTDRGGRPCD(_HM);
    public static final ProductPRDCPTDRGGRPCD MD = new ProductPRDCPTDRGGRPCD(_MD);
    public static final ProductPRDCPTDRGGRPCD PT = new ProductPRDCPTDRGGRPCD(_PT);
    public static final ProductPRDCPTDRGGRPCD TE = new ProductPRDCPTDRGGRPCD(_TE);
    public static final ProductPRDCPTDRGGRPCD VE = new ProductPRDCPTDRGGRPCD(_VE);
    public static final ProductPRDCPTDRGGRPCD LM = new ProductPRDCPTDRGGRPCD(_LM);
    public java.lang.String getValue() { return _value_;}
    public static ProductPRDCPTDRGGRPCD fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProductPRDCPTDRGGRPCD enumeration = (ProductPRDCPTDRGGRPCD)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductPRDCPTDRGGRPCD fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPRDCPTDRGGRPCD.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>DRGGRPCD"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
