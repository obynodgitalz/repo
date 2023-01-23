package MelloTest.MelloTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogIn extends App  {	
	
	@Test
	
	
	public void validLogin () {
	
	
	driver.findElement(By.name("loginID")).sendKeys("Zovah1");
	driver.findElement(By.name("password")).sendKeys("Blonde77@1");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/form/button")).click();
	driver.findElement(By.name("digit1")).sendKeys("0");
	driver.findElement(By.name("digit2")).sendKeys("0");
	driver.findElement(By.name("digit3")).sendKeys("0");
	driver.findElement(By.name("digit4")).sendKeys("0");
	driver.findElement(By.name("digit5")).sendKeys("0");
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/button")).click();
	
	}
}
	
