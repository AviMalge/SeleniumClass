package WebElemnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation 
{

	public static void main(String[] args)
	{
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.name("login"));
		Point loc = ele.getLocation();
		int x =loc.getX();
		int y=loc.getY();
		System.out.println("X Coordinate ="+ x);
		System.out.println("Y Coordinate ="+ y);
		
	}

}
