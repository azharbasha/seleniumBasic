package Search;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Incognito {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();	
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();;
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
//		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		for(int i=0; i < 5; i++) 
		{	
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		
	
		
		
	//	driver.findElement(By.id("Adults")).sendKeys("5");
//		driver.findElement(By.id("Adults")).sendKeys("2");
//		
//		driver.findElement(By.id("MoreOptionsLink")).click();
//		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");;
//		
//		driver.findElement(By.id("SearchBtn")).click();
//		
//		String error = driver.findElement(By.id("homeErrorMessage")).getText();
//		
//		System.out.println("error msg is :" +error );
	}

}
