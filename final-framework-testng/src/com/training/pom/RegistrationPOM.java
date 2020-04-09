package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPOM {
private WebDriver driver; 
	
	public RegistrationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="input-firstname")
	private WebElement firstName; 
	
	@FindBy(id="input-lastname")
	private WebElement lastName; 
	
	@FindBy(id="input-email")
	private WebElement eMailId; 
	
	@FindBy(id="input-telephone")
	private WebElement telePhone;
	
	@FindBy(id="input-address-1")
	private WebElement address1;
	
	@FindBy(id="input-city")
	private WebElement ciTy1;
	
	@FindBy(id="input-postcode")
	private WebElement postCode;
	
	
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPassword;
	
	
	
	
	
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	
	public void sendeMail(String eMailId) {
		this.eMailId.clear();
		this.eMailId.sendKeys(eMailId);
	}
	
	public void sendTelephone(String telePhone) {
		this.telePhone.clear();
		this.telePhone.sendKeys(telePhone);
	}
	
	public void sendAddress(String address1) {
		this.address1.clear();
		this.address1.sendKeys(address1);
	}
	
	public void sendCity(String ciTy1) {
		this.ciTy1.clear();
		this.ciTy1.sendKeys(ciTy1);
	}
	
	public void sendPostcode(String postCode) {
		this.postCode.clear();
		this.postCode.sendKeys(postCode);
	}
	
	
	public void sendCountry() {
		Select countryName = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
		countryName.selectByVisibleText("India");
		
	}
	
	public void sendRegion() {
		Select countryName = new Select(driver.findElement(By.xpath("//select[@id='input-zone']")));
		countryName.selectByVisibleText("Karnataka");
		
	}
	
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
		
	}
	
	public void sendConfirmpassword(String confirmPassword) {
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);
		
	}
	
	public void clickRadiobutton() {
		WebElement radioClick = driver.findElement(By.xpath("//input[@value='0']"));
		radioClick.click();
		
	}
	
	public void clickCheckbox() {
		WebElement checkboxClick = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkboxClick.click();
		if(checkboxClick.isSelected())
		{
			System.out.println("Checkbox is Selected");
		}else
			System.out.println("Checkbox is not Selected");
		
	}
	
	public void formSubmit() {
		WebElement submitForm = driver.findElement(By.xpath("//input[@type='submit']"));
		submitForm.submit();
}
}
