package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priority {
	WebDriver driver;
	  @Test(priority=2)
	  public void f() {
		  driver.get("http://triotend.com/ecom/");
	  }
	  @Test(priority=1)
	  public void f1() {
		  driver.get("http://triotend.com/tts/site/login");
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



