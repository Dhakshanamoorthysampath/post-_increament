package com.wells_fargo;

public class EnhanceSwitchCase {

	public static void main(String[] args) {
		int num = Integer.parseInt(IO.readln("Enter the num :").trim());
		
		String result1 = calander(num);
		System.out.println(result1);
		String result2 = dayCalculat(num);
		System.out.println(result2);
	}


public static String calander(int num) {
	//old switch case
	switch(num) {
	
	case 1:
		return "monday";
		
	case 2: //{
	//	System.out.println("case 2 body is executed");
		
	//	yield "Tuesday";
		return "Tuesday";
	//}
//	return "Tuesday";	
		
	case 3:
		return "wensday";
	case 4:
		return "Thusday";
	case 5:
		return "fridayday";
	case 6:
		return "saterday";
	case 7:
		return "sunday";
		default:
			return "Invalid day";
	
	}
}
//Enhance switch case
static String dayCalculat(int num) {
	
	String dayOutPut = switch(num) {
	case 1 ->"monday";
	case 2 ->"Tuesday";
	case 3 ->"wenesday";
	case 4 ->"Thusday";
	case 5 ->"friday";
	case 6 ->"saterday";
	case 7 ->"sunday";
	default ->"invalid day";
	
	
	};
	
	return dayOutPut;
	
}
}