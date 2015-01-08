/**
 * CaseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class CaseInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.selfClaim.vo.CaseBasicInfo[] caseBasicInfoList;

    private cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo resultInfo;

    public CaseInfo() {
    }

    public CaseInfo(
           cn.com.cis.claim.car.interf.selfClaim.vo.CaseBasicInfo[] caseBasicInfoList,
           cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo resultInfo) {
           this.caseBasicInfoList = caseBasicInfoList;
           this.resultInfo = resultInfo;
    }


    /**
     * Gets the caseBasicInfoList value for this CaseInfo.
     * 
     * @return caseBasicInfoList
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.CaseBasicInfo[] getCaseBasicInfoList() {
        return caseBasicInfoList;
    }


    /**
     * Sets the caseBasicInfoList value for this CaseInfo.
     * 
     * @param caseBasicInfoList
     */
    public void setCaseBasicInfoList(cn.com.cis.claim.car.interf.selfClaim.vo.CaseBasicInfo[] caseBasicInfoList) {
        this.caseBasicInfoList = caseBasicInfoList;
    }


    /**
     * Gets the resultInfo value for this CaseInfo.
     * 
     * @return resultInfo
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo getResultInfo() {
        return resultInfo;
    }


    /**
     * Sets the resultInfo value for this CaseInfo.
     * 
     * @param resultInfo
     */
    public void setResultInfo(cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseInfo)) return false;
        CaseInfo other = (CaseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseBasicInfoList==null && other.getCaseBasicInfoList()==null) || 
             (this.caseBasicInfoList!=null &&
              java.util.Arrays.equals(this.caseBasicInfoList, other.getCaseBasicInfoList()))) &&
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
        if (getCaseBasicInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseBasicInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseBasicInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(CaseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseBasicInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "caseBasicInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseBasicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseBasicInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "resultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ResultInfo"));
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
