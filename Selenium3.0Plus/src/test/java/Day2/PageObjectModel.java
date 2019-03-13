package Day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PageObjectModel {
	WebDriver driver;
	String sUserName = "mercury";
	String sPassword = "mercury";
	String sExpectedResult = "Find a Flight: Mercury Tours:";
  @Test
  public void verifyLogin() {
	  LoginPage login = new LoginPage(driver);
	  login.enterUserName(sUserName);
	  login.enterPassword(sPassword);
	  login.clickSignInButton();
	  Assert.assertEquals(sExpectedResult, driver.getTitle());
	  System.out.println(driver.getTitle());
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoaut.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
