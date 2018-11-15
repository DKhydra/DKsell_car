package com.fnzb.utils.event;

public class CodeTpye {

   //验证码
   private static final String verificationCode = "SMS_150737939";

   //短信通知
   private static final String notificationCode = "SMS_150742739";


   public static String getVerificationCode() {
      return verificationCode;
   }

   public static String getNotificationCode() {
      return notificationCode;
   }
}
