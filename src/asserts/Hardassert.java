package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hardassert {
	
	@Test
	public void t()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		WebElement Logo=driver.findElement(By.tagName("img"));
		System.out.println(Logo.isDisplayed());
		
		//True assert
		//Assert.assertTrue(Logo.isDisplayed());
		
		//False assert
		//Assert.assertFalse(Logo.isDisplayed());
		
		//to compare the titles
		String Expectedtitle="Smart Hospital : Hospital Management Sytem";
		String Actualtitle=driver.getTitle();
		Assert.assertEquals(Actualtitle, Expectedtitle, "Mismatch in Title");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("triotend@gmail.com");
	}


}
