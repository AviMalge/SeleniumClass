package webElementsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver(); 

		driver.get("https://www.myntra.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='Men']"));
		
		Actions a= new Actions(driver);
		
		a.moveToElement(mouseHover).perform();
		
		driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();

	}

}
