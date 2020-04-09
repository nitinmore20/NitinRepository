package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginfunctionPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginFunction {

	private WebDriver driver;
	private String baseUrl;
	private LoginfunctionPOM LoginfunctionPOM;
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
		LoginfunctionPOM = new LoginfunctionPOM(driver); 
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
		LoginfunctionPOM.clickLoginlink();
		LoginfunctionPOM.sendUserName("neha@gmail.com");
		LoginfunctionPOM.sendPassword("Neha123");
		LoginfunctionPOM.clickLoginBtn(); 
		
	}
}
