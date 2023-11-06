package testpkg;

public abstract class MyClass  //concrete,  abstract  
{

	int a = 20;
	
	public void meth1()    //concrete
	{
		a = 30;
		System.out.println(a);
		System.out.println("this is my simple method");
	}
	
	public abstract void credential();   //abstract
	
	
	
	
	
}
