package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC31InvalidLoginPOM {

private WebDriver driver; 
	
	public TC31InvalidLoginPOM(WebDriver driver) {
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
		String warnMessage = warnAlert.getText();
		Boolean textAlert = this.warnAlert.isDisplayed();
		if(textAlert)
		{
			
			System.out.println(warnMessage);
		}
}
}

