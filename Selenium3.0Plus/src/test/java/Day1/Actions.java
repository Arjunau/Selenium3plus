package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Actions {
	WebDriver driver;
	String ExpectedResult = "Home";
  @Test(priority = 1)
  
  public void SignIn() {
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
	  Assert.assertEquals(ExpectedResult, driver.getTitle());
	  System.out.println(driver.getTitle());
	 
	  }
  
  
  
  @BeforeClass
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
  }

  @AfterClass
  public void afterMethod() {
	  //driver.close();
  }

}
