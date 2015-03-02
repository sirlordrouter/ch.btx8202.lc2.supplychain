/**
 * ArticleARTARTCHCHTYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTCHCHTYPE implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ArticleARTARTCHCHTYPE(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REP = "REP";
    public static final java.lang.String _PAR = "PAR";
    public static final java.lang.String _ORD = "ORD";
    public static final java.lang.String _PRI = "PRI";
    public static final java.lang.String _PIM = "PIM";
    public static final java.lang.String _ORG = "ORG";
    public static final java.lang.String _MPR = "MPR";
    public static final java.lang.String _COM = "COM";
    public static final java.lang.String _GRF = "GRF";
    public static final java.lang.String _REF = "REF";
    public static final java.lang.String _SDO = "SDO";
    public static final ArticleARTARTCHCHTYPE REP = new ArticleARTARTCHCHTYPE(_REP);
    public static final ArticleARTARTCHCHTYPE PAR = new ArticleARTARTCHCHTYPE(_PAR);
    public static final ArticleARTARTCHCHTYPE ORD = new ArticleARTARTCHCHTYPE(_ORD);
    public static final ArticleARTARTCHCHTYPE PRI = new ArticleARTARTCHCHTYPE(_PRI);
    public static final ArticleARTARTCHCHTYPE PIM = new ArticleARTARTCHCHTYPE(_PIM);
    public static final ArticleARTARTCHCHTYPE ORG = new ArticleARTARTCHCHTYPE(_ORG);
    public static final ArticleARTARTCHCHTYPE MPR = new ArticleARTARTCHCHTYPE(_MPR);
    public static final ArticleARTARTCHCHTYPE COM = new ArticleARTARTCHCHTYPE(_COM);
    public static final ArticleARTARTCHCHTYPE GRF = new ArticleARTARTCHCHTYPE(_GRF);
    public static final ArticleARTARTCHCHTYPE REF = new ArticleARTARTCHCHTYPE(_REF);
    public static final ArticleARTARTCHCHTYPE SDO = new ArticleARTARTCHCHTYPE(_SDO);
    public java.lang.String getValue() { return _value_;}
    public static ArticleARTARTCHCHTYPE fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ArticleARTARTCHCHTYPE enumeration = (ArticleARTARTCHCHTYPE)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ArticleARTARTCHCHTYPE fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ArticleARTARTCHCHTYPE.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Article>ART>ARTCH>CHTYPE"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
