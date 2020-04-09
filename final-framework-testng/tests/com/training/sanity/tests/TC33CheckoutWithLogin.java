package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.TC33CheckoutWithLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC33CheckoutWithLogin {

	
	private WebDriver driver;
	private String baseUrl;
	private TC33CheckoutWithLoginPOM TC33CheckoutWithLoginPOM;
	private static Properties properties;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TC33CheckoutWithLoginPOM = new TC33CheckoutWithLoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser
		driver.get(baseUrl);
		
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void journeyToOrder() throws InterruptedException {
		TC33CheckoutWithLoginPOM.clickLoginlink();
		TC33CheckoutWithLoginPOM.sendUserName("neha@gmail.com");
		TC33CheckoutWithLoginPOM.sendPassword("Neha123");
		TC33CheckoutWithLoginPOM.clickLoginBtn();
		TC33CheckoutWithLoginPOM.clickHome();
		TC33CheckoutWithLoginPOM.clickShopUniform();
		TC33CheckoutWithLoginPOM.clickTshirt();
		TC33CheckoutWithLoginPOM.selectSizeToCart();
		TC33CheckoutWithLoginPOM.moveToCartCheckout();
		TC33CheckoutWithLoginPOM.checkoutToDelivery();
		TC33CheckoutWithLoginPOM.paymentMethodToConfirmation();
	}
}	