package com.remotecontrolelectroincs;

public class Fan implements SmartDevice{

	@Override
	public void powerOn() {
		System.out.println("Fan PowerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("Fan PowerOff");
	}

}
