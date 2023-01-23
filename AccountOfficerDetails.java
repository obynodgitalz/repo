package MelloTest.MelloTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AccountOfficerDetails extends LogIn {
	
	@SuppressWarnings("deprecation")
	@AfterTest
	
	public void FindAccountOfficerDetails () throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div[1]/div[1]/a[14]/div")).click();
	
	
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	String Actual = "Account Officer Details";
	String Expected = "Account Officer Details";
	
	Assert.assertEquals(Expected, Actual)
	;
	
	
	
	driver.close();
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("Test was completed Successfully");
	}
	

}
