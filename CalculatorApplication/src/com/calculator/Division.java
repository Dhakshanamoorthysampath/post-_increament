package com.calculator;

public class Division {
public double division(int a ,int b) {
	if(b==0) {//control arithamatic exception
		System.out.println("cannot diveded by zero");
		return 0;
	}else {
		return a%b;
	}
}
}
