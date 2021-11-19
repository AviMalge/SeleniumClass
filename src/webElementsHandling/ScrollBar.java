package webElementsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-2000)");


	}

}
