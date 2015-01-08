/**
 * EngageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class EngageInfo  implements java.io.Serializable {
    private java.lang.String clausecode;

    private java.lang.String clauses;

    public EngageInfo() {
    }

    public EngageInfo(
           java.lang.String clausecode,
           java.lang.String clauses) {
           this.clausecode = clausecode;
           this.clauses = clauses;
    }


    /**
     * Gets the clausecode value for this EngageInfo.
     * 
     * @return clausecode
     */
    public java.lang.String getClausecode() {
        return clausecode;
    }


    /**
     * Sets the clausecode value for this EngageInfo.
     * 
     * @param clausecode
     */
    public void setClausecode(java.lang.String clausecode) {
        this.clausecode = clausecode;
    }


    /**
     * Gets the clauses value for this EngageInfo.
     * 
     * @return clauses
     */
    public java.lang.String getClauses() {
        return clauses;
    }


    /**
     * Sets the clauses value for this EngageInfo.
     * 
     * @param clauses
     */
    public void setClauses(java.lang.String clauses) {
        this.clauses = clauses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EngageInfo)) return false;
        EngageInfo other = (EngageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clausecode==null && other.getClausecode()==null) || 
             (this.clausecode!=null &&
              this.clausecode.equals(other.getClausecode()))) &&
            ((this.clauses==null && other.getClauses()==null) || 
             (this.clauses!=null &&
              this.clauses.equals(other.getClauses())));
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
        if (getClausecode() != null) {
            _hashCode += getClausecode().hashCode();
        }
        if (getClauses() != null) {
            _hashCode += getClauses().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EngageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EngageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clausecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "clausecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clauses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "clauses"));
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
