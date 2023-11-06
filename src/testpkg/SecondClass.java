package testpkg;

public class SecondClass 
{

	int a = 50;  //global variable
	
	
	public void printVar()
	{
		
		
		final int a = 60;  //local variable  //constant
		//a=100;
		System.out.println(a);  //60  // 100
		System.out.println(this.a);  //50
	}
	
	public void printanoVal()
	{
		a=200;
		System.out.println(a);  //50 //200
	}
	
	public void thirdmeth()
	{
		System.out.println(a); //50
	}
	
	
	public static void main(String[] args) 
	{
		
		SecondClass sc = new SecondClass();
		sc.printVar();
		
		
	}
	
}
