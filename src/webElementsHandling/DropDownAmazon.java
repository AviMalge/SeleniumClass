package webElementsHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAmazon {

	public static void main(String[] args) throws InterruptedException 
	{
	   
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Thread.sleep(3000);
		
		dropdown.click();
		
		Thread.sleep(3000);

		Select s = new Select(dropdown);
		
		Thread.sleep(3000);
		
		s.selectByIndex(4);
		
		Thread.sleep(3000);
		
		s.selectByValue("search-alias=computers-intl-ship");
		
		s.selectByVisibleText("Video Games");
		
		List<WebElement> options = s.getOptions();
		
		System.out.println(options.size());
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
			
	}

}