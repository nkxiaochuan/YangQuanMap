/**
 * InsuranceItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class InsuranceItem  implements java.io.Serializable {
    private java.lang.String insureTerm;

    private java.lang.String insureTermCode;

    public InsuranceItem() {
    }

    public InsuranceItem(
           java.lang.String insureTerm,
           java.lang.String insureTermCode) {
           this.insureTerm = insureTerm;
           this.insureTermCode = insureTermCode;
    }


    /**
     * Gets the insureTerm value for this InsuranceItem.
     * 
     * @return insureTerm
     */
    public java.lang.String getInsureTerm() {
        return insureTerm;
    }


    /**
     * Sets the insureTerm value for this InsuranceItem.
     * 
     * @param insureTerm
     */
    public void setInsureTerm(java.lang.String insureTerm) {
        this.insureTerm = insureTerm;
    }


    /**
     * Gets the insureTermCode value for this InsuranceItem.
     * 
     * @return insureTermCode
     */
    public java.lang.String getInsureTermCode() {
        return insureTermCode;
    }


    /**
     * Sets the insureTermCode value for this InsuranceItem.
     * 
     * @param insureTermCode
     */
    public void setInsureTermCode(java.lang.String insureTermCode) {
        this.insureTermCode = insureTermCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsuranceItem)) return false;
        InsuranceItem other = (InsuranceItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insureTerm==null && other.getInsureTerm()==null) || 
             (this.insureTerm!=null &&
              this.insureTerm.equals(other.getInsureTerm()))) &&
            ((this.insureTermCode==null && other.getInsureTermCode()==null) || 
             (this.insureTermCode!=null &&
              this.insureTermCode.equals(other.getInsureTermCode())));
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
        if (getInsureTerm() != null) {
            _hashCode += getInsureTerm().hashCode();
        }
        if (getInsureTermCode() != null) {
            _hashCode += getInsureTermCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsuranceItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "InsuranceItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insureTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "insureTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insureTermCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "insureTermCode"));
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
