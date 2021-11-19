package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginS1ImplicitWait {



	public static void main(String[] args)
		{
			//open browser
			WebDriver driver =new ChromeDriver();
			
			
			//enter url
			driver.get("https://demo.actitime.com/login.do");
			
			//impicit wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//enter valid username
			driver.findElement(By.id("username")).sendKeys("admin");
			
			//enter valid password
			driver.findElement(By.name("pwd")).sendKeys("manager");
			
			//click on login button
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
			System.out.println("Page Title : "+driver.getTitle());
			System.out.println("Page URL : "+driver.getCurrentUrl());
			
			
			//verification
			String title;
			title="actiTIME - Enter Time-Track";
		
			
			//Explicit wait until title is displayed
			WebDriverWait wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
				
				
				
			if(title.equals(driver.getTitle()))
			{
				System.out.println("Title Is Matching Test Pass");
			}
			else
			{
				System.out.println("Title Is Not Matching Test Fail");
			}
			
			driver.close();
			
			
		}
	
	}
	

