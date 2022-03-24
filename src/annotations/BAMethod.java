package annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BAMethod {
	
	WebDriver driver;
  @Test
  public void f() {
	// login Script
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("button.btn")).click();
		
		 //wait time
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90)); 
		 //Direct Child 
		 driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90)); 
		 //nthchild
		 driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(9)")).click(); 
		 //sub childs
		  
		 driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(10)")).click(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		 driver.findElement(By.cssSelector("ul.treeview-menu>li:nth-child(2)")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://triotend.com/tts/site/login");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
