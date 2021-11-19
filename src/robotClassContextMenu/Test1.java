package robotClassContextMenu;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws AWTException 
	{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 driver.manage().window().maximize();
		 
		 Robot r =new Robot();
		 
		 //open new tab
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_T);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_T);
		 
		 //open new window
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_N);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_N);
		 
		 //minimize
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_WINDOWS);
		 r.keyPress(KeyEvent.VK_DOWN);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_WINDOWS);
		 r.keyRelease(KeyEvent.VK_DOWN);
	}

}
