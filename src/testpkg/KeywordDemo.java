package testpkg;

public class KeywordDemo 
{
	
	static int i = 30;
	
	public static void printVar()
	{
		
		System.out.println(i);
		System.out.println("this is method");
	}
	
	public void meth2()
	{
		System.out.println("this is normal method");
	}
	
	public static void main(String[] args) 
	{
	
		//KeywordDemo kd = new KeywordDemo();
		
		
		KeywordDemo.printVar();
		KeywordDemo kd = new KeywordDemo();
		
		kd.meth2();
		
		
	}

}
