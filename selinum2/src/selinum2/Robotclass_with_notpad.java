package selinum2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robotclass_with_notpad {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//Runtime.getRuntime().exec("notepad");/********open notpad and write text*******/
		Robot robo=new Robot();
		
		 robo.keyPress(KeyEvent.VK_Q); robo.keyPress(KeyEvent.VK_S);
		  robo.keyPress(KeyEvent.VK_P); robo.keyPress(KeyEvent.VK_I);
		 robo.keyPress(KeyEvent.VK_D); robo.keyPress(KeyEvent.VK_E);
		 robo.keyPress(KeyEvent.VK_R);
		 

		
		

		Thread.sleep(3000);
		

	}

}
