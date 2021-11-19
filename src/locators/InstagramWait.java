package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramWait {



	public static void main(String[] args)
		{
			//open browser
			WebDriver driver =new ChromeDriver();//..........1
			
			//maximize the window
			driver.manage().window().maximize();//..........2
			
			//enter url
			driver.get("https://www.instagram.com/");//..........3
			
			//impicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//..........4
			
			//enter valid username
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcdxyz");
			
			//enter valid password
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
			
			//click on login button
			driver.findElement(By.xpath("//div[text()='Log In']")).click();
			
			//click on signup button
			driver.findElement(By.xpath("//span[text()='Sign up']")).click();
			
			//get title of page
			System.out.println("Page Title : "+driver.getTitle());
			
			//get url of page
			System.out.println("Page URL : "+driver.getCurrentUrl());
			
			
			//verification
			String title;
			title="Login • Instagram";
		
			
			//Explicit wait until title is displayed
			WebDriverWait wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.titleContains("Login • Instagram"));
				
				
				
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
	

