/**
 * CaseInfoMobile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class CaseInfoMobile  implements java.io.Serializable {
    private java.lang.String checkAddress;

    private java.lang.String damageDate;

    private java.lang.String damageReason;

    private java.lang.String dangerInfo;

    private java.lang.String linkName;

    private java.lang.String phoneNumber;

    private java.lang.String registNo;

    public CaseInfoMobile() {
    }

    public CaseInfoMobile(
           java.lang.String checkAddress,
           java.lang.String damageDate,
           java.lang.String damageReason,
           java.lang.String dangerInfo,
           java.lang.String linkName,
           java.lang.String phoneNumber,
           java.lang.String registNo) {
           this.checkAddress = checkAddress;
           this.damageDate = damageDate;
           this.damageReason = damageReason;
           this.dangerInfo = dangerInfo;
           this.linkName = linkName;
           this.phoneNumber = phoneNumber;
           this.registNo = registNo;
    }


    /**
     * Gets the checkAddress value for this CaseInfoMobile.
     * 
     * @return checkAddress
     */
    public java.lang.String getCheckAddress() {
        return checkAddress;
    }


    /**
     * Sets the checkAddress value for this CaseInfoMobile.
     * 
     * @param checkAddress
     */
    public void setCheckAddress(java.lang.String checkAddress) {
        this.checkAddress = checkAddress;
    }


    /**
     * Gets the damageDate value for this CaseInfoMobile.
     * 
     * @return damageDate
     */
    public java.lang.String getDamageDate() {
        return damageDate;
    }


    /**
     * Sets the damageDate value for this CaseInfoMobile.
     * 
     * @param damageDate
     */
    public void setDamageDate(java.lang.String damageDate) {
        this.damageDate = damageDate;
    }


    /**
     * Gets the damageReason value for this CaseInfoMobile.
     * 
     * @return damageReason
     */
    public java.lang.String getDamageReason() {
        return damageReason;
    }


    /**
     * Sets the damageReason value for this CaseInfoMobile.
     * 
     * @param damageReason
     */
    public void setDamageReason(java.lang.String damageReason) {
        this.damageReason = damageReason;
    }


    /**
     * Gets the dangerInfo value for this CaseInfoMobile.
     * 
     * @return dangerInfo
     */
    public java.lang.String getDangerInfo() {
        return dangerInfo;
    }


    /**
     * Sets the dangerInfo value for this CaseInfoMobile.
     * 
     * @param dangerInfo
     */
    public void setDangerInfo(java.lang.String dangerInfo) {
        this.dangerInfo = dangerInfo;
    }


    /**
     * Gets the linkName value for this CaseInfoMobile.
     * 
     * @return linkName
     */
    public java.lang.String getLinkName() {
        return linkName;
    }


    /**
     * Sets the linkName value for this CaseInfoMobile.
     * 
     * @param linkName
     */
    public void setLinkName(java.lang.String linkName) {
        this.linkName = linkName;
    }


    /**
     * Gets the phoneNumber value for this CaseInfoMobile.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CaseInfoMobile.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the registNo value for this CaseInfoMobile.
     * 
     * @return registNo
     */
    public java.lang.String getRegistNo() {
        return registNo;
    }


    /**
     * Sets the registNo value for this CaseInfoMobile.
     * 
     * @param registNo
     */
    public void setRegistNo(java.lang.String registNo) {
        this.registNo = registNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseInfoMobile)) return false;
        CaseInfoMobile other = (CaseInfoMobile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkAddress==null && other.getCheckAddress()==null) || 
             (this.checkAddress!=null &&
              this.checkAddress.equals(other.getCheckAddress()))) &&
            ((this.damageDate==null && other.getDamageDate()==null) || 
             (this.damageDate!=null &&
              this.damageDate.equals(other.getDamageDate()))) &&
            ((this.damageReason==null && other.getDamageReason()==null) || 
             (this.damageReason!=null &&
              this.damageReason.equals(other.getDamageReason()))) &&
            ((this.dangerInfo==null && other.getDangerInfo()==null) || 
             (this.dangerInfo!=null &&
              this.dangerInfo.equals(other.getDangerInfo()))) &&
            ((this.linkName==null && other.getLinkName()==null) || 
             (this.linkName!=null &&
              this.linkName.equals(other.getLinkName()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo())));
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
        if (getCheckAddress() != null) {
            _hashCode += getCheckAddress().hashCode();
        }
        if (getDamageDate() != null) {
            _hashCode += getDamageDate().hashCode();
        }
        if (getDamageReason() != null) {
            _hashCode += getDamageReason().hashCode();
        }
        if (getDangerInfo() != null) {
            _hashCode += getDangerInfo().hashCode();
        }
        if (getLinkName() != null) {
            _hashCode += getLinkName().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getRegistNo() != null) {
            _hashCode += getRegistNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseInfoMobile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CaseInfoMobile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "checkAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "damageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damageReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "damageReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "dangerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "linkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "registNo"));
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
