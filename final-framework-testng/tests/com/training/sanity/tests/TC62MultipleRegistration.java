package com.training.sanity.tests;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC62MultipleRegistration {

	@BeforeMethod
    public void beforeMethod() {
       
    }
	
	@Test 
    public void testMethodsOne() throws IOException {
		
		
	    	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\NitinMore\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		    driver.get("http://uniformm1.upskills.in/index.php?route=account/register");
		    
		    FileInputStream fis = new FileInputStream("C:\\excel\\test.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheetAt(0);
			
			String rowvalue10,rowvalue11,rowvalue12,rowvalue13,rowvalue14,rowvalue16,rowvalue17,rowvalue110,rowvalue111;
			
			rowvalue10 = sheet.getRow(1).getCell(0).getStringCellValue();
			rowvalue11 = sheet.getRow(1).getCell(1).getStringCellValue();
			rowvalue12 = sheet.getRow(1).getCell(2).getStringCellValue();
			rowvalue13 = sheet.getRow(1).getCell(3).getStringCellValue();
			rowvalue14 = sheet.getRow(1).getCell(4).getStringCellValue();
			rowvalue16 = sheet.getRow(1).getCell(6).getStringCellValue();
			rowvalue17 = sheet.getRow(1).getCell(7).getStringCellValue();
			
			Select countryName = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
			countryName.selectByVisibleText("India");
			
			Select countryName1 = new Select(driver.findElement(By.xpath("//select[@id='input-zone']")));
			countryName1.selectByVisibleText("Karnataka");
			
			rowvalue110 = sheet.getRow(1).getCell(10).getStringCellValue();
			rowvalue111 = sheet.getRow(1).getCell(11).getStringCellValue();
			
			
			driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(rowvalue10);
			driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(rowvalue11);
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(rowvalue12);
			driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(rowvalue13);
			driver.findElement(By.xpath("//input[@id='input-address-1']")).sendKeys(rowvalue14);
			driver.findElement(By.xpath("//input[@id='input-city']")).sendKeys(rowvalue16);
			driver.findElement(By.xpath("//input[@id='input-postcode']")).sendKeys(rowvalue17);
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(rowvalue110);
			driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(rowvalue111);
			
			WebElement radioClick1 = driver.findElement(By.xpath("//input[@value='0']"));
			radioClick1.click();
			
			WebElement checkboxClick1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
			checkboxClick1.click();
			if(checkboxClick1.isSelected())
			{
				System.out.println("Checkbox is Selected");
			}else
				System.out.println("Checkbox is not Selected");
			
			WebElement submitForm1 = driver.findElement(By.xpath("//input[@type='submit']"));
			submitForm1.submit();
	}
	
	@Test
    public void testMethodsTwo() throws IOException {
		long id = Thread.currentThread().getId();
	       System.out.println("Simple test-method One. Thread id is: " + id);
	    	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\NitinMore\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		    driver.get("http://uniformm1.upskills.in/index.php?route=account/register");
		    
		    FileInputStream fis = new FileInputStream("C:\\excel\\test.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheetAt(0);
			
			String rowvalue20,rowvalue21,rowvalue22,rowvalue23,rowvalue24,rowvalue26,rowvalue27,rowvalue210,rowvalue211;
			
			rowvalue20 = sheet.getRow(2).getCell(0).getStringCellValue();
			rowvalue21 = sheet.getRow(2).getCell(1).getStringCellValue();
			rowvalue22 = sheet.getRow(2).getCell(2).getStringCellValue();
			rowvalue23 = sheet.getRow(2).getCell(3).getStringCellValue();
			rowvalue24 = sheet.getRow(2).getCell(4).getStringCellValue();
			rowvalue26 = sheet.getRow(2).getCell(6).getStringCellValue();
			rowvalue27 = sheet.getRow(2).getCell(7).getStringCellValue();
			
			Select countryName = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
			countryName.selectByVisibleText("India");
			
			Select countryName1 = new Select(driver.findElement(By.xpath("//select[@id='input-zone']")));
			countryName1.selectByVisibleText("Karnataka");
			
			rowvalue210 = sheet.getRow(1).getCell(10).getStringCellValue();
			rowvalue211 = sheet.getRow(1).getCell(11).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(rowvalue20);
			driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(rowvalue21);
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(rowvalue22);
			driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(rowvalue23);
			driver.findElement(By.xpath("//input[@id='input-address-1']")).sendKeys(rowvalue24);
			driver.findElement(By.xpath("//input[@id='input-city']")).sendKeys(rowvalue26);
			driver.findElement(By.xpath("//input[@id='input-postcode']")).sendKeys(rowvalue27);
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(rowvalue210);
			driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(rowvalue211);
			
			WebElement radioClick2 = driver.findElement(By.xpath("//input[@value='0']"));
			radioClick2.click();
			
			WebElement checkboxClick2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
			checkboxClick2.click();
			if(checkboxClick2.isSelected())
			{
				System.out.println("Checkbox is Selected");
			}else
				System.out.println("Checkbox is not Selected");
			
			WebElement submitForm2 = driver.findElement(By.xpath("//input[@type='submit']"));
			submitForm2.submit();
	
			
	}
	
	@AfterMethod
    public void afterMethod() {
		System.out.println("Test case Executed Successfully");
       }
	
}
