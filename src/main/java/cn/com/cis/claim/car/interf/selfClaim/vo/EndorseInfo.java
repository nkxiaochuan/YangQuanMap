/**
 * EndorseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class EndorseInfo  implements java.io.Serializable {
    private java.lang.String endorseText;

    private java.lang.Double premiumChange;

    private java.util.Calendar validDate;

    public EndorseInfo() {
    }

    public EndorseInfo(
           java.lang.String endorseText,
           java.lang.Double premiumChange,
           java.util.Calendar validDate) {
           this.endorseText = endorseText;
           this.premiumChange = premiumChange;
           this.validDate = validDate;
    }


    /**
     * Gets the endorseText value for this EndorseInfo.
     * 
     * @return endorseText
     */
    public java.lang.String getEndorseText() {
        return endorseText;
    }


    /**
     * Sets the endorseText value for this EndorseInfo.
     * 
     * @param endorseText
     */
    public void setEndorseText(java.lang.String endorseText) {
        this.endorseText = endorseText;
    }


    /**
     * Gets the premiumChange value for this EndorseInfo.
     * 
     * @return premiumChange
     */
    public java.lang.Double getPremiumChange() {
        return premiumChange;
    }


    /**
     * Sets the premiumChange value for this EndorseInfo.
     * 
     * @param premiumChange
     */
    public void setPremiumChange(java.lang.Double premiumChange) {
        this.premiumChange = premiumChange;
    }


    /**
     * Gets the validDate value for this EndorseInfo.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this EndorseInfo.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EndorseInfo)) return false;
        EndorseInfo other = (EndorseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endorseText==null && other.getEndorseText()==null) || 
             (this.endorseText!=null &&
              this.endorseText.equals(other.getEndorseText()))) &&
            ((this.premiumChange==null && other.getPremiumChange()==null) || 
             (this.premiumChange!=null &&
              this.premiumChange.equals(other.getPremiumChange()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate())));
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
        if (getEndorseText() != null) {
            _hashCode += getEndorseText().hashCode();
        }
        if (getPremiumChange() != null) {
            _hashCode += getPremiumChange().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EndorseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EndorseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endorseText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "endorseText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiumChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "premiumChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
