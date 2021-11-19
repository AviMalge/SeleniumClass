package WebElemnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement ele = driver.findElement(By.xpath("//input[name='q']"));
		
		WebElement ele = driver.findElement(By.name("q"));
		
         Dimension box = ele.getSize();
         int height=box.getHeight();
         int width=box.getWidth();
         
         System.out.println("Height of box = "+height);
         System.out.println("Width of box = "+width);
	}

}
