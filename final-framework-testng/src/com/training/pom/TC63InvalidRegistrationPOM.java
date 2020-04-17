package com.training.pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC63InvalidRegistrationPOM {

	private WebDriver driver;



	
	public TC63InvalidRegistrationPOM(WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
		
	}


	public void sendFirstName() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(rowvalue);
		
	}

	public void sendLastName() throws IOException {
	FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(rowvalue);
	}

	public void sendeMail() throws IOException {
	FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(rowvalue);
	}

	public void sendTelephone() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(3).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(rowvalue);
	}

	public void sendAddress() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(4).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-address-1']")).sendKeys(rowvalue);
	}

	public void sendCity() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(6).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-city']")).sendKeys(rowvalue);
	}

	public void sendPostcode() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(7).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-postcode']")).sendKeys(rowvalue);
	}


	public void sendCountry() {
		Select countryName = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
		countryName.selectByVisibleText("India");
		
	}

	public void sendRegion() {
		Select countryName = new Select(driver.findElement(By.xpath("//select[@id='input-zone']")));
		countryName.selectByVisibleText("Karnataka");
		
	}

	public void sendPassword() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(10).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(rowvalue);
		
	}

	public void sendConfirmpassword() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String rowvalue;
		
		rowvalue = sheet.getRow(1).getCell(11).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(rowvalue);
		
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
}
