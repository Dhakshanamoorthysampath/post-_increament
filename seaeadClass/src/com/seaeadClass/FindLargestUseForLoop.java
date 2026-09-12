package com.seaeadClass;

public class FindLargestUseForLoop {
// find largest number
	public static void main(String[] args) {
		
		int arr[] = {10,60,32,79,40,24}; 
		
		int largestNum = arr[0];
  		for(int i = 1;i<arr.length;i++) {
			
			if(arr[i]>largestNum) {     //if(arr[i]<largestNum) { onny greater then and less than ony changed l the operater 
				
			//	arr[i] = largestNum;
				largestNum = arr[i];
			}
			
		}
		
		System.out.println("largest num = "+largestNum);
		
		
	}
}
