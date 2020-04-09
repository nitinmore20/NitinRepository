package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RegistrationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegistrationTest {

	private WebDriver driver;
	private String baseUrl;
	private RegistrationPOM RegistrationPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegistrationPOM = new RegistrationPOM(driver); 
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
	public void registrationTest(){
		
		
		
		RegistrationPOM.sendFirstName("Neha");
		RegistrationPOM.sendLastName("B");
		RegistrationPOM.sendeMail("neha@ac.com");
		RegistrationPOM.sendTelephone("9241835892");
		RegistrationPOM.sendAddress("Jayanagar");
		RegistrationPOM.sendCity("Bangalore");
		RegistrationPOM.sendPostcode("560082");
		RegistrationPOM.sendCountry();
		RegistrationPOM.sendRegion();
		RegistrationPOM.sendPassword("Neha123");
		RegistrationPOM.sendConfirmpassword("Neha123");
		RegistrationPOM.clickRadiobutton();
		RegistrationPOM.clickCheckbox();
		RegistrationPOM.formSubmit();
		
		
	}
}
