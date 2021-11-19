package webElementsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		WebElement acer = driver.findElement(By.xpath("//img[contains(@alt,'Acer')]"));
		
		Point aloc = acer.getLocation();
		int x = aloc.getX();
		int y = aloc.getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		acer.click();


	}

}
