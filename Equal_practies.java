class Equal_practies
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		System.out.println(a==b);
		System.out.println(a==b);
		
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);         //true
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equalsIgnoreCase(s2));  //true
		
		
	}
}
