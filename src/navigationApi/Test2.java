package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();//method chaining
		
		driver.get("https://www.skillrary.com/");
		
		//go bwd in browser
	     driver.navigate().back();
	     
	     //refresh page
	     driver.navigate().refresh();
		
		//go fwd in browser
		driver.navigate().forward();
		
		
		driver.close();

		

	}

}
