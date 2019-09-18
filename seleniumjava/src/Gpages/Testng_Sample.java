package Gpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_Sample {

	String driverPath = "C:\\sjdemo\\chromedriver.exe";
	public String expectedTitle = null;
	public String actualTitle = null;
	String url = "http://demo.guru99.com/test/newtours/";
	WebDriver driver;
	
	 @org.testng.annotations.BeforeTest
	  public void BeforeTest() {
	  	System.setProperty("webdriver.chrome.driver", driverPath);
	  	driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get(url);	
	  	System.out.println("LAUNCHING BROWSER");
	  }
	 
		@BeforeMethod
		public void VerifyHomePageTitle() {
			expectedTitle = "Welcome: Mercury Tours";
			actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Before Method");
		}
	
			@Test(priority = 0)
			public void Register() {
				driver.findElement(By.linkText("REGISTER")).click();
				expectedTitle = "Register: Mercury Tours";
				actualTitle = driver.getTitle();
				Assert.assertEquals(actualTitle, expectedTitle);
				System.out.println("first test");
			
			}
			
			@Test(priority = 1)
			public void Support() {
				driver.findElement(By.linkText("SUPPORT")).click();
				expectedTitle = "Under Construction: Mercury Tours";
				actualTitle = driver.getTitle();
				Assert.assertEquals(actualTitle, expectedTitle);
				System.out.println("Second Test");
			}
	
	@AfterMethod
	public void HomePage() {
		driver.findElement(By.linkText("Home")).click();
		System.out.println("after mehtod");
	}
	
	@AfterTest
	public void afterTest() {
		
		driver.close();
		System.out.println("Driver is closed");
	}
}
