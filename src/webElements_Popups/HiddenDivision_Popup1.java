package webElements_Popups;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popup1 {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
		
        driver.get("https://demoapp.skillrary.com/");
		
      //driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//button[@id='last']")).click();
	
		
		
		driver.close();
	}

}
