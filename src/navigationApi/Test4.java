package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test4
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
	
		
		//to maximize the browser
	    driver.manage().window().maximize();//method chaining
		
		//enter url
		driver.get("https://www.skillrary.com/");
		
		//navigate to other url
		driver.navigate().to("https://www.google.com/");
		
		
		Thread.sleep(3000);//for delay adds throws interruptedException
		//go bwd in browser
	     driver.navigate().back();
	     
	     Thread.sleep(3000);//for delay
	     //refresh page
	     driver.navigate().refresh();
		
	     Thread.sleep(3000);//for delay
		//go fwd in browser
		driver.navigate().forward();
		
		driver.close();
		

		

	}

}