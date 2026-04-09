package com.remotecontrolelectroincs;

public class AC implements SmartDevice{

	@Override
	public void powerOn() {
		System.out.println("AC PowerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("AC PowerOff");
	}

}
