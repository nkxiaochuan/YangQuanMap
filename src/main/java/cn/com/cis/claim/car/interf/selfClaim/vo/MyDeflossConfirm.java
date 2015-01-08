/**
 * MyDeflossConfirm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class MyDeflossConfirm  implements java.io.Serializable {
    private java.lang.String agree;

    private cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[] fileList;

    private java.lang.String phoneNumber;

    private java.lang.String registNo;

    private java.lang.Long taskId;

    private java.lang.String type;

    public MyDeflossConfirm() {
    }

    public MyDeflossConfirm(
           java.lang.String agree,
           cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[] fileList,
           java.lang.String phoneNumber,
           java.lang.String registNo,
           java.lang.Long taskId,
           java.lang.String type) {
           this.agree = agree;
           this.fileList = fileList;
           this.phoneNumber = phoneNumber;
           this.registNo = registNo;
           this.taskId = taskId;
           this.type = type;
    }


    /**
     * Gets the agree value for this MyDeflossConfirm.
     * 
     * @return agree
     */
    public java.lang.String getAgree() {
        return agree;
    }


    /**
     * Sets the agree value for this MyDeflossConfirm.
     * 
     * @param agree
     */
    public void setAgree(java.lang.String agree) {
        this.agree = agree;
    }


    /**
     * Gets the fileList value for this MyDeflossConfirm.
     * 
     * @return fileList
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[] getFileList() {
        return fileList;
    }


    /**
     * Sets the fileList value for this MyDeflossConfirm.
     * 
     * @param fileList
     */
    public void setFileList(cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[] fileList) {
        this.fileList = fileList;
    }


    /**
     * Gets the phoneNumber value for this MyDeflossConfirm.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this MyDeflossConfirm.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the registNo value for this MyDeflossConfirm.
     * 
     * @return registNo
     */
    public java.lang.String getRegistNo() {
        return registNo;
    }


    /**
     * Sets the registNo value for this MyDeflossConfirm.
     * 
     * @param registNo
     */
    public void setRegistNo(java.lang.String registNo) {
        this.registNo = registNo;
    }


    /**
     * Gets the taskId value for this MyDeflossConfirm.
     * 
     * @return taskId
     */
    public java.lang.Long getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this MyDeflossConfirm.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.Long taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the type value for this MyDeflossConfirm.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this MyDeflossConfirm.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyDeflossConfirm)) return false;
        MyDeflossConfirm other = (MyDeflossConfirm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agree==null && other.getAgree()==null) || 
             (this.agree!=null &&
              this.agree.equals(other.getAgree()))) &&
            ((this.fileList==null && other.getFileList()==null) || 
             (this.fileList!=null &&
              java.util.Arrays.equals(this.fileList, other.getFileList()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getAgree() != null) {
            _hashCode += getAgree().hashCode();
        }
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getRegistNo() != null) {
            _hashCode += getRegistNo().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyDeflossConfirm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyDeflossConfirm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "agree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "fileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "registNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "type"));
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
