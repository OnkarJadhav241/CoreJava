package com.authenticationsystem;

public class FacebookAuth implements Authentication {

	@Override
	public void login() {
		System.out.println("FacebookLogin Successful...!");
	}

	@Override
	public void logout() {
		System.out.println("Facebook Logout Successful...!");
	}
}
