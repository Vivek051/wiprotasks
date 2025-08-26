package com.wipro.Questions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question8 {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		//WebElement msg = driver.findElement(By.xpath("/html/body/div/h3"));
		Set <String> mwindows = driver.getWindowHandles();
		for(String cwindow : mwindows) {
			driver.switchTo().window(cwindow);
			System.out.println("url is : " +driver.getTitle());

		}
		driver.close();
		driver.quit();
  }
}
