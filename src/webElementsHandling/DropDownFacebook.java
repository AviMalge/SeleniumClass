package webElementsHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFacebook 
{

	public static void main(String[] args) 
	{
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234567890");
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		//day
		Select sday=new Select(day);
		
		sday.selectByIndex(29);
		
		List<WebElement> opday = sday.getOptions();
		System.out.println(opday.size());
		
		ArrayList<String> dd =new ArrayList<String>();
		for(WebElement allday:opday)
		{
			System.out.println(allday.getText()+" ");
			dd.add(allday.getText());
		}
		Collections.sort(dd);
		System.out.println(">>>>>>>>>>>>After Sort<<<<<<<<<<<<");
		System.out.println(dd);
		
		
		System.out.println();
		
		//month
		Select smonth=new Select(month);
		
		smonth.selectByIndex(3);
		
		List<WebElement> opmonth = smonth.getOptions();
		System.out.println(opmonth.size());
		
		for(WebElement allmonth:opmonth)
		{
			System.out.print(allmonth.getText()+" ");
		}
		System.out.println();
		
		//year
		Select syear=new Select(year);
		
		syear.selectByValue("1994");
		
		List<WebElement> opyear = syear.getOptions();
		System.out.println(opyear.size());
		
		for(WebElement allyear:opyear)
		{
			System.out.print(allyear.getText()+" ");
		}
		System.out.println();
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
	}

}
