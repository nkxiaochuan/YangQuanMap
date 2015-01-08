/*     */ package cn.com.sinosoft.mobileplat.model.pojo;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.GeneratedValue;
/*     */ import javax.persistence.GenerationType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.SequenceGenerator;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Temporal;
/*     */ import javax.persistence.TemporalType;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="SURVEYIMAGEINFO")
/*     */ public class SurveyImageInfo
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Long imageInfoId;
/*     */   private String taskId;
/*     */   private Integer serialNo;
/*     */   private String imageNo;
/*     */   private String imageType;
/*     */   private String imageRemark;
/*     */   private String imageName;
/*     */   private Long imageSize;
/*     */   private String imageAddress;
/*     */   private Date imageDate;
/*     */   private String imageDir;
/*     */   private String imageMd5;
/*     */ 
/*     */   @SequenceGenerator(name="generator", allocationSize=1, sequenceName="SEQ_SURVEYIMAGEINFO")
/*     */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generator")
/*     */   @Column(name="IMAGEINFOID")
/*     */   public Long getImageInfoId()
/*     */   {
/*  72 */     return this.imageInfoId;
/*     */   }
/*     */ 
/*     */   public void setImageInfoId(Long imageInfoId) {
/*  76 */     this.imageInfoId = imageInfoId;
/*     */   }
/*     */   @Column(name="TASKID")
/*     */   public String getTaskId() {
/*  81 */     return this.taskId;
/*     */   }
/*     */ 
/*     */   public void setTaskId(String taskId) {
/*  85 */     this.taskId = taskId;
/*     */   }
/*     */   @Column(name="SERIALNO")
/*     */   public Integer getSerialNo() {
/*  90 */     return this.serialNo;
/*     */   }
/*     */ 
/*     */   public void setSerialNo(Integer serialNo) {
/*  94 */     this.serialNo = serialNo;
/*     */   }
/*     */   @Column(name="IMAGENO")
/*     */   public String getImageNo() {
/*  99 */     return this.imageNo;
/*     */   }
/*     */ 
/*     */   public void setImageNo(String imageNo) {
/* 103 */     this.imageNo = imageNo;
/*     */   }
/*     */   @Column(name="IMAGETYPE")
/*     */   public String getImageType() {
/* 108 */     return this.imageType;
/*     */   }
/*     */ 
/*     */   public void setImageType(String imageType) {
/* 112 */     this.imageType = imageType;
/*     */   }
/*     */   @Column(name="IMAGEREMARK")
/*     */   public String getImageRemark() {
/* 117 */     return this.imageRemark;
/*     */   }
/*     */ 
/*     */   public void setImageRemark(String imageRemark) {
/* 121 */     this.imageRemark = imageRemark;
/*     */   }
/*     */   @Column(name="IMAGENAME")
/*     */   public String getImageName() {
/* 126 */     return this.imageName;
/*     */   }
/*     */ 
/*     */   public void setImageName(String imageName) {
/* 130 */     this.imageName = imageName;
/*     */   }
/*     */   @Column(name="IMAGESIZE")
/*     */   public Long getImageSize() {
/* 135 */     return this.imageSize;
/*     */   }
/*     */ 
/*     */   public void setImageSize(Long imageSize) {
/* 139 */     this.imageSize = imageSize;
/*     */   }
/*     */   @Column(name="IMAGEADDRESS")
/*     */   public String getImageAddress() {
/* 144 */     return this.imageAddress;
/*     */   }
/*     */ 
/*     */   public void setImageAddress(String imageAddress) {
/* 148 */     this.imageAddress = imageAddress;
/*     */   }
/* 154 */   @Temporal(TemporalType.TIMESTAMP)
/*     */   @Column(name="IMAGEDATE")
/*     */   public Date getImageDate() { return this.imageDate; }
/*     */ 
/*     */   public void setImageDate(Date imageDate)
/*     */   {
/* 158 */     this.imageDate = imageDate;
/*     */   }
/*     */   @Column(name="IMAGEDIR")
/*     */   public String getImageDir() {
/* 163 */     return this.imageDir;
/*     */   }
/*     */ 
/*     */   public void setImageDir(String imageDir) {
/* 167 */     this.imageDir = imageDir;
/*     */   }
/*     */   @Column(name="IMAGEMD5")
/*     */   public String getImageMd5() {
/* 172 */     return this.imageMd5;
/*     */   }
/*     */ 
/*     */   public void setImageMd5(String imageMd5) {
/* 176 */     this.imageMd5 = imageMd5;
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.model.pojo.SurveyImageInfo
 * JD-Core Version:    0.6.0
 */