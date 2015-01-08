/**
 * VOResponseBackBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sinosoft.platform.common.remote.bocins.Dto.forpad;

public class VOResponseBackBasic  implements java.io.Serializable {
    private java.lang.String errMessage;

    private java.lang.String responseCode;

    private java.lang.String responseType;

    public VOResponseBackBasic() {
    }

    public VOResponseBackBasic(
           java.lang.String errMessage,
           java.lang.String responseCode,
           java.lang.String responseType) {
           this.errMessage = errMessage;
           this.responseCode = responseCode;
           this.responseType = responseType;
    }


    /**
     * Gets the errMessage value for this VOResponseBackBasic.
     * 
     * @return errMessage
     */
    public java.lang.String getErrMessage() {
        return errMessage;
    }


    /**
     * Sets the errMessage value for this VOResponseBackBasic.
     * 
     * @param errMessage
     */
    public void setErrMessage(java.lang.String errMessage) {
        this.errMessage = errMessage;
    }


    /**
     * Gets the responseCode value for this VOResponseBackBasic.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this VOResponseBackBasic.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseType value for this VOResponseBackBasic.
     * 
     * @return responseType
     */
    public java.lang.String getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this VOResponseBackBasic.
     * 
     * @param responseType
     */
    public void setResponseType(java.lang.String responseType) {
        this.responseType = responseType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VOResponseBackBasic)) return false;
        VOResponseBackBasic other = (VOResponseBackBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errMessage==null && other.getErrMessage()==null) || 
             (this.errMessage!=null &&
              this.errMessage.equals(other.getErrMessage()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseType==null && other.getResponseType()==null) || 
             (this.responseType!=null &&
              this.responseType.equals(other.getResponseType())));
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
        if (getErrMessage() != null) {
            _hashCode += getErrMessage().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseType() != null) {
            _hashCode += getResponseType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VOResponseBackBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "VOResponseBackBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "errMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "responseType"));
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
