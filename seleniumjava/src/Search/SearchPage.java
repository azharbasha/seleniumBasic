package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	public static WebElement element = null;
	
	public static  WebElement User_Search(WebDriver driver) {
		element = driver.findElement(By.name("uid"));
		return element;
	}
	
	
	public static String UserName = "mngr194616";
	
	public static String Password = "edAhesE";

	public static String Title = " GTPL Bank Manager HomePage ";
	
	public static WebElement Password_Search(WebDriver driver) {
		element = driver .findElement(By.name("password"));
		return element;
	}
	
	public static WebElement click(WebDriver driver) {
		element = driver.findElement(By.name("btnLogin"));
		return element;
	}
}
