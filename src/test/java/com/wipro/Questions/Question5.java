package com.wipro.Questions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question5 {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("Title :" + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert salert = driver.switchTo().alert();
		salert.accept();
		WebElement res = driver.findElement(By.id("result"));
		String msg = res.getText();
		if(msg != null) {
		System.out.println("The Message : " + msg);
		} else {
			System.out.println("Not verified");
		}
  }
}
