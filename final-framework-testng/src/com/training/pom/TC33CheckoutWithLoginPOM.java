package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC33CheckoutWithLoginPOM {

private WebDriver driver; 
	
	public TC33CheckoutWithLoginPOM(WebDriver driver) {
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
	
	//path on Uniform Store
	@FindBy(xpath="//a[contains(text(),'Uniform Store')]")
	private WebElement home; 
	
	//path on Shop Uniform
	@FindBy(xpath="//img[@alt='banner1']")
	private WebElement shopUniform;
	
	//path on tshirt
	@FindBy(xpath="//a[@href='http://uniformm1.upskills.in/index.php?route=product/product&product_id=186']")
	private WebElement tShirt;
	
	//path for Add to Cart Button
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addCart;
	
	//path for alert text
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement alertText;
	
	//path for Cart
	@FindBy(xpath="//button[@type='button']")
	private WebElement clickCart;
	
	//path for View Cart
	@FindBy(xpath="//a[@href='http://uniformm1.upskills.in/index.php?route=checkout/cart']")
	private WebElement viewCart;
	
	//path for Checkout
	@FindBy(xpath="//a[contains(text(),'Checkout')]")
	private WebElement checkOut;
	
	//path for Checkout Continue	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement checkOutBilling;
	
	//path for Delivery Details Continue
	@FindBy(xpath="//input[@id='button-shipping-address']")
	private WebElement checkOutDeliveryDetails;
	
	@FindBy(xpath="//input[@name='shipping_method']")
	private WebElement DeliveryMethod;
	
	//path for Delivery Method Continue
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement DeliveryMethodContinue;
	
	//path for Payment Method Radio Button
	@FindBy(xpath="//input[@name='payment_method']")
	private WebElement PaymentMethodRadio;
	
	//path for Payment Method Text Box
	@FindBy(xpath="//*[@id='collapse-payment-method']//p[3]//textarea")
	private WebElement PaymentMethodTextBox;
	
	//path for Payment Method Checkbox
	@FindBy(xpath="//input[@name='agree']")
	private WebElement PaymentMethodCheckBox;
	
	//path for Payment Method COntinue
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement PaymentMethodContinue;
	
	//path for Confirm Order Button
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement confirmOrder;
	
	
	
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
	
	public void clickHome() {
		this.home.click(); 
	}
	
	public void clickShopUniform() {
		shopUniform.click();
	}
	
	public void clickTshirt() {
		tShirt.click();
	}
	
	
	
	public void selectSizeToCart(){
		Select chestSize = new Select (driver.findElement(By.xpath("//select[@name='option[376]']")));
		
		chestSize.selectByIndex(6);
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
	
	public void moveToCartCheckout()
	
	{
		
		Actions builder = new Actions(driver);
		builder.moveToElement(clickCart).build().perform();
		clickCart.click();
		viewCart.click();
		checkOut.click();
		
	}
	
	public void checkoutToDelivery()
	{
		checkOutBilling.click();
		checkOutDeliveryDetails.click();
		DeliveryMethodContinue.click();
	}
	
	public void paymentMethodToConfirmation()
	{
		if(PaymentMethodRadio.isSelected())
		{
			System.out.println("Cash on Delivery Selected");
		}else
			System.out.println("Payment Method is not Selected");
		
		PaymentMethodTextBox.sendKeys("Please Deliver between 7am to 10 am");
		
		PaymentMethodCheckBox.click();
		
		PaymentMethodContinue.click();
		
		confirmOrder.click();
	}
}

	
	


