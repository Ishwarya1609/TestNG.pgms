package annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class IgnoreTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://triotend.com/ecom/");
  }
  @Test(enabled=false)
  public void f1() {
	  driver.get("http://triotend.com");
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();  
  }

  @AfterClass
  public void afterClass() {
  }

}
