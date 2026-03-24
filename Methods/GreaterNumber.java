package com.methods;

public class GreaterNumber {

	public int gretestNumber() {
		int num1= 34,num2=43;
         if (num1>num2) {
        	 System.out.println(num1+" is greater than "+num2);
         }else if (num1<num2) {
        	 System.out.println(num2+" is greater than "+num1);
         }else if (num1==num2) {
        	 System.out.println(num1+" is equal to "+num2);
         }
		return 0;
	}
}
