/**
 * DeflossReturnInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.vo;

public class DeflossReturnInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.selfClaim.vo.DeflossCarInfo[] deflossCarInfoList;

    private cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo resultInfo;

    public DeflossReturnInfo() {
    }

    public DeflossReturnInfo(
           cn.com.cis.claim.car.interf.selfClaim.vo.DeflossCarInfo[] deflossCarInfoList,
           cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo resultInfo) {
           this.deflossCarInfoList = deflossCarInfoList;
           this.resultInfo = resultInfo;
    }


    /**
     * Gets the deflossCarInfoList value for this DeflossReturnInfo.
     * 
     * @return deflossCarInfoList
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.DeflossCarInfo[] getDeflossCarInfoList() {
        return deflossCarInfoList;
    }


    /**
     * Sets the deflossCarInfoList value for this DeflossReturnInfo.
     * 
     * @param deflossCarInfoList
     */
    public void setDeflossCarInfoList(cn.com.cis.claim.car.interf.selfClaim.vo.DeflossCarInfo[] deflossCarInfoList) {
        this.deflossCarInfoList = deflossCarInfoList;
    }


    /**
     * Gets the resultInfo value for this DeflossReturnInfo.
     * 
     * @return resultInfo
     */
    public cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo getResultInfo() {
        return resultInfo;
    }


    /**
     * Sets the resultInfo value for this DeflossReturnInfo.
     * 
     * @param resultInfo
     */
    public void setResultInfo(cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo resultInfo) {
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
            ((this.deflossCarInfoList==null && other.getDeflossCarInfoList()==null) || 
             (this.deflossCarInfoList!=null &&
              java.util.Arrays.equals(this.deflossCarInfoList, other.getDeflossCarInfoList()))) &&
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
        if (getDeflossCarInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeflossCarInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeflossCarInfoList(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "DeflossReturnInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deflossCarInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "deflossCarInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "DeflossCarInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "DeflossCarInfo"));
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
