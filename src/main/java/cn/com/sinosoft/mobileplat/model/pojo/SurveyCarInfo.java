/*     */ package cn.com.sinosoft.mobileplat.model.pojo;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.SequenceGenerator;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="SURVEYCARINFO")
/*     */ public class SurveyCarInfo
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Long carInfoId;
/*     */   private String taskId;
/*     */   private String serialNo;
/*     */   private String lossItemType;
/*     */   private String licenseNo;
/*     */   private String dutyType;
/*     */   private String isLoss;
/*     */ 
/*     */   @SequenceGenerator(name="generator", allocationSize=1, sequenceName="SEQ_SURVEYCARINFO")
/*     */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generator")
/*     */   @Column(name="CARINFOID")
/*     */   public Long getCarInfoId()
/*     */   {
/*  64 */     return this.carInfoId;
/*     */   }
/*     */ 
/*     */   public void setCarInfoId(Long carInfoId) {
/*  68 */     this.carInfoId = carInfoId;
/*     */   }
/*     */   @Column(name="TASKID")
/*     */   public String getTaskId() {
/*  73 */     return this.taskId;
/*     */   }
/*     */ 
/*     */   public void setTaskId(String taskId) {
/*  77 */     this.taskId = taskId;
/*     */   }
/*     */   @Column(name="SERIALNO")
/*     */   public String getSerialNo() {
/*  82 */     return this.serialNo;
/*     */   }
/*     */ 
/*     */   public void setSerialNo(String serialNo) {
/*  86 */     this.serialNo = serialNo;
/*     */   }
/*     */   @Column(name="LOSSITEMTYPE")
/*     */   public String getLossItemType() {
/*  91 */     return this.lossItemType;
/*     */   }
/*     */ 
/*     */   public void setLossItemType(String lossItemType) {
/*  95 */     this.lossItemType = lossItemType;
/*     */   }
/*     */   @Column(name="LICENSENO")
/*     */   public String getLicenseNo() {
/* 100 */     return this.licenseNo;
/*     */   }
/*     */ 
/*     */   public void setLicenseNo(String licenseNo) {
/* 104 */     this.licenseNo = licenseNo;
/*     */   }
/*     */   @Column(name="DUTYTYPE")
/*     */   public String getDutyType() {
/* 109 */     return this.dutyType;
/*     */   }
/*     */ 
/*     */   public void setDutyType(String dutyType) {
/* 113 */     this.dutyType = dutyType;
/*     */   }
/*     */   @Column(name="ISLOSS")
/*     */   public String getIsLoss() {
/* 118 */     return this.isLoss;
/*     */   }
/*     */ 
/*     */   public void setIsLoss(String isLoss) {
/* 122 */     this.isLoss = isLoss;
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.model.pojo.SurveyCarInfo
 * JD-Core Version:    0.6.0
 */