/**
 * Material.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class Material  implements java.io.Serializable {
    private java.lang.Integer count;

    private java.lang.String materialName;

    private java.lang.Double sumMaterialFee;

    private java.lang.Double unitPric;

    public Material() {
    }

    public Material(
           java.lang.Integer count,
           java.lang.String materialName,
           java.lang.Double sumMaterialFee,
           java.lang.Double unitPric) {
           this.count = count;
           this.materialName = materialName;
           this.sumMaterialFee = sumMaterialFee;
           this.unitPric = unitPric;
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
     * Gets the sumMaterialFee value for this Material.
     * 
     * @return sumMaterialFee
     */
    public java.lang.Double getSumMaterialFee() {
        return sumMaterialFee;
    }


    /**
     * Sets the sumMaterialFee value for this Material.
     * 
     * @param sumMaterialFee
     */
    public void setSumMaterialFee(java.lang.Double sumMaterialFee) {
        this.sumMaterialFee = sumMaterialFee;
    }


    /**
     * Gets the unitPric value for this Material.
     * 
     * @return unitPric
     */
    public java.lang.Double getUnitPric() {
        return unitPric;
    }


    /**
     * Sets the unitPric value for this Material.
     * 
     * @param unitPric
     */
    public void setUnitPric(java.lang.Double unitPric) {
        this.unitPric = unitPric;
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
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.materialName==null && other.getMaterialName()==null) || 
             (this.materialName!=null &&
              this.materialName.equals(other.getMaterialName()))) &&
            ((this.sumMaterialFee==null && other.getSumMaterialFee()==null) || 
             (this.sumMaterialFee!=null &&
              this.sumMaterialFee.equals(other.getSumMaterialFee()))) &&
            ((this.unitPric==null && other.getUnitPric()==null) || 
             (this.unitPric!=null &&
              this.unitPric.equals(other.getUnitPric())));
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
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getMaterialName() != null) {
            _hashCode += getMaterialName().hashCode();
        }
        if (getSumMaterialFee() != null) {
            _hashCode += getSumMaterialFee().hashCode();
        }
        if (getUnitPric() != null) {
            _hashCode += getUnitPric().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Material.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Material"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "materialName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumMaterialFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "sumMaterialFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPric");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "unitPric"));
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
