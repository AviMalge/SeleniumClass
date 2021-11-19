package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebooklogin {
	public WebDriver driver;
	
	@BeforeMethod public void openapp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test public void loginpage()
	{
		driver.findElement(By.id("email")).sendKeys("abced@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		Reporter.log(title,true);
	}
	
	@AfterMethod public void closeapp()
	{
		driver.close();
	}

}
