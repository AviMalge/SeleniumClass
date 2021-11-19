package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WAS3 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.partialLinkText("Customer")).click();
		driver.close();

	}

}
