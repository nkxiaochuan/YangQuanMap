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
/*     */ @Table(name="USERREGIST")
/*     */ public class UserRegist
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Long userRegistId;
/*     */   private String userCode;
/*     */   private String mobileId;
/*     */   private String mobileType;
/*     */   private String validateFlag;
/*     */   private String tokenId;
/*     */ 
/*     */   @SequenceGenerator(name="generator", allocationSize=1, sequenceName="SEQ_USERREGIST")
/*     */   @Id
/*     */   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generator")
/*     */   @Column(name="USERREGISTID")
/*     */   public Long getUserRegistId()
/*     */   {
/*  44 */     return this.userRegistId;
/*     */   }
/*     */ 
/*     */   public void setUserRegistId(Long userRegistId) {
/*  48 */     this.userRegistId = userRegistId;
/*     */   }
/*     */ 
/*     */   @Column(name="USERCODE")
/*     */   public String getUserCode()
/*     */   {
/*  57 */     return this.userCode;
/*     */   }
/*     */ 
/*     */   public void setUserCode(String userCode) {
/*  61 */     this.userCode = userCode;
/*     */   }
/*     */   @Column(name="MOBILEID")
/*     */   public String getMobileId() {
/*  66 */     return this.mobileId;
/*     */   }
/*     */ 
/*     */   public void setMobileId(String mobileId) {
/*  70 */     this.mobileId = mobileId;
/*     */   }
/*     */   @Column(name="MOBILETYPE")
/*     */   public String getMobileType() {
/*  75 */     return this.mobileType;
/*     */   }
/*     */ 
/*     */   public void setMobileType(String mobileType) {
/*  79 */     this.mobileType = mobileType;
/*     */   }
/*     */   @Column(name="VALIDATEFLAG")
/*     */   public String getValidateFlag() {
/*  84 */     return this.validateFlag;
/*     */   }
/*     */ 
/*     */   public void setValidateFlag(String validateFlag) {
/*  88 */     this.validateFlag = validateFlag;
/*     */   }
/*     */ 
/*     */   public static long getSerialversionuid() {
/*  92 */     return 1L;
/*     */   }
/*     */   @Column(name="TOKENID")
/*     */   public String getTokenId() {
/*  97 */     return this.tokenId;
/*     */   }
/*     */ 
/*     */   public void setTokenId(String tokenId) {
/* 101 */     this.tokenId = tokenId;
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.model.pojo.UserRegist
 * JD-Core Version:    0.6.0
 */