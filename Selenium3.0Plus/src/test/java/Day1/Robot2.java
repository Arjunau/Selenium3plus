package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Robot2 {
	WebDriver driver;
	
  @Test (priority = 1)
  public void test1() throws InterruptedException, AWTException {
	  
      driver.findElement(By.xpath(".//a[@href=contains(text(),'custmfmt.xls')]")).click();            
          Robot robot = new Robot();            
          Thread.sleep(2000); // Thread.sleep throws InterruptedException    
          /*robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button               
          Thread.sleep(2000);*/  
          robot.keyPress(KeyEvent.VK_TAB);      
          Thread.sleep(2000);    
          robot.keyPress(KeyEvent.VK_TAB);      
          Thread.sleep(2000);    
          robot.keyPress(KeyEvent.VK_TAB);      
          Thread.sleep(2000);    
          robot.keyPress(KeyEvent.VK_ENTER); 
          
  }
  @BeforeClass
  public void setUp() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); 
  }

  		
  @AfterClass
  public void afterExecution() {
	  driver.close();
  }









  

}
