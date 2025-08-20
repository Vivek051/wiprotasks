package com.wipro.javaselenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab11_4_TestNG_Pagefactory {
	WebDriver driver;

	@Test(dataProvider = "dp")

	public void f(String searchItem) throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Title : " + title);

		Assert.assertEquals(driver.getTitle(), "Account Login");
		Lab11_4_Pagefactory obj = PageFactory.initElements(driver, Lab11_4_Pagefactory.class);
		obj.opendesktop();
		obj.selectmac();
		obj.sortelement();
		obj.clicking();
		obj.searchbox(searchItem);
		obj.buttonclick();
		obj.searchItem(searchItem);
		obj.selectdescription();
		obj.submitpage();
		System.out.println("Search completed... ");
	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		System.out.println("Application launched successfully");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("Browser closed");
	}


	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "Mobile" },
			new Object[] { "Monitors" }
		};
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Execution");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class Execution");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Execution");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test Execution");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Execution");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Execution");
	}
}

