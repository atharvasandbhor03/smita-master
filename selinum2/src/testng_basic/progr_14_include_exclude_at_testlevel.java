package testng_basic;

import org.testng.annotations.Test;

public class progr_14_include_exclude_at_testlevel {
	@Test
	public void reg()  throws InterruptedException
	{
		System.out.println("register");
	}
	
	@Test
	public void login()  throws InterruptedException
	{
		System.out.println("login");

	}
	
	@Test
	public void delete()  throws InterruptedException
	{
		System.out.println("delete");

	}
	
	@Test(dependsOnMethods = "delete")
	public void create()  throws InterruptedException
	{
		System.out.println("create");

	}
}
