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
import com.training.pom.TC63InvalidRegistrationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC63InvalidRegistration {

	public static class RegistrationTest {

		private WebDriver driver;
		private String baseUrl;
		private TC63InvalidRegistrationPOM TC63InvalidRegistrationPOM;
		private static Properties properties;
		//private ScreenShot screenShot;
		
		

		@BeforeClass
		public void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			TC63InvalidRegistrationPOM = new TC63InvalidRegistrationPOM(driver); 
			baseUrl = properties.getProperty("baseURL");
			//screenShot = new ScreenShot(driver); 
			// open the browser 
			driver.get(baseUrl);
			
		}
		
		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(5000);
			driver.quit();
		}
		@Test
		public void registrationTest() throws IOException{
			
			
			
			TC63InvalidRegistrationPOM.sendFirstName();
			TC63InvalidRegistrationPOM.sendLastName();
			TC63InvalidRegistrationPOM.sendeMail();
			TC63InvalidRegistrationPOM.sendTelephone();
			TC63InvalidRegistrationPOM.sendAddress();
			TC63InvalidRegistrationPOM.sendCity();
			TC63InvalidRegistrationPOM.sendPostcode();
			TC63InvalidRegistrationPOM.sendCountry();
			TC63InvalidRegistrationPOM.sendRegion();
			TC63InvalidRegistrationPOM.sendPassword();
			TC63InvalidRegistrationPOM.sendConfirmpassword();
			TC63InvalidRegistrationPOM.clickRadiobutton();
			TC63InvalidRegistrationPOM.clickCheckbox();		
			TC63InvalidRegistrationPOM.formSubmit();
			
			
			
		}
	}
}

