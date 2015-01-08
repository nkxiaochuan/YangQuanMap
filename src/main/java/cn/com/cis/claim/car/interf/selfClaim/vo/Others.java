/**
 * Others.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class Others  implements java.io.Serializable {
    private java.lang.Double othersFee;

    private java.lang.String othersName;

    public Others() {
    }

    public Others(
           java.lang.Double othersFee,
           java.lang.String othersName) {
           this.othersFee = othersFee;
           this.othersName = othersName;
    }


    /**
     * Gets the othersFee value for this Others.
     * 
     * @return othersFee
     */
    public java.lang.Double getOthersFee() {
        return othersFee;
    }


    /**
     * Sets the othersFee value for this Others.
     * 
     * @param othersFee
     */
    public void setOthersFee(java.lang.Double othersFee) {
        this.othersFee = othersFee;
    }


    /**
     * Gets the othersName value for this Others.
     * 
     * @return othersName
     */
    public java.lang.String getOthersName() {
        return othersName;
    }


    /**
     * Sets the othersName value for this Others.
     * 
     * @param othersName
     */
    public void setOthersName(java.lang.String othersName) {
        this.othersName = othersName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Others)) return false;
        Others other = (Others) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.othersFee==null && other.getOthersFee()==null) || 
             (this.othersFee!=null &&
              this.othersFee.equals(other.getOthersFee()))) &&
            ((this.othersName==null && other.getOthersName()==null) || 
             (this.othersName!=null &&
              this.othersName.equals(other.getOthersName())));
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
        if (getOthersFee() != null) {
            _hashCode += getOthersFee().hashCode();
        }
        if (getOthersName() != null) {
            _hashCode += getOthersName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Others.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Others"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othersFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "othersFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othersName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "othersName"));
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
