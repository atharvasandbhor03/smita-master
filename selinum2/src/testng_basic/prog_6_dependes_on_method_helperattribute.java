package testng_basic;

import org.testng.annotations.Test;

public class prog_6_dependes_on_method_helperattribute {

	/************here we call method based on method helper attribute ********/
	@Test
	public void reg() 
	{
		System.out.println("regi");
		
	}
 	
	@Test(dependsOnMethods = {"reg","login","newacc"})
	public void delete() 
	{
		System.out.println("delete");
		
	}
	
	@Test(dependsOnMethods = {"reg"})
	public void login()
	{
		System.out.println("login");
		
	}
	
	@Test(dependsOnMethods = {"reg","login"})
	public void newacc() {
		System.out.println("create new acc");
	}
}
