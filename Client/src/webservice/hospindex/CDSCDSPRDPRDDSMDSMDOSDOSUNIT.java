/**
 * CDSCDSPRDPRDDSMDSMDOSDOSUNIT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSCDSPRDPRDDSMDSMDOSDOSUNIT  implements java.io.Serializable {
    private int UNITLNO;

    private double MAXDQ;

    private java.lang.String MAXDU;

    public CDSCDSPRDPRDDSMDSMDOSDOSUNIT() {
    }

    public CDSCDSPRDPRDDSMDSMDOSDOSUNIT(
           int UNITLNO,
           double MAXDQ,
           java.lang.String MAXDU) {
           this.UNITLNO = UNITLNO;
           this.MAXDQ = MAXDQ;
           this.MAXDU = MAXDU;
    }


    /**
     * Gets the UNITLNO value for this CDSCDSPRDPRDDSMDSMDOSDOSUNIT.
     * 
     * @return UNITLNO
     */
    public int getUNITLNO() {
        return UNITLNO;
    }


    /**
     * Sets the UNITLNO value for this CDSCDSPRDPRDDSMDSMDOSDOSUNIT.
     * 
     * @param UNITLNO
     */
    public void setUNITLNO(int UNITLNO) {
        this.UNITLNO = UNITLNO;
    }


    /**
     * Gets the MAXDQ value for this CDSCDSPRDPRDDSMDSMDOSDOSUNIT.
     * 
     * @return MAXDQ
     */
    public double getMAXDQ() {
        return MAXDQ;
    }


    /**
     * Sets the MAXDQ value for this CDSCDSPRDPRDDSMDSMDOSDOSUNIT.
     * 
     * @param MAXDQ
     */
    public void setMAXDQ(double MAXDQ) {
        this.MAXDQ = MAXDQ;
    }


    /**
     * Gets the MAXDU value for this CDSCDSPRDPRDDSMDSMDOSDOSUNIT.
     * 
     * @return MAXDU
     */
    public java.lang.String getMAXDU() {
        return MAXDU;
    }


    /**
     * Sets the MAXDU value for this CDSCDSPRDPRDDSMDSMDOSDOSUNIT.
     * 
     * @param MAXDU
     */
    public void setMAXDU(java.lang.String MAXDU) {
        this.MAXDU = MAXDU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSCDSPRDPRDDSMDSMDOSDOSUNIT)) return false;
        CDSCDSPRDPRDDSMDSMDOSDOSUNIT other = (CDSCDSPRDPRDDSMDSMDOSDOSUNIT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.UNITLNO == other.getUNITLNO() &&
            this.MAXDQ == other.getMAXDQ() &&
            ((this.MAXDU==null && other.getMAXDU()==null) || 
             (this.MAXDU!=null &&
              this.MAXDU.equals(other.getMAXDU())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getUNITLNO();
        _hashCode += new Double(getMAXDQ()).hashCode();
        if (getMAXDU() != null) {
            _hashCode += getMAXDU().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDSCDSPRDPRDDSMDSMDOSDOSUNIT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>CDS>CDSPRD>PRDDSM>DSMDOS>DOSUNIT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNITLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "UNITLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAXDQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MAXDQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAXDU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MAXDU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
