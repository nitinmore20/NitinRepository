package com.training.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC61RegistrationPOM {

	
		private WebDriver driver; 
			
			public TC61RegistrationPOM(WebDriver driver) {
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
			
			public  void writeExcel() throws IOException{
				
				File file = new File("C:\\excel\\excel.xlsx");
				
				XSSFWorkbook wb = new XSSFWorkbook();
				
				XSSFSheet sh = wb.createSheet();
				
				//Xpath's for the Elements
				
				String fistnameExcel = driver.findElement(By.xpath("//input[@id='input-firstname']")).getAttribute("value");
				String lastnameExcel = driver.findElement(By.xpath("//input[@id='input-lastname']")).getAttribute("value");
				String emailExcel = driver.findElement(By.xpath("//input[@id='input-email']")).getAttribute("value");
				String telephoneExcel = driver.findElement(By.xpath("//input[@id='input-telephone']")).getAttribute("value");
				String address1Excel = driver.findElement(By.xpath("//input[@id='input-address-1']")).getAttribute("value");
				String cityExcel = driver.findElement(By.xpath("//input[@id='input-city']")).getAttribute("value");
				String postcodeExcel = driver.findElement(By.xpath("//input[@id='input-postcode']")).getAttribute("value");
				
				//getting text from country dropdown
				Select countryName = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
				WebElement country = countryName.getFirstSelectedOption();
				String countryExcel = country.getText();
				
				//getting text from country dropdown
				
				Select regionName = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
				WebElement region = regionName.getFirstSelectedOption();
				String regionExcel = region.getText();
				
				String passwordExcel = driver.findElement(By.xpath("//input[@id='input-password']")).getAttribute("value");
				String confirmpasswordExcel = driver.findElement(By.xpath("//input[@id='input-confirm']")).getAttribute("value");
				
				
				
				//Create the Heading row
				sh.createRow(0).createCell(0).setCellValue("First Name");						
				sh.getRow(0).createCell(1).setCellValue("Last Name");
				sh.getRow(0).createCell(2).setCellValue("E-Mail");
				sh.getRow(0).createCell(3).setCellValue("Telephone");
				sh.getRow(0).createCell(4).setCellValue("Address 1");
				sh.getRow(0).createCell(5).setCellValue("City");
				sh.getRow(0).createCell(6).setCellValue("Post Code");
				sh.getRow(0).createCell(7).setCellValue("Country");
				sh.getRow(0).createCell(8).setCellValue("Region / State");
				sh.getRow(0).createCell(9).setCellValue("Password");
				sh.getRow(0).createCell(10).setCellValue("Password Confirm");
				
				// Create the account details 
				
				sh.createRow(1).createCell(0).setCellValue(fistnameExcel);	
				sh.getRow(1).createCell(1).setCellValue(lastnameExcel);
				sh.getRow(1).createCell(2).setCellValue(emailExcel);
				sh.getRow(1).createCell(3).setCellValue(telephoneExcel);
				sh.getRow(1).createCell(4).setCellValue(address1Excel);
				sh.getRow(1).createCell(5).setCellValue(cityExcel);
				sh.getRow(1).createCell(6).setCellValue(postcodeExcel);
				sh.getRow(1).createCell(7).setCellValue(countryExcel);
				sh.getRow(1).createCell(8).setCellValue(regionExcel);
				sh.getRow(1).createCell(9).setCellValue(passwordExcel);
				sh.getRow(1).createCell(10).setCellValue(confirmpasswordExcel);
				
				FileOutputStream fos = new FileOutputStream(file);
				
				wb.write(fos);
				
				fos.close();
				
		}
			
			public void readExcel() throws IOException {
				// TODO Auto-generated method stub

				FileInputStream fis = new FileInputStream("C:\\excel\\excel.xlsx");
				
				XSSFWorkbook workbook = new XSSFWorkbook(fis);

				XSSFSheet sheet = workbook.getSheetAt(0);
				
				

				int totalrows = sheet.getLastRowNum();
				
				System.out.println("Total Rows:" + totalrows);

				String rowvalue,rowvalue1;
				int j;
				//for (i = 0; i <= totalrows; i++){
					
					for (j=0; j<=10; j++){

					try {
						rowvalue = sheet.getRow(0).getCell(j).getStringCellValue();
						rowvalue1 = sheet.getRow(1).getCell(j).getStringCellValue();
						
						
						System.out.println(rowvalue);
						System.out.println(rowvalue1);
					}

					catch (NullPointerException ex) {
						String errormessage = ex.getMessage();
						System.out.print(errormessage);
					}
					
				}
			}
}

				
		
			




