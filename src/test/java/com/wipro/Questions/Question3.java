package com.wipro.Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question3 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("laptop");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(3000);

		List<WebElement> productTitle = driver.findElements(By.cssSelector("span.a-size-medium.a-text-normal"));
		if (productTitle.size() >= 5) {
		    for (int i = 0; i < 5; i++) {
		        System.out.println((i + 1) + productTitle.get(i).getText());
		    }
		} else {
		    System.out.println("Invalid data");
		}
		driver.quit();
	}
}