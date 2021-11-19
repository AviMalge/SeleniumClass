package webElementsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@value='go']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'2')])[2]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),' Core Java For Selenium Trainin')]")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[@class='entypo-twitter']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
