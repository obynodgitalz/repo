package MelloTest.MelloTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class TransfersOwnAccounts extends LogIn {
	
	@AfterTest
	
	@SuppressWarnings("deprecation")
	public void PerformTransfer () throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div[1]/div[1]/a[2]/div")).click();	
	driver.findElement(By.id("mui-component-select-sourceAccount")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-sourceAccount\"]/div[3]/ul/li[2]")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/form/div[1]/div[2]/div[2]/div/div/input")).sendKeys("10");
	
	driver.findElement(By.id("mui-component-select-destinationAccountNo")).click();
	driver.findElement(By.xpath("//*[@id=\"menu-destinationAccountNo\"]/div[3]/ul/li")).click();
	driver.findElement(By.name("narration")).sendKeys("Test transfer Own account");
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/form/div[3]/div/button")).click();
	
	driver.findElement(By.name("pin")).sendKeys("1234");
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/form/button")).click();
	
	
	/*driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/form/button")).click();
	
	
	
	
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
