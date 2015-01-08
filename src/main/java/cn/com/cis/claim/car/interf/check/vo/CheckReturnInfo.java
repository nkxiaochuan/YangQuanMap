/**
 * CheckReturnInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class CheckReturnInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.CarInfo carInfo;

    private cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile caseInfoMobile;

    private cn.com.cis.claim.car.interf.check.vo.CheckTaskInfo checkTaskInfo;

    private java.lang.String policyInfoJson;

    private cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfos;

    private cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo;

    public CheckReturnInfo() {
    }

    public CheckReturnInfo(
           cn.com.cis.claim.car.interf.check.vo.CarInfo carInfo,
           cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile caseInfoMobile,
           cn.com.cis.claim.car.interf.check.vo.CheckTaskInfo checkTaskInfo,
           java.lang.String policyInfoJson,
           cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfos,
           cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo) {
           this.carInfo = carInfo;
           this.caseInfoMobile = caseInfoMobile;
           this.checkTaskInfo = checkTaskInfo;
           this.policyInfoJson = policyInfoJson;
           this.policyInfos = policyInfos;
           this.resultInfo = resultInfo;
    }


    /**
     * Gets the carInfo value for this CheckReturnInfo.
     * 
     * @return carInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.CarInfo getCarInfo() {
        return carInfo;
    }


    /**
     * Sets the carInfo value for this CheckReturnInfo.
     * 
     * @param carInfo
     */
    public void setCarInfo(cn.com.cis.claim.car.interf.check.vo.CarInfo carInfo) {
        this.carInfo = carInfo;
    }


    /**
     * Gets the caseInfoMobile value for this CheckReturnInfo.
     * 
     * @return caseInfoMobile
     */
    public cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile getCaseInfoMobile() {
        return caseInfoMobile;
    }


    /**
     * Sets the caseInfoMobile value for this CheckReturnInfo.
     * 
     * @param caseInfoMobile
     */
    public void setCaseInfoMobile(cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile caseInfoMobile) {
        this.caseInfoMobile = caseInfoMobile;
    }


    /**
     * Gets the checkTaskInfo value for this CheckReturnInfo.
     * 
     * @return checkTaskInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.CheckTaskInfo getCheckTaskInfo() {
        return checkTaskInfo;
    }


    /**
     * Sets the checkTaskInfo value for this CheckReturnInfo.
     * 
     * @param checkTaskInfo
     */
    public void setCheckTaskInfo(cn.com.cis.claim.car.interf.check.vo.CheckTaskInfo checkTaskInfo) {
        this.checkTaskInfo = checkTaskInfo;
    }


    /**
     * Gets the policyInfoJson value for this CheckReturnInfo.
     * 
     * @return policyInfoJson
     */
    public java.lang.String getPolicyInfoJson() {
        return policyInfoJson;
    }


    /**
     * Sets the policyInfoJson value for this CheckReturnInfo.
     * 
     * @param policyInfoJson
     */
    public void setPolicyInfoJson(java.lang.String policyInfoJson) {
        this.policyInfoJson = policyInfoJson;
    }


    /**
     * Gets the policyInfos value for this CheckReturnInfo.
     * 
     * @return policyInfos
     */
    public cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] getPolicyInfos() {
        return policyInfos;
    }


    /**
     * Sets the policyInfos value for this CheckReturnInfo.
     * 
     * @param policyInfos
     */
    public void setPolicyInfos(cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfos) {
        this.policyInfos = policyInfos;
    }


    /**
     * Gets the resultInfo value for this CheckReturnInfo.
     * 
     * @return resultInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo getResultInfo() {
        return resultInfo;
    }


    /**
     * Sets the resultInfo value for this CheckReturnInfo.
     * 
     * @param resultInfo
     */
    public void setResultInfo(cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckReturnInfo)) return false;
        CheckReturnInfo other = (CheckReturnInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carInfo==null && other.getCarInfo()==null) || 
             (this.carInfo!=null &&
              this.carInfo.equals(other.getCarInfo()))) &&
            ((this.caseInfoMobile==null && other.getCaseInfoMobile()==null) || 
             (this.caseInfoMobile!=null &&
              this.caseInfoMobile.equals(other.getCaseInfoMobile()))) &&
            ((this.checkTaskInfo==null && other.getCheckTaskInfo()==null) || 
             (this.checkTaskInfo!=null &&
              this.checkTaskInfo.equals(other.getCheckTaskInfo()))) &&
            ((this.policyInfoJson==null && other.getPolicyInfoJson()==null) || 
             (this.policyInfoJson!=null &&
              this.policyInfoJson.equals(other.getPolicyInfoJson()))) &&
            ((this.policyInfos==null && other.getPolicyInfos()==null) || 
             (this.policyInfos!=null &&
              java.util.Arrays.equals(this.policyInfos, other.getPolicyInfos()))) &&
            ((this.resultInfo==null && other.getResultInfo()==null) || 
             (this.resultInfo!=null &&
              this.resultInfo.equals(other.getResultInfo())));
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
        if (getCarInfo() != null) {
            _hashCode += getCarInfo().hashCode();
        }
        if (getCaseInfoMobile() != null) {
            _hashCode += getCaseInfoMobile().hashCode();
        }
        if (getCheckTaskInfo() != null) {
            _hashCode += getCheckTaskInfo().hashCode();
        }
        if (getPolicyInfoJson() != null) {
            _hashCode += getPolicyInfoJson().hashCode();
        }
        if (getPolicyInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResultInfo() != null) {
            _hashCode += getResultInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckReturnInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckReturnInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "carInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CarInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseInfoMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "caseInfoMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CaseInfoMobile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkTaskInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "checkTaskInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckTaskInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyInfoJson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "policyInfoJson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "policyInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "PolicyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "PolicyInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "resultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo"));
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
