/**
 * EvalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class EvalRequest  implements java.io.Serializable {
    private java.lang.String caseNo;

    private java.lang.String comCode;

    private java.lang.String estimateNo;

    private java.lang.String handlerCode;

    private cn.com.cis.claim.car.interf.check.vo.InsuranceItem[] insuranceItem;

    private java.lang.String insureVehicleCode;

    private java.lang.String insureVehicleName;

    private java.lang.String lossNo;

    private java.lang.Double manHour;

    private java.lang.String password;

    private java.lang.String power;

    private java.lang.String requestType;

    private java.lang.String userCode;

    public EvalRequest() {
    }

    public EvalRequest(
           java.lang.String caseNo,
           java.lang.String comCode,
           java.lang.String estimateNo,
           java.lang.String handlerCode,
           cn.com.cis.claim.car.interf.check.vo.InsuranceItem[] insuranceItem,
           java.lang.String insureVehicleCode,
           java.lang.String insureVehicleName,
           java.lang.String lossNo,
           java.lang.Double manHour,
           java.lang.String password,
           java.lang.String power,
           java.lang.String requestType,
           java.lang.String userCode) {
           this.caseNo = caseNo;
           this.comCode = comCode;
           this.estimateNo = estimateNo;
           this.handlerCode = handlerCode;
           this.insuranceItem = insuranceItem;
           this.insureVehicleCode = insureVehicleCode;
           this.insureVehicleName = insureVehicleName;
           this.lossNo = lossNo;
           this.manHour = manHour;
           this.password = password;
           this.power = power;
           this.requestType = requestType;
           this.userCode = userCode;
    }


    /**
     * Gets the caseNo value for this EvalRequest.
     * 
     * @return caseNo
     */
    public java.lang.String getCaseNo() {
        return caseNo;
    }


    /**
     * Sets the caseNo value for this EvalRequest.
     * 
     * @param caseNo
     */
    public void setCaseNo(java.lang.String caseNo) {
        this.caseNo = caseNo;
    }


    /**
     * Gets the comCode value for this EvalRequest.
     * 
     * @return comCode
     */
    public java.lang.String getComCode() {
        return comCode;
    }


    /**
     * Sets the comCode value for this EvalRequest.
     * 
     * @param comCode
     */
    public void setComCode(java.lang.String comCode) {
        this.comCode = comCode;
    }


    /**
     * Gets the estimateNo value for this EvalRequest.
     * 
     * @return estimateNo
     */
    public java.lang.String getEstimateNo() {
        return estimateNo;
    }


    /**
     * Sets the estimateNo value for this EvalRequest.
     * 
     * @param estimateNo
     */
    public void setEstimateNo(java.lang.String estimateNo) {
        this.estimateNo = estimateNo;
    }


    /**
     * Gets the handlerCode value for this EvalRequest.
     * 
     * @return handlerCode
     */
    public java.lang.String getHandlerCode() {
        return handlerCode;
    }


    /**
     * Sets the handlerCode value for this EvalRequest.
     * 
     * @param handlerCode
     */
    public void setHandlerCode(java.lang.String handlerCode) {
        this.handlerCode = handlerCode;
    }


    /**
     * Gets the insuranceItem value for this EvalRequest.
     * 
     * @return insuranceItem
     */
    public cn.com.cis.claim.car.interf.check.vo.InsuranceItem[] getInsuranceItem() {
        return insuranceItem;
    }


    /**
     * Sets the insuranceItem value for this EvalRequest.
     * 
     * @param insuranceItem
     */
    public void setInsuranceItem(cn.com.cis.claim.car.interf.check.vo.InsuranceItem[] insuranceItem) {
        this.insuranceItem = insuranceItem;
    }


    /**
     * Gets the insureVehicleCode value for this EvalRequest.
     * 
     * @return insureVehicleCode
     */
    public java.lang.String getInsureVehicleCode() {
        return insureVehicleCode;
    }


    /**
     * Sets the insureVehicleCode value for this EvalRequest.
     * 
     * @param insureVehicleCode
     */
    public void setInsureVehicleCode(java.lang.String insureVehicleCode) {
        this.insureVehicleCode = insureVehicleCode;
    }


    /**
     * Gets the insureVehicleName value for this EvalRequest.
     * 
     * @return insureVehicleName
     */
    public java.lang.String getInsureVehicleName() {
        return insureVehicleName;
    }


    /**
     * Sets the insureVehicleName value for this EvalRequest.
     * 
     * @param insureVehicleName
     */
    public void setInsureVehicleName(java.lang.String insureVehicleName) {
        this.insureVehicleName = insureVehicleName;
    }


    /**
     * Gets the lossNo value for this EvalRequest.
     * 
     * @return lossNo
     */
    public java.lang.String getLossNo() {
        return lossNo;
    }


    /**
     * Sets the lossNo value for this EvalRequest.
     * 
     * @param lossNo
     */
    public void setLossNo(java.lang.String lossNo) {
        this.lossNo = lossNo;
    }


    /**
     * Gets the manHour value for this EvalRequest.
     * 
     * @return manHour
     */
    public java.lang.Double getManHour() {
        return manHour;
    }


    /**
     * Sets the manHour value for this EvalRequest.
     * 
     * @param manHour
     */
    public void setManHour(java.lang.Double manHour) {
        this.manHour = manHour;
    }


    /**
     * Gets the password value for this EvalRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this EvalRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the power value for this EvalRequest.
     * 
     * @return power
     */
    public java.lang.String getPower() {
        return power;
    }


    /**
     * Sets the power value for this EvalRequest.
     * 
     * @param power
     */
    public void setPower(java.lang.String power) {
        this.power = power;
    }


    /**
     * Gets the requestType value for this EvalRequest.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this EvalRequest.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the userCode value for this EvalRequest.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this EvalRequest.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EvalRequest)) return false;
        EvalRequest other = (EvalRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseNo==null && other.getCaseNo()==null) || 
             (this.caseNo!=null &&
              this.caseNo.equals(other.getCaseNo()))) &&
            ((this.comCode==null && other.getComCode()==null) || 
             (this.comCode!=null &&
              this.comCode.equals(other.getComCode()))) &&
            ((this.estimateNo==null && other.getEstimateNo()==null) || 
             (this.estimateNo!=null &&
              this.estimateNo.equals(other.getEstimateNo()))) &&
            ((this.handlerCode==null && other.getHandlerCode()==null) || 
             (this.handlerCode!=null &&
              this.handlerCode.equals(other.getHandlerCode()))) &&
            ((this.insuranceItem==null && other.getInsuranceItem()==null) || 
             (this.insuranceItem!=null &&
              java.util.Arrays.equals(this.insuranceItem, other.getInsuranceItem()))) &&
            ((this.insureVehicleCode==null && other.getInsureVehicleCode()==null) || 
             (this.insureVehicleCode!=null &&
              this.insureVehicleCode.equals(other.getInsureVehicleCode()))) &&
            ((this.insureVehicleName==null && other.getInsureVehicleName()==null) || 
             (this.insureVehicleName!=null &&
              this.insureVehicleName.equals(other.getInsureVehicleName()))) &&
            ((this.lossNo==null && other.getLossNo()==null) || 
             (this.lossNo!=null &&
              this.lossNo.equals(other.getLossNo()))) &&
            ((this.manHour==null && other.getManHour()==null) || 
             (this.manHour!=null &&
              this.manHour.equals(other.getManHour()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.power==null && other.getPower()==null) || 
             (this.power!=null &&
              this.power.equals(other.getPower()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
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
        if (getCaseNo() != null) {
            _hashCode += getCaseNo().hashCode();
        }
        if (getComCode() != null) {
            _hashCode += getComCode().hashCode();
        }
        if (getEstimateNo() != null) {
            _hashCode += getEstimateNo().hashCode();
        }
        if (getHandlerCode() != null) {
            _hashCode += getHandlerCode().hashCode();
        }
        if (getInsuranceItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsuranceItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsuranceItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInsureVehicleCode() != null) {
            _hashCode += getInsureVehicleCode().hashCode();
        }
        if (getInsureVehicleName() != null) {
            _hashCode += getInsureVehicleName().hashCode();
        }
        if (getLossNo() != null) {
            _hashCode += getLossNo().hashCode();
        }
        if (getManHour() != null) {
            _hashCode += getManHour().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPower() != null) {
            _hashCode += getPower().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EvalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EvalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "caseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "comCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimateNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "estimateNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "handlerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "insuranceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "InsuranceItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "InsuranceItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insureVehicleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "insureVehicleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insureVehicleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "insureVehicleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "lossNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manHour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "manHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "requestType"));
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
