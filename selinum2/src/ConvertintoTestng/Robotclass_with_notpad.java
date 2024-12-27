package ConvertintoTestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class Robotclass_with_notpad {
	
	@Test
	public void task() throws InterruptedException, AWTException
	{
		Robot robo=new Robot();
		
		 robo.keyPress(KeyEvent.VK_Q); robo.keyPress(KeyEvent.VK_S);
		  robo.keyPress(KeyEvent.VK_P); robo.keyPress(KeyEvent.VK_I);
		 robo.keyPress(KeyEvent.VK_D); robo.keyPress(KeyEvent.VK_E);
		 robo.keyPress(KeyEvent.VK_R);
		

		
		

		Thread.sleep(3000);
		
	}

}
