package com.custumer;

public class Manager {

	public static void main(String[] args) {
		 
		AccountHolder accountHolder1 = new AccountHolder();
		accountHolder1.accountType ="saving";
		accountHolder1.mobileNum = 9988667724L;
		accountHolder1.name ="Tamil";
		
		System.out.println(accountHolder1.accountType);
		System.out.println(accountHolder1.mobileNum);
		System.out.println(accountHolder1.name);
		
		AccountHolder accountHolder2 = new AccountHolder();
		accountHolder2.accountType ="current";
		accountHolder2.mobileNum = 99111117724L;
		accountHolder2.name ="Durai";
	//	System.out.println(accountHolder2.getValue());
	//	System.out.println(accountHolder2.getKey());
		System.out.println(accountHolder2.accountType);
		System.out.println(accountHolder2.mobileNum);
		System.out.println(accountHolder2.name);
		
		
		new Manager();//instan
	}
}
