package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Softassert {
	
	@Test
	public void t()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		WebElement Logo=driver.findElement(By.tagName("img"));
		System.out.println(Logo.isDisplayed());
		
		//to compare the titles
		String Expectedtitle="Smart Hospital : Hospital Management System";
		String Actualtitle=driver.getTitle();
		
		SoftAssert sft=new SoftAssert();
		sft.assertEquals(Actualtitle, Expectedtitle, "Mismatch in Title");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("triotend@gmail.com");
		sft.assertAll();
	}

}
