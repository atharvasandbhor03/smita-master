package testng_basic;

import org.testng.annotations.Test;

public class progr_15_1_include_exclude_at_testlevel {
	@Test(groups = "system")
	public void hello()  throws InterruptedException
	{
		System.out.println("register");
	}
	
	@Test(groups = "smoke")
	public void task()  throws InterruptedException
	{
		System.out.println("task");

	}
}
