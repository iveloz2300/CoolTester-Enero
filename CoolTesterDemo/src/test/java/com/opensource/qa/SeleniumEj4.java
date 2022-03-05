package com.opensource.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class SeleniumEj4 {

	String username, password, msgNoRecords, userNotExist, newEmployee, newUser, newpassword,usernamedelete;
	// public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		username = "Admin";
		password = "admin123";
		userNotExist = "XYZ";
		msgNoRecords = "No Records Found";
		newEmployee = "";
		newUser = "";
		newpassword = "";
		usernamedelete="iveloz";

	}

	@Test
	public void TC004_Admin_DeleteUser() {
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(usernamedelete);

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Step 7
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, usernamedelete);
		
		// Step 8
		Reporter.log("Select User");
		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[1]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		// Step 9
		Reporter.log("Click Delete");
		driver.findElement(By.xpath("//*[@id=\"btnDelete\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		// Step 10
		Reporter.log("	Validate pop-window is displayed: \"Delete Records?\"");
		driver.findElement(By.xpath("//*[@id=\"btnDelete\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		// Step 11
		Reporter.log("Click Ok to confirm delete user");
		driver.findElement(By.xpath("//*[@id=\"dialogDeleteBtn\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		

	}

	@AfterTest
	public void afterTest() {
		// driver.close();
	}

}
