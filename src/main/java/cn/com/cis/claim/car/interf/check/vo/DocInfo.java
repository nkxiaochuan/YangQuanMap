/**
 * DocInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class DocInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList;

    private java.lang.String registNo;

    private java.lang.String userCode;

    public DocInfo() {
    }

    public DocInfo(
           cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList,
           java.lang.String registNo,
           java.lang.String userCode) {
           this.fileInfoList = fileInfoList;
           this.registNo = registNo;
           this.userCode = userCode;
    }


    /**
     * Gets the fileInfoList value for this DocInfo.
     * 
     * @return fileInfoList
     */
    public cn.com.cis.claim.car.interf.check.vo.FileInfo[] getFileInfoList() {
        return fileInfoList;
    }


    /**
     * Sets the fileInfoList value for this DocInfo.
     * 
     * @param fileInfoList
     */
    public void setFileInfoList(cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList) {
        this.fileInfoList = fileInfoList;
    }


    /**
     * Gets the registNo value for this DocInfo.
     * 
     * @return registNo
     */
    public java.lang.String getRegistNo() {
        return registNo;
    }


    /**
     * Sets the registNo value for this DocInfo.
     * 
     * @param registNo
     */
    public void setRegistNo(java.lang.String registNo) {
        this.registNo = registNo;
    }


    /**
     * Gets the userCode value for this DocInfo.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this DocInfo.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocInfo)) return false;
        DocInfo other = (DocInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileInfoList==null && other.getFileInfoList()==null) || 
             (this.fileInfoList!=null &&
              java.util.Arrays.equals(this.fileInfoList, other.getFileInfoList()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo()))) &&
            ((this.userCode==null && other.getUserCode()==null) || 
             (this.userCode!=null &&
              this.userCode.equals(other.getUserCode())));
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
        if (getFileInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegistNo() != null) {
            _hashCode += getRegistNo().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DocInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "fileInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "registNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "userCode"));
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
