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
/*     */ @Table(name="SURVEYTASKINFO")
/*     */ public class SurveyTaskInfo
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Long taskInfoId;
/*     */   private String taskId;
/*     */   private String userCode;
/*     */   private String surveyPlace;
/*     */   private String surveyReport;
/*     */   private Integer imageNum;
/*     */   private String uploadState;
/*     */ 
/*     */   @SequenceGenerator(name="generator", allocationSize=1, sequenceName="SEQ_RSURVEYTASKINFO")
/*     */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generator")
/*     */   @Column(name="TASKINFOID")
/*     */   public Long getTaskInfoId()
/*     */   {
/*  58 */     return this.taskInfoId;
/*     */   }
/*     */ 
/*     */   public void setTaskInfoId(Long taskInfoId) {
/*  62 */     this.taskInfoId = taskInfoId;
/*     */   }
/*     */   @Column(name="TASKID")
/*     */   public String getTaskId() {
/*  67 */     return this.taskId;
/*     */   }
/*     */ 
/*     */   public void setTaskId(String taskId) {
/*  71 */     this.taskId = taskId;
/*     */   }
/*     */   @Column(name="USERCODE")
/*     */   public String getUserCode() {
/*  76 */     return this.userCode;
/*     */   }
/*     */ 
/*     */   public void setUserCode(String userCode) {
/*  80 */     this.userCode = userCode;
/*     */   }
/*     */   @Column(name="SURVEYPLACE")
/*     */   public String getSurveyPlace() {
/*  85 */     return this.surveyPlace;
/*     */   }
/*     */ 
/*     */   public void setSurveyPlace(String surveyPlace) {
/*  89 */     this.surveyPlace = surveyPlace;
/*     */   }
/*     */   @Column(name="SURVEYREPORT")
/*     */   public String getSurveyReport() {
/*  94 */     return this.surveyReport;
/*     */   }
/*     */ 
/*     */   public void setSurveyReport(String surveyReport) {
/*  98 */     this.surveyReport = surveyReport;
/*     */   }
/*     */   @Column(name="IMAGENUM")
/*     */   public Integer getImageNum() {
/* 103 */     return this.imageNum;
/*     */   }
/*     */ 
/*     */   public void setImageNum(Integer imageNum) {
/* 107 */     this.imageNum = imageNum;
/*     */   }
/*     */   @Column(name="UPLOADSTATE")
/*     */   public String getUploadState() {
/* 112 */     return this.uploadState;
/*     */   }
/*     */ 
/*     */   public void setUploadState(String uploadState) {
/* 116 */     this.uploadState = uploadState;
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.model.pojo.SurveyTaskInfo
 * JD-Core Version:    0.6.0
 */