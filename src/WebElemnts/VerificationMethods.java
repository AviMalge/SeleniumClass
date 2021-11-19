package WebElemnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethods 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//email text box
		WebElement email = driver.findElement(By.id("email"));

		
		if(email.isDisplayed())
		{
			System.out.println("email box displayed");
			email.sendKeys("abcd@gmail.com");
		}
		
		else
		System.out.println("email not displayed");
		
		// create new button
		WebElement createnew = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		if(createnew.isEnabled())
		{
			System.out.println("create new button is enabled");
			createnew.click();
		}
		else
		System.out.println("create new button is not enabled");
		
		// radio button
		WebElement radiobutton = driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
		
		if(radiobutton.isSelected())
		{
			System.out.println("radio button is selected");
		}
		else
		System.out.println("radio button is not selected");
		radiobutton.click();
		
		
		
	}

}
