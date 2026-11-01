
package com.calculator;
import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		Addition       addition        = new Addition();
		Subtraction    sub             = new Subtraction();
		Multiplecation multi           = new Multiplecation();
		Division       div             = new Division();
		
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("chose option ");
		System.out.println("1>Addition \n2> sutraction\n 3>multiplecation\n 4> Devisiioon");
		int option = sc.nextInt();
		
		System.out.println("enter the first number");
		int first = sc.nextInt();
		System.out.println("enter the second number");
		int second =sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println(addition.addtion(first,second));
			break;
		case 2:
			System.out.println(sub.subtractions(first,second));
			break;
		case 3:
		System.out.println(multi.multiplcation(first,second));
		break;
		case 4:
			System.out.println(div.division(first, second));
			break;
		}
		sc.close();
	}
}
