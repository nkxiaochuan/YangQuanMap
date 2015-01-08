/**
 * DeflossConfirm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class DeflossConfirm  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList;

    private java.lang.String phoneNumber;

    private java.lang.Long taskId;

    private java.lang.String type;

    private java.lang.String userCode;

    public DeflossConfirm() {
    }

    public DeflossConfirm(
           cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList,
           java.lang.String phoneNumber,
           java.lang.Long taskId,
           java.lang.String type,
           java.lang.String userCode) {
           this.fileInfoList = fileInfoList;
           this.phoneNumber = phoneNumber;
           this.taskId = taskId;
           this.type = type;
           this.userCode = userCode;
    }


    /**
     * Gets the fileInfoList value for this DeflossConfirm.
     * 
     * @return fileInfoList
     */
    public cn.com.cis.claim.car.interf.check.vo.FileInfo[] getFileInfoList() {
        return fileInfoList;
    }


    /**
     * Sets the fileInfoList value for this DeflossConfirm.
     * 
     * @param fileInfoList
     */
    public void setFileInfoList(cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList) {
        this.fileInfoList = fileInfoList;
    }


    /**
     * Gets the phoneNumber value for this DeflossConfirm.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this DeflossConfirm.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the taskId value for this DeflossConfirm.
     * 
     * @return taskId
     */
    public java.lang.Long getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this DeflossConfirm.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.Long taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the type value for this DeflossConfirm.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DeflossConfirm.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the userCode value for this DeflossConfirm.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this DeflossConfirm.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeflossConfirm)) return false;
        DeflossConfirm other = (DeflossConfirm) obj;
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
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeflossConfirm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossConfirm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "fileInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "type"));
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
