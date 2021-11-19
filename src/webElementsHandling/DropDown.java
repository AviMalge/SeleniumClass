package webElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
	   
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='_sacat']"));
		
		dropdown.click();

		Select s = new Select(dropdown);
		
		s.selectByIndex(4);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
			
	}

}

