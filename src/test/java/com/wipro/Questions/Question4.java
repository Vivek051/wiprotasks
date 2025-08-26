package com.wipro.Questions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question4 {
	WebDriver driver;

	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement sel = driver.findElement(By.name("my-select"));
		Select sort = new Select(sel);
		List<WebElement> element = sort.getOptions(); 
		
			System.out.println("The Values are: " + element.get(1).getText());
		}
	}