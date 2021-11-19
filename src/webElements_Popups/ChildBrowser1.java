package webElements_Popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		
		child.remove(parent);
		
		driver.switchTo().window(parent);
		
		for(String ch:child)
		{
			driver.switchTo().window(ch);
			driver.close();
		}

	}

}
