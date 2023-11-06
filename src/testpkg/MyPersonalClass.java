package testpkg;

public class MyPersonalClass extends MyClass
{

	
	public void credential() 
	{
	
		System.out.println("username and password");
		
	}

	
	public static void main(String[] args) 
	{
		MyPersonalClass mp = new MyPersonalClass();
		mp.meth1();
		mp.credential();
		
		
	}
	
}
