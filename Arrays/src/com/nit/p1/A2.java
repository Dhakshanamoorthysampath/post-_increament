package com.nit.p1;

public class A2 {

	public static void main(String[] args) {
		int arr[]= {1,-1,2,3,-8,5,-2,0,-11,4,-14};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println("Get positive values :"+arr[i]+",");
			}
			if(arr[i]<0) {
				System.out.println("Nagative values :"+arr[i]);
			}
		}

	}

}
