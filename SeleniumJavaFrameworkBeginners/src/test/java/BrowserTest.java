import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws Exception {

		//String projectPath = System.getProperty("user.dir");
		//System.out.println("Project Path : "+projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver(); 
		
		
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation step by step");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Automation step by step");
		
		List<WebElement> listOfInputeElement =  driver.findElements(By.xpath("//input"));
		int count = listOfInputeElement.size();
		System.out.println("Count of input element : "+count);
		
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("Project Path : "+projectPath);
		//System.setProperty("webdriver.ie.driver", projectPath+"\\Drivers\\InternetExplorer\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.close();
	}

}
