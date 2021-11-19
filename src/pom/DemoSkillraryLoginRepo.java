package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryLoginRepo {
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginBtn;
	
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement sumbitButton;
	
	
	public DemoSkillraryLoginRepo(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void loginButton() {
		loginBtn.click();
	}
	
	
	public void emailAddress(String email) {
		emailaddresstb.sendKeys(email);
	}
	
	public void password(String pass) {
		 passwordtb.sendKeys(pass);
	}
	
	public void sumbit() {
		sumbitButton.click();
	}

}
