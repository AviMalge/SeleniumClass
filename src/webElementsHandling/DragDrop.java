package webElementsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
		
		WebElement korea = driver.findElement(By.xpath("//div[@id='box105']"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(seoul, korea).perform();
		
		driver.close();
		

	}

}
