package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_pageobject {
	WebDriver driver;
	public login_pageobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver = driver;
	}
	By uname = By.name("username");
	By pword = 	By.name("password");
	By loginbutton = By.xpath("//button[@type='submit']");

	public void enterusernam(String username) {
		driver.findElement(uname).sendKeys(username);
	}

		
	public void enterpassword(String password)
	{
		driver.findElement(pword).sendKeys(password);
	}
	
	
	public void clickonlogin()
	{
		driver.findElement(loginbutton).click();
	}
}
