package com.training.pom;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC32CheckoutWithoutLoginPOM {

	private WebDriver driver; 
	
	public TC32CheckoutWithoutLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//xpath for Shop Uniform
	@FindBy(xpath="//img[@alt='banner1']")
	private WebElement shopUniform;
	
	@FindBy(xpath="//a[@href='http://uniformm1.upskills.in/index.php?route=product/product&product_id=186']")
	private WebElement tShirt;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addCart;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement alertText;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement clickCart;
	
	@FindBy(xpath="//a[@href='http://uniformm1.upskills.in/index.php?route=checkout/cart']")
	private WebElement viewCart;
	
	@FindBy(xpath="//a[contains(text(),'Checkout')]")
	private WebElement checkOut;
	
	//Click on Shop Uniforms under Premium School Uniform 
	public void clickShopUniform() {
		shopUniform.click();
	}
	
	public void clickTshirt() {
		tShirt.click();
	}
	
	public void SelectSizeToCart(){
		Select chestSize = new Select (driver.findElement(By.xpath("//select[@id='input-option376']")));
		
		chestSize.selectByIndex(7);
		WebElement option = chestSize.getFirstSelectedOption();
		String selectedSize = option.getText();
		System.out.println("The Selected Size is " + selectedSize);
		//Add to Cart
		addCart.click();
	    String alertMess = alertText.getText();
	    System.out.println(alertMess);
	    if(alertText.isDisplayed())
	    {
	    	System.out.println("Product added in Cart");
	    	
	    }
	    }
	    public void clickAndViewCart() {
			clickCart.click();
			viewCart.click();
		}
	    
	    public void clickCheckout() {
			checkOut.click();
		}
	    }
	


