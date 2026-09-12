package com.seaeadClass;



	public class Employee implements Runnable{
		
		
		public void run() {
			System.out.println("Thread  is executed");
		}
		public static void main(String[] args) {
			
			
			Employee employee = new Employee();
			Thread thread1 = new Thread(employee);
			Thread thread2 = new Thread(employee);
			Thread thread3 = new Thread(employee);
			Thread thread4 = new Thread(employee);
			thread1.start();
			
			String name = "hell0";
			
			for(int i= name.length()-1 ; i>=0 ; i--) {
				System.out.print(name.charAt(i));  //reerse string
			}
	// find the bigest number 10,60,24
	int a=10 ,b=60,c=24;
			
			if((a>b)&&(a>c)) {
				System.out.println("a is big");
				}
			else if((b>a)&&(b>c)){
				System.out.printf("%d big",b);
			}else {
				System.out.println("c is big");
			}				
			
				
			
}
}