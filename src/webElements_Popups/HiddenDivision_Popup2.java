package webElements_Popups;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popup2 {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
		
        driver.get("https://demo.actitime.com/login.do");
		
      //driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
		
		
		//driver.close();
	}

}