package testNGxml;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTest2 {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googleSearch2() {
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	@Test
	public void googleSearch3() {
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
	}
	
	
	
}
