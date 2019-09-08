package extentReports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG {

	ExtentTest test;
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;

	WebDriver driver;

	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void setUpTest() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void test1() throws Exception {

		test = extent.createTest("Google Search Test", "This is my first test");
		// log(Status, details)
		test.log(Status.INFO, "Starting test case");
		//driver.get("https:\\www.google.com");
		//test.pass("Navigate to google search");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

	}

	@Test
	public void test2() throws Exception {
		
		test = extent.createTest("Google Search Test2", "This is my second  test");

	     // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

	}
	
	
	@AfterTest
	public void tearDownTest() {

		driver.close();
		driver.quit();
		System.out.println("Test complted successfully");

	}

	@AfterSuite
	public void tearDown() {

		extent.flush();

	}

}
