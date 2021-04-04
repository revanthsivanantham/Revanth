package demo;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try{
		demo();
		}
		catch (Exception exp)
		{
			System.out.println("Caught exception");
		}
}
	
	public static void demo() throws Exception
	{
		int i = 1/0;
		throw new ArithmeticException("Exception thrown by Revanth");
	}
}