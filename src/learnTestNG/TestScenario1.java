package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
		
		Assert.assertEquals("Hello", "Hello1");
	}

	@Test
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	@Test(groups="Smoke")
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	@Test(priority=-2)
	public void seven_testcase()
	{
		System.out.println("this is seven test case");
	}
	@Test(priority=-1)
	public void eight_testcase()
	{
		System.out.println("this is eight test case");
	}
}
