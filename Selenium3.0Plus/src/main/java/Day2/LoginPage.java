package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By userName = By.name("userName");
	By password = By.name("password");
	By signIn = By.name("login");
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	public void enterUserName(String sUserName) {
		driver.findElement(userName).sendKeys(sUserName);
	}
	public void enterPassword(String sPassword) {
		driver.findElement(password).sendKeys(sPassword);
	}
	public void clickSignInButton() {
		driver.findElement(signIn).click();
	}
	public void clearUserName() {
		driver.findElement(userName).clear();
	}
	
	
	

}
