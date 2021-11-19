package launchApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)
	{
		//open the browser automatically
		WebDriver driver =new ChromeDriver();
		
		//Enter The Url
		driver.get("https://www.amazon.com/");
		
		//Print title
		System.out.println(driver.getTitle());
		
		//print url
		System.out.println(driver.getCurrentUrl());
		
		//close the browser automatically
		driver.close();
		
	}

}
