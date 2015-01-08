/**
 * CheckUserReturnInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class CheckUserReturnInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo;

    private cn.com.cis.claim.car.interf.check.vo.User user;

    public CheckUserReturnInfo() {
    }

    public CheckUserReturnInfo(
           cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo,
           cn.com.cis.claim.car.interf.check.vo.User user) {
           this.resultInfo = resultInfo;
           this.user = user;
    }


    /**
     * Gets the resultInfo value for this CheckUserReturnInfo.
     * 
     * @return resultInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo getResultInfo() {
        return resultInfo;
    }


    /**
     * Sets the resultInfo value for this CheckUserReturnInfo.
     * 
     * @param resultInfo
     */
    public void setResultInfo(cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }


    /**
     * Gets the user value for this CheckUserReturnInfo.
     * 
     * @return user
     */
    public cn.com.cis.claim.car.interf.check.vo.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this CheckUserReturnInfo.
     * 
     * @param user
     */
    public void setUser(cn.com.cis.claim.car.interf.check.vo.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckUserReturnInfo)) return false;
        CheckUserReturnInfo other = (CheckUserReturnInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultInfo==null && other.getResultInfo()==null) || 
             (this.resultInfo!=null &&
              this.resultInfo.equals(other.getResultInfo()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        if (getResultInfo() != null) {
            _hashCode += getResultInfo().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckUserReturnInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckUserReturnInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "resultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "User"));
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
