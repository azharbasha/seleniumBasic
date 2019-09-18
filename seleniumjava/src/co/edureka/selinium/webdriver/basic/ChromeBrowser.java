package co.edureka.selinium.webdriver.basic;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html?e=2");
		
		System.out.println(CredentailsMap());
		System.out.println(CredentailsMap().get("customer"));
		
//		String Credentials = CredentailsMap().get("customer");
//		driver.findElement(By.name("username")).sendKeys(UserName("customer"));
		driver.findElement(By.name("password")).sendKeys(PassWord("customer"));
		
	}



	public static HashMap<String , String> CredentailsMap(){
		HashMap<String, String> usermap = new HashMap<String, String>();
		
		usermap.put("customer", "naveenautomation:Test@123");
		usermap.put("admin", "arpit:arpit123");
		usermap.put("distributor", "gulnaz:123233");
		usermap.put("seller", "chetna:chetna9090");
		usermap.put("deliverygirl", "greeshma:greeshma@1233");
		
		return usermap;
	}

	public static String UserName(String role) {
		String UserCredentials = CredentailsMap().get(role);
		return UserCredentials.split(":")[0];
	}
	public static String PassWord(String role) {
		String pass =  CredentailsMap().get(role);
		return pass.split(":")[1];
	}

}