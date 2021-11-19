package webElements_Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup1 
{

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		
        driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.dismiss();
		
		driver.close();
		
	
	}

}
