package learnTestNG;

import org.testng.annotations.Test;

public class TestScenario3 
{

	@Test(groups={"Regression","Sanity"})
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}

	@Test
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
}
