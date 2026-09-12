package com.increament_decreament;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
	//	a++;  //increament a value print a=11
		a=a++;//now we are a value assain to a but a is apost increament so result is 10
		System.out.println("a= "+a);
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//hari sir 
		int x=1;
		x=++x;   //pre increament 
		System.out.println("x= "+x);
		x=1;
		x=x++;  //post increanment out put is 1 becase declear the value inilitation
		System.out.println("x= "+x);
	}

}
