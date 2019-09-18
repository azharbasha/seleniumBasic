package Gpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowser {
		

		WebDriver driver;
		
		@Test(priority =1)
		public void openBrowser() {
			driver = new ChromeDriver();
		}
		
		@Test(priority = 2)
		public void launchGoogle() {
			driver.get("https://www.google.co.in/");
		}
		
		@Test(priority =3)
		public void ClickfirstLink() {
			driver.findElement(By.xpath(".//*[@title = 'Search']")).click();
		}
		
		@Test(priority = 4)
		public void PageTitle() throws InterruptedException {
			driver.findElement(By.xpath(".//*[@value = 'Search']")).click();
			Thread.sleep(3000);
			Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"),true);
			
		}

}
