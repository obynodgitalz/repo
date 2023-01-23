package MelloTest.MelloTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/**
 * Hello world!
 *
 */
public class App 
{
 public static WebDriver driver;

	@SuppressWarnings("deprecation")
	
	@BeforeClass
	
	public void LaunchURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\obinna.agubuche\\eclipse-workspace\\MelloTest\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://vbp-test.vanso.com:5000/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
