/**
 * AddDeflossReturnInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class AddDeflossReturnInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo deflossCarInfo;

    private cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo;

    public AddDeflossReturnInfo() {
    }

    public AddDeflossReturnInfo(
           cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo deflossCarInfo,
           cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo) {
           this.deflossCarInfo = deflossCarInfo;
           this.resultInfo = resultInfo;
    }


    /**
     * Gets the deflossCarInfo value for this AddDeflossReturnInfo.
     * 
     * @return deflossCarInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo getDeflossCarInfo() {
        return deflossCarInfo;
    }


    /**
     * Sets the deflossCarInfo value for this AddDeflossReturnInfo.
     * 
     * @param deflossCarInfo
     */
    public void setDeflossCarInfo(cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo deflossCarInfo) {
        this.deflossCarInfo = deflossCarInfo;
    }


    /**
     * Gets the resultInfo value for this AddDeflossReturnInfo.
     * 
     * @return resultInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo getResultInfo() {
        return resultInfo;
    }


    /**
     * Sets the resultInfo value for this AddDeflossReturnInfo.
     * 
     * @param resultInfo
     */
    public void setResultInfo(cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddDeflossReturnInfo)) return false;
        AddDeflossReturnInfo other = (AddDeflossReturnInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deflossCarInfo==null && other.getDeflossCarInfo()==null) || 
             (this.deflossCarInfo!=null &&
              this.deflossCarInfo.equals(other.getDeflossCarInfo()))) &&
            ((this.resultInfo==null && other.getResultInfo()==null) || 
             (this.resultInfo!=null &&
              this.resultInfo.equals(other.getResultInfo())));
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
        if (getDeflossCarInfo() != null) {
            _hashCode += getDeflossCarInfo().hashCode();
        }
        if (getResultInfo() != null) {
            _hashCode += getResultInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddDeflossReturnInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "AddDeflossReturnInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deflossCarInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "deflossCarInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossCarInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "resultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo"));
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
