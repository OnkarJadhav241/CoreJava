package com.remotecontrolelectroincs;

public class Light implements SmartDevice {

	@Override
	public void powerOn() {
		System.out.println("Light PowerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("Light PowerOff");
	}

}
