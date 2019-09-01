package com.w2a.GitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
	}

	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("vinhnpa0909@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("anhvinh99");
		;
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
