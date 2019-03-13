package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPageUsingPageFactory{
	WebDriver driver;
	/*By generate = By.id("i");
	By low = By.id("low");
	By high = By.id("high");	
	By go = By.name("Submit");*/
	
	
	
	@FindBy(how = How.NAME, using = "userName")
	WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	WebElement password;
	@FindBy(how = How.NAME, using = "login")
	WebElement signIn;
	
	public LoginPageUsingPageFactory(WebDriver driver) {
		this.driver = driver;
		
	}
	public void login(String sUserName, String sPassword ) {
		userName.sendKeys(sUserName);
		password.sendKeys(sPassword);
			
	}
	public void signOn() {
		signIn.click();
	}
	

}
