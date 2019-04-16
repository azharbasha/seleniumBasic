package co.edureka.selinium.webdriver.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchbrowser {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\seleniumjava\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Register")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("azhar");
		driver.findElement(By.id("user_surname")).sendKeys("shaik");
		driver.findElement(By.id("user_phone")).sendKeys("123456");
		Select drpdwn =  new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		drpdwn.selectByVisibleText("April");
		Select drpdwn1 = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		drpdwn1.selectByValue("1991");
		Select drpdwn2 = new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		drpdwn2.selectByValue("13");
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("nasyam");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Hyderabad");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("5000082");
		driver.findElement(By.name("email")).sendKeys("basha3@gmail.com");
		driver.findElement(By.name("password")).sendKeys("basha@786");
		driver.findElement(By.name("c_password")).sendKeys("basha@786");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.id("email")).sendKeys("basha3@gmail.com");
		driver.findElement(By.id("password")).sendKeys("basha@786");
		driver.findElement(By.name("submit")).click();
	}
}		
		
		
		/* forward backward and refresh
		driver.manage().window().maximize();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://rediff.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println("refreshed");
		*/
		
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\seleniumjava\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/index.php");
		
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr186669");
		 driver.findElement(By.name("password")).sendKeys("hubYdAb");
		 driver.findElement(By.name("btnLogin")).click();
		 String Title = driver.getTitle();
		System.out.println("title is :"+Title);
		
		*/
		
		
	
		
		/*		
		//popup Test 
		  
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();

		Set<String> handler=driver.getWindowHandles();		
	        Iterator<String> it=handler.iterator();
		
	     String ParentWindowId = it.next();
	     System.out.println("parent window id :"+ParentWindowId);
	     
	     String ChildWindowId = it.next();
	     System.out.println("Chile window id :"+ChildWindowId);

	     driver.switchTo().window(ChildWindowId);
	     Thread.sleep(2000);
	     System.out.println("Child window popup:"+driver.getTitle());
	     driver.close();
	     
	     driver.switchTo().window(ParentWindowId);
	     System.out.println("Parent window popup :"+driver.getTitle());
	     driver.close();
	
		
		// Drag and drop
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();

	//clicking the menu options
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Dubai Visa Services")).click();;
	driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\AZHAR\\Desktop\\java\\my_class.java");
	driver.findElement(By.id("terms")).click();  
	driver.findElement(By.id("submitbutton")).click();
	  
		Thread.sleep(5000);
		
		
		//alert box
		Alert alert = (Alert) driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		if(text .equals("Please enter a valid user name"))
		{
			System.out.println("correct alert message");
		}
		else {
			System.out.println("in-correct alert message");
		}
		
		alert.accept();
		
		//facebook login
		WebElement email = driver.findElement(By.id("email")); 
		
		System.out.println("enter the name of the user");
		email.sendKeys("shaikazhars.786@gmail.com");
		
		System.out.println("enter the password");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("basha@786");
		
		WebElement signin = driver.findElement(By.id("u_0_2"));
		
		signin.click();
		
		System.out.println("login sucessful");
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss();
		
		
		Select signout = new Select(driver.findElement(By.name("logoutMenu")));
		
		signout.selectByVisibleText("Log Out");
		
		 driver.findElement(By.linkText("Log in")).click();
		 
		
		System.out.println("Title of the page is :"+driver.getTitle());
		
		
		// drop down selections
		Select drpselection = new Select(driver.findElement(By.id("month")));
		
		drpselection.selectByValue("2");
		
		Thread.sleep(3000);
		drpselection.selectByIndex(4);
		
		Thread.sleep(3000);
		drpselection.selectByVisibleText("Aug");
		
		//driver.close();
		*/
