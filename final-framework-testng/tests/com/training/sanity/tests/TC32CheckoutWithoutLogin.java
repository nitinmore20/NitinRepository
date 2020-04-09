package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.TC32CheckoutWithoutLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC32CheckoutWithoutLogin {

	private WebDriver driver;
	private String baseUrl;
	private TC32CheckoutWithoutLoginPOM TC32CheckoutWithoutLoginPOM;
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
		TC32CheckoutWithoutLoginPOM = new TC32CheckoutWithoutLoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL1");
		//screenShot = new ScreenShot(driver); 
		// open the browser
		driver.get(baseUrl);
		
		
	}
	
	/*@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}*/
	
	@Test
	public void noLoginCheckout() {
		TC32CheckoutWithoutLoginPOM.clickShopUniform();
		TC32CheckoutWithoutLoginPOM.clickTshirt();
		TC32CheckoutWithoutLoginPOM.SelectSizeToCart();
		TC32CheckoutWithoutLoginPOM.clickAndViewCart();
		TC32CheckoutWithoutLoginPOM.clickCheckout();
	
}
}