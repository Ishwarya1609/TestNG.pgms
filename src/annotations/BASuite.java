package annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BASuite {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.selenium.dev/");
  }
  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
