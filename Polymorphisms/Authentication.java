package com.polymorphism;

public class Authentication {

	public void login(String username) {
		System.out.println("Username : " + username);
	}

	public void login(String username, String password) {
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}
}
