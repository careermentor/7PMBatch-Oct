package testpkg;

public class MYInterfaceClass implements MyInterface
{

	
	public void meth2() 
	{
	
		System.out.println("this is interface methods");
		
	}
	
	public void meth3()
	{
		System.out.println("this is simple method of class");
	}

	
	public static void main(String[] args) {
		MYInterfaceClass mi = new MYInterfaceClass();
		mi.meth2();
		mi.meth3();
	}
	
	
}
