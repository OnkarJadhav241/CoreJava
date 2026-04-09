package com.notificationsystem;

public class MainClass {

	public static void main(String[] args) {

       Notification n = new EmailNotification();
       n.sendMessage("Good Morning");
       
       Notification n1 = new SMSNotification();
       n1.sendMessage("Hello");
       
       Notification n2 = new WhatsAppNotification();
       n2.sendMessage("How are you");

	}

}
