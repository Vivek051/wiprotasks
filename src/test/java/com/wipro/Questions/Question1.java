package com.wipro.Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.utilities.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
	WebDriver driver;
	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		if(actualtitle.equalsIgnoreCase("Google"))
		{
			System.out.println("Google title is matched");
		}
		else
		{

			System.out.println("Google title is not matched:"+actualtitle);

		}

	}

	
}
