package com.amazone_project;

public class Ellipsis {

	public void practics(int a, int b, int c) {

		int resut = a + b + c;
//	System.out.println(resut);
	}

//this is Ellipss try to the this is code 
	public void addition(int... number) {
		long sum = 0;
		for(int num :number) {
			sum= (long)sum+num;   //type casting is int to long cannot ype casting  aso is execute the progrom theats not any error but this good practies
		}
		System.out.println((sum));
	}

	public static void main(String[] args) {

		Ellipsis ellipsis = new Ellipsis();
		ellipsis.addition(1000098887, 2088777877, 309999999,12212,143337,343343,223323232,234223342);
	}
}
