package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario4 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}

	@Test
	public void second_testcase()
	{
		System.out.println("this is second test case");
		Assert.assertEquals("Test", "Testing");
	}
	
}
