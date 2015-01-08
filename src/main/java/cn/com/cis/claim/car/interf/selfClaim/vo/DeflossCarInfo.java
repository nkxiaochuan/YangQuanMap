/**
 * DeflossCarInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class DeflossCarInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.selfClaim.vo.Component[] componentList;

    private cn.com.cis.claim.car.interf.selfClaim.vo.Factory factory;

    private java.lang.String licenseNo;

    private java.lang.String lossItemType;

    private cn.com.cis.claim.car.interf.selfClaim.vo.Material[] materialList;

    private cn.com.cis.claim.car.interf.selfClaim.vo.Others[] othersList;

    private java.lang.String registNo;

    private cn.com.cis.claim.car.interf.selfClaim.vo.Repair[] repairList;

    private java.lang.Double sumComFee;

    private java.lang.Double sumLoss;

    private java.lang.Double sumMaterialFee;

    private java.lang.Double sumRemnant;

    private java.lang.Double sumRepairFee;

    private java.lang.Long taskId;

    public DeflossCarInfo() {
    }

    public DeflossCarInfo(
           cn.com.cis.claim.car.interf.selfClaim.vo.Component[] componentList,
           cn.com.cis.claim.car.interf.selfClaim.vo.Factory factory,
           java.lang.String licenseNo,
           java.lang.String lossItemType,
           cn.com.cis.claim.car.interf.selfClaim.vo.Material[] materialList,
           cn.com.cis.claim.car.interf.selfClaim.vo.Others[] othersList,
           java.lang.String registNo,
           cn.com.cis.claim.car.interf.selfClaim.vo.Repair[] repairList,
           java.lang.Double sumComFee,
           java.lang.Double sumLoss,
           java.lang.Double sumMaterialFee,
           java.lang.Double sumRemnant,
           java.lang.Double sumRepairFee,
           java.lang.Long taskId) {
           this.componentList = componentList;
           this.factory = factory;
           this.licenseNo = licenseNo;
           this.lossItemType = lossItemType;
           this.materialList = materialList;
           this.othersList = othersList;
           this.registNo = registNo;
           this.repairList = repairList;
           this.sumComFee = sumComFee;
           this.sumLoss = sumLoss;
           this.sumMaterialFee = sumMaterialFee;
           this.sumRemnant = sumRemnant;
           this.sumRepairFee = sumRepairFee;
           this.taskId = taskId;
    }


    /**
     * Gets the componentList value for this DeflossCarInfo.
     * 
     * @return componentList
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.Component[] getComponentList() {
        return componentList;
    }


    /**
     * Sets the componentList value for this DeflossCarInfo.
     * 
     * @param componentList
     */
    public void setComponentList(cn.com.cis.claim.car.interf.selfClaim.vo.Component[] componentList) {
        this.componentList = componentList;
    }


    /**
     * Gets the factory value for this DeflossCarInfo.
     * 
     * @return factory
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.Factory getFactory() {
        return factory;
    }


    /**
     * Sets the factory value for this DeflossCarInfo.
     * 
     * @param factory
     */
    public void setFactory(cn.com.cis.claim.car.interf.selfClaim.vo.Factory factory) {
        this.factory = factory;
    }


    /**
     * Gets the licenseNo value for this DeflossCarInfo.
     * 
     * @return licenseNo
     */
    public java.lang.String getLicenseNo() {
        return licenseNo;
    }


    /**
     * Sets the licenseNo value for this DeflossCarInfo.
     * 
     * @param licenseNo
     */
    public void setLicenseNo(java.lang.String licenseNo) {
        this.licenseNo = licenseNo;
    }


    /**
     * Gets the lossItemType value for this DeflossCarInfo.
     * 
     * @return lossItemType
     */
    public java.lang.String getLossItemType() {
        return lossItemType;
    }


    /**
     * Sets the lossItemType value for this DeflossCarInfo.
     * 
     * @param lossItemType
     */
    public void setLossItemType(java.lang.String lossItemType) {
        this.lossItemType = lossItemType;
    }


    /**
     * Gets the materialList value for this DeflossCarInfo.
     * 
     * @return materialList
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.Material[] getMaterialList() {
        return materialList;
    }


    /**
     * Sets the materialList value for this DeflossCarInfo.
     * 
     * @param materialList
     */
    public void setMaterialList(cn.com.cis.claim.car.interf.selfClaim.vo.Material[] materialList) {
        this.materialList = materialList;
    }


    /**
     * Gets the othersList value for this DeflossCarInfo.
     * 
     * @return othersList
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.Others[] getOthersList() {
        return othersList;
    }


    /**
     * Sets the othersList value for this DeflossCarInfo.
     * 
     * @param othersList
     */
    public void setOthersList(cn.com.cis.claim.car.interf.selfClaim.vo.Others[] othersList) {
        this.othersList = othersList;
    }


    /**
     * Gets the registNo value for this DeflossCarInfo.
     * 
     * @return registNo
     */
    public java.lang.String getRegistNo() {
        return registNo;
    }


    /**
     * Sets the registNo value for this DeflossCarInfo.
     * 
     * @param registNo
     */
    public void setRegistNo(java.lang.String registNo) {
        this.registNo = registNo;
    }


    /**
     * Gets the repairList value for this DeflossCarInfo.
     * 
     * @return repairList
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.Repair[] getRepairList() {
        return repairList;
    }


    /**
     * Sets the repairList value for this DeflossCarInfo.
     * 
     * @param repairList
     */
    public void setRepairList(cn.com.cis.claim.car.interf.selfClaim.vo.Repair[] repairList) {
        this.repairList = repairList;
    }


    /**
     * Gets the sumComFee value for this DeflossCarInfo.
     * 
     * @return sumComFee
     */
    public java.lang.Double getSumComFee() {
        return sumComFee;
    }


    /**
     * Sets the sumComFee value for this DeflossCarInfo.
     * 
     * @param sumComFee
     */
    public void setSumComFee(java.lang.Double sumComFee) {
        this.sumComFee = sumComFee;
    }


    /**
     * Gets the sumLoss value for this DeflossCarInfo.
     * 
     * @return sumLoss
     */
    public java.lang.Double getSumLoss() {
        return sumLoss;
    }


    /**
     * Sets the sumLoss value for this DeflossCarInfo.
     * 
     * @param sumLoss
     */
    public void setSumLoss(java.lang.Double sumLoss) {
        this.sumLoss = sumLoss;
    }


    /**
     * Gets the sumMaterialFee value for this DeflossCarInfo.
     * 
     * @return sumMaterialFee
     */
    public java.lang.Double getSumMaterialFee() {
        return sumMaterialFee;
    }


    /**
     * Sets the sumMaterialFee value for this DeflossCarInfo.
     * 
     * @param sumMaterialFee
     */
    public void setSumMaterialFee(java.lang.Double sumMaterialFee) {
        this.sumMaterialFee = sumMaterialFee;
    }


    /**
     * Gets the sumRemnant value for this DeflossCarInfo.
     * 
     * @return sumRemnant
     */
    public java.lang.Double getSumRemnant() {
        return sumRemnant;
    }


    /**
     * Sets the sumRemnant value for this DeflossCarInfo.
     * 
     * @param sumRemnant
     */
    public void setSumRemnant(java.lang.Double sumRemnant) {
        this.sumRemnant = sumRemnant;
    }


    /**
     * Gets the sumRepairFee value for this DeflossCarInfo.
     * 
     * @return sumRepairFee
     */
    public java.lang.Double getSumRepairFee() {
        return sumRepairFee;
    }


    /**
     * Sets the sumRepairFee value for this DeflossCarInfo.
     * 
     * @param sumRepairFee
     */
    public void setSumRepairFee(java.lang.Double sumRepairFee) {
        this.sumRepairFee = sumRepairFee;
    }


    /**
     * Gets the taskId value for this DeflossCarInfo.
     * 
     * @return taskId
     */
    public java.lang.Long getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this DeflossCarInfo.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.Long taskId) {
        this.taskId = taskId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeflossCarInfo)) return false;
        DeflossCarInfo other = (DeflossCarInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.componentList==null && other.getComponentList()==null) || 
             (this.componentList!=null &&
              java.util.Arrays.equals(this.componentList, other.getComponentList()))) &&
            ((this.factory==null && other.getFactory()==null) || 
             (this.factory!=null &&
              this.factory.equals(other.getFactory()))) &&
            ((this.licenseNo==null && other.getLicenseNo()==null) || 
             (this.licenseNo!=null &&
              this.licenseNo.equals(other.getLicenseNo()))) &&
            ((this.lossItemType==null && other.getLossItemType()==null) || 
             (this.lossItemType!=null &&
              this.lossItemType.equals(other.getLossItemType()))) &&
            ((this.materialList==null && other.getMaterialList()==null) || 
             (this.materialList!=null &&
              java.util.Arrays.equals(this.materialList, other.getMaterialList()))) &&
            ((this.othersList==null && other.getOthersList()==null) || 
             (this.othersList!=null &&
              java.util.Arrays.equals(this.othersList, other.getOthersList()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo()))) &&
            ((this.repairList==null && other.getRepairList()==null) || 
             (this.repairList!=null &&
              java.util.Arrays.equals(this.repairList, other.getRepairList()))) &&
            ((this.sumComFee==null && other.getSumComFee()==null) || 
             (this.sumComFee!=null &&
              this.sumComFee.equals(other.getSumComFee()))) &&
            ((this.sumLoss==null && other.getSumLoss()==null) || 
             (this.sumLoss!=null &&
              this.sumLoss.equals(other.getSumLoss()))) &&
            ((this.sumMaterialFee==null && other.getSumMaterialFee()==null) || 
             (this.sumMaterialFee!=null &&
              this.sumMaterialFee.equals(other.getSumMaterialFee()))) &&
            ((this.sumRemnant==null && other.getSumRemnant()==null) || 
             (this.sumRemnant!=null &&
              this.sumRemnant.equals(other.getSumRemnant()))) &&
            ((this.sumRepairFee==null && other.getSumRepairFee()==null) || 
             (this.sumRepairFee!=null &&
              this.sumRepairFee.equals(other.getSumRepairFee()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId())));
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
        if (getComponentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFactory() != null) {
            _hashCode += getFactory().hashCode();
        }
        if (getLicenseNo() != null) {
            _hashCode += getLicenseNo().hashCode();
        }
        if (getLossItemType() != null) {
            _hashCode += getLossItemType().hashCode();
        }
        if (getMaterialList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaterialList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaterialList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOthersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOthersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOthersList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegistNo() != null) {
            _hashCode += getRegistNo().hashCode();
        }
        if (getRepairList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepairList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepairList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSumComFee() != null) {
            _hashCode += getSumComFee().hashCode();
        }
        if (getSumLoss() != null) {
            _hashCode += getSumLoss().hashCode();
        }
        if (getSumMaterialFee() != null) {
            _hashCode += getSumMaterialFee().hashCode();
        }
        if (getSumRemnant() != null) {
            _hashCode += getSumRemnant().hashCode();
        }
        if (getSumRepairFee() != null) {
            _hashCode += getSumRepairFee().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeflossCarInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "DeflossCarInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "componentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Component"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Component"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "factory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Factory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "licenseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "lossItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "materialList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Material"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Material"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othersList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "othersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Others"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Others"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "registNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "repairList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Repair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Repair"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumComFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "sumComFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumLoss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "sumLoss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumMaterialFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "sumMaterialFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumRemnant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "sumRemnant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumRepairFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "sumRepairFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
