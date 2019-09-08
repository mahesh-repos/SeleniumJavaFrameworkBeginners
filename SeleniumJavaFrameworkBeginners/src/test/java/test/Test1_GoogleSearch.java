package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		
		googleSearch();

	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// goto google.com
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		// Enter text in search Box
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		// click on search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		// close and quit the web driver
		driver.close();
		driver.quit();
		
		System.out.println("Test Complted Successfuly");
		
	}
}
