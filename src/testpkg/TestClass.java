package testpkg;

public class TestClass 
{

	int a = 10;
	float b = 10.5f;
	char c = 'X';
	String name = "Java";
	boolean d = true;
	
	public void printValues()
	{
	
		System.out.println(a);
		System.out.println("welcome to java programming world");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(name);
		
		System.out.println("This is value of a: " + a);
		
		System.out.println(10+20);
		System.out.println("10" + 20);
		
	}
	
	
	public static void main(String[] args) 
	{
		TestClass abc = new TestClass();   //object of the class
		abc.printValues();
		//System.out.println(abc.a);
		
	}
	
	
}
