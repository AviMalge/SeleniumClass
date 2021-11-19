package webElementsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameGoogle {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		
        driver.get("https://www.google.com/");
		
      //driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.findElement(By.xpath("//a[@class='gb_C']")).click();
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		
		driver.close();
		

	}

}
