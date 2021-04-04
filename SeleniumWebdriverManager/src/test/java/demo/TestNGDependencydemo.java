package demo;

import org.testng.annotations.Test;

public class TestNGDependencydemo {
	
	@Test(dependsOnGroups = "summer.*")
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups = "summer1")
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test()
	public void test3()
	{
		System.out.println("test3");
	}
}
