package webElementsHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions 
{


	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver= new ChromeDriver(); //open browser
		
		//driver.manage().window().maximize(); // maximize
		
		driver.get("https://www.myntra.com/"); //enter URL
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		//locate xpath of search bar and store it in variable
		WebElement searchbar = driver.findElement(By.xpath("//input[@class='desktop-searchBar']")); 
		
		//enter value in search bar
		searchbar.sendKeys("dress");
		
		//Delay to load suggestions
		Thread.sleep(3000);
		
		//locate xpath of one suggestion and store it into one variable
		List<WebElement> dress = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		
		//to get the size of suggestions
		System.out.println(dress.size());
		
		//to print  all the suggestions
		for (WebElement list:dress)
		{
			System.out.println(list.getText());
		}
		
		//close the browser
		driver.close();
	
	}

}
