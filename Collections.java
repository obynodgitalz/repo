package MelloTest.MelloTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class Collections extends LogIn {
	
	@SuppressWarnings("deprecation")
	@AfterTest
	
	public void ForeignExchangeRates () throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div[1]/div[1]/a[4]/div")).click();
	
	driver.findElement(By.id("mui-component-select-to")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-to\"]/div[3]/ul/li[2]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/form/div[2]/div/button")).click();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	driver.close();
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("Test was completed Successfully");
	}
	

}
