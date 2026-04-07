package com.authenticationsystem;

public class GoogleAuth implements Authentication {

	@Override
	public void login() {
		System.out.println("Google Login Successful...!");
	}

	@Override
	public void logout() {
		System.out.println("Google Logout Successful...!");
	}

}
