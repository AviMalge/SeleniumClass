package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("abcd@abcd.com");
		
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("abcd@abcd.com");
		
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
