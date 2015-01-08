/**
 * VOGPS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sinosoft.platform.common.remote.bocins.Dto.forpad;

public class VOGPS  implements java.io.Serializable {
    private java.lang.String IMEI;

    private java.lang.String latY;

    private java.lang.String lngX;

    private java.lang.String requestPwd;

    private java.lang.String requestType;

    private java.lang.String requestUser;

    private java.lang.String speed;

    private java.lang.String userCode;

    public VOGPS() {
    }

    public VOGPS(
           java.lang.String IMEI,
           java.lang.String latY,
           java.lang.String lngX,
           java.lang.String requestPwd,
           java.lang.String requestType,
           java.lang.String requestUser,
           java.lang.String speed,
           java.lang.String userCode) {
           this.IMEI = IMEI;
           this.latY = latY;
           this.lngX = lngX;
           this.requestPwd = requestPwd;
           this.requestType = requestType;
           this.requestUser = requestUser;
           this.speed = speed;
           this.userCode = userCode;
    }


    /**
     * Gets the IMEI value for this VOGPS.
     * 
     * @return IMEI
     */
    public java.lang.String getIMEI() {
        return IMEI;
    }


    /**
     * Sets the IMEI value for this VOGPS.
     * 
     * @param IMEI
     */
    public void setIMEI(java.lang.String IMEI) {
        this.IMEI = IMEI;
    }


    /**
     * Gets the latY value for this VOGPS.
     * 
     * @return latY
     */
    public java.lang.String getLatY() {
        return latY;
    }


    /**
     * Sets the latY value for this VOGPS.
     * 
     * @param latY
     */
    public void setLatY(java.lang.String latY) {
        this.latY = latY;
    }


    /**
     * Gets the lngX value for this VOGPS.
     * 
     * @return lngX
     */
    public java.lang.String getLngX() {
        return lngX;
    }


    /**
     * Sets the lngX value for this VOGPS.
     * 
     * @param lngX
     */
    public void setLngX(java.lang.String lngX) {
        this.lngX = lngX;
    }


    /**
     * Gets the requestPwd value for this VOGPS.
     * 
     * @return requestPwd
     */
    public java.lang.String getRequestPwd() {
        return requestPwd;
    }


    /**
     * Sets the requestPwd value for this VOGPS.
     * 
     * @param requestPwd
     */
    public void setRequestPwd(java.lang.String requestPwd) {
        this.requestPwd = requestPwd;
    }


    /**
     * Gets the requestType value for this VOGPS.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this VOGPS.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the requestUser value for this VOGPS.
     * 
     * @return requestUser
     */
    public java.lang.String getRequestUser() {
        return requestUser;
    }


    /**
     * Sets the requestUser value for this VOGPS.
     * 
     * @param requestUser
     */
    public void setRequestUser(java.lang.String requestUser) {
        this.requestUser = requestUser;
    }


    /**
     * Gets the speed value for this VOGPS.
     * 
     * @return speed
     */
    public java.lang.String getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this VOGPS.
     * 
     * @param speed
     */
    public void setSpeed(java.lang.String speed) {
        this.speed = speed;
    }


    /**
     * Gets the userCode value for this VOGPS.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this VOGPS.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VOGPS)) return false;
        VOGPS other = (VOGPS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IMEI==null && other.getIMEI()==null) || 
             (this.IMEI!=null &&
              this.IMEI.equals(other.getIMEI()))) &&
            ((this.latY==null && other.getLatY()==null) || 
             (this.latY!=null &&
              this.latY.equals(other.getLatY()))) &&
            ((this.lngX==null && other.getLngX()==null) || 
             (this.lngX!=null &&
              this.lngX.equals(other.getLngX()))) &&
            ((this.requestPwd==null && other.getRequestPwd()==null) || 
             (this.requestPwd!=null &&
              this.requestPwd.equals(other.getRequestPwd()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.requestUser==null && other.getRequestUser()==null) || 
             (this.requestUser!=null &&
              this.requestUser.equals(other.getRequestUser()))) &&
            ((this.speed==null && other.getSpeed()==null) || 
             (this.speed!=null &&
              this.speed.equals(other.getSpeed()))) &&
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
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        if (getLatY() != null) {
            _hashCode += getLatY().hashCode();
        }
        if (getLngX() != null) {
            _hashCode += getLngX().hashCode();
        }
        if (getRequestPwd() != null) {
            _hashCode += getRequestPwd().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getRequestUser() != null) {
            _hashCode += getRequestUser().hashCode();
        }
        if (getSpeed() != null) {
            _hashCode += getSpeed().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VOGPS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "VOGPS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "IMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "latY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lngX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "lngX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "requestPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "requestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "requestUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://forpad.Dto.bocins.remote.common.platform.sinosoft.com", "userCode"));
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
