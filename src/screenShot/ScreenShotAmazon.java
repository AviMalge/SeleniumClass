package screenShot;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotAmazon 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File scr = sc.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("./photo/amz2.png");
		
		FileUtils.copyFile(scr, dest);
		
		driver.close();

	}

}
