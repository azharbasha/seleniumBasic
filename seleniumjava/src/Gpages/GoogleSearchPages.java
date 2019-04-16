package Gpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPages {

	public static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	public static String samp = "automation step by step - raghav pal";

	public static WebElement button_search(WebDriver driver) 
	{
		element = driver.findElement(By.partialLinkText("Google Search"));
		return element;
	}
}
