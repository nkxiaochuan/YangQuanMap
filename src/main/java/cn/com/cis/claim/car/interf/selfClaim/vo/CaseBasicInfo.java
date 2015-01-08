/**
 * CaseBasicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class CaseBasicInfo  implements java.io.Serializable {
    private java.lang.String checkAddress;

    private java.lang.String customerTypeName;

    private java.lang.String damageDate;

    private java.lang.String damageReason;

    private java.lang.String frameNo;

    private java.lang.String linkName;

    private java.lang.String phoneNumber;

    private java.lang.String registDate;

    private java.lang.String registNo;

    private java.lang.String vipFlag;

    public CaseBasicInfo() {
    }

    public CaseBasicInfo(
           java.lang.String checkAddress,
           java.lang.String customerTypeName,
           java.lang.String damageDate,
           java.lang.String damageReason,
           java.lang.String frameNo,
           java.lang.String linkName,
           java.lang.String phoneNumber,
           java.lang.String registDate,
           java.lang.String registNo,
           java.lang.String vipFlag) {
           this.checkAddress = checkAddress;
           this.customerTypeName = customerTypeName;
           this.damageDate = damageDate;
           this.damageReason = damageReason;
           this.frameNo = frameNo;
           this.linkName = linkName;
           this.phoneNumber = phoneNumber;
           this.registDate = registDate;
           this.registNo = registNo;
           this.vipFlag = vipFlag;
    }


    /**
     * Gets the checkAddress value for this CaseBasicInfo.
     * 
     * @return checkAddress
     */
    public java.lang.String getCheckAddress() {
        return checkAddress;
    }


    /**
     * Sets the checkAddress value for this CaseBasicInfo.
     * 
     * @param checkAddress
     */
    public void setCheckAddress(java.lang.String checkAddress) {
        this.checkAddress = checkAddress;
    }


    /**
     * Gets the customerTypeName value for this CaseBasicInfo.
     * 
     * @return customerTypeName
     */
    public java.lang.String getCustomerTypeName() {
        return customerTypeName;
    }


    /**
     * Sets the customerTypeName value for this CaseBasicInfo.
     * 
     * @param customerTypeName
     */
    public void setCustomerTypeName(java.lang.String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }


    /**
     * Gets the damageDate value for this CaseBasicInfo.
     * 
     * @return damageDate
     */
    public java.lang.String getDamageDate() {
        return damageDate;
    }


    /**
     * Sets the damageDate value for this CaseBasicInfo.
     * 
     * @param damageDate
     */
    public void setDamageDate(java.lang.String damageDate) {
        this.damageDate = damageDate;
    }


    /**
     * Gets the damageReason value for this CaseBasicInfo.
     * 
     * @return damageReason
     */
    public java.lang.String getDamageReason() {
        return damageReason;
    }


    /**
     * Sets the damageReason value for this CaseBasicInfo.
     * 
     * @param damageReason
     */
    public void setDamageReason(java.lang.String damageReason) {
        this.damageReason = damageReason;
    }


    /**
     * Gets the frameNo value for this CaseBasicInfo.
     * 
     * @return frameNo
     */
    public java.lang.String getFrameNo() {
        return frameNo;
    }


    /**
     * Sets the frameNo value for this CaseBasicInfo.
     * 
     * @param frameNo
     */
    public void setFrameNo(java.lang.String frameNo) {
        this.frameNo = frameNo;
    }


    /**
     * Gets the linkName value for this CaseBasicInfo.
     * 
     * @return linkName
     */
    public java.lang.String getLinkName() {
        return linkName;
    }


    /**
     * Sets the linkName value for this CaseBasicInfo.
     * 
     * @param linkName
     */
    public void setLinkName(java.lang.String linkName) {
        this.linkName = linkName;
    }


    /**
     * Gets the phoneNumber value for this CaseBasicInfo.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CaseBasicInfo.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the registDate value for this CaseBasicInfo.
     * 
     * @return registDate
     */
    public java.lang.String getRegistDate() {
        return registDate;
    }


    /**
     * Sets the registDate value for this CaseBasicInfo.
     * 
     * @param registDate
     */
    public void setRegistDate(java.lang.String registDate) {
        this.registDate = registDate;
    }


    /**
     * Gets the registNo value for this CaseBasicInfo.
     * 
     * @return registNo
     */
    public java.lang.String getRegistNo() {
        return registNo;
    }


    /**
     * Sets the registNo value for this CaseBasicInfo.
     * 
     * @param registNo
     */
    public void setRegistNo(java.lang.String registNo) {
        this.registNo = registNo;
    }


    /**
     * Gets the vipFlag value for this CaseBasicInfo.
     * 
     * @return vipFlag
     */
    public java.lang.String getVipFlag() {
        return vipFlag;
    }


    /**
     * Sets the vipFlag value for this CaseBasicInfo.
     * 
     * @param vipFlag
     */
    public void setVipFlag(java.lang.String vipFlag) {
        this.vipFlag = vipFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseBasicInfo)) return false;
        CaseBasicInfo other = (CaseBasicInfo) obj;
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
            ((this.customerTypeName==null && other.getCustomerTypeName()==null) || 
             (this.customerTypeName!=null &&
              this.customerTypeName.equals(other.getCustomerTypeName()))) &&
            ((this.damageDate==null && other.getDamageDate()==null) || 
             (this.damageDate!=null &&
              this.damageDate.equals(other.getDamageDate()))) &&
            ((this.damageReason==null && other.getDamageReason()==null) || 
             (this.damageReason!=null &&
              this.damageReason.equals(other.getDamageReason()))) &&
            ((this.frameNo==null && other.getFrameNo()==null) || 
             (this.frameNo!=null &&
              this.frameNo.equals(other.getFrameNo()))) &&
            ((this.linkName==null && other.getLinkName()==null) || 
             (this.linkName!=null &&
              this.linkName.equals(other.getLinkName()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.registDate==null && other.getRegistDate()==null) || 
             (this.registDate!=null &&
              this.registDate.equals(other.getRegistDate()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo()))) &&
            ((this.vipFlag==null && other.getVipFlag()==null) || 
             (this.vipFlag!=null &&
              this.vipFlag.equals(other.getVipFlag())));
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
        if (getCustomerTypeName() != null) {
            _hashCode += getCustomerTypeName().hashCode();
        }
        if (getDamageDate() != null) {
            _hashCode += getDamageDate().hashCode();
        }
        if (getDamageReason() != null) {
            _hashCode += getDamageReason().hashCode();
        }
        if (getFrameNo() != null) {
            _hashCode += getFrameNo().hashCode();
        }
        if (getLinkName() != null) {
            _hashCode += getLinkName().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getRegistDate() != null) {
            _hashCode += getRegistDate().hashCode();
        }
        if (getRegistNo() != null) {
            _hashCode += getRegistNo().hashCode();
        }
        if (getVipFlag() != null) {
            _hashCode += getVipFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseBasicInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseBasicInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "checkAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "customerTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "damageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damageReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "damageReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "frameNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "linkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "registDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "registNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "vipFlag"));
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
