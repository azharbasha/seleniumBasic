package Gpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	static WebDriver driver= null;
	
	public static void main(String[] args) {
	googlesearch();

	}
	
	public static void googlesearch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		GoogleSearchPages.textbox_search(driver).sendKeys(GoogleSearchPages.samp);
		//GoogleSearchPages.button_search(driver).sendKeys(Keys.RETURN);
	
		GoogleSearchPages.button_search(driver).click();
	
		//GoogleSearchPages.textbox_search(driver).sendKeys("Automation step by step");
		//GoogleSearchPages.button_search(driver).click();
		
	}

}
