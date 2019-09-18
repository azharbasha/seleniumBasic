package Gpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScraping {
	static WebDriver driver ;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.espncricinfo.com/series/8048/scorecard/1181768/mumbai-indians-vs-chennai-super-kings-final-indian-premier-league-2019");
		
		
		List<WebElement> batsmenList = driver.findElements(By.xpath("//div[@id = 'gp-inning-00']//a[@name = '&lpos=cricket:game:scorecard:player']"));
	

	System.out.println("list of players :"+batsmenList.size());
	
	for(int i =0;i < batsmenList.size()-6;i++) {
		System.out.println( batsmenList.get(i).getText());
		PlayerScoreCard(driver,batsmenList.get(i).getText());
	}
}	
	public static void PlayerScoreCard(WebDriver driver,String batsmenList) {
		
		//List<WebElement> PlayerScoreInfoList = driver.findElements(By.xpath("//a[contains(text(),'"+PlayerName +"')]//following-sibling::div[@class = 'cell runs']"));
		List<WebElement> PlayerScoreInfoList = driver.findElements(By.xpath("//div[@id = 'gp-inning-00']//div[@class = 'cell runs'][1]"));
//		for(int i =0; i< PlayerScoreInfoList.size();i++) {
		System.out.println(PlayerScoreInfoList);
			
//		}
	}
}
