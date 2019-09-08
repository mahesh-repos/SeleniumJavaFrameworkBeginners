package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {

	public static void main(String[] args) {
		
		seleniumWaits();
	}
	
	public static void  seleniumWaits() {
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		// implict wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Autpmation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("abcd"))); 
		
		
		driver.close();
		driver.quit();
	}
	
}
