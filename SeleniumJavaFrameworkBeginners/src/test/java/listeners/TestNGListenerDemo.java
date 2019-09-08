package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

	@Test
	public void test1() {
		System.out.println("I am Inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am Inside Test 2");
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("ABCD");	
		driver.findElement(By.name("abc")).sendKeys("ABCD");
		
		driver.close();
		
	}
	
	@Test
	public void test3() {
		System.out.println("I am Inside Test s3");
		throw new SkipException("This test is skipped");
	}
	
}
