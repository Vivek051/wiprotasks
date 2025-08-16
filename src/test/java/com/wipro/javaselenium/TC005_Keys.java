package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_Keys {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList")).click();

		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement emailField = driver.findElement(By.id("ap_email_login"));
		
		if (emailField.isDisplayed()) {
			System.out.println("Email field is displayed");

			emailField.sendKeys("8867661735");
			emailField.sendKeys(Keys.TAB);
			emailField.sendKeys(Keys.ENTER);
			driver.findElement(By.id("ap_password")).sendKeys("Viv@#123");
			driver.findElement(By.id("ap_password")).sendKeys(Keys.TAB);
			driver.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);
		} else {
			System.out.println("Email field is not displayed");
		}


	}
}
