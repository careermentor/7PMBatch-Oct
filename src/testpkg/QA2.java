package testpkg;

public class QA2 extends QA1
{
	
	int i = 500;
	
	public void printvar()
	{
		int i = 600;
		System.out.println(i); //600
		System.out.println(this.i); //500
		System.out.println(super.i); //300
		super.sum(20, 30);
	}
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
		
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
		
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sum(20, 30); // 1300
		q2.sub(30, 10);
		q2.printvar();
		
		
	}
	
}
