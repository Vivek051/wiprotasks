package com.wipro.Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question6 {
	WebDriver driver;
	
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
		System.out.println("Title :" + driver.getTitle());
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}else if(!checkbox2.isSelected()) {
			checkbox2.click();
		}
		System.out.println("Both the Check boxes are Checked");
		
  }
}
