package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution 
{
	@Parameters({"browserName"})
	@Test
	public void demo(String browser)
	{ WebDriver driver;
		
		if (browser.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		
		else 
		{
			driver =new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abced@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		Reporter.log(title,true);
		
		driver.close();
		
		
	}
	

}
