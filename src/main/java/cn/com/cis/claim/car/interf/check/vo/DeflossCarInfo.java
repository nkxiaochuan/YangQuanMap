/**
 * DeflossCarInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.vo;

public class DeflossCarInfo  implements java.io.Serializable {
    private java.lang.String certainCode;

    private java.lang.String certainName;

    private java.lang.String cetainLossType;

    private cn.com.cis.claim.car.interf.check.vo.Component[] componentList;

    private java.lang.String defLossDate;

    private java.lang.String defSite;

    private java.lang.Long deflossMainId;

    private java.lang.String deflossRemark;

    private java.lang.String dutyType;

    private java.lang.Long estimateNo;

    private cn.com.cis.claim.car.interf.check.vo.Factory factory;

    private cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList;

    private java.lang.String frameNo;

    private java.lang.String handlerCode;

    private java.lang.String handlerName;

    private java.lang.String licenseNo;

    private java.lang.String licenseType;

    private java.lang.String lossCarKindCode;

    private java.lang.String lossCarKindName;

    private java.lang.String lossItemType;

    private java.lang.String lossPart;

    private java.math.BigDecimal manageFeeRate;

    private cn.com.cis.claim.car.interf.check.vo.Material[] material;

    private cn.com.cis.claim.car.interf.check.vo.OtherFee[] otherFeeList;

    private java.lang.String registNo;

    private cn.com.cis.claim.car.interf.check.vo.Repair[] repairList;

    private java.lang.String state;

    private java.math.BigDecimal sumComFee;

    private java.math.BigDecimal sumLoss;

    private java.math.BigDecimal sumManageFee;

    private java.math.BigDecimal sumMaterialFee;

    private java.math.BigDecimal sumOtherFee;

    private java.math.BigDecimal sumRemnant;

    private java.math.BigDecimal sumRepairFee;

    private java.math.BigDecimal sumRescueFee;

    private java.lang.Long taskId;

    private java.lang.String userCode;

    public DeflossCarInfo() {
    }

    public DeflossCarInfo(
           java.lang.String certainCode,
           java.lang.String certainName,
           java.lang.String cetainLossType,
           cn.com.cis.claim.car.interf.check.vo.Component[] componentList,
           java.lang.String defLossDate,
           java.lang.String defSite,
           java.lang.Long deflossMainId,
           java.lang.String deflossRemark,
           java.lang.String dutyType,
           java.lang.Long estimateNo,
           cn.com.cis.claim.car.interf.check.vo.Factory factory,
           cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList,
           java.lang.String frameNo,
           java.lang.String handlerCode,
           java.lang.String handlerName,
           java.lang.String licenseNo,
           java.lang.String licenseType,
           java.lang.String lossCarKindCode,
           java.lang.String lossCarKindName,
           java.lang.String lossItemType,
           java.lang.String lossPart,
           java.math.BigDecimal manageFeeRate,
           cn.com.cis.claim.car.interf.check.vo.Material[] material,
           cn.com.cis.claim.car.interf.check.vo.OtherFee[] otherFeeList,
           java.lang.String registNo,
           cn.com.cis.claim.car.interf.check.vo.Repair[] repairList,
           java.lang.String state,
           java.math.BigDecimal sumComFee,
           java.math.BigDecimal sumLoss,
           java.math.BigDecimal sumManageFee,
           java.math.BigDecimal sumMaterialFee,
           java.math.BigDecimal sumOtherFee,
           java.math.BigDecimal sumRemnant,
           java.math.BigDecimal sumRepairFee,
           java.math.BigDecimal sumRescueFee,
           java.lang.Long taskId,
           java.lang.String userCode) {
           this.certainCode = certainCode;
           this.certainName = certainName;
           this.cetainLossType = cetainLossType;
           this.componentList = componentList;
           this.defLossDate = defLossDate;
           this.defSite = defSite;
           this.deflossMainId = deflossMainId;
           this.deflossRemark = deflossRemark;
           this.dutyType = dutyType;
           this.estimateNo = estimateNo;
           this.factory = factory;
           this.fileInfoList = fileInfoList;
           this.frameNo = frameNo;
           this.handlerCode = handlerCode;
           this.handlerName = handlerName;
           this.licenseNo = licenseNo;
           this.licenseType = licenseType;
           this.lossCarKindCode = lossCarKindCode;
           this.lossCarKindName = lossCarKindName;
           this.lossItemType = lossItemType;
           this.lossPart = lossPart;
           this.manageFeeRate = manageFeeRate;
           this.material = material;
           this.otherFeeList = otherFeeList;
           this.registNo = registNo;
           this.repairList = repairList;
           this.state = state;
           this.sumComFee = sumComFee;
           this.sumLoss = sumLoss;
           this.sumManageFee = sumManageFee;
           this.sumMaterialFee = sumMaterialFee;
           this.sumOtherFee = sumOtherFee;
           this.sumRemnant = sumRemnant;
           this.sumRepairFee = sumRepairFee;
           this.sumRescueFee = sumRescueFee;
           this.taskId = taskId;
           this.userCode = userCode;
    }


    /**
     * Gets the certainCode value for this DeflossCarInfo.
     * 
     * @return certainCode
     */
    public java.lang.String getCertainCode() {
        return certainCode;
    }


    /**
     * Sets the certainCode value for this DeflossCarInfo.
     * 
     * @param certainCode
     */
    public void setCertainCode(java.lang.String certainCode) {
        this.certainCode = certainCode;
    }


    /**
     * Gets the certainName value for this DeflossCarInfo.
     * 
     * @return certainName
     */
    public java.lang.String getCertainName() {
        return certainName;
    }


    /**
     * Sets the certainName value for this DeflossCarInfo.
     * 
     * @param certainName
     */
    public void setCertainName(java.lang.String certainName) {
        this.certainName = certainName;
    }


    /**
     * Gets the cetainLossType value for this DeflossCarInfo.
     * 
     * @return cetainLossType
     */
    public java.lang.String getCetainLossType() {
        return cetainLossType;
    }


    /**
     * Sets the cetainLossType value for this DeflossCarInfo.
     * 
     * @param cetainLossType
     */
    public void setCetainLossType(java.lang.String cetainLossType) {
        this.cetainLossType = cetainLossType;
    }


    /**
     * Gets the componentList value for this DeflossCarInfo.
     * 
     * @return componentList
     */
    public cn.com.cis.claim.car.interf.check.vo.Component[] getComponentList() {
        return componentList;
    }


    /**
     * Sets the componentList value for this DeflossCarInfo.
     * 
     * @param componentList
     */
    public void setComponentList(cn.com.cis.claim.car.interf.check.vo.Component[] componentList) {
        this.componentList = componentList;
    }


    /**
     * Gets the defLossDate value for this DeflossCarInfo.
     * 
     * @return defLossDate
     */
    public java.lang.String getDefLossDate() {
        return defLossDate;
    }


    /**
     * Sets the defLossDate value for this DeflossCarInfo.
     * 
     * @param defLossDate
     */
    public void setDefLossDate(java.lang.String defLossDate) {
        this.defLossDate = defLossDate;
    }


    /**
     * Gets the defSite value for this DeflossCarInfo.
     * 
     * @return defSite
     */
    public java.lang.String getDefSite() {
        return defSite;
    }


    /**
     * Sets the defSite value for this DeflossCarInfo.
     * 
     * @param defSite
     */
    public void setDefSite(java.lang.String defSite) {
        this.defSite = defSite;
    }


    /**
     * Gets the deflossMainId value for this DeflossCarInfo.
     * 
     * @return deflossMainId
     */
    public java.lang.Long getDeflossMainId() {
        return deflossMainId;
    }


    /**
     * Sets the deflossMainId value for this DeflossCarInfo.
     * 
     * @param deflossMainId
     */
    public void setDeflossMainId(java.lang.Long deflossMainId) {
        this.deflossMainId = deflossMainId;
    }


    /**
     * Gets the deflossRemark value for this DeflossCarInfo.
     * 
     * @return deflossRemark
     */
    public java.lang.String getDeflossRemark() {
        return deflossRemark;
    }


    /**
     * Sets the deflossRemark value for this DeflossCarInfo.
     * 
     * @param deflossRemark
     */
    public void setDeflossRemark(java.lang.String deflossRemark) {
        this.deflossRemark = deflossRemark;
    }


    /**
     * Gets the dutyType value for this DeflossCarInfo.
     * 
     * @return dutyType
     */
    public java.lang.String getDutyType() {
        return dutyType;
    }


    /**
     * Sets the dutyType value for this DeflossCarInfo.
     * 
     * @param dutyType
     */
    public void setDutyType(java.lang.String dutyType) {
        this.dutyType = dutyType;
    }


    /**
     * Gets the estimateNo value for this DeflossCarInfo.
     * 
     * @return estimateNo
     */
    public java.lang.Long getEstimateNo() {
        return estimateNo;
    }


    /**
     * Sets the estimateNo value for this DeflossCarInfo.
     * 
     * @param estimateNo
     */
    public void setEstimateNo(java.lang.Long estimateNo) {
        this.estimateNo = estimateNo;
    }


    /**
     * Gets the factory value for this DeflossCarInfo.
     * 
     * @return factory
     */
    public cn.com.cis.claim.car.interf.check.vo.Factory getFactory() {
        return factory;
    }


    /**
     * Sets the factory value for this DeflossCarInfo.
     * 
     * @param factory
     */
    public void setFactory(cn.com.cis.claim.car.interf.check.vo.Factory factory) {
        this.factory = factory;
    }


    /**
     * Gets the fileInfoList value for this DeflossCarInfo.
     * 
     * @return fileInfoList
     */
    public cn.com.cis.claim.car.interf.check.vo.FileInfo[] getFileInfoList() {
        return fileInfoList;
    }


    /**
     * Sets the fileInfoList value for this DeflossCarInfo.
     * 
     * @param fileInfoList
     */
    public void setFileInfoList(cn.com.cis.claim.car.interf.check.vo.FileInfo[] fileInfoList) {
        this.fileInfoList = fileInfoList;
    }


    /**
     * Gets the frameNo value for this DeflossCarInfo.
     * 
     * @return frameNo
     */
    public java.lang.String getFrameNo() {
        return frameNo;
    }


    /**
     * Sets the frameNo value for this DeflossCarInfo.
     * 
     * @param frameNo
     */
    public void setFrameNo(java.lang.String frameNo) {
        this.frameNo = frameNo;
    }


    /**
     * Gets the handlerCode value for this DeflossCarInfo.
     * 
     * @return handlerCode
     */
    public java.lang.String getHandlerCode() {
        return handlerCode;
    }


    /**
     * Sets the handlerCode value for this DeflossCarInfo.
     * 
     * @param handlerCode
     */
    public void setHandlerCode(java.lang.String handlerCode) {
        this.handlerCode = handlerCode;
    }


    /**
     * Gets the handlerName value for this DeflossCarInfo.
     * 
     * @return handlerName
     */
    public java.lang.String getHandlerName() {
        return handlerName;
    }


    /**
     * Sets the handlerName value for this DeflossCarInfo.
     * 
     * @param handlerName
     */
    public void setHandlerName(java.lang.String handlerName) {
        this.handlerName = handlerName;
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
     * Gets the licenseType value for this DeflossCarInfo.
     * 
     * @return licenseType
     */
    public java.lang.String getLicenseType() {
        return licenseType;
    }


    /**
     * Sets the licenseType value for this DeflossCarInfo.
     * 
     * @param licenseType
     */
    public void setLicenseType(java.lang.String licenseType) {
        this.licenseType = licenseType;
    }


    /**
     * Gets the lossCarKindCode value for this DeflossCarInfo.
     * 
     * @return lossCarKindCode
     */
    public java.lang.String getLossCarKindCode() {
        return lossCarKindCode;
    }


    /**
     * Sets the lossCarKindCode value for this DeflossCarInfo.
     * 
     * @param lossCarKindCode
     */
    public void setLossCarKindCode(java.lang.String lossCarKindCode) {
        this.lossCarKindCode = lossCarKindCode;
    }


    /**
     * Gets the lossCarKindName value for this DeflossCarInfo.
     * 
     * @return lossCarKindName
     */
    public java.lang.String getLossCarKindName() {
        return lossCarKindName;
    }


    /**
     * Sets the lossCarKindName value for this DeflossCarInfo.
     * 
     * @param lossCarKindName
     */
    public void setLossCarKindName(java.lang.String lossCarKindName) {
        this.lossCarKindName = lossCarKindName;
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
     * Gets the lossPart value for this DeflossCarInfo.
     * 
     * @return lossPart
     */
    public java.lang.String getLossPart() {
        return lossPart;
    }


    /**
     * Sets the lossPart value for this DeflossCarInfo.
     * 
     * @param lossPart
     */
    public void setLossPart(java.lang.String lossPart) {
        this.lossPart = lossPart;
    }


    /**
     * Gets the manageFeeRate value for this DeflossCarInfo.
     * 
     * @return manageFeeRate
     */
    public java.math.BigDecimal getManageFeeRate() {
        return manageFeeRate;
    }


    /**
     * Sets the manageFeeRate value for this DeflossCarInfo.
     * 
     * @param manageFeeRate
     */
    public void setManageFeeRate(java.math.BigDecimal manageFeeRate) {
        this.manageFeeRate = manageFeeRate;
    }


    /**
     * Gets the material value for this DeflossCarInfo.
     * 
     * @return material
     */
    public cn.com.cis.claim.car.interf.check.vo.Material[] getMaterial() {
        return material;
    }


    /**
     * Sets the material value for this DeflossCarInfo.
     * 
     * @param material
     */
    public void setMaterial(cn.com.cis.claim.car.interf.check.vo.Material[] material) {
        this.material = material;
    }


    /**
     * Gets the otherFeeList value for this DeflossCarInfo.
     * 
     * @return otherFeeList
     */
    public cn.com.cis.claim.car.interf.check.vo.OtherFee[] getOtherFeeList() {
        return otherFeeList;
    }


    /**
     * Sets the otherFeeList value for this DeflossCarInfo.
     * 
     * @param otherFeeList
     */
    public void setOtherFeeList(cn.com.cis.claim.car.interf.check.vo.OtherFee[] otherFeeList) {
        this.otherFeeList = otherFeeList;
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
    public cn.com.cis.claim.car.interf.check.vo.Repair[] getRepairList() {
        return repairList;
    }


    /**
     * Sets the repairList value for this DeflossCarInfo.
     * 
     * @param repairList
     */
    public void setRepairList(cn.com.cis.claim.car.interf.check.vo.Repair[] repairList) {
        this.repairList = repairList;
    }


    /**
     * Gets the state value for this DeflossCarInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this DeflossCarInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the sumComFee value for this DeflossCarInfo.
     * 
     * @return sumComFee
     */
    public java.math.BigDecimal getSumComFee() {
        return sumComFee;
    }


    /**
     * Sets the sumComFee value for this DeflossCarInfo.
     * 
     * @param sumComFee
     */
    public void setSumComFee(java.math.BigDecimal sumComFee) {
        this.sumComFee = sumComFee;
    }


    /**
     * Gets the sumLoss value for this DeflossCarInfo.
     * 
     * @return sumLoss
     */
    public java.math.BigDecimal getSumLoss() {
        return sumLoss;
    }


    /**
     * Sets the sumLoss value for this DeflossCarInfo.
     * 
     * @param sumLoss
     */
    public void setSumLoss(java.math.BigDecimal sumLoss) {
        this.sumLoss = sumLoss;
    }


    /**
     * Gets the sumManageFee value for this DeflossCarInfo.
     * 
     * @return sumManageFee
     */
    public java.math.BigDecimal getSumManageFee() {
        return sumManageFee;
    }


    /**
     * Sets the sumManageFee value for this DeflossCarInfo.
     * 
     * @param sumManageFee
     */
    public void setSumManageFee(java.math.BigDecimal sumManageFee) {
        this.sumManageFee = sumManageFee;
    }


    /**
     * Gets the sumMaterialFee value for this DeflossCarInfo.
     * 
     * @return sumMaterialFee
     */
    public java.math.BigDecimal getSumMaterialFee() {
        return sumMaterialFee;
    }


    /**
     * Sets the sumMaterialFee value for this DeflossCarInfo.
     * 
     * @param sumMaterialFee
     */
    public void setSumMaterialFee(java.math.BigDecimal sumMaterialFee) {
        this.sumMaterialFee = sumMaterialFee;
    }


    /**
     * Gets the sumOtherFee value for this DeflossCarInfo.
     * 
     * @return sumOtherFee
     */
    public java.math.BigDecimal getSumOtherFee() {
        return sumOtherFee;
    }


    /**
     * Sets the sumOtherFee value for this DeflossCarInfo.
     * 
     * @param sumOtherFee
     */
    public void setSumOtherFee(java.math.BigDecimal sumOtherFee) {
        this.sumOtherFee = sumOtherFee;
    }


    /**
     * Gets the sumRemnant value for this DeflossCarInfo.
     * 
     * @return sumRemnant
     */
    public java.math.BigDecimal getSumRemnant() {
        return sumRemnant;
    }


    /**
     * Sets the sumRemnant value for this DeflossCarInfo.
     * 
     * @param sumRemnant
     */
    public void setSumRemnant(java.math.BigDecimal sumRemnant) {
        this.sumRemnant = sumRemnant;
    }


    /**
     * Gets the sumRepairFee value for this DeflossCarInfo.
     * 
     * @return sumRepairFee
     */
    public java.math.BigDecimal getSumRepairFee() {
        return sumRepairFee;
    }


    /**
     * Sets the sumRepairFee value for this DeflossCarInfo.
     * 
     * @param sumRepairFee
     */
    public void setSumRepairFee(java.math.BigDecimal sumRepairFee) {
        this.sumRepairFee = sumRepairFee;
    }


    /**
     * Gets the sumRescueFee value for this DeflossCarInfo.
     * 
     * @return sumRescueFee
     */
    public java.math.BigDecimal getSumRescueFee() {
        return sumRescueFee;
    }


    /**
     * Sets the sumRescueFee value for this DeflossCarInfo.
     * 
     * @param sumRescueFee
     */
    public void setSumRescueFee(java.math.BigDecimal sumRescueFee) {
        this.sumRescueFee = sumRescueFee;
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


    /**
     * Gets the userCode value for this DeflossCarInfo.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this DeflossCarInfo.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
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
            ((this.certainCode==null && other.getCertainCode()==null) || 
             (this.certainCode!=null &&
              this.certainCode.equals(other.getCertainCode()))) &&
            ((this.certainName==null && other.getCertainName()==null) || 
             (this.certainName!=null &&
              this.certainName.equals(other.getCertainName()))) &&
            ((this.cetainLossType==null && other.getCetainLossType()==null) || 
             (this.cetainLossType!=null &&
              this.cetainLossType.equals(other.getCetainLossType()))) &&
            ((this.componentList==null && other.getComponentList()==null) || 
             (this.componentList!=null &&
              java.util.Arrays.equals(this.componentList, other.getComponentList()))) &&
            ((this.defLossDate==null && other.getDefLossDate()==null) || 
             (this.defLossDate!=null &&
              this.defLossDate.equals(other.getDefLossDate()))) &&
            ((this.defSite==null && other.getDefSite()==null) || 
             (this.defSite!=null &&
              this.defSite.equals(other.getDefSite()))) &&
            ((this.deflossMainId==null && other.getDeflossMainId()==null) || 
             (this.deflossMainId!=null &&
              this.deflossMainId.equals(other.getDeflossMainId()))) &&
            ((this.deflossRemark==null && other.getDeflossRemark()==null) || 
             (this.deflossRemark!=null &&
              this.deflossRemark.equals(other.getDeflossRemark()))) &&
            ((this.dutyType==null && other.getDutyType()==null) || 
             (this.dutyType!=null &&
              this.dutyType.equals(other.getDutyType()))) &&
            ((this.estimateNo==null && other.getEstimateNo()==null) || 
             (this.estimateNo!=null &&
              this.estimateNo.equals(other.getEstimateNo()))) &&
            ((this.factory==null && other.getFactory()==null) || 
             (this.factory!=null &&
              this.factory.equals(other.getFactory()))) &&
            ((this.fileInfoList==null && other.getFileInfoList()==null) || 
             (this.fileInfoList!=null &&
              java.util.Arrays.equals(this.fileInfoList, other.getFileInfoList()))) &&
            ((this.frameNo==null && other.getFrameNo()==null) || 
             (this.frameNo!=null &&
              this.frameNo.equals(other.getFrameNo()))) &&
            ((this.handlerCode==null && other.getHandlerCode()==null) || 
             (this.handlerCode!=null &&
              this.handlerCode.equals(other.getHandlerCode()))) &&
            ((this.handlerName==null && other.getHandlerName()==null) || 
             (this.handlerName!=null &&
              this.handlerName.equals(other.getHandlerName()))) &&
            ((this.licenseNo==null && other.getLicenseNo()==null) || 
             (this.licenseNo!=null &&
              this.licenseNo.equals(other.getLicenseNo()))) &&
            ((this.licenseType==null && other.getLicenseType()==null) || 
             (this.licenseType!=null &&
              this.licenseType.equals(other.getLicenseType()))) &&
            ((this.lossCarKindCode==null && other.getLossCarKindCode()==null) || 
             (this.lossCarKindCode!=null &&
              this.lossCarKindCode.equals(other.getLossCarKindCode()))) &&
            ((this.lossCarKindName==null && other.getLossCarKindName()==null) || 
             (this.lossCarKindName!=null &&
              this.lossCarKindName.equals(other.getLossCarKindName()))) &&
            ((this.lossItemType==null && other.getLossItemType()==null) || 
             (this.lossItemType!=null &&
              this.lossItemType.equals(other.getLossItemType()))) &&
            ((this.lossPart==null && other.getLossPart()==null) || 
             (this.lossPart!=null &&
              this.lossPart.equals(other.getLossPart()))) &&
            ((this.manageFeeRate==null && other.getManageFeeRate()==null) || 
             (this.manageFeeRate!=null &&
              this.manageFeeRate.equals(other.getManageFeeRate()))) &&
            ((this.material==null && other.getMaterial()==null) || 
             (this.material!=null &&
              java.util.Arrays.equals(this.material, other.getMaterial()))) &&
            ((this.otherFeeList==null && other.getOtherFeeList()==null) || 
             (this.otherFeeList!=null &&
              java.util.Arrays.equals(this.otherFeeList, other.getOtherFeeList()))) &&
            ((this.registNo==null && other.getRegistNo()==null) || 
             (this.registNo!=null &&
              this.registNo.equals(other.getRegistNo()))) &&
            ((this.repairList==null && other.getRepairList()==null) || 
             (this.repairList!=null &&
              java.util.Arrays.equals(this.repairList, other.getRepairList()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.sumComFee==null && other.getSumComFee()==null) || 
             (this.sumComFee!=null &&
              this.sumComFee.equals(other.getSumComFee()))) &&
            ((this.sumLoss==null && other.getSumLoss()==null) || 
             (this.sumLoss!=null &&
              this.sumLoss.equals(other.getSumLoss()))) &&
            ((this.sumManageFee==null && other.getSumManageFee()==null) || 
             (this.sumManageFee!=null &&
              this.sumManageFee.equals(other.getSumManageFee()))) &&
            ((this.sumMaterialFee==null && other.getSumMaterialFee()==null) || 
             (this.sumMaterialFee!=null &&
              this.sumMaterialFee.equals(other.getSumMaterialFee()))) &&
            ((this.sumOtherFee==null && other.getSumOtherFee()==null) || 
             (this.sumOtherFee!=null &&
              this.sumOtherFee.equals(other.getSumOtherFee()))) &&
            ((this.sumRemnant==null && other.getSumRemnant()==null) || 
             (this.sumRemnant!=null &&
              this.sumRemnant.equals(other.getSumRemnant()))) &&
            ((this.sumRepairFee==null && other.getSumRepairFee()==null) || 
             (this.sumRepairFee!=null &&
              this.sumRepairFee.equals(other.getSumRepairFee()))) &&
            ((this.sumRescueFee==null && other.getSumRescueFee()==null) || 
             (this.sumRescueFee!=null &&
              this.sumRescueFee.equals(other.getSumRescueFee()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
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
        if (getCertainCode() != null) {
            _hashCode += getCertainCode().hashCode();
        }
        if (getCertainName() != null) {
            _hashCode += getCertainName().hashCode();
        }
        if (getCetainLossType() != null) {
            _hashCode += getCetainLossType().hashCode();
        }
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
        if (getDefLossDate() != null) {
            _hashCode += getDefLossDate().hashCode();
        }
        if (getDefSite() != null) {
            _hashCode += getDefSite().hashCode();
        }
        if (getDeflossMainId() != null) {
            _hashCode += getDeflossMainId().hashCode();
        }
        if (getDeflossRemark() != null) {
            _hashCode += getDeflossRemark().hashCode();
        }
        if (getDutyType() != null) {
            _hashCode += getDutyType().hashCode();
        }
        if (getEstimateNo() != null) {
            _hashCode += getEstimateNo().hashCode();
        }
        if (getFactory() != null) {
            _hashCode += getFactory().hashCode();
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
        if (getFrameNo() != null) {
            _hashCode += getFrameNo().hashCode();
        }
        if (getHandlerCode() != null) {
            _hashCode += getHandlerCode().hashCode();
        }
        if (getHandlerName() != null) {
            _hashCode += getHandlerName().hashCode();
        }
        if (getLicenseNo() != null) {
            _hashCode += getLicenseNo().hashCode();
        }
        if (getLicenseType() != null) {
            _hashCode += getLicenseType().hashCode();
        }
        if (getLossCarKindCode() != null) {
            _hashCode += getLossCarKindCode().hashCode();
        }
        if (getLossCarKindName() != null) {
            _hashCode += getLossCarKindName().hashCode();
        }
        if (getLossItemType() != null) {
            _hashCode += getLossItemType().hashCode();
        }
        if (getLossPart() != null) {
            _hashCode += getLossPart().hashCode();
        }
        if (getManageFeeRate() != null) {
            _hashCode += getManageFeeRate().hashCode();
        }
        if (getMaterial() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaterial());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaterial(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherFeeList(), i);
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSumComFee() != null) {
            _hashCode += getSumComFee().hashCode();
        }
        if (getSumLoss() != null) {
            _hashCode += getSumLoss().hashCode();
        }
        if (getSumManageFee() != null) {
            _hashCode += getSumManageFee().hashCode();
        }
        if (getSumMaterialFee() != null) {
            _hashCode += getSumMaterialFee().hashCode();
        }
        if (getSumOtherFee() != null) {
            _hashCode += getSumOtherFee().hashCode();
        }
        if (getSumRemnant() != null) {
            _hashCode += getSumRemnant().hashCode();
        }
        if (getSumRepairFee() != null) {
            _hashCode += getSumRepairFee().hashCode();
        }
        if (getSumRescueFee() != null) {
            _hashCode += getSumRescueFee().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeflossCarInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossCarInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certainCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "certainCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certainName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "certainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cetainLossType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "cetainLossType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "componentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Component"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Component"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defLossDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "defLossDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defSite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "defSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deflossMainId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "deflossMainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deflossRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "deflossRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "dutyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimateNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "estimateNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "factory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Factory"));
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
        elemField.setFieldName("frameNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "frameNo"));
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
        elemField.setFieldName("handlerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "handlerName"));
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
        elemField.setFieldName("licenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "licenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossCarKindCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "lossCarKindCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossCarKindName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "lossCarKindName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "lossItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "lossPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageFeeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "manageFeeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("material");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "material"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Material"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Material"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "otherFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "OtherFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "OtherFee"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "registNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "repairList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Repair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Repair"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumComFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumComFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("sumManageFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumManageFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumMaterialFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumMaterialFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumOtherFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumOtherFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumRemnant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumRemnant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumRepairFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumRepairFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumRescueFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "sumRescueFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
