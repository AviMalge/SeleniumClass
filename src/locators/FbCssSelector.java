package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbCssSelector 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("12346789");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12346789");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
