package com.notificationsystem;

public class SMSNotification implements Notification {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Welcome to SMS.....!");
		System.out.println(msg);
	}
}
