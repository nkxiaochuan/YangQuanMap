/**
 * ItemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class ItemInfo  implements java.io.Serializable {
    private java.lang.Double amount;

    private java.lang.String exceptFlag;

    private java.lang.String kindCode;

    private java.lang.String kindName;

    private java.lang.Double premium;

    public ItemInfo() {
    }

    public ItemInfo(
           java.lang.Double amount,
           java.lang.String exceptFlag,
           java.lang.String kindCode,
           java.lang.String kindName,
           java.lang.Double premium) {
           this.amount = amount;
           this.exceptFlag = exceptFlag;
           this.kindCode = kindCode;
           this.kindName = kindName;
           this.premium = premium;
    }


    /**
     * Gets the amount value for this ItemInfo.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ItemInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the exceptFlag value for this ItemInfo.
     * 
     * @return exceptFlag
     */
    public java.lang.String getExceptFlag() {
        return exceptFlag;
    }


    /**
     * Sets the exceptFlag value for this ItemInfo.
     * 
     * @param exceptFlag
     */
    public void setExceptFlag(java.lang.String exceptFlag) {
        this.exceptFlag = exceptFlag;
    }


    /**
     * Gets the kindCode value for this ItemInfo.
     * 
     * @return kindCode
     */
    public java.lang.String getKindCode() {
        return kindCode;
    }


    /**
     * Sets the kindCode value for this ItemInfo.
     * 
     * @param kindCode
     */
    public void setKindCode(java.lang.String kindCode) {
        this.kindCode = kindCode;
    }


    /**
     * Gets the kindName value for this ItemInfo.
     * 
     * @return kindName
     */
    public java.lang.String getKindName() {
        return kindName;
    }


    /**
     * Sets the kindName value for this ItemInfo.
     * 
     * @param kindName
     */
    public void setKindName(java.lang.String kindName) {
        this.kindName = kindName;
    }


    /**
     * Gets the premium value for this ItemInfo.
     * 
     * @return premium
     */
    public java.lang.Double getPremium() {
        return premium;
    }


    /**
     * Sets the premium value for this ItemInfo.
     * 
     * @param premium
     */
    public void setPremium(java.lang.Double premium) {
        this.premium = premium;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemInfo)) return false;
        ItemInfo other = (ItemInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.exceptFlag==null && other.getExceptFlag()==null) || 
             (this.exceptFlag!=null &&
              this.exceptFlag.equals(other.getExceptFlag()))) &&
            ((this.kindCode==null && other.getKindCode()==null) || 
             (this.kindCode!=null &&
              this.kindCode.equals(other.getKindCode()))) &&
            ((this.kindName==null && other.getKindName()==null) || 
             (this.kindName!=null &&
              this.kindName.equals(other.getKindName()))) &&
            ((this.premium==null && other.getPremium()==null) || 
             (this.premium!=null &&
              this.premium.equals(other.getPremium())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getExceptFlag() != null) {
            _hashCode += getExceptFlag().hashCode();
        }
        if (getKindCode() != null) {
            _hashCode += getKindCode().hashCode();
        }
        if (getKindName() != null) {
            _hashCode += getKindName().hashCode();
        }
        if (getPremium() != null) {
            _hashCode += getPremium().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ItemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "exceptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "kindCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "kindName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "premium"));
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
