package com.prints;

public class ClassMain {

	public static void main(String[] args) {
		
		Printer p;
		
		p=new InkjetPrinter();
		p.print();
		
		p=new LaserPrinter();
		p.print();

	}

}
