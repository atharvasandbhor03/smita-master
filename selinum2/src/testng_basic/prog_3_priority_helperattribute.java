package testng_basic;

import org.testng.annotations.Test;

public class prog_3_priority_helperattribute {

/*	
 * 
 * 
 * =====execute in alphabetical order=======technically it is not right
 * 
 * 
 * 
 * @Test
	public void reg() 
	{
		System.out.println("regi");
		
	}
	@Test
	public void delete() 
	{
		System.out.println("delete");
		
	}
	@Test
	public void login()
	{
		System.out.println("login");
		
	}
	*/
	
	//*******************if we give priority then it will execute in priority order and if priority is similar then again goes for alphabetical order execution
	
	
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
		
		@Test(priority = 1)
		public void newacc() {
			System.out.println("create new acc");
		}
		
		
		
		
		
	
}
