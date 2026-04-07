package com.notificationsystem;

public class WhatsAppNotification implements Notification {
	
	@Override
	public void sendMessage(String msg) {
		System.out.println("Welcome to Whatsapp.....!");
		System.out.println(msg);
	}

}
