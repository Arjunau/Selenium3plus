package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptExec {
	WebDriver driver;
  @Test(priority = 1)
  public void getTitle() throws InterruptedException {
	   JavascriptExecutor js =  (JavascriptExecutor)driver;
	  	String title =js.executeScript("return document.title;").toString();
	    System.out.println(title);
	    
	    WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", contactUs);
	    
	    JavascriptExecutor alert = (JavascriptExecutor)driver;
	    alert.executeScript("alert('hello world');", driver.findElement(By.xpath("//*[@id='s_Text']")));
	    		
	 
  }
  
  
  
  
  @BeforeClass
  public void beforeMethod()  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.allstate.com/");
		
  }

  @AfterClass
  public void afterMethod() {
	  //driver.close();
  }
}
