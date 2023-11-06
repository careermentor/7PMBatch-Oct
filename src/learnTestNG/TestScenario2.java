package learnTestNG;

import org.testng.annotations.Test;

public class TestScenario2 
{

	@Test(groups="Sanity")
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}

	@Test(enabled=true)
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
}
