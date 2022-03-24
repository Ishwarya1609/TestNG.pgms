package annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestBA {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("http://triotend.com/");
	  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://triotend.com/ecom");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
