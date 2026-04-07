package com.remotecontrolelectroincs;

public class AC implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("AC PowerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("AC PowerOff");
	}

}
