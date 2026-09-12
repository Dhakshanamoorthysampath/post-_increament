package com.seaeadClass;

public class FindLargestMax {

	public static void main(String[] args) {
		
		int a = 10 ,b = 25, c = 15;
		int largestvalue = Math.max(a,Math.max(b,c)); //maximum value
		System.out.println("largestvalue = "+largestvalue);
		
		int smallestvalue = Math.min(a,Math.min(b, c));//  minum value
		
		System.out.println("smallestvalue = "+smallestvalue);
	}
}
