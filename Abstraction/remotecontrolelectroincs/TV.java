package com.remotecontrolelectroincs;

public class TV implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("TV PowerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("TV PowerOff");
	}

}
