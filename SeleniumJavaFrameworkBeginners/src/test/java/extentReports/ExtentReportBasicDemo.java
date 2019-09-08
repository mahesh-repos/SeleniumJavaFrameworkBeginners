package extentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	
	static WebDriver driver= null;

	public static void main(String[] args) {
		
		 // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport .html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Google search test", "This is my first test");
        
        String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\Chrome\\chromedriver.exe");
		driver =new ChromeDriver();
        
		test.log(Status.INFO, "Starting test case");
		driver.get("https://www.google.com");	
		test.pass("Navigated to google search");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("Enter text in search box");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("Pressed keyboard Enter Key");
		
		driver.close();
		driver.quit();
		test.pass("Closed the browser");
		
		test.info("Test complted successfully");
	
		 // calling flush writes everything to the log file
        extent.flush();
        

	}

}
