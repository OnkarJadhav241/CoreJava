package com.authenticationsystem;

public class MainClass {

	public static void main(String[] args) {
	
		Authentication a= new GoogleAuth();
		a.login();
		a.logout();
		
		Authentication a1= new FacebookAuth();
		a1.login();
		a1.logout();
		

	}

}
