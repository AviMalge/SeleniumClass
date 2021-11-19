package dataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillRaryLoginExcel //DDT using Excel
{
	
	public static void main(String[] args) throws  IOException 
	
	{
		//create object of file input stream class
		
		FileInputStream fis = new FileInputStream("./skillraryDDT.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@id='last']")).click();
		
	}

}
	
