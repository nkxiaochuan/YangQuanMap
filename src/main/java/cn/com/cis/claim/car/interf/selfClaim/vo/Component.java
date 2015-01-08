/**
 * Component.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class Component  implements java.io.Serializable {
    private java.lang.String comPname;

    private java.lang.Integer lossCount;

    private java.lang.Double lossPrice;

    private java.lang.Double remnant;

    private java.lang.Double sumPrice;

    public Component() {
    }

    public Component(
           java.lang.String comPname,
           java.lang.Integer lossCount,
           java.lang.Double lossPrice,
           java.lang.Double remnant,
           java.lang.Double sumPrice) {
           this.comPname = comPname;
           this.lossCount = lossCount;
           this.lossPrice = lossPrice;
           this.remnant = remnant;
           this.sumPrice = sumPrice;
    }


    /**
     * Gets the comPname value for this Component.
     * 
     * @return comPname
     */
    public java.lang.String getComPname() {
        return comPname;
    }


    /**
     * Sets the comPname value for this Component.
     * 
     * @param comPname
     */
    public void setComPname(java.lang.String comPname) {
        this.comPname = comPname;
    }


    /**
     * Gets the lossCount value for this Component.
     * 
     * @return lossCount
     */
    public java.lang.Integer getLossCount() {
        return lossCount;
    }


    /**
     * Sets the lossCount value for this Component.
     * 
     * @param lossCount
     */
    public void setLossCount(java.lang.Integer lossCount) {
        this.lossCount = lossCount;
    }


    /**
     * Gets the lossPrice value for this Component.
     * 
     * @return lossPrice
     */
    public java.lang.Double getLossPrice() {
        return lossPrice;
    }


    /**
     * Sets the lossPrice value for this Component.
     * 
     * @param lossPrice
     */
    public void setLossPrice(java.lang.Double lossPrice) {
        this.lossPrice = lossPrice;
    }


    /**
     * Gets the remnant value for this Component.
     * 
     * @return remnant
     */
    public java.lang.Double getRemnant() {
        return remnant;
    }


    /**
     * Sets the remnant value for this Component.
     * 
     * @param remnant
     */
    public void setRemnant(java.lang.Double remnant) {
        this.remnant = remnant;
    }


    /**
     * Gets the sumPrice value for this Component.
     * 
     * @return sumPrice
     */
    public java.lang.Double getSumPrice() {
        return sumPrice;
    }


    /**
     * Sets the sumPrice value for this Component.
     * 
     * @param sumPrice
     */
    public void setSumPrice(java.lang.Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Component)) return false;
        Component other = (Component) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comPname==null && other.getComPname()==null) || 
             (this.comPname!=null &&
              this.comPname.equals(other.getComPname()))) &&
            ((this.lossCount==null && other.getLossCount()==null) || 
             (this.lossCount!=null &&
              this.lossCount.equals(other.getLossCount()))) &&
            ((this.lossPrice==null && other.getLossPrice()==null) || 
             (this.lossPrice!=null &&
              this.lossPrice.equals(other.getLossPrice()))) &&
            ((this.remnant==null && other.getRemnant()==null) || 
             (this.remnant!=null &&
              this.remnant.equals(other.getRemnant()))) &&
            ((this.sumPrice==null && other.getSumPrice()==null) || 
             (this.sumPrice!=null &&
              this.sumPrice.equals(other.getSumPrice())));
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
        if (getComPname() != null) {
            _hashCode += getComPname().hashCode();
        }
        if (getLossCount() != null) {
            _hashCode += getLossCount().hashCode();
        }
        if (getLossPrice() != null) {
            _hashCode += getLossPrice().hashCode();
        }
        if (getRemnant() != null) {
            _hashCode += getRemnant().hashCode();
        }
        if (getSumPrice() != null) {
            _hashCode += getSumPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Component.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Component"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comPname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "comPname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "lossCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "lossPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remnant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "remnant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "sumPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
