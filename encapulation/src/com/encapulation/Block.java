package com.encapulation;

public class Block {

	{
		System.out.println("non static block is executed ");
	}
	public void m1() {
		System.out.println("method executed");
		{
			System.out.println("local block is executed");
		}
	}
	public static void main(String[] args) {
		Block b = new Block();
		b.m1();
	}
}
