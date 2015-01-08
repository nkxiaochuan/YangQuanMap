/**
 * OtherFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class OtherFee  implements java.io.Serializable {
    private java.math.BigDecimal deLossPrice;

    private java.lang.String kindCode;

    private java.lang.String kindName;

    private java.lang.String otherFeeId;

    private java.lang.String otherFeeName;

    private java.lang.String remark;

    private java.lang.Integer serialNo;

    public OtherFee() {
    }

    public OtherFee(
           java.math.BigDecimal deLossPrice,
           java.lang.String kindCode,
           java.lang.String kindName,
           java.lang.String otherFeeId,
           java.lang.String otherFeeName,
           java.lang.String remark,
           java.lang.Integer serialNo) {
           this.deLossPrice = deLossPrice;
           this.kindCode = kindCode;
           this.kindName = kindName;
           this.otherFeeId = otherFeeId;
           this.otherFeeName = otherFeeName;
           this.remark = remark;
           this.serialNo = serialNo;
    }


    /**
     * Gets the deLossPrice value for this OtherFee.
     * 
     * @return deLossPrice
     */
    public java.math.BigDecimal getDeLossPrice() {
        return deLossPrice;
    }


    /**
     * Sets the deLossPrice value for this OtherFee.
     * 
     * @param deLossPrice
     */
    public void setDeLossPrice(java.math.BigDecimal deLossPrice) {
        this.deLossPrice = deLossPrice;
    }


    /**
     * Gets the kindCode value for this OtherFee.
     * 
     * @return kindCode
     */
    public java.lang.String getKindCode() {
        return kindCode;
    }


    /**
     * Sets the kindCode value for this OtherFee.
     * 
     * @param kindCode
     */
    public void setKindCode(java.lang.String kindCode) {
        this.kindCode = kindCode;
    }


    /**
     * Gets the kindName value for this OtherFee.
     * 
     * @return kindName
     */
    public java.lang.String getKindName() {
        return kindName;
    }


    /**
     * Sets the kindName value for this OtherFee.
     * 
     * @param kindName
     */
    public void setKindName(java.lang.String kindName) {
        this.kindName = kindName;
    }


    /**
     * Gets the otherFeeId value for this OtherFee.
     * 
     * @return otherFeeId
     */
    public java.lang.String getOtherFeeId() {
        return otherFeeId;
    }


    /**
     * Sets the otherFeeId value for this OtherFee.
     * 
     * @param otherFeeId
     */
    public void setOtherFeeId(java.lang.String otherFeeId) {
        this.otherFeeId = otherFeeId;
    }


    /**
     * Gets the otherFeeName value for this OtherFee.
     * 
     * @return otherFeeName
     */
    public java.lang.String getOtherFeeName() {
        return otherFeeName;
    }


    /**
     * Sets the otherFeeName value for this OtherFee.
     * 
     * @param otherFeeName
     */
    public void setOtherFeeName(java.lang.String otherFeeName) {
        this.otherFeeName = otherFeeName;
    }


    /**
     * Gets the remark value for this OtherFee.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this OtherFee.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the serialNo value for this OtherFee.
     * 
     * @return serialNo
     */
    public java.lang.Integer getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this OtherFee.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.Integer serialNo) {
        this.serialNo = serialNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherFee)) return false;
        OtherFee other = (OtherFee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deLossPrice==null && other.getDeLossPrice()==null) || 
             (this.deLossPrice!=null &&
              this.deLossPrice.equals(other.getDeLossPrice()))) &&
            ((this.kindCode==null && other.getKindCode()==null) || 
             (this.kindCode!=null &&
              this.kindCode.equals(other.getKindCode()))) &&
            ((this.kindName==null && other.getKindName()==null) || 
             (this.kindName!=null &&
              this.kindName.equals(other.getKindName()))) &&
            ((this.otherFeeId==null && other.getOtherFeeId()==null) || 
             (this.otherFeeId!=null &&
              this.otherFeeId.equals(other.getOtherFeeId()))) &&
            ((this.otherFeeName==null && other.getOtherFeeName()==null) || 
             (this.otherFeeName!=null &&
              this.otherFeeName.equals(other.getOtherFeeName()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo())));
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
        if (getDeLossPrice() != null) {
            _hashCode += getDeLossPrice().hashCode();
        }
        if (getKindCode() != null) {
            _hashCode += getKindCode().hashCode();
        }
        if (getKindName() != null) {
            _hashCode += getKindName().hashCode();
        }
        if (getOtherFeeId() != null) {
            _hashCode += getOtherFeeId().hashCode();
        }
        if (getOtherFeeName() != null) {
            _hashCode += getOtherFeeName().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "OtherFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deLossPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "deLossPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("otherFeeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "otherFeeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherFeeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "otherFeeName"));
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
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
