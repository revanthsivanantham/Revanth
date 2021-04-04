package demo;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreDemo {
	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("inside test1 method");
	}
	
	@Test
	public void test2()
	{
		System.out.println("inside test2 method");
	}
}
