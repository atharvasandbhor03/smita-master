package testng_basic;

import org.testng.annotations.Test;

public class prog_5_enable_helperattribute {
	
	@Test(priority = -3)
	public void reg() 
	{
		System.out.println("regi");
		
	}
 	
	@Test(priority = 2)
	public void delete() 
	{
		System.out.println("delete");
		
	}
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login");
		
	}
	
	@Test(priority = 1,enabled = false)//by default enabled attribute is true
	public void newacc() {
		System.out.println("create new acc");
	}

}
