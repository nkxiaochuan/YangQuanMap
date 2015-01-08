/**
 * PolicyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class PolicyInfo  implements java.io.Serializable {
    private java.lang.String customerTypeName;

    private java.lang.String damageCount;

    private java.util.Calendar endDate;

    private cn.com.cis.claim.car.interf.selfClaim.vo.EndorseInfo[] endorseInfo;

    private cn.com.cis.claim.car.interf.selfClaim.vo.EngageInfo[] engageInfo;

    private java.lang.String insuredCom;

    private java.lang.String insuredName;

    private cn.com.cis.claim.car.interf.selfClaim.vo.ItemInfo[] itemInfo;

    private java.lang.String licenseNo;

    private java.lang.String policyNo;

    private java.lang.String policyType;

    private java.util.Calendar startDate;

    private java.lang.String vipFlagName;

    public PolicyInfo() {
    }

    public PolicyInfo(
           java.lang.String customerTypeName,
           java.lang.String damageCount,
           java.util.Calendar endDate,
           cn.com.cis.claim.car.interf.selfClaim.vo.EndorseInfo[] endorseInfo,
           cn.com.cis.claim.car.interf.selfClaim.vo.EngageInfo[] engageInfo,
           java.lang.String insuredCom,
           java.lang.String insuredName,
           cn.com.cis.claim.car.interf.selfClaim.vo.ItemInfo[] itemInfo,
           java.lang.String licenseNo,
           java.lang.String policyNo,
           java.lang.String policyType,
           java.util.Calendar startDate,
           java.lang.String vipFlagName) {
           this.customerTypeName = customerTypeName;
           this.damageCount = damageCount;
           this.endDate = endDate;
           this.endorseInfo = endorseInfo;
           this.engageInfo = engageInfo;
           this.insuredCom = insuredCom;
           this.insuredName = insuredName;
           this.itemInfo = itemInfo;
           this.licenseNo = licenseNo;
           this.policyNo = policyNo;
           this.policyType = policyType;
           this.startDate = startDate;
           this.vipFlagName = vipFlagName;
    }


    /**
     * Gets the customerTypeName value for this PolicyInfo.
     * 
     * @return customerTypeName
     */
    public java.lang.String getCustomerTypeName() {
        return customerTypeName;
    }


    /**
     * Sets the customerTypeName value for this PolicyInfo.
     * 
     * @param customerTypeName
     */
    public void setCustomerTypeName(java.lang.String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }


    /**
     * Gets the damageCount value for this PolicyInfo.
     * 
     * @return damageCount
     */
    public java.lang.String getDamageCount() {
        return damageCount;
    }


    /**
     * Sets the damageCount value for this PolicyInfo.
     * 
     * @param damageCount
     */
    public void setDamageCount(java.lang.String damageCount) {
        this.damageCount = damageCount;
    }


    /**
     * Gets the endDate value for this PolicyInfo.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PolicyInfo.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the endorseInfo value for this PolicyInfo.
     * 
     * @return endorseInfo
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.EndorseInfo[] getEndorseInfo() {
        return endorseInfo;
    }


    /**
     * Sets the endorseInfo value for this PolicyInfo.
     * 
     * @param endorseInfo
     */
    public void setEndorseInfo(cn.com.cis.claim.car.interf.selfClaim.vo.EndorseInfo[] endorseInfo) {
        this.endorseInfo = endorseInfo;
    }


    /**
     * Gets the engageInfo value for this PolicyInfo.
     * 
     * @return engageInfo
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.EngageInfo[] getEngageInfo() {
        return engageInfo;
    }


    /**
     * Sets the engageInfo value for this PolicyInfo.
     * 
     * @param engageInfo
     */
    public void setEngageInfo(cn.com.cis.claim.car.interf.selfClaim.vo.EngageInfo[] engageInfo) {
        this.engageInfo = engageInfo;
    }


    /**
     * Gets the insuredCom value for this PolicyInfo.
     * 
     * @return insuredCom
     */
    public java.lang.String getInsuredCom() {
        return insuredCom;
    }


    /**
     * Sets the insuredCom value for this PolicyInfo.
     * 
     * @param insuredCom
     */
    public void setInsuredCom(java.lang.String insuredCom) {
        this.insuredCom = insuredCom;
    }


    /**
     * Gets the insuredName value for this PolicyInfo.
     * 
     * @return insuredName
     */
    public java.lang.String getInsuredName() {
        return insuredName;
    }


    /**
     * Sets the insuredName value for this PolicyInfo.
     * 
     * @param insuredName
     */
    public void setInsuredName(java.lang.String insuredName) {
        this.insuredName = insuredName;
    }


    /**
     * Gets the itemInfo value for this PolicyInfo.
     * 
     * @return itemInfo
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.ItemInfo[] getItemInfo() {
        return itemInfo;
    }


    /**
     * Sets the itemInfo value for this PolicyInfo.
     * 
     * @param itemInfo
     */
    public void setItemInfo(cn.com.cis.claim.car.interf.selfClaim.vo.ItemInfo[] itemInfo) {
        this.itemInfo = itemInfo;
    }


    /**
     * Gets the licenseNo value for this PolicyInfo.
     * 
     * @return licenseNo
     */
    public java.lang.String getLicenseNo() {
        return licenseNo;
    }


    /**
     * Sets the licenseNo value for this PolicyInfo.
     * 
     * @param licenseNo
     */
    public void setLicenseNo(java.lang.String licenseNo) {
        this.licenseNo = licenseNo;
    }


    /**
     * Gets the policyNo value for this PolicyInfo.
     * 
     * @return policyNo
     */
    public java.lang.String getPolicyNo() {
        return policyNo;
    }


    /**
     * Sets the policyNo value for this PolicyInfo.
     * 
     * @param policyNo
     */
    public void setPolicyNo(java.lang.String policyNo) {
        this.policyNo = policyNo;
    }


    /**
     * Gets the policyType value for this PolicyInfo.
     * 
     * @return policyType
     */
    public java.lang.String getPolicyType() {
        return policyType;
    }


    /**
     * Sets the policyType value for this PolicyInfo.
     * 
     * @param policyType
     */
    public void setPolicyType(java.lang.String policyType) {
        this.policyType = policyType;
    }


    /**
     * Gets the startDate value for this PolicyInfo.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PolicyInfo.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the vipFlagName value for this PolicyInfo.
     * 
     * @return vipFlagName
     */
    public java.lang.String getVipFlagName() {
        return vipFlagName;
    }


    /**
     * Sets the vipFlagName value for this PolicyInfo.
     * 
     * @param vipFlagName
     */
    public void setVipFlagName(java.lang.String vipFlagName) {
        this.vipFlagName = vipFlagName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyInfo)) return false;
        PolicyInfo other = (PolicyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerTypeName==null && other.getCustomerTypeName()==null) || 
             (this.customerTypeName!=null &&
              this.customerTypeName.equals(other.getCustomerTypeName()))) &&
            ((this.damageCount==null && other.getDamageCount()==null) || 
             (this.damageCount!=null &&
              this.damageCount.equals(other.getDamageCount()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.endorseInfo==null && other.getEndorseInfo()==null) || 
             (this.endorseInfo!=null &&
              java.util.Arrays.equals(this.endorseInfo, other.getEndorseInfo()))) &&
            ((this.engageInfo==null && other.getEngageInfo()==null) || 
             (this.engageInfo!=null &&
              java.util.Arrays.equals(this.engageInfo, other.getEngageInfo()))) &&
            ((this.insuredCom==null && other.getInsuredCom()==null) || 
             (this.insuredCom!=null &&
              this.insuredCom.equals(other.getInsuredCom()))) &&
            ((this.insuredName==null && other.getInsuredName()==null) || 
             (this.insuredName!=null &&
              this.insuredName.equals(other.getInsuredName()))) &&
            ((this.itemInfo==null && other.getItemInfo()==null) || 
             (this.itemInfo!=null &&
              java.util.Arrays.equals(this.itemInfo, other.getItemInfo()))) &&
            ((this.licenseNo==null && other.getLicenseNo()==null) || 
             (this.licenseNo!=null &&
              this.licenseNo.equals(other.getLicenseNo()))) &&
            ((this.policyNo==null && other.getPolicyNo()==null) || 
             (this.policyNo!=null &&
              this.policyNo.equals(other.getPolicyNo()))) &&
            ((this.policyType==null && other.getPolicyType()==null) || 
             (this.policyType!=null &&
              this.policyType.equals(other.getPolicyType()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.vipFlagName==null && other.getVipFlagName()==null) || 
             (this.vipFlagName!=null &&
              this.vipFlagName.equals(other.getVipFlagName())));
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
        if (getCustomerTypeName() != null) {
            _hashCode += getCustomerTypeName().hashCode();
        }
        if (getDamageCount() != null) {
            _hashCode += getDamageCount().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEndorseInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndorseInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndorseInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEngageInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEngageInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEngageInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInsuredCom() != null) {
            _hashCode += getInsuredCom().hashCode();
        }
        if (getInsuredName() != null) {
            _hashCode += getInsuredName().hashCode();
        }
        if (getItemInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLicenseNo() != null) {
            _hashCode += getLicenseNo().hashCode();
        }
        if (getPolicyNo() != null) {
            _hashCode += getPolicyNo().hashCode();
        }
        if (getPolicyType() != null) {
            _hashCode += getPolicyType().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getVipFlagName() != null) {
            _hashCode += getVipFlagName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "PolicyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "customerTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "damageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endorseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "endorseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EndorseInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EndorseInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "engageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EngageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EngageInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredCom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "insuredCom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "insuredName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "itemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ItemInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ItemInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "licenseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "policyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "policyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipFlagName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "vipFlagName"));
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
