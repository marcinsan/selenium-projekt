package Lait.pl.selenium1;


import org.junit.*;
import org.openqa.selenium.*;

public class LoginTest {
	
	WebDriver driver = null;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
				
	}
 
	@Test
	public void click0MenuItems() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();
		driver.findElement(By.linkText("SIGN-ON")).click();
        driver.findElement(By.name("userName")).sendKeys("123@o2.pl");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("login")).click();
	}
}

