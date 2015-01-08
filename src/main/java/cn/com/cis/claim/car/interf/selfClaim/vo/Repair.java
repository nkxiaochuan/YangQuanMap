/**
 * Repair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class Repair  implements java.io.Serializable {
    private java.lang.String comPname;

    private java.lang.Double manHour;

    private java.lang.String repairTypeName;

    private java.lang.Double sumRepairFee;

    private java.lang.Double unitManHourPrice;

    public Repair() {
    }

    public Repair(
           java.lang.String comPname,
           java.lang.Double manHour,
           java.lang.String repairTypeName,
           java.lang.Double sumRepairFee,
           java.lang.Double unitManHourPrice) {
           this.comPname = comPname;
           this.manHour = manHour;
           this.repairTypeName = repairTypeName;
           this.sumRepairFee = sumRepairFee;
           this.unitManHourPrice = unitManHourPrice;
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
     * Gets the manHour value for this Repair.
     * 
     * @return manHour
     */
    public java.lang.Double getManHour() {
        return manHour;
    }


    /**
     * Sets the manHour value for this Repair.
     * 
     * @param manHour
     */
    public void setManHour(java.lang.Double manHour) {
        this.manHour = manHour;
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
     * Gets the sumRepairFee value for this Repair.
     * 
     * @return sumRepairFee
     */
    public java.lang.Double getSumRepairFee() {
        return sumRepairFee;
    }


    /**
     * Sets the sumRepairFee value for this Repair.
     * 
     * @param sumRepairFee
     */
    public void setSumRepairFee(java.lang.Double sumRepairFee) {
        this.sumRepairFee = sumRepairFee;
    }


    /**
     * Gets the unitManHourPrice value for this Repair.
     * 
     * @return unitManHourPrice
     */
    public java.lang.Double getUnitManHourPrice() {
        return unitManHourPrice;
    }


    /**
     * Sets the unitManHourPrice value for this Repair.
     * 
     * @param unitManHourPrice
     */
    public void setUnitManHourPrice(java.lang.Double unitManHourPrice) {
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
            ((this.comPname==null && other.getComPname()==null) || 
             (this.comPname!=null &&
              this.comPname.equals(other.getComPname()))) &&
            ((this.manHour==null && other.getManHour()==null) || 
             (this.manHour!=null &&
              this.manHour.equals(other.getManHour()))) &&
            ((this.repairTypeName==null && other.getRepairTypeName()==null) || 
             (this.repairTypeName!=null &&
              this.repairTypeName.equals(other.getRepairTypeName()))) &&
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
        if (getComPname() != null) {
            _hashCode += getComPname().hashCode();
        }
        if (getManHour() != null) {
            _hashCode += getManHour().hashCode();
        }
        if (getRepairTypeName() != null) {
            _hashCode += getRepairTypeName().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Repair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comPname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "comPname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manHour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "manHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "repairTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumRepairFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "sumRepairFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitManHourPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "unitManHourPrice"));
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
