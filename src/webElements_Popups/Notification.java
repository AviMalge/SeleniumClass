package webElements_Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class Notification {

	public static void main(String[] args) 
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		//FirefoxOptions op1= new FirefoxOptions();
		//op1.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(op);
		driver.get("https://www.olx.in/");
		
		//WebDriver driver= new FirefoxDriver(op1);
		
		
		

	}

}
