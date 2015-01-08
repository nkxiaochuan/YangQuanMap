/**
 * Factory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class Factory  implements java.io.Serializable {
    private java.lang.String address;

    private java.math.BigDecimal discountRate;

    private java.lang.String factoryCode;

    private java.lang.String factoryName;

    private java.lang.String factoryType;

    public Factory() {
    }

    public Factory(
           java.lang.String address,
           java.math.BigDecimal discountRate,
           java.lang.String factoryCode,
           java.lang.String factoryName,
           java.lang.String factoryType) {
           this.address = address;
           this.discountRate = discountRate;
           this.factoryCode = factoryCode;
           this.factoryName = factoryName;
           this.factoryType = factoryType;
    }


    /**
     * Gets the address value for this Factory.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Factory.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the discountRate value for this Factory.
     * 
     * @return discountRate
     */
    public java.math.BigDecimal getDiscountRate() {
        return discountRate;
    }


    /**
     * Sets the discountRate value for this Factory.
     * 
     * @param discountRate
     */
    public void setDiscountRate(java.math.BigDecimal discountRate) {
        this.discountRate = discountRate;
    }


    /**
     * Gets the factoryCode value for this Factory.
     * 
     * @return factoryCode
     */
    public java.lang.String getFactoryCode() {
        return factoryCode;
    }


    /**
     * Sets the factoryCode value for this Factory.
     * 
     * @param factoryCode
     */
    public void setFactoryCode(java.lang.String factoryCode) {
        this.factoryCode = factoryCode;
    }


    /**
     * Gets the factoryName value for this Factory.
     * 
     * @return factoryName
     */
    public java.lang.String getFactoryName() {
        return factoryName;
    }


    /**
     * Sets the factoryName value for this Factory.
     * 
     * @param factoryName
     */
    public void setFactoryName(java.lang.String factoryName) {
        this.factoryName = factoryName;
    }


    /**
     * Gets the factoryType value for this Factory.
     * 
     * @return factoryType
     */
    public java.lang.String getFactoryType() {
        return factoryType;
    }


    /**
     * Sets the factoryType value for this Factory.
     * 
     * @param factoryType
     */
    public void setFactoryType(java.lang.String factoryType) {
        this.factoryType = factoryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Factory)) return false;
        Factory other = (Factory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.discountRate==null && other.getDiscountRate()==null) || 
             (this.discountRate!=null &&
              this.discountRate.equals(other.getDiscountRate()))) &&
            ((this.factoryCode==null && other.getFactoryCode()==null) || 
             (this.factoryCode!=null &&
              this.factoryCode.equals(other.getFactoryCode()))) &&
            ((this.factoryName==null && other.getFactoryName()==null) || 
             (this.factoryName!=null &&
              this.factoryName.equals(other.getFactoryName()))) &&
            ((this.factoryType==null && other.getFactoryType()==null) || 
             (this.factoryType!=null &&
              this.factoryType.equals(other.getFactoryType())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getDiscountRate() != null) {
            _hashCode += getDiscountRate().hashCode();
        }
        if (getFactoryCode() != null) {
            _hashCode += getFactoryCode().hashCode();
        }
        if (getFactoryName() != null) {
            _hashCode += getFactoryName().hashCode();
        }
        if (getFactoryType() != null) {
            _hashCode += getFactoryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Factory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Factory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "discountRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "factoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "factoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "factoryType"));
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
