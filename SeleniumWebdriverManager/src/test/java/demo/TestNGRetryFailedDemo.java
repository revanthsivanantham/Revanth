package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

	@Test
	public void test1()
	{
		System.out.println("inside test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("inside test2");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = listeners.LocalRetry.class)
	public void test3()
	{
		System.out.println("inside test3");
		Assert.assertTrue(false);
		
	}
}
