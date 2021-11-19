package webElementsHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSkillrary {

	public static void main(String[] args) throws InterruptedException 
	{
	   
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		
		dropdown.click();
	
		Select s = new Select(dropdown);
		
		s.selectByIndex(1);
		
		s.selectByValue("90");
		
		s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		
		List<WebElement> options = s.getOptions();
		
		System.out.println(options.size());
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		
		Thread.sleep(3000);
		
		//s.deselectByIndex(1);
		
		//s.deselectByValue("90");
		
		//s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		
		driver.close();
		
			
	}

}