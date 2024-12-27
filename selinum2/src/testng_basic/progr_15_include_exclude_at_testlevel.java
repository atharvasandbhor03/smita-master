package testng_basic;

import org.testng.annotations.Test;

public class progr_15_include_exclude_at_testlevel {
	@Test(groups = "system")
	public void reg()  throws InterruptedException
	{
		System.out.println("register");
	}
	
	@Test(groups = "smoke")
	public void login()  throws InterruptedException
	{
		System.out.println("login");

	}
	
	@Test(groups = "system")
	public void delete()  throws InterruptedException
	{
		System.out.println("delete");

	}
	
	@Test(groups = "smoke")
	public void create()  throws InterruptedException
	{
		System.out.println("create");

	}
}
