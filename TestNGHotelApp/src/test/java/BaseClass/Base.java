package BaseClass;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	@BeforeSuite
	private void suitebefore() {
		Date date = new Date();
		 Timestamp ts = new Timestamp(date.getTime());
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    System.out.println(formatter.format(ts));
	}
	
	@AfterSuite
	private void suiteafter() {
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(formatter.format(ts));   

	}
	
	@BeforeTest
	private void testbefore() {
		

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		

	}
	
	@AfterTest
	private void testafter() {
		driver.close();

	}
	
	@BeforeClass
	private void classbefore() {
		
		driver.navigate().to("http://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys("bhargab101");
		driver.findElement(By.id("password")).sendKeys("82umpv7d");
		driver.findElement(By.id("login")).click();

	}
	
	@AfterClass
	private void classafter() {
		driver.navigate().to("http://adactinhotelapp.com/index.php");

	}
	
	
}
