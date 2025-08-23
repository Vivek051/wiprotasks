package com.orangehrm.pages;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Loginpage {

	WebDriver driver;
	public Loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

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
	
	

