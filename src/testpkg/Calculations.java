package testpkg;

public class Calculations 
{
	
	

	public float sum()   //no arguments/parameter
	{
		int a = 20;
		float b = 30.5f;
		float c = a+b;
		System.out.println("value of c: " + c);
		return c;
	}
	
	
	public int add(int a, int b)  //arguments/parameter
	{
		int c = a+b;
		System.out.println("sum of a & b: " + c);
		return c;
		
		//10+20+30
		//x=10+20
		//x+30
	}
	
	public int mul(int a, int b)  //arguments/parameter
	{
		int c = a*b;
		System.out.println("sum of a & b: " + c);
		return c;
		
		//10+20+30
		//x=10+20
		//x+30
	}
	
	public Calculations()
	{
		System.out.println("this is a constructor");
		
		int a = 20;
		float b = 30.5f;
		float c = a+b;
		System.out.println("value of c: " + c);
		
		
	}
	
	public Calculations(int a, int b)
	{
		int c = a+b;
		System.out.println("mul of a&b: " + c);
		System.out.println("this is a constructor");
		
	}
	
	
	
	public static void main(String[] args)
	{
	
		Calculations cal = new Calculations();  //automatically called when create object of the class
		
		Calculations cal1 = new Calculations(20, 30);
		
		cal1.sum();
		int x = cal.add(30, 40);
		cal.add(x, 60);
		
		cal.add(40, 50);
		
	}
	
}
