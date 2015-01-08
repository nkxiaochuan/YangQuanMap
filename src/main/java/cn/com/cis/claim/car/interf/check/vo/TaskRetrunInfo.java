/**
 * TaskRetrunInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class TaskRetrunInfo  implements java.io.Serializable {
    private cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo;

    private cn.com.cis.claim.car.interf.check.vo.TaskReturn[] taskReturnList;

    public TaskRetrunInfo() {
    }

    public TaskRetrunInfo(
           cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo,
           cn.com.cis.claim.car.interf.check.vo.TaskReturn[] taskReturnList) {
           this.resultInfo = resultInfo;
           this.taskReturnList = taskReturnList;
    }


    /**
     * Gets the resultInfo value for this TaskRetrunInfo.
     * 
     * @return resultInfo
     */
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo getResultInfo() {
        return resultInfo;
    }


    /**
     * Sets the resultInfo value for this TaskRetrunInfo.
     * 
     * @param resultInfo
     */
    public void setResultInfo(cn.com.cis.claim.car.interf.check.vo.ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }


    /**
     * Gets the taskReturnList value for this TaskRetrunInfo.
     * 
     * @return taskReturnList
     */
    public cn.com.cis.claim.car.interf.check.vo.TaskReturn[] getTaskReturnList() {
        return taskReturnList;
    }


    /**
     * Sets the taskReturnList value for this TaskRetrunInfo.
     * 
     * @param taskReturnList
     */
    public void setTaskReturnList(cn.com.cis.claim.car.interf.check.vo.TaskReturn[] taskReturnList) {
        this.taskReturnList = taskReturnList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskRetrunInfo)) return false;
        TaskRetrunInfo other = (TaskRetrunInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultInfo==null && other.getResultInfo()==null) || 
             (this.resultInfo!=null &&
              this.resultInfo.equals(other.getResultInfo()))) &&
            ((this.taskReturnList==null && other.getTaskReturnList()==null) || 
             (this.taskReturnList!=null &&
              java.util.Arrays.equals(this.taskReturnList, other.getTaskReturnList())));
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
        if (getResultInfo() != null) {
            _hashCode += getResultInfo().hashCode();
        }
        if (getTaskReturnList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaskReturnList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaskReturnList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskRetrunInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskRetrunInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "resultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskReturnList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "taskReturnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskReturn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskReturn"));
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
