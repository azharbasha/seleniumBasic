package Gpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Demo {
  
  String driverPath = "C:\\sjdemo\\chromedriver.exe";
  public String expectedTitle = null;
  public String actualTitle = null;
  String baseUrl = "http://demo.guru99.com/test/newtours/";
  WebDriver driver;



  //@org.testng.annotations.BeforeTest
  @org.testng.annotations.BeforeTest
  public void BeforeTest() {
  	System.setProperty("webdriver.chrome.driver", driverPath);
  	driver = new ChromeDriver();
  	driver.manage().window().maximize();
  	driver.get(baseUrl);	
  	System.out.println("LAUNCHING BROWSER");
  }

  	@BeforeMethod
  	public void verifyHomePageTitle(){
  		expectedTitle = "Welcome: Mercury Tours";
  		actualTitle = driver.getTitle();
  		Assert.assertEquals(actualTitle, expectedTitle);
  		System.out.println("1 making to Home page Launch");
  	}

  		@Test(priority = 0)
  		public void Registr() {
  			driver.findElement(By.linkText("REGISTER")).click();
  			actualTitle = driver.getTitle();
  			expectedTitle =  "Register: Mercury Tours";
  			Assert.assertEquals(actualTitle, expectedTitle);
  			System.out.println("login to the register file p =0");
  		}
  	
  		@Test(priority = 1)
  		public void Support() {
  			driver.findElement(By.linkText("SUPPORT")).click();
  			actualTitle = driver.getTitle();
  			expectedTitle =  "Under Construction: Mercury Tours";
  			Assert.assertEquals(actualTitle, expectedTitle);
  			System.out.println("login to the Support file p=1");
  		}

  	@AfterMethod
  	public void HomePage() {
  		driver.findElement(By.linkText("Home")).click();
  		System.out.println("1 Home Page");
  	}

  @AfterTest
  public void TearDown() 
  {
  		driver.close();
  		System.out.println("Driver is closed");
  } 
}


