package Gpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class TestNG_Demo {

	WebDriver driver = null;
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void TestPhase() {
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("automation step by step - raghav pal");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void TearDown() 
	{
			driver.quit();
	}
}


