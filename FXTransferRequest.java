package MelloTest.MelloTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class FXTransferRequest extends LogIn {
	
	@AfterTest
	
	@SuppressWarnings("deprecation")
	public void ForeignExchangeTransfer () throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div[1]/div[1]/a[3]/div")).click();
	
	driver.findElement(By.id("mui-component-select-transferType")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-transferType\"]/div[3]/ul/li[1]")).click();
	
	driver.findElement(By.id("mui-component-select-currency")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-currency\"]/div[3]/ul/li[1]")).click();
	
	driver.findElement(By.id("mui-component-select-sourceAccount")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-sourceAccount\"]/div[3]/ul/li[1]")).click();
	
	driver.findElement(By.name("amount")).sendKeys("10");
	
	driver.findElement(By.name("beneficiaryName")).sendKeys("Daniel Maxwell");
	
	driver.findElement(By.name("beneficiaryAccount")).sendKeys("1234565788");
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//driver.findElement(By.id("mui-component-select-beneficiaryCountry")).click();
	//driver.findElement(By.xpath("//*[@id=\"menu-beneficiaryCountry\"]/div[3]/ul/li[3]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/div[1]/div/form/div[2]/div[2]/div[1]/div/div/div")).click();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li")).click();
	
	
	driver.findElement(By.name("agreeTerms")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/form/div[3]/div/button")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div/button")).click();
	
	driver.findElement(By.name("phoneNumber")).sendKeys("123445678877");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[4]/div/form/div[2]/div/button")).click();
	
	driver.findElement(By.id("mui-component-select-maritalStatus")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-maritalStatus\"]/div[3]/ul/li[2]")).click();
	
	driver.findElement(By.name("nextKin")).sendKeys("Michael toriola");
	driver.findElement(By.name("kinFullname")).sendKeys("Michael Abiodun Falola");
	driver.findElement(By.name("kinPhone")).sendKeys("86767778877568");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[5]/div/form/div[2]/div/button")).click();
	
	Thread.sleep(10000);
	
	
	driver.findElement(By.name("digit1")).sendKeys("0");
	driver.findElement(By.name("digit2")).sendKeys("0");
	driver.findElement(By.name("digit3")).sendKeys("0");
	driver.findElement(By.name("digit4")).sendKeys("0");
	driver.findElement(By.name("digit5")).sendKeys("0");
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/button")).click();
	
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/section/div[2]/button")).click();*/
	
	
	System.out.println("Test was completed Successfully");
	}
	

}
