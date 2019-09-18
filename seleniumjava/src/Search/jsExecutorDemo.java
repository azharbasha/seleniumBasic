package Search;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jsExecutorDemo {

	@Test
	public  void main() {
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor  js = ((JavascriptExecutor) driver);
        js.executeScript("document.getElementById('email').value='krishna@gmail.com';");
		
	}

}
