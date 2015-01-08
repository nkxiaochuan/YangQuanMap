/**
 * Repair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class Repair  implements java.io.Serializable {
    private java.lang.String comPcode;

    private java.lang.String comPname;

    private java.lang.String compLevelCode;

    private java.lang.String compLevelName;

    private java.lang.String kindCode;

    private java.lang.String kindName;

    private java.math.BigDecimal manHour;

    private java.lang.String remark;

    private java.lang.String repairId;

    private java.lang.String repairTypeCode;

    private java.lang.String repairTypeName;

    private java.lang.String selfConfigFlag;

    private java.lang.Integer serialNo;

    private java.math.BigDecimal sumRepairFee;

    private java.math.BigDecimal unitManHourPrice;

    public Repair() {
    }

    public Repair(
           java.lang.String comPcode,
           java.lang.String comPname,
           java.lang.String compLevelCode,
           java.lang.String compLevelName,
           java.lang.String kindCode,
           java.lang.String kindName,
           java.math.BigDecimal manHour,
           java.lang.String remark,
           java.lang.String repairId,
           java.lang.String repairTypeCode,
           java.lang.String repairTypeName,
           java.lang.String selfConfigFlag,
           java.lang.Integer serialNo,
           java.math.BigDecimal sumRepairFee,
           java.math.BigDecimal unitManHourPrice) {
           this.comPcode = comPcode;
           this.comPname = comPname;
           this.compLevelCode = compLevelCode;
           this.compLevelName = compLevelName;
           this.kindCode = kindCode;
           this.kindName = kindName;
           this.manHour = manHour;
           this.remark = remark;
           this.repairId = repairId;
           this.repairTypeCode = repairTypeCode;
           this.repairTypeName = repairTypeName;
           this.selfConfigFlag = selfConfigFlag;
           this.serialNo = serialNo;
           this.sumRepairFee = sumRepairFee;
           this.unitManHourPrice = unitManHourPrice;
    }


    /**
     * Gets the comPcode value for this Repair.
     * 
     * @return comPcode
     */
    public java.lang.String getComPcode() {
        return comPcode;
    }


    /**
     * Sets the comPcode value for this Repair.
     * 
     * @param comPcode
     */
    public void setComPcode(java.lang.String comPcode) {
        this.comPcode = comPcode;
    }


    /**
     * Gets the comPname value for this Repair.
     * 
     * @return comPname
     */
    public java.lang.String getComPname() {
        return comPname;
    }


    /**
     * Sets the comPname value for this Repair.
     * 
     * @param comPname
     */
    public void setComPname(java.lang.String comPname) {
        this.comPname = comPname;
    }


    /**
     * Gets the compLevelCode value for this Repair.
     * 
     * @return compLevelCode
     */
    public java.lang.String getCompLevelCode() {
        return compLevelCode;
    }


    /**
     * Sets the compLevelCode value for this Repair.
     * 
     * @param compLevelCode
     */
    public void setCompLevelCode(java.lang.String compLevelCode) {
        this.compLevelCode = compLevelCode;
    }


    /**
     * Gets the compLevelName value for this Repair.
     * 
     * @return compLevelName
     */
    public java.lang.String getCompLevelName() {
        return compLevelName;
    }


    /**
     * Sets the compLevelName value for this Repair.
     * 
     * @param compLevelName
     */
    public void setCompLevelName(java.lang.String compLevelName) {
        this.compLevelName = compLevelName;
    }


    /**
     * Gets the kindCode value for this Repair.
     * 
     * @return kindCode
     */
    public java.lang.String getKindCode() {
        return kindCode;
    }


    /**
     * Sets the kindCode value for this Repair.
     * 
     * @param kindCode
     */
    public void setKindCode(java.lang.String kindCode) {
        this.kindCode = kindCode;
    }


    /**
     * Gets the kindName value for this Repair.
     * 
     * @return kindName
     */
    public java.lang.String getKindName() {
        return kindName;
    }


    /**
     * Sets the kindName value for this Repair.
     * 
     * @param kindName
     */
    public void setKindName(java.lang.String kindName) {
        this.kindName = kindName;
    }


    /**
     * Gets the manHour value for this Repair.
     * 
     * @return manHour
     */
    public java.math.BigDecimal getManHour() {
        return manHour;
    }


    /**
     * Sets the manHour value for this Repair.
     * 
     * @param manHour
     */
    public void setManHour(java.math.BigDecimal manHour) {
        this.manHour = manHour;
    }


    /**
     * Gets the remark value for this Repair.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this Repair.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the repairId value for this Repair.
     * 
     * @return repairId
     */
    public java.lang.String getRepairId() {
        return repairId;
    }


    /**
     * Sets the repairId value for this Repair.
     * 
     * @param repairId
     */
    public void setRepairId(java.lang.String repairId) {
        this.repairId = repairId;
    }


    /**
     * Gets the repairTypeCode value for this Repair.
     * 
     * @return repairTypeCode
     */
    public java.lang.String getRepairTypeCode() {
        return repairTypeCode;
    }


    /**
     * Sets the repairTypeCode value for this Repair.
     * 
     * @param repairTypeCode
     */
    public void setRepairTypeCode(java.lang.String repairTypeCode) {
        this.repairTypeCode = repairTypeCode;
    }


    /**
     * Gets the repairTypeName value for this Repair.
     * 
     * @return repairTypeName
     */
    public java.lang.String getRepairTypeName() {
        return repairTypeName;
    }


    /**
     * Sets the repairTypeName value for this Repair.
     * 
     * @param repairTypeName
     */
    public void setRepairTypeName(java.lang.String repairTypeName) {
        this.repairTypeName = repairTypeName;
    }


    /**
     * Gets the selfConfigFlag value for this Repair.
     * 
     * @return selfConfigFlag
     */
    public java.lang.String getSelfConfigFlag() {
        return selfConfigFlag;
    }


    /**
     * Sets the selfConfigFlag value for this Repair.
     * 
     * @param selfConfigFlag
     */
    public void setSelfConfigFlag(java.lang.String selfConfigFlag) {
        this.selfConfigFlag = selfConfigFlag;
    }


    /**
     * Gets the serialNo value for this Repair.
     * 
     * @return serialNo
     */
    public java.lang.Integer getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this Repair.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.Integer serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the sumRepairFee value for this Repair.
     * 
     * @return sumRepairFee
     */
    public java.math.BigDecimal getSumRepairFee() {
        return sumRepairFee;
    }


    /**
     * Sets the sumRepairFee value for this Repair.
     * 
     * @param sumRepairFee
     */
    public void setSumRepairFee(java.math.BigDecimal sumRepairFee) {
        this.sumRepairFee = sumRepairFee;
    }


    /**
     * Gets the unitManHourPrice value for this Repair.
     * 
     * @return unitManHourPrice
     */
    public java.math.BigDecimal getUnitManHourPrice() {
        return unitManHourPrice;
    }


    /**
     * Sets the unitManHourPrice value for this Repair.
     * 
     * @param unitManHourPrice
     */
    public void setUnitManHourPrice(java.math.BigDecimal unitManHourPrice) {
        this.unitManHourPrice = unitManHourPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Repair)) return false;
        Repair other = (Repair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comPcode==null && other.getComPcode()==null) || 
             (this.comPcode!=null &&
              this.comPcode.equals(other.getComPcode()))) &&
            ((this.comPname==null && other.getComPname()==null) || 
             (this.comPname!=null &&
              this.comPname.equals(other.getComPname()))) &&
            ((this.compLevelCode==null && other.getCompLevelCode()==null) || 
             (this.compLevelCode!=null &&
              this.compLevelCode.equals(other.getCompLevelCode()))) &&
            ((this.compLevelName==null && other.getCompLevelName()==null) || 
             (this.compLevelName!=null &&
              this.compLevelName.equals(other.getCompLevelName()))) &&
            ((this.kindCode==null && other.getKindCode()==null) || 
             (this.kindCode!=null &&
              this.kindCode.equals(other.getKindCode()))) &&
            ((this.kindName==null && other.getKindName()==null) || 
             (this.kindName!=null &&
              this.kindName.equals(other.getKindName()))) &&
            ((this.manHour==null && other.getManHour()==null) || 
             (this.manHour!=null &&
              this.manHour.equals(other.getManHour()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.repairId==null && other.getRepairId()==null) || 
             (this.repairId!=null &&
              this.repairId.equals(other.getRepairId()))) &&
            ((this.repairTypeCode==null && other.getRepairTypeCode()==null) || 
             (this.repairTypeCode!=null &&
              this.repairTypeCode.equals(other.getRepairTypeCode()))) &&
            ((this.repairTypeName==null && other.getRepairTypeName()==null) || 
             (this.repairTypeName!=null &&
              this.repairTypeName.equals(other.getRepairTypeName()))) &&
            ((this.selfConfigFlag==null && other.getSelfConfigFlag()==null) || 
             (this.selfConfigFlag!=null &&
              this.selfConfigFlag.equals(other.getSelfConfigFlag()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.sumRepairFee==null && other.getSumRepairFee()==null) || 
             (this.sumRepairFee!=null &&
              this.sumRepairFee.equals(other.getSumRepairFee()))) &&
            ((this.unitManHourPrice==null && other.getUnitManHourPrice()==null) || 
             (this.unitManHourPrice!=null &&
              this.unitManHourPrice.equals(other.getUnitManHourPrice())));
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
        if (getComPcode() != null) {
            _hashCode += getComPcode().hashCode();
        }
        if (getComPname() != null) {
            _hashCode += getComPname().hashCode();
        }
        if (getCompLevelCode() != null) {
            _hashCode += getCompLevelCode().hashCode();
        }
        if (getCompLevelName() != null) {
            _hashCode += getCompLevelName().hashCode();
        }
        if (getKindCode() != null) {
            _hashCode += getKindCode().hashCode();
        }
        if (getKindName() != null) {
            _hashCode += getKindName().hashCode();
        }
        if (getManHour() != null) {
            _hashCode += getManHour().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getRepairId() != null) {
            _hashCode += getRepairId().hashCode();
        }
        if (getRepairTypeCode() != null) {
            _hashCode += getRepairTypeCode().hashCode();
        }
        if (getRepairTypeName() != null) {
            _hashCode += getRepairTypeName().hashCode();
        }
        if (getSelfConfigFlag() != null) {
            _hashCode += getSelfConfigFlag().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getSumRepairFee() != null) {
            _hashCode += getSumRepairFee().hashCode();
        }
        if (getUnitManHourPrice() != null) {
            _hashCode += getUnitManHourPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Repair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Repair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comPcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "comPcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comPname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "comPname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compLevelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "compLevelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compLevelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "compLevelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("manHour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "manHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("repairId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "repairId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "repairTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "repairTypeName"));
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
        elemField.setFieldName("sumRepairFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumRepairFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitManHourPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "unitManHourPrice"));
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
