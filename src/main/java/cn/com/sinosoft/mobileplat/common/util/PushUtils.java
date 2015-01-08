/*     */ package cn.com.sinosoft.mobileplat.common.util;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ import javapns.back.PushNotificationManager;
/*     */ import javapns.data.Device;
/*     */ import javapns.data.PayLoad;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.fusesource.mqtt.client.BlockingConnection;
/*     */ import org.fusesource.mqtt.client.MQTT;
/*     */ import org.fusesource.mqtt.client.Message;
/*     */ import org.fusesource.mqtt.client.QoS;
/*     */ import org.fusesource.mqtt.client.Topic;
/*     */ 
/*     */ public class PushUtils
/*     */ {
/*  17 */   private static Logger logger = Logger.getLogger(PushUtils.class);
/*     */ 
/*     */   public void androidPush2One(String userIp, int port, String topic, String messageContent)
/*     */     throws Exception
/*     */   {
/*  30 */     MQTT mqtt = new MQTT();
/*  31 */     mqtt.setHost(userIp, port);
/*     */ 
/*  33 */     BlockingConnection connection = mqtt.blockingConnection();
/*  34 */     connection.connect();
/*     */ 
/*  37 */     connection.publish(topic, messageContent.getBytes(), QoS.AT_LEAST_ONCE, true);
/*     */ 
/*  40 */     Topic[] topics = { new Topic("foo", QoS.AT_LEAST_ONCE) };
/*  41 */     byte[] qoses = connection.subscribe(topics);
/*  42 */     System.out.println(new String(qoses));
/*     */ 
/*  44 */     Message message = connection.receive();
/*  45 */     System.out.println(message.getTopic());
/*  46 */     byte[] payload = message.getPayload();
/*  47 */     System.out.println(new String(payload));
/*     */ 
/*  50 */     message.ack();
/*     */ 
/*  52 */     connection.disconnect();
/*     */ 
/*  54 */     logger.info("android 推送消息内容：" + messageContent);
/*  55 */     logger.info("android 推送消息成功");
/*     */   }
/*     */ 
/*     */   public void iphonePush2One(String p12File, String p12Pass, String deviceToken, String content)
/*     */   {
/*  79 */     String host = "gateway.push.apple.com";
/*  80 */     int port = 2195;
/*     */     try
/*     */     {
/*  83 */       PayLoad payLoad = new PayLoad();
/*  84 */       payLoad.addAlert(content);
/*  85 */       payLoad.addBadge(1);
/*  86 */       payLoad.addSound("default");
/*     */ 
/*  90 */       PushNotificationManager pushManager = 
/*  91 */         PushNotificationManager.getInstance();
/*  92 */       pushManager.addDevice("iPhone", deviceToken);
/*     */ 
/*  95 */       pushManager.initializeConnection(host, port, p12File, p12Pass, 
/*  96 */         "PKCS12");
/*     */ 
/*  99 */       Device client = pushManager.getDevice("iPhone");
/* 100 */       pushManager.sendNotification(client, payLoad);
/*     */ 
/* 102 */       pushManager.stopConnection();
/* 103 */       pushManager.removeDevice("iPhone");
/* 104 */       logger.info("iphone 推送消息内容：" + payLoad.toString());
/* 105 */       logger.info("iphone 推送消息成功");
/*     */     }
/*     */     catch (Exception e) {
/* 108 */       logger.error("iphone 推送消息异常：" + e.getMessage());
/* 109 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void iphonePush2More(String p12File, String p12Pass, List<String> deviceTokens, String content)
/*     */   {
/* 133 */     String host = "gateway.sandbox.push.apple.com";
/* 134 */     int port = 2195;
/*     */     try
/*     */     {
/* 137 */       PayLoad payLoad = new PayLoad();
/* 138 */       payLoad.addAlert(content);
/* 139 */       payLoad.addBadge(1);
/* 140 */       payLoad.addSound("default");
/*     */ 
/* 143 */       payLoad.addCustomDictionary("url", "www.baidu.com");
/* 144 */       PushNotificationManager pushManager = 
/* 145 */         PushNotificationManager.getInstance();
/*     */ 
/* 148 */       pushManager.initializeConnection(host, port, p12File, p12Pass, 
/* 149 */         "PKCS12");
/*     */ 
/* 152 */       for (int i = 0; i < deviceTokens.size(); i++) {
/* 153 */         pushManager.addDevice("iphone" + i, (String)deviceTokens.get(i));
/* 154 */         Device client = pushManager.getDevice("iphone" + i);
/* 155 */         pushManager.sendNotification(client, payLoad);
/*     */       }
/*     */ 
/* 158 */       pushManager.stopConnection();
/* 159 */       for (int i = 0; i < deviceTokens.size(); i++) {
/* 160 */         pushManager.removeDevice("iphone" + i);
/*     */       }
/* 162 */       logger.info("iphone 推送消息成功");
/*     */     }
/*     */     catch (Exception e) {
/* 165 */       logger.error("iphone 推送消息异常：" + e.getMessage());
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */     throws Exception
/*     */   {
/* 174 */     String deviceToken2 = "279e83d66645395253f9ec09d503fed1dcb564a0ae0de27588d6c601b58ca1a2";
/*     */ 
/* 178 */     System.out.println("token长度:" + deviceToken2.length());
/*     */ 
/* 180 */     String content = "移动查勘系统Iphone推送测试";
/*     */ 
/* 183 */     String p12File = "g:/Iphone/LiuZhen.p12";
/* 184 */     String p12FilePassword = "com.secneo.push.LiuZhen";
/*     */ 
/* 187 */     new PushUtils().iphonePush2One(p12File, p12FilePassword, deviceToken2, content);
/*     */   }
/*     */ }

/* Location:           C:\Users\DeathSilence\Desktop\mobileplat\mobileplat\WEB-INF\classes\
 * Qualified Name:     cn.com.sinosoft.mobileplat.common.util.PushUtils
 * JD-Core Version:    0.6.0
 */