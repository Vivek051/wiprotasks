package com.wipro.javaselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC014_TestNG {
	@Parameters("browser")
	@Test
	public void test2(String browser) {
		System.out.println("This is test2");

		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("This is chrome site");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("This is firefox site");
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
		} else if (browser.equalsIgnoreCase("edge")){
			System.out.println("This is edge site");
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.flipkart.com/");
		}
	}
}

