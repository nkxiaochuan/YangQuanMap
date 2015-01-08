/**
 * TaskReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class TaskReturn  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.CarInfo[] carInfoList;

    private java.lang.String confirmFlag;

    private java.lang.String damageDate;

    private java.lang.String inDate;

    private java.lang.String linkerName;

    private java.lang.String linkerPhoneNumber;

    private cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfoList;

    private java.util.Calendar receiveDate;

    private java.lang.String registNo;

    private java.math.BigDecimal sumLoss;

    private java.lang.String surveyPlace;

    private java.lang.Long taskId;

    private java.lang.String taskType;

    public TaskReturn() {
    }

    public TaskReturn(
           cn.com.cis.claim.car.interf.check.vo.CarInfo[] carInfoList,
           java.lang.String confirmFlag,
           java.lang.String damageDate,
           java.lang.String inDate,
           java.lang.String linkerName,
           java.lang.String linkerPhoneNumber,
           cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfoList,
           java.util.Calendar receiveDate,
           java.lang.String registNo,
           java.math.BigDecimal sumLoss,
           java.lang.String surveyPlace,
           java.lang.Long taskId,
           java.lang.String taskType) {
           this.carInfoList = carInfoList;
           this.confirmFlag = confirmFlag;
           this.damageDate = damageDate;
           this.inDate = inDate;
           this.linkerName = linkerName;
           this.linkerPhoneNumber = linkerPhoneNumber;
           this.policyInfoList = policyInfoList;
           this.receiveDate = receiveDate;
           this.registNo = registNo;
           this.sumLoss = sumLoss;
           this.surveyPlace = surveyPlace;
           this.taskId = taskId;
           this.taskType = taskType;
    }


    /**
     * Gets the carInfoList value for this TaskReturn.
     * 
     * @return carInfoList
     */
    public cn.com.cis.claim.car.interf.check.vo.CarInfo[] getCarInfoList() {
        return carInfoList;
    }


    /**
     * Sets the carInfoList value for this TaskReturn.
     * 
     * @param carInfoList
     */
    public void setCarInfoList(cn.com.cis.claim.car.interf.check.vo.CarInfo[] carInfoList) {
        this.carInfoList = carInfoList;
    }


    /**
     * Gets the confirmFlag value for this TaskReturn.
     * 
     * @return confirmFlag
     */
    public java.lang.String getConfirmFlag() {
        return confirmFlag;
    }


    /**
     * Sets the confirmFlag value for this TaskReturn.
     * 
     * @param confirmFlag
     */
    public void setConfirmFlag(java.lang.String confirmFlag) {
        this.confirmFlag = confirmFlag;
    }


    /**
     * Gets the damageDate value for this TaskReturn.
     * 
     * @return damageDate
     */
    public java.lang.String getDamageDate() {
        return damageDate;
    }


    /**
     * Sets the damageDate value for this TaskReturn.
     * 
     * @param damageDate
     */
    public void setDamageDate(java.lang.String damageDate) {
        this.damageDate = damageDate;
    }


    /**
     * Gets the inDate value for this TaskReturn.
     * 
     * @return inDate
     */
    public java.lang.String getInDate() {
        return inDate;
    }


    /**
     * Sets the inDate value for this TaskReturn.
     * 
     * @param inDate
     */
    public void setInDate(java.lang.String inDate) {
        this.inDate = inDate;
    }


    /**
     * Gets the linkerName value for this TaskReturn.
     * 
     * @return linkerName
     */
    public java.lang.String getLinkerName() {
        return linkerName;
    }


    /**
     * Sets the linkerName value for this TaskReturn.
     * 
     * @param linkerName
     */
    public void setLinkerName(java.lang.String linkerName) {
        this.linkerName = linkerName;
    }


    /**
     * Gets the linkerPhoneNumber value for this TaskReturn.
     * 
     * @return linkerPhoneNumber
     */
    public java.lang.String getLinkerPhoneNumber() {
        return linkerPhoneNumber;
    }


    /**
     * Sets the linkerPhoneNumber value for this TaskReturn.
     * 
     * @param linkerPhoneNumber
     */
    public void setLinkerPhoneNumber(java.lang.String linkerPhoneNumber) {
        this.linkerPhoneNumber = linkerPhoneNumber;
    }


    /**
     * Gets the policyInfoList value for this TaskReturn.
     * 
     * @return policyInfoList
     */
    public cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] getPolicyInfoList() {
        return policyInfoList;
    }


    /**
     * Sets the policyInfoList value for this TaskReturn.
     * 
     * @param policyInfoList
     */
    public void setPolicyInfoList(cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfoList) {
        this.policyInfoList = policyInfoList;
    }


    /**
     * Gets the receiveDate value for this TaskReturn.
     * 
     * @return receiveDate
     */
    public java.util.Calendar getReceiveDate() {
        return receiveDate;
    }


    /**
     * Sets the receiveDate value for this TaskReturn.
     * 
     * @param receiveDate
     */
    public void setReceiveDate(java.util.Calendar receiveDate) {
        this.receiveDate = receiveDate;
    }


    /**
     * Gets the registNo value for this TaskReturn.
     * 
     * @return registNo
     */
    public java.lang.String getRegistNo() {
        return registNo;
    }


    /**
     * Sets the registNo value for this TaskReturn.
     * 
     * @param registNo
     */
    public void setRegistNo(java.lang.String registNo) {
        this.registNo = registNo;
    }


    /**
     * Gets the sumLoss value for this TaskReturn.
     * 
     * @return sumLoss
     */
    public java.math.BigDecimal getSumLoss() {
        return sumLoss;
    }


    /**
     * Sets the sumLoss value for this TaskReturn.
     * 
     * @param sumLoss
     */
    public void setSumLoss(java.math.BigDecimal sumLoss) {
        this.sumLoss = sumLoss;
    }


    /**
     * Gets the surveyPlace value for this TaskReturn.
     * 
     * @return surveyPlace
     */
    public java.lang.String getSurveyPlace() {
        return surveyPlace;
    }


    /**
     * Sets the surveyPlace value for this TaskReturn.
     * 
     * @param surveyPlace
     */
    public void setSurveyPlace(java.lang.String surveyPlace) {
        this.surveyPlace = surveyPlace;
    }


    /**
     * Gets the taskId value for this TaskReturn.
     * 
     * @return taskId
     */
    public java.lang.Long getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this TaskReturn.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.Long taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the taskType value for this TaskReturn.
     * 
     * @return taskType
     */
    public java.lang.String getTaskType() {
        return taskType;
    }


    /**
     * Sets the taskType value for this TaskReturn.
     * 
     * @param taskType
     */
    public void setTaskType(java.lang.String taskType) {
        this.taskType = taskType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskReturn)) return false;
        TaskReturn other = (TaskReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carInfoList==null && other.getCarInfoList()==null) || 
             (this.carInfoList!=null &&
              java.util.Arrays.equals(this.carInfoList, other.getCarInfoList()))) &&
            ((this.confirmFlag==null && other.getConfirmFlag()==null) || 
             (this.confirmFlag!=null &&
              this.confirmFlag.equals(other.getConfirmFlag()))) &&
            ((this.damageDate==null && other.getDamageDate()==null) || 
             (this.damageDate!=null &&
              this.damageDate.equals(other.getDamageDate()))) &&
            ((this.inDate==null && other.getInDate()==null) || 
             (this.inDate!=null &&
              this.inDate.equals(other.getInDate()))) &&
            ((this.linkerName==null && other.getLinkerName()==null) || 
             (this.linkerName!=null &&
              this.linkerName.equals(other.getLinkerName()))) &&
            ((this.linkerPhoneNumber==null && other.getLinkerPhoneNumber()==null) || 
             (this.linkerPhoneNumber!=null &&
              this.linkerPhoneNumber.equals(other.getLinkerPhoneNumber()))) &&
            ((this.policyInfoList==null && other.getPolicyInfoList()==null) || 
             (this.policyInfoList!=null &&
              java.util.Arrays.equals(this.policyInfoList, other.getPolicyInfoList()))) &&
            ((this.receiveDate==null && other.getReceiveDate()==null) || 
             (this.receiveDate!=null &&
              this.receiveDate.equals(other.getReceiveDate()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo()))) &&
            ((this.sumLoss==null && other.getSumLoss()==null) || 
             (this.sumLoss!=null &&
              this.sumLoss.equals(other.getSumLoss()))) &&
            ((this.surveyPlace==null && other.getSurveyPlace()==null) || 
             (this.surveyPlace!=null &&
              this.surveyPlace.equals(other.getSurveyPlace()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.taskType==null && other.getTaskType()==null) || 
             (this.taskType!=null &&
              this.taskType.equals(other.getTaskType())));
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
        if (getCarInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfirmFlag() != null) {
            _hashCode += getConfirmFlag().hashCode();
        }
        if (getDamageDate() != null) {
            _hashCode += getDamageDate().hashCode();
        }
        if (getInDate() != null) {
            _hashCode += getInDate().hashCode();
        }
        if (getLinkerName() != null) {
            _hashCode += getLinkerName().hashCode();
        }
        if (getLinkerPhoneNumber() != null) {
            _hashCode += getLinkerPhoneNumber().hashCode();
        }
        if (getPolicyInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiveDate() != null) {
            _hashCode += getReceiveDate().hashCode();
        }
        if (getRegistNo() != null) {
            _hashCode += getRegistNo().hashCode();
        }
        if (getSumLoss() != null) {
            _hashCode += getSumLoss().hashCode();
        }
        if (getSurveyPlace() != null) {
            _hashCode += getSurveyPlace().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getTaskType() != null) {
            _hashCode += getTaskType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "carInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CarInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CarInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "confirmFlag"));
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
        elemField.setFieldName("inDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "inDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "linkerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkerPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "linkerPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "policyInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "PolicyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "PolicyInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "receiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "registNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumLoss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumLoss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "surveyPlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "taskType"));
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
