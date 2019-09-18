package Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Search.SearchPage;
import Search.Util;

public class Package {
	public static WebDriver driver = null;
	public static String  Expected = null;
	public static String Title = null;

	public static void main(String[] args) {
		
		GoogleSearch();
		Expected = driver.getTitle();
		Assert.assertEquals(Title, Expected);
		System.out.println("Title managed");

	}
	
	public static void GoogleSearch() {
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/index.php");
		
		SearchPage.User_Search(driver).sendKeys(Search.SearchPage.UserName);
		
		SearchPage.Password_Search(driver).sendKeys(Search.SearchPage.Password);
		
		SearchPage.click(driver).click();
		
	}
}
