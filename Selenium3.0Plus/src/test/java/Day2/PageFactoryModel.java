package Day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PageFactoryModel {
	 WebDriver driver;
	 String sUserName = "mercury";
		String sPassword = "mercury";
		String sExpectedResult = "Find a Flight: Mercury Tours:";
  @Test
  public  void verifyLogin() {
	  
	  LoginPageUsingPageFactory login = PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
	  login.login(sUserName, sPassword);
	  login.signOn();
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
