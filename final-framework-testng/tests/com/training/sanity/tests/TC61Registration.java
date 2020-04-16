package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TC61RegistrationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC61Registration {

	public static class RegistrationTest {

		private WebDriver driver;
		private String baseUrl;
		private TC61RegistrationPOM TC61RegistrationPOM;
		private static Properties properties;
		private ScreenShot screenShot;
		
		

		@BeforeClass
		public void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			TC61RegistrationPOM = new TC61RegistrationPOM(driver); 
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
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
			
			
			
			TC61RegistrationPOM.sendFirstName("Neha");
			TC61RegistrationPOM.sendLastName("B");
			TC61RegistrationPOM.sendeMail("neha@ag.com");
			TC61RegistrationPOM.sendTelephone("9241835892");
			TC61RegistrationPOM.sendAddress("Jayanagar");
			TC61RegistrationPOM.sendCity("Bangalore");
			TC61RegistrationPOM.sendPostcode("560082");
			TC61RegistrationPOM.sendCountry();
			TC61RegistrationPOM.sendRegion();
			TC61RegistrationPOM.sendPassword("Neha123");
			TC61RegistrationPOM.sendConfirmpassword("Neha123");
			TC61RegistrationPOM.clickRadiobutton();
			TC61RegistrationPOM.clickCheckbox();
			TC61RegistrationPOM.writeExcel();
			TC61RegistrationPOM.formSubmit();
			TC61RegistrationPOM.readExcel();
			
			
		}
	}
}
