/**
 * Ws_Pharma_V101Soap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SwissIndex;

public interface Ws_Pharma_V101Soap_PortType extends java.rmi.Remote {

    /**
     * <p></p><p><b>Schema Output:</b> Click <a href='../schema/SwissindexPharma_out_V101.xsd'>here</a>
     */
    public SwissIndex.PHARMA downloadAll(java.lang.String lang) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Output:</b> Click <a href='../schema/SwissindexPharma_out_V101.xsd'>here</a>
     */
    public SwissIndex.PHARMA downloadByDate(java.util.Calendar mutationDate, java.lang.String lang) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Output:</b> Click <a href='../schema/SwissindexPharma_out_V101.xsd'>here</a>
     */
    public SwissIndex.PHARMA getByGTIN(java.lang.String GTIN, java.lang.String lang) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Output:</b> Click <a href='../schema/SwissindexPharma_out_V101.xsd'>here</a>
     */
    public SwissIndex.PHARMA getByPharmacode(java.lang.String pharmacode, java.lang.String lang) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Output:</b> Click <a href='../schema/SwissindexPharma_out_V101.xsd'>here</a>
     */
    public SwissIndex.PHARMA getByDescr(java.lang.String descr, java.lang.String lang) throws java.rmi.RemoteException;
}
