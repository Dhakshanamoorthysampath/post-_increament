package com.seaeadClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PaymentSerice {

	public static void main(String[] args) {
		
	
		 int _salarey = 300000;
		 System.out.println(_salarey);
		ExecutorService executor  = Executors.newFixedThreadPool(2);
		System.out.println("thired is sucessfully run");
		
		executor.submit(()->sendMail());
		
		executor.submit(()->{
			System.out.println(" 1 thread is executed\n");
		});
		
		executor.submit(()->{
			System.out.println(" 2 thread is executer\n");
		});
		
		executor.submit(()->{
			System.out.println(" 3 thread thred execute\n");
		});
		
		
		
		executor.submit(()->{
			System.out.println("thread is  waiting\n");
		});
		executor.shutdown();
		
	}
	static void sendMail() {
		System.out.println(" 1 thread is execute");
	}



		
	}
	}










