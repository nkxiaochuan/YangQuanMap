/**
 * KindInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class KindInfo  implements java.io.Serializable {
    private java.lang.String kindCode;

    private java.lang.String kindName;

    public KindInfo() {
    }

    public KindInfo(
           java.lang.String kindCode,
           java.lang.String kindName) {
           this.kindCode = kindCode;
           this.kindName = kindName;
    }


    /**
     * Gets the kindCode value for this KindInfo.
     * 
     * @return kindCode
     */
    public java.lang.String getKindCode() {
        return kindCode;
    }


    /**
     * Sets the kindCode value for this KindInfo.
     * 
     * @param kindCode
     */
    public void setKindCode(java.lang.String kindCode) {
        this.kindCode = kindCode;
    }


    /**
     * Gets the kindName value for this KindInfo.
     * 
     * @return kindName
     */
    public java.lang.String getKindName() {
        return kindName;
    }


    /**
     * Sets the kindName value for this KindInfo.
     * 
     * @param kindName
     */
    public void setKindName(java.lang.String kindName) {
        this.kindName = kindName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KindInfo)) return false;
        KindInfo other = (KindInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kindCode==null && other.getKindCode()==null) || 
             (this.kindCode!=null &&
              this.kindCode.equals(other.getKindCode()))) &&
            ((this.kindName==null && other.getKindName()==null) || 
             (this.kindName!=null &&
              this.kindName.equals(other.getKindName())));
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
        if (getKindCode() != null) {
            _hashCode += getKindCode().hashCode();
        }
        if (getKindName() != null) {
            _hashCode += getKindName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KindInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "KindInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "kindCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "kindName"));
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
