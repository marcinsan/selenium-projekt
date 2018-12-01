package pl.lait.pageObjects;

import java.security.spec.PSSParameterSpec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lait.pl.selenium1.Init;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	@FindBy(name = "userName")
	WebElement userNameInput;
	
	@FindBy(name = "password")
	WebElement passInput;
	
	@FindBy(name = "login")
	WebElement loginInBtn;
	
	
	public LoginPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void goToLoginPage() {
		signOnLink.click();
	}
	
	/**
	 * Loguje sie jako user z danymi
	 * przekazanymi w parametrach
	 * @param login
	 * @param pass
	 */
	public void loginAs(String login, String pass) {
		userNameInput.sendKeys(login);
		passInput.sendKeys(pass);
		loginInBtn.click();		
	}
	
	

}
