/**
 * MyCheckInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class MyCheckInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[] fileList;

    private java.lang.String registNo;

    public MyCheckInfo() {
    }

    public MyCheckInfo(
           cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[] fileList,
           java.lang.String registNo) {
           this.fileList = fileList;
           this.registNo = registNo;
    }


    /**
     * Gets the fileList value for this MyCheckInfo.
     * 
     * @return fileList
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[] getFileList() {
        return fileList;
    }


    /**
     * Sets the fileList value for this MyCheckInfo.
     * 
     * @param fileList
     */
    public void setFileList(cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[] fileList) {
        this.fileList = fileList;
    }


    /**
     * Gets the registNo value for this MyCheckInfo.
     * 
     * @return registNo
     */
    public java.lang.String getRegistNo() {
        return registNo;
    }


    /**
     * Sets the registNo value for this MyCheckInfo.
     * 
     * @param registNo
     */
    public void setRegistNo(java.lang.String registNo) {
        this.registNo = registNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyCheckInfo)) return false;
        MyCheckInfo other = (MyCheckInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileList==null && other.getFileList()==null) || 
             (this.fileList!=null &&
              java.util.Arrays.equals(this.fileList, other.getFileList()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo())));
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
        if (getFileList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegistNo() != null) {
            _hashCode += getRegistNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyCheckInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyCheckInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "fileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "registNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
