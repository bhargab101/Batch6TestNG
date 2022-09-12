package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClass.Base;

public class TestRunner extends Base {

	@Test(priority = 0)
	public void searchHotel() {
		WebElement location=driver.findElement(By.id("location"));
		WebElement hotel=driver.findElement(By.id("hotels"));
		WebElement roomType=driver.findElement(By.id("room_type"));
		Select s=new Select(location);
		s.selectByValue("New York");
		Select s1=new Select(hotel);
		s1.selectByIndex(1);
		Select s2=new Select(roomType);
		s2.selectByIndex(1);
		driver.findElement(By.id("Submit")).click();
	}
    ///Faced problem here
	///test not running and showing java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "TestRunner.TestRunner.driver" is null

}
