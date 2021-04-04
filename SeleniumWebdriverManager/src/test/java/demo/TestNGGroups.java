package demo;

import org.testng.annotations.Test;

@Test(groups = "allclassTest")
public class TestNGGroups {

	@Test(groups={"windows.sanity"})
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test(groups={"linux.regression"})
	public void Test2()
	{
		System.out.println("Test2");
	}
	
	@Test(groups={"sanity","regression"})
	public void Test3()
	{
		System.out.println("Test3");
	}
	
	public void Test4()
	{
		System.out.println("Test4");
	}
}
