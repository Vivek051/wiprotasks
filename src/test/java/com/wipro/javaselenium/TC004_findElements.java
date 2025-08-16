package com.wipro.javaselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_findElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> amzlinks  = driver.findElements(By.tagName("a"));
		System.out.println("Total links in amazon.in: " + amzlinks.size());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(WebElement links : amzlinks) {
			System.out.println("The link is :" + links.getAttribute("href"));
			System.out.println("The link is :" + links.getText());

		}
	}
}
