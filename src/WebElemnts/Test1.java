package WebElemnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		

	}

}
