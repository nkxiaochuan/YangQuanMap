/**
 * DeflossReturnInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class DeflossReturnInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile caseInfoMobile;

    private cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo deflossCarInfo;

    private cn.com.cis.claim.car.interf.check.vo.EvalRequest evalRequest;

    private cn.com.cis.claim.car.interf.check.vo.KindInfo[] kindInfo;

    private cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfos;

    private cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo;

    public DeflossReturnInfo() {
    }

    public DeflossReturnInfo(
           cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile caseInfoMobile,
           cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo deflossCarInfo,
           cn.com.cis.claim.car.interf.check.vo.EvalRequest evalRequest,
           cn.com.cis.claim.car.interf.check.vo.KindInfo[] kindInfo,
           cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfos,
           cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo) {
           this.caseInfoMobile = caseInfoMobile;
           this.deflossCarInfo = deflossCarInfo;
           this.evalRequest = evalRequest;
           this.kindInfo = kindInfo;
           this.policyInfos = policyInfos;
           this.resultInfo = resultInfo;
    }


    /**
     * Gets the caseInfoMobile value for this DeflossReturnInfo.
     * 
     * @return caseInfoMobile
     */
    public cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile getCaseInfoMobile() {
        return caseInfoMobile;
    }


    /**
     * Sets the caseInfoMobile value for this DeflossReturnInfo.
     * 
     * @param caseInfoMobile
     */
    public void setCaseInfoMobile(cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile caseInfoMobile) {
        this.caseInfoMobile = caseInfoMobile;
    }


    /**
     * Gets the deflossCarInfo value for this DeflossReturnInfo.
     * 
     * @return deflossCarInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo getDeflossCarInfo() {
        return deflossCarInfo;
    }


    /**
     * Sets the deflossCarInfo value for this DeflossReturnInfo.
     * 
     * @param deflossCarInfo
     */
    public void setDeflossCarInfo(cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo deflossCarInfo) {
        this.deflossCarInfo = deflossCarInfo;
    }


    /**
     * Gets the evalRequest value for this DeflossReturnInfo.
     * 
     * @return evalRequest
     */
    public cn.com.cis.claim.car.interf.check.vo.EvalRequest getEvalRequest() {
        return evalRequest;
    }


    /**
     * Sets the evalRequest value for this DeflossReturnInfo.
     * 
     * @param evalRequest
     */
    public void setEvalRequest(cn.com.cis.claim.car.interf.check.vo.EvalRequest evalRequest) {
        this.evalRequest = evalRequest;
    }


    /**
     * Gets the kindInfo value for this DeflossReturnInfo.
     * 
     * @return kindInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.KindInfo[] getKindInfo() {
        return kindInfo;
    }


    /**
     * Sets the kindInfo value for this DeflossReturnInfo.
     * 
     * @param kindInfo
     */
    public void setKindInfo(cn.com.cis.claim.car.interf.check.vo.KindInfo[] kindInfo) {
        this.kindInfo = kindInfo;
    }


    /**
     * Gets the policyInfos value for this DeflossReturnInfo.
     * 
     * @return policyInfos
     */
    public cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] getPolicyInfos() {
        return policyInfos;
    }


    /**
     * Sets the policyInfos value for this DeflossReturnInfo.
     * 
     * @param policyInfos
     */
    public void setPolicyInfos(cn.com.cis.claim.car.interf.check.vo.PolicyInfo[] policyInfos) {
        this.policyInfos = policyInfos;
    }


    /**
     * Gets the resultInfo value for this DeflossReturnInfo.
     * 
     * @return resultInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo getResultInfo() {
        return resultInfo;
    }


    /**
     * Sets the resultInfo value for this DeflossReturnInfo.
     * 
     * @param resultInfo
     */
    public void setResultInfo(cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeflossReturnInfo)) return false;
        DeflossReturnInfo other = (DeflossReturnInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseInfoMobile==null && other.getCaseInfoMobile()==null) || 
             (this.caseInfoMobile!=null &&
              this.caseInfoMobile.equals(other.getCaseInfoMobile()))) &&
            ((this.deflossCarInfo==null && other.getDeflossCarInfo()==null) || 
             (this.deflossCarInfo!=null &&
              this.deflossCarInfo.equals(other.getDeflossCarInfo()))) &&
            ((this.evalRequest==null && other.getEvalRequest()==null) || 
             (this.evalRequest!=null &&
              this.evalRequest.equals(other.getEvalRequest()))) &&
            ((this.kindInfo==null && other.getKindInfo()==null) || 
             (this.kindInfo!=null &&
              java.util.Arrays.equals(this.kindInfo, other.getKindInfo()))) &&
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
        if (getCaseInfoMobile() != null) {
            _hashCode += getCaseInfoMobile().hashCode();
        }
        if (getDeflossCarInfo() != null) {
            _hashCode += getDeflossCarInfo().hashCode();
        }
        if (getEvalRequest() != null) {
            _hashCode += getEvalRequest().hashCode();
        }
        if (getKindInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKindInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKindInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(DeflossReturnInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossReturnInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseInfoMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "caseInfoMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CaseInfoMobile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deflossCarInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "deflossCarInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossCarInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evalRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "evalRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EvalRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kindInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "kindInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "KindInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "KindInfo"));
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
