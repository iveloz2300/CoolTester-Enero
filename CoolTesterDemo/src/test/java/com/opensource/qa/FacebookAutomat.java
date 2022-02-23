package com.opensource.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacebookAutomat {
	
	public static WebDriver driver; 
	
 @BeforeTest
 public void beforeTest() {
	  }
	  
  @Test
  public void face2() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  }


  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
