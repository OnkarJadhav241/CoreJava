package com.notificationsystem;

public class EmailNotification implements Notification{
     
	@Override
	public void sendMessage(String msg) {
		System.out.println("Welcome to Email.....!");
		System.out.println(msg);
	}
}
