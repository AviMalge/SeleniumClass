package webElementsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.xpath("//a[@id='course']"));
		
		Actions a =new Actions(driver);
		
		a.moveToElement(course).perform();
		
		WebElement sel = driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		
		sel.click();
		
		WebElement add = driver.findElement(By.xpath("//button[@id='add']"));
		
	
		a.doubleClick(add).perform();;
		


	}

}
