package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groop1Test {
	WebDriver driver;
  @Test(groups= {"ERP"})
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://triotend.com/tts/site/login");
  }
  @Test(groups= {"ECOM"})
  public void t()
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://triotend.com");
	  
  }
  @Test(groups= {"ECOM"})
  public void t1()
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://triotend.com/ecom");
  }
  @Test(groups= {"ERP"})
  public void t2()
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://erp.triotend.com/");
  }
  
}
