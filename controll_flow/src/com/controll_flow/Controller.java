package com.controll_flow;

public class Controller {

	static void decetion(int a) {
		if(a==10)
			System.out.println("a==10");
		System.out.println("a is printed");
	}
	public static void main(String[] args) {
		decetion(10);// this is static no need object 
		
		
	}
}
