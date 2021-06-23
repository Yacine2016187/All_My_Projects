package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{

	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="//input[@type='submit']")
	WebElement Loginbtn;
	
	@FindBy (name="/html/body/div[2]/div/div[1]/a/img")
	WebElement crmLogo;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMIImage() {
		return crmLogo.isDisplayed();
		
	}
	public  HomePage Login(String un , String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		Loginbtn.click();
		
		
		return new HomePage() ;
		
	}

	
}
