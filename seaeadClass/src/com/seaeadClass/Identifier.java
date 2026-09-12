package com.seaeadClass;
// Ananomes class parent class hold
public class Identifier {  // calss identifier

	
	public void salarey() {
		
		System.out.println("saerey month 300000");
	}
	 new Identifier() {
			
			@Override
			public void salarey() {
				super.salarey();
				System.out.println("monthy 200000");
			}
		};
	
	
	public static void main(String[] args) {
		
	//	int =10;   //compie time eror
		int a = 10;  //this ariabe identefier  //method identifier  //class identifier
		
		Identifier identifier = new Identifier(); /*{
			
			@Override
			public void salarey() {
				super.salarey();
				System.out.println("monthy 200000");
			}
		};*/
		
		identifier.salarey();
	}
}
