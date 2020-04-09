package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.ForgetpasswordPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ForgetPassword {

	private WebDriver driver;
	private String baseUrl;
	private ForgetpasswordPOM ForgetpasswordPOM;
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
		ForgetpasswordPOM = new ForgetpasswordPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser
		driver.get(baseUrl);
		
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		ForgetpasswordPOM.clickLoginlink();
		ForgetpasswordPOM.sendUserName("neha@gmail.com");
		ForgetpasswordPOM.sendPassword("Neha12");
		ForgetpasswordPOM.clickLoginBtn(); 
		ForgetpasswordPOM.alertText();
		ForgetpasswordPOM.forgetPasswordEmail("neha@gmail.com");
		ForgetpasswordPOM.clickContinue();
	}
}

