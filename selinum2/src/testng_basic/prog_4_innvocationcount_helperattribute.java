package testng_basic;

import org.testng.annotations.Test;

public class prog_4_innvocationcount_helperattribute {

	@Test(invocationCount = 2)// by default priority is 0 and by deafult invocation count is 1
	public void reg() 
	{
		System.out.println("regi");
		
	}
 	
	@Test(invocationCount = 2,priority  = 2)
	public void delete() 
	{
		System.out.println("delete");
		
	}
	
	@Test(priority = 1,invocationCount = 2)
	public void login()
	{
		System.out.println("login");
		
	}
	
}
