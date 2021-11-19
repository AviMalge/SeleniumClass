package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillraryLogin //Data Driven Testing using Properties file
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	
	{
		//create object of property
		
		Properties p =new Properties();
		
		//create stream to read the data
		
		p.load(new FileInputStream("./skillrarydata.properties"));
		
		WebDriver driver = new ChromeDriver();
		
		//get the key using getProperty()
		
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(p.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@id='last']")).click();
	}

}
