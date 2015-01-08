/**
 * Material.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class Material  implements java.io.Serializable {
    private java.lang.String assistId;

    private java.lang.Integer count;

    private java.lang.String kindCode;

    private java.lang.String kindName;

    private java.lang.String materialName;

    private java.lang.String remark;

    private java.lang.String selfConfigFlag;

    private java.lang.Integer serialNo;

    private java.math.BigDecimal sumMaterialFee;

    private java.math.BigDecimal unitPrice;

    public Material() {
    }

    public Material(
           java.lang.String assistId,
           java.lang.Integer count,
           java.lang.String kindCode,
           java.lang.String kindName,
           java.lang.String materialName,
           java.lang.String remark,
           java.lang.String selfConfigFlag,
           java.lang.Integer serialNo,
           java.math.BigDecimal sumMaterialFee,
           java.math.BigDecimal unitPrice) {
           this.assistId = assistId;
           this.count = count;
           this.kindCode = kindCode;
           this.kindName = kindName;
           this.materialName = materialName;
           this.remark = remark;
           this.selfConfigFlag = selfConfigFlag;
           this.serialNo = serialNo;
           this.sumMaterialFee = sumMaterialFee;
           this.unitPrice = unitPrice;
    }


    /**
     * Gets the assistId value for this Material.
     * 
     * @return assistId
     */
    public java.lang.String getAssistId() {
        return assistId;
    }


    /**
     * Sets the assistId value for this Material.
     * 
     * @param assistId
     */
    public void setAssistId(java.lang.String assistId) {
        this.assistId = assistId;
    }


    /**
     * Gets the count value for this Material.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this Material.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the kindCode value for this Material.
     * 
     * @return kindCode
     */
    public java.lang.String getKindCode() {
        return kindCode;
    }


    /**
     * Sets the kindCode value for this Material.
     * 
     * @param kindCode
     */
    public void setKindCode(java.lang.String kindCode) {
        this.kindCode = kindCode;
    }


    /**
     * Gets the kindName value for this Material.
     * 
     * @return kindName
     */
    public java.lang.String getKindName() {
        return kindName;
    }


    /**
     * Sets the kindName value for this Material.
     * 
     * @param kindName
     */
    public void setKindName(java.lang.String kindName) {
        this.kindName = kindName;
    }


    /**
     * Gets the materialName value for this Material.
     * 
     * @return materialName
     */
    public java.lang.String getMaterialName() {
        return materialName;
    }


    /**
     * Sets the materialName value for this Material.
     * 
     * @param materialName
     */
    public void setMaterialName(java.lang.String materialName) {
        this.materialName = materialName;
    }


    /**
     * Gets the remark value for this Material.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this Material.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the selfConfigFlag value for this Material.
     * 
     * @return selfConfigFlag
     */
    public java.lang.String getSelfConfigFlag() {
        return selfConfigFlag;
    }


    /**
     * Sets the selfConfigFlag value for this Material.
     * 
     * @param selfConfigFlag
     */
    public void setSelfConfigFlag(java.lang.String selfConfigFlag) {
        this.selfConfigFlag = selfConfigFlag;
    }


    /**
     * Gets the serialNo value for this Material.
     * 
     * @return serialNo
     */
    public java.lang.Integer getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this Material.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.Integer serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the sumMaterialFee value for this Material.
     * 
     * @return sumMaterialFee
     */
    public java.math.BigDecimal getSumMaterialFee() {
        return sumMaterialFee;
    }


    /**
     * Sets the sumMaterialFee value for this Material.
     * 
     * @param sumMaterialFee
     */
    public void setSumMaterialFee(java.math.BigDecimal sumMaterialFee) {
        this.sumMaterialFee = sumMaterialFee;
    }


    /**
     * Gets the unitPrice value for this Material.
     * 
     * @return unitPrice
     */
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this Material.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Material)) return false;
        Material other = (Material) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assistId==null && other.getAssistId()==null) || 
             (this.assistId!=null &&
              this.assistId.equals(other.getAssistId()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.kindCode==null && other.getKindCode()==null) || 
             (this.kindCode!=null &&
              this.kindCode.equals(other.getKindCode()))) &&
            ((this.kindName==null && other.getKindName()==null) || 
             (this.kindName!=null &&
              this.kindName.equals(other.getKindName()))) &&
            ((this.materialName==null && other.getMaterialName()==null) || 
             (this.materialName!=null &&
              this.materialName.equals(other.getMaterialName()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.selfConfigFlag==null && other.getSelfConfigFlag()==null) || 
             (this.selfConfigFlag!=null &&
              this.selfConfigFlag.equals(other.getSelfConfigFlag()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.sumMaterialFee==null && other.getSumMaterialFee()==null) || 
             (this.sumMaterialFee!=null &&
              this.sumMaterialFee.equals(other.getSumMaterialFee()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice())));
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
        if (getAssistId() != null) {
            _hashCode += getAssistId().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getKindCode() != null) {
            _hashCode += getKindCode().hashCode();
        }
        if (getKindName() != null) {
            _hashCode += getKindName().hashCode();
        }
        if (getMaterialName() != null) {
            _hashCode += getMaterialName().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getSelfConfigFlag() != null) {
            _hashCode += getSelfConfigFlag().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getSumMaterialFee() != null) {
            _hashCode += getSumMaterialFee().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Material.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Material"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assistId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "assistId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "kindCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "kindName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "materialName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfConfigFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "selfConfigFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumMaterialFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumMaterialFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
