package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetpasswordPOM {

private WebDriver driver; 
	
	public ForgetpasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='list-group-item']")
	private WebElement loginLink;
	
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(text(),'for')]")
	private WebElement warnAlert;
	
	@FindBy(xpath="//a[contains(text(),'Forgotten')]")
	private WebElement forgottenButton;
	
	@FindBy(xpath="//div[@class='col-sm-10']/input")
	private WebElement forgottenEmailEnter;
	
	@FindBy(xpath="//div[@class='pull-right']/input")
	private WebElement continueButton;
	

	
	public void clickLoginlink() {
		loginLink.click();
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void alertText() {
		Boolean textAlert = this.warnAlert.isDisplayed();
		if(textAlert)
		{
			forgottenButton.click();
		}
		
	}
		
		public void forgetPasswordEmail(String forgottenEmailEnter) {
			this.forgottenEmailEnter.clear(); 
			this.forgottenEmailEnter.sendKeys(forgottenEmailEnter);		
		
		
	}
		
		public void clickContinue() {
			this.continueButton.click(); 
		}
}
