package demo;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test()
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority =2)
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority =0)
	public void test3()
	{
		System.out.println("Test3");
	}
}
