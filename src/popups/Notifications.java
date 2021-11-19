package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class Notifications {

	public static void main(String[] args) {
		//chrome
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		
		//Firefox
		//FirefoxOptions option1=new FirefoxOptions();
		//option.addArguments("--disable-notifications");
		//WebDriver driver=new FirefoxDriver(option1);
	
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		

	}

}