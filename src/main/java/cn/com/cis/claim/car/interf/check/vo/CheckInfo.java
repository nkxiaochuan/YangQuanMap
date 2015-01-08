/**
 * CheckInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class CheckInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.CarInfo[] carInfoList;

    private java.lang.String caseType;

    private java.lang.String checkConText;

    private java.lang.String checkSite;

    private cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList;

    private java.lang.String haveBook;

    private java.lang.String inputDate;

    private java.lang.String insureAccident;

    private java.lang.String replaceRepay;

    private java.lang.Long taskId;

    public CheckInfo() {
    }

    public CheckInfo(
           cn.com.cis.claim.car.interf.check.vo.CarInfo[] carInfoList,
           java.lang.String caseType,
           java.lang.String checkConText,
           java.lang.String checkSite,
           cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList,
           java.lang.String haveBook,
           java.lang.String inputDate,
           java.lang.String insureAccident,
           java.lang.String replaceRepay,
           java.lang.Long taskId) {
           this.carInfoList = carInfoList;
           this.caseType = caseType;
           this.checkConText = checkConText;
           this.checkSite = checkSite;
           this.fileInfoList = fileInfoList;
           this.haveBook = haveBook;
           this.inputDate = inputDate;
           this.insureAccident = insureAccident;
           this.replaceRepay = replaceRepay;
           this.taskId = taskId;
    }


    /**
     * Gets the carInfoList value for this CheckInfo.
     * 
     * @return carInfoList
     */
    public cn.com.cis.claim.car.interf.check.vo.CarInfo[] getCarInfoList() {
        return carInfoList;
    }


    /**
     * Sets the carInfoList value for this CheckInfo.
     * 
     * @param carInfoList
     */
    public void setCarInfoList(cn.com.cis.claim.car.interf.check.vo.CarInfo[] carInfoList) {
        this.carInfoList = carInfoList;
    }


    /**
     * Gets the caseType value for this CheckInfo.
     * 
     * @return caseType
     */
    public java.lang.String getCaseType() {
        return caseType;
    }


    /**
     * Sets the caseType value for this CheckInfo.
     * 
     * @param caseType
     */
    public void setCaseType(java.lang.String caseType) {
        this.caseType = caseType;
    }


    /**
     * Gets the checkConText value for this CheckInfo.
     * 
     * @return checkConText
     */
    public java.lang.String getCheckConText() {
        return checkConText;
    }


    /**
     * Sets the checkConText value for this CheckInfo.
     * 
     * @param checkConText
     */
    public void setCheckConText(java.lang.String checkConText) {
        this.checkConText = checkConText;
    }


    /**
     * Gets the checkSite value for this CheckInfo.
     * 
     * @return checkSite
     */
    public java.lang.String getCheckSite() {
        return checkSite;
    }


    /**
     * Sets the checkSite value for this CheckInfo.
     * 
     * @param checkSite
     */
    public void setCheckSite(java.lang.String checkSite) {
        this.checkSite = checkSite;
    }


    /**
     * Gets the fileInfoList value for this CheckInfo.
     * 
     * @return fileInfoList
     */
    public cn.com.cis.claim.car.interf.check.vo.FileInfo[] getFileInfoList() {
        return fileInfoList;
    }


    /**
     * Sets the fileInfoList value for this CheckInfo.
     * 
     * @param fileInfoList
     */
    public void setFileInfoList(cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList) {
        this.fileInfoList = fileInfoList;
    }


    /**
     * Gets the haveBook value for this CheckInfo.
     * 
     * @return haveBook
     */
    public java.lang.String getHaveBook() {
        return haveBook;
    }


    /**
     * Sets the haveBook value for this CheckInfo.
     * 
     * @param haveBook
     */
    public void setHaveBook(java.lang.String haveBook) {
        this.haveBook = haveBook;
    }


    /**
     * Gets the inputDate value for this CheckInfo.
     * 
     * @return inputDate
     */
    public java.lang.String getInputDate() {
        return inputDate;
    }


    /**
     * Sets the inputDate value for this CheckInfo.
     * 
     * @param inputDate
     */
    public void setInputDate(java.lang.String inputDate) {
        this.inputDate = inputDate;
    }


    /**
     * Gets the insureAccident value for this CheckInfo.
     * 
     * @return insureAccident
     */
    public java.lang.String getInsureAccident() {
        return insureAccident;
    }


    /**
     * Sets the insureAccident value for this CheckInfo.
     * 
     * @param insureAccident
     */
    public void setInsureAccident(java.lang.String insureAccident) {
        this.insureAccident = insureAccident;
    }


    /**
     * Gets the replaceRepay value for this CheckInfo.
     * 
     * @return replaceRepay
     */
    public java.lang.String getReplaceRepay() {
        return replaceRepay;
    }


    /**
     * Sets the replaceRepay value for this CheckInfo.
     * 
     * @param replaceRepay
     */
    public void setReplaceRepay(java.lang.String replaceRepay) {
        this.replaceRepay = replaceRepay;
    }


    /**
     * Gets the taskId value for this CheckInfo.
     * 
     * @return taskId
     */
    public java.lang.Long getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this CheckInfo.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.Long taskId) {
        this.taskId = taskId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckInfo)) return false;
        CheckInfo other = (CheckInfo) obj;
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
            ((this.caseType==null && other.getCaseType()==null) || 
             (this.caseType!=null &&
              this.caseType.equals(other.getCaseType()))) &&
            ((this.checkConText==null && other.getCheckConText()==null) || 
             (this.checkConText!=null &&
              this.checkConText.equals(other.getCheckConText()))) &&
            ((this.checkSite==null && other.getCheckSite()==null) || 
             (this.checkSite!=null &&
              this.checkSite.equals(other.getCheckSite()))) &&
            ((this.fileInfoList==null && other.getFileInfoList()==null) || 
             (this.fileInfoList!=null &&
              java.util.Arrays.equals(this.fileInfoList, other.getFileInfoList()))) &&
            ((this.haveBook==null && other.getHaveBook()==null) || 
             (this.haveBook!=null &&
              this.haveBook.equals(other.getHaveBook()))) &&
            ((this.inputDate==null && other.getInputDate()==null) || 
             (this.inputDate!=null &&
              this.inputDate.equals(other.getInputDate()))) &&
            ((this.insureAccident==null && other.getInsureAccident()==null) || 
             (this.insureAccident!=null &&
              this.insureAccident.equals(other.getInsureAccident()))) &&
            ((this.replaceRepay==null && other.getReplaceRepay()==null) || 
             (this.replaceRepay!=null &&
              this.replaceRepay.equals(other.getReplaceRepay()))) &&
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
        if (getCaseType() != null) {
            _hashCode += getCaseType().hashCode();
        }
        if (getCheckConText() != null) {
            _hashCode += getCheckConText().hashCode();
        }
        if (getCheckSite() != null) {
            _hashCode += getCheckSite().hashCode();
        }
        if (getFileInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHaveBook() != null) {
            _hashCode += getHaveBook().hashCode();
        }
        if (getInputDate() != null) {
            _hashCode += getInputDate().hashCode();
        }
        if (getInsureAccident() != null) {
            _hashCode += getInsureAccident().hashCode();
        }
        if (getReplaceRepay() != null) {
            _hashCode += getReplaceRepay().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "carInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CarInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CarInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "caseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkConText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "checkConText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "checkSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "fileInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haveBook");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "haveBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "inputDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insureAccident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "insureAccident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replaceRepay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "replaceRepay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
