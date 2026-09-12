package com.seaeadClass;

public class FindLargestIFelse {
// find largest number usig if ifese using get the out put
// smallestt number also we can same way	
	public static void main(String[] args) {
		int a = 10,b = 25,c =15;
		
		if((a<b)&&(a<c)) {
			System.out.println("largest & smallest = "+a);
		}else if((b<c)&&(b<a)){
			System.out.println("largest & smallest = "+b);
		}else{
			System.out.println("largest & smallest = "+c);
		}
	}
}
 // time compecity is O(1) ony one time execute the code 
//  space compecity is O(1) space compecity aso same resut