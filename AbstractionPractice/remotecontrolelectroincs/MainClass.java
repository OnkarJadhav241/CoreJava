package com.remotecontrolelectroincs;

public class MainClass {

	public static void main(String[] args) {
		
		SmartDevice s;
		
		s=new Light();
		s.powerOn();
		s.powerOff();
		
		s=new AC();
		s.powerOn();
		s.powerOff();
		
		s=new Fan();
		s.powerOn();
		s.powerOff();

	}

}
