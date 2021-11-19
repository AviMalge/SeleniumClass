package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("aabbcc@gmail.com");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("123456789");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String title="STORE";
		
		Thread.sleep(3000);
		if (title.equals(driver.getTitle()))
				{
			          System.out.println("Title is matching TEST PASSED");
				}
		else
		{
			System.out.println("Title is not matching TEST FAILD");
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
