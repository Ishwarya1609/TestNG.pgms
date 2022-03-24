package annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAnnotation {
  @Test
  public void f() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://triotend.com/tts/site/login");
	driver.manage().window().maximize();

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
	 driver.close();
	 
}
}
