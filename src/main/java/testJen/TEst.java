package testJen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEst {

	WebDriver driver;
	
	
	@BeforeTest
	public void beforetest()
	{
		driver = new FirefoxDriver();
		//sdkjf
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void t1()
	{
		driver.findElement(By.xpath("//*[@value='Google Search']")).click();
	}
}
