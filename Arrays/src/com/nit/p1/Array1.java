package com.nit.p1;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
     int a[]= new int[5];//array object creation
     a[0]=1;
     a[1]=2;
     System.out.println(Arrays.toString(a));
     //declear arr (int arr[])
     int arr[]={1,2,3,4,5};// array inililation
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
     for(int B:arr) {
    	 System.out.println(B);
     }
	}   

}
