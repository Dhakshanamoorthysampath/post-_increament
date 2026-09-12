  
package com.tnAadharcard;

public class ApplayAadharCard {

	String Name;      //non static variable >instance object is created
	String userId;    
	long[] phoneNumber;
	long aadharNumber;
	public static void main(String[] args) {
		
		ApplayAadharCard aadharCard = new ApplayAadharCard();
		aadharCard.Name = "Ramu";
		aadharCard.userId = "123jf456";
		aadharCard.phoneNumber = new long[2];//declear the array
		aadharCard.phoneNumber[0] = 9629911122L;//inisilasation or assing the value
		aadharCard.phoneNumber[1] = 63807334455L;
		aadharCard.aadharNumber   =   111122223333L;
		
		
		System.out.println(aadharCard.Name);//print the instance variable with object reference 
		System.out.println(aadharCard.userId);
		System.out.println(aadharCard.phoneNumber[0] );
		System.out.println(aadharCard.phoneNumber[1]);
		System.out.println(aadharCard.aadharNumber);
		
	}
}


