package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WAS1
{

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.name("email")).sendKeys("1234567890");
		driver.findElement(By.id("did_submit")).click();
		
		
	}

}
