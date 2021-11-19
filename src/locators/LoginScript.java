package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript 
{

	public static void main(String[] args) throws InterruptedException
	{
		//open browser
		WebDriver driver =new ChromeDriver();
		
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		
		//enter valid username
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//enter valid password
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//click on login button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		System.out.println("Page Title : "+driver.getTitle());
		System.out.println("Page URL : "+driver.getCurrentUrl());
		
		
		//verification
		String title;
		title="actiTIME - Enter Time-Track";
	
		
		Thread.sleep(3000);
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
