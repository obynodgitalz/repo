package MelloTest.MelloTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class DataTopup extends LogIn {
	
	@SuppressWarnings("deprecation")
	@AfterTest
	
	public void BuyData () throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div[1]/div[1]/a[9]/div")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#simple-tab-1"))).click();
	
	
	
	/*
	 * driver.findElement(By.id("mui-component-select-to")).click();
	 * driver.findElement(By.xpath("//*[@id=\"menu-to\"]/div[3]/ul/li[2]")).click();
	 * 
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/form/div[2]/div/button")).
	 * click();
	 * 
	 * driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 */
	
	driver.close();
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("Test was completed Successfully");
	}
	

}
