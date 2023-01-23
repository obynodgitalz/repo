package MelloTest.MelloTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class AirtimeTopup extends LogIn {
	
	@SuppressWarnings("deprecation")
	@AfterTest
	
	public void BuyAirtime () throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div[1]/div[1]/a[9]/div")).click();
	
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	driver.findElement(By.id("mui-component-select-airtime.networkCode")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-airtime.networkCode\"]/div[3]/ul/li[2]")).click();
	
	driver.findElement(By.id("mui-component-select-airtime.sourceAccount")).click();
	
	/*
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"menu-airtime.networkCode\"]/div[3]/ul/li[2]")).click();
	 * 
	 * 
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/form/div[2]/div/button")).
	 * click();
	 */ 
	  
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 
	
	driver.close();
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("Test was completed Successfully");
	}
	

}
