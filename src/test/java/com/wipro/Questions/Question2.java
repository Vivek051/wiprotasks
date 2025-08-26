package com.wipro.Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Question2 {
	WebDriver driver;
	@Test(dataProvider = "dp")
	public void f(String username, String pass) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		WebElement msg = driver.findElement(By.id("flash"));
		String msgtxt = msg.getText();
		Thread.sleep(3000);

		if(msgtxt.contains("You logged into a secure area!")) {
			System.out.println("Welcome to the Secure Area. When you are done click logout below.");
		} else {
			System.out.println(" Your username is invalid!");

		}
	}
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");

		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method...");
		driver.quit();

	}


	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] {  "tomsmith","SuperSecretPassword!"  },
			//new Object[] {  },
		};
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}


}
