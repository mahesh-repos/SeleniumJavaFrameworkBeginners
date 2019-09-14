package demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailValidate {

	private WebDriver driver;


	@BeforeClass
	public void Startup(){
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\Chrome\\chromedriver.exe");
		driver =new ChromeDriver();
	}


	@Test (description="Google Login")
	public void GoogleLogin() throws Exception{
		driver.get("http://www.gmail.com");
		//assertEquals("Sign in", driver.findElement(By.id("signIn")).getAttribute("value"));
		
		driver.findElement(By.id("identifierId")).sendKeys("maheshgadekar1994@gmail.com",Keys.ENTER);
		
		//driver.findElement(By.partialLinkText("Next")).click();
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Maheshmaya@143",Keys.ENTER);
		
		 driver.findElement(By.name("password")).sendKeys("Maheshmaya@143",Keys.ENTER);
		
		//driver.findElement(By.id("signIn")).click();
	//	Thread.sleep(10000);
		//  driver.switchTo().frame("canvas_frame");
		//  driver.findElement(By.id("gbgs4dn")).click();
		// driver.findElement(By.id("gb_71")).click();
		//driver.switchTo().defaultContent(); 
		//assertEquals("Sign in to Gmail", driver.findElement(By.id("button")).getText());
	}
	@AfterClass
	public void teardown(){
		//driver.quit();
	}


}
