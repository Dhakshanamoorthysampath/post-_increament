package com.seaeadClass;

//sealed class is java 17 feacture
public sealed class SealedClass permits Student1 ,Student2  {

	public void studentMark(){
		System.out.println("sealed class is execute ");
	}
	
}
