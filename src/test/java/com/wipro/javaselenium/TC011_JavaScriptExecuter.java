package com.wipro.javaselenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC011_JavaScriptExecuter {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("alert('Hello');");
		//for particular argument
		js.executeScript("window.scrollBy(0,1500)");
		/*for bottom scroll
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		*/
	}
}
