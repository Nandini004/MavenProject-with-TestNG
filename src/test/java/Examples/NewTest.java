package Examples;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.guru99.com/selenium-tutorial.html");  
		String title = driver.getTitle();				 
		
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();  
	  syso("Browser Invoked");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();	
  }

}
