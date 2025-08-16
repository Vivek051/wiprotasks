package com.wipro.javaselenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC00_Lab5 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		System.out.println("Title :" + driver.getTitle());
		//driver.findElement(By.linkText("REGISTER")).click();
		
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.err.println("Title is matched");
		} 
		else {
			System.out.println("Title not matched...");
	}


            driver.navigate().to("https://www.yahoo.com/");
            System.out.println("Navigated to Yahoo. Title: " + driver.getCurrentUrl());
            driver.navigate().back();
            System.out.println("uri is " + driver.getCurrentUrl());
            driver.navigate().forward();
            driver.navigate().refresh();
            System.out.println("url is " + driver.getCurrentUrl());
            
            System.out.println("Page source is: " + driver.getPageSource());


              
	}
}
