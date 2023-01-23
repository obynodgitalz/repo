package MelloTest.MelloTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class InveStments extends LogIn {
	
	@SuppressWarnings("deprecation")
	@AfterTest
	
	public void FabInvestments () throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div[1]/div[1]/a[5]/div")).click();
	
	driver.findElement(By.id("mui-component-select-sourceAccount")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-sourceAccount\"]/div[3]/ul/li[2]")).click();
	
	driver.findElement(By.id("mui-component-select-investmentType")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-investmentType\"]/div[3]/ul/li[1]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[3]/form/div[2]/div/button")).click();
	
	driver.findElement(By.id("mui-component-select-tenure")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-tenure\"]/div[3]/ul/li[1]")).click();
	
	driver.findElement(By.name("amount")).sendKeys("10");
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[3]/form/div[2]/div/button")).click();
	
	
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/section/div[2]/button")).click();
	
	driver.close();
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("Test was completed Successfully");
	}
	

}
