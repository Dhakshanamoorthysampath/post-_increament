class Ifelse 
{
	static void m1(int a){
		
		if(a>10){
			m2();
		}
	}
	static void m2(){
			System.out.println("m2 executed  ");
		}
	public static void main(String[] args) 
	{
		Ifelse el = new Ifelse();
		el.m1(20);
	}
}
