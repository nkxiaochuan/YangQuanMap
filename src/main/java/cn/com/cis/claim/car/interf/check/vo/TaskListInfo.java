/**
 * TaskListInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class TaskListInfo  implements java.io.Serializable {
    private java.lang.String insuredName;

    private java.lang.String licenseNo;

    private java.lang.String linkerName;

    private java.lang.String linkerPhoneNumber;

    private java.lang.Integer pageNum;

    private java.lang.Integer pageSize;

    private java.lang.String policyNo;

    private java.lang.String registNo;

    private java.lang.String taskType;

    private java.lang.String userCode;

    public TaskListInfo() {
    }

    public TaskListInfo(
           java.lang.String insuredName,
           java.lang.String licenseNo,
           java.lang.String linkerName,
           java.lang.String linkerPhoneNumber,
           java.lang.Integer pageNum,
           java.lang.Integer pageSize,
           java.lang.String policyNo,
           java.lang.String registNo,
           java.lang.String taskType,
           java.lang.String userCode) {
           this.insuredName = insuredName;
           this.licenseNo = licenseNo;
           this.linkerName = linkerName;
           this.linkerPhoneNumber = linkerPhoneNumber;
           this.pageNum = pageNum;
           this.pageSize = pageSize;
           this.policyNo = policyNo;
           this.registNo = registNo;
           this.taskType = taskType;
           this.userCode = userCode;
    }


    /**
     * Gets the insuredName value for this TaskListInfo.
     * 
     * @return insuredName
     */
    public java.lang.String getInsuredName() {
        return insuredName;
    }


    /**
     * Sets the insuredName value for this TaskListInfo.
     * 
     * @param insuredName
     */
    public void setInsuredName(java.lang.String insuredName) {
        this.insuredName = insuredName;
    }


    /**
     * Gets the licenseNo value for this TaskListInfo.
     * 
     * @return licenseNo
     */
    public java.lang.String getLicenseNo() {
        return licenseNo;
    }


    /**
     * Sets the licenseNo value for this TaskListInfo.
     * 
     * @param licenseNo
     */
    public void setLicenseNo(java.lang.String licenseNo) {
        this.licenseNo = licenseNo;
    }


    /**
     * Gets the linkerName value for this TaskListInfo.
     * 
     * @return linkerName
     */
    public java.lang.String getLinkerName() {
        return linkerName;
    }


    /**
     * Sets the linkerName value for this TaskListInfo.
     * 
     * @param linkerName
     */
    public void setLinkerName(java.lang.String linkerName) {
        this.linkerName = linkerName;
    }


    /**
     * Gets the linkerPhoneNumber value for this TaskListInfo.
     * 
     * @return linkerPhoneNumber
     */
    public java.lang.String getLinkerPhoneNumber() {
        return linkerPhoneNumber;
    }


    /**
     * Sets the linkerPhoneNumber value for this TaskListInfo.
     * 
     * @param linkerPhoneNumber
     */
    public void setLinkerPhoneNumber(java.lang.String linkerPhoneNumber) {
        this.linkerPhoneNumber = linkerPhoneNumber;
    }


    /**
     * Gets the pageNum value for this TaskListInfo.
     * 
     * @return pageNum
     */
    public java.lang.Integer getPageNum() {
        return pageNum;
    }


    /**
     * Sets the pageNum value for this TaskListInfo.
     * 
     * @param pageNum
     */
    public void setPageNum(java.lang.Integer pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * Gets the pageSize value for this TaskListInfo.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this TaskListInfo.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the policyNo value for this TaskListInfo.
     * 
     * @return policyNo
     */
    public java.lang.String getPolicyNo() {
        return policyNo;
    }


    /**
     * Sets the policyNo value for this TaskListInfo.
     * 
     * @param policyNo
     */
    public void setPolicyNo(java.lang.String policyNo) {
        this.policyNo = policyNo;
    }


    /**
     * Gets the registNo value for this TaskListInfo.
     * 
     * @return registNo
     */
    public java.lang.String getRegistNo() {
        return registNo;
    }


    /**
     * Sets the registNo value for this TaskListInfo.
     * 
     * @param registNo
     */
    public void setRegistNo(java.lang.String registNo) {
        this.registNo = registNo;
    }


    /**
     * Gets the taskType value for this TaskListInfo.
     * 
     * @return taskType
     */
    public java.lang.String getTaskType() {
        return taskType;
    }


    /**
     * Sets the taskType value for this TaskListInfo.
     * 
     * @param taskType
     */
    public void setTaskType(java.lang.String taskType) {
        this.taskType = taskType;
    }


    /**
     * Gets the userCode value for this TaskListInfo.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this TaskListInfo.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskListInfo)) return false;
        TaskListInfo other = (TaskListInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insuredName==null && other.getInsuredName()==null) || 
             (this.insuredName!=null &&
              this.insuredName.equals(other.getInsuredName()))) &&
            ((this.licenseNo==null && other.getLicenseNo()==null) || 
             (this.licenseNo!=null &&
              this.licenseNo.equals(other.getLicenseNo()))) &&
            ((this.linkerName==null && other.getLinkerName()==null) || 
             (this.linkerName!=null &&
              this.linkerName.equals(other.getLinkerName()))) &&
            ((this.linkerPhoneNumber==null && other.getLinkerPhoneNumber()==null) || 
             (this.linkerPhoneNumber!=null &&
              this.linkerPhoneNumber.equals(other.getLinkerPhoneNumber()))) &&
            ((this.pageNum==null && other.getPageNum()==null) || 
             (this.pageNum!=null &&
              this.pageNum.equals(other.getPageNum()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.policyNo==null && other.getPolicyNo()==null) || 
             (this.policyNo!=null &&
              this.policyNo.equals(other.getPolicyNo()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo()))) &&
            ((this.taskType==null && other.getTaskType()==null) || 
             (this.taskType!=null &&
              this.taskType.equals(other.getTaskType()))) &&
            ((this.userCode==null && other.getUserCode()==null) || 
             (this.userCode!=null &&
              this.userCode.equals(other.getUserCode())));
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
        if (getInsuredName() != null) {
            _hashCode += getInsuredName().hashCode();
        }
        if (getLicenseNo() != null) {
            _hashCode += getLicenseNo().hashCode();
        }
        if (getLinkerName() != null) {
            _hashCode += getLinkerName().hashCode();
        }
        if (getLinkerPhoneNumber() != null) {
            _hashCode += getLinkerPhoneNumber().hashCode();
        }
        if (getPageNum() != null) {
            _hashCode += getPageNum().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getPolicyNo() != null) {
            _hashCode += getPolicyNo().hashCode();
        }
        if (getRegistNo() != null) {
            _hashCode += getRegistNo().hashCode();
        }
        if (getTaskType() != null) {
            _hashCode += getTaskType().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskListInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskListInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "insuredName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "licenseNo"));
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
        elemField.setFieldName("pageNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "pageNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "policyNo"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "taskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "userCode"));
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
