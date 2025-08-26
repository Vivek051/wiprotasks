package com.wipro.Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question7 {
	WebDriver driver;
	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		System.out.println("Title :" + driver.getTitle());
		List <WebElement> name= driver.findElements(By.xpath("//*[@id='table1']/tbody/tr/td[2]"));
		if(name != null) {
			for(WebElement names : name) {
				System.out.println("Name : " + names.getText());
			}
		}
//		List <WebElement> name1= driver.findElements(By.xpath("//*[@id='table1']/tbody/tr/td[3]"));
//		if(name.contains("Jason")) {
//			System.out.println("Email : " + driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[3]")).getText());
//			
//		}
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
		for (WebElement row : rows) {
			String fullName = row.findElement(By.xpath("td[2]")).getText();
			if (fullName.contains("Jason")) {
				String email = row.findElement(By.xpath("td[3]")).getText();
				System.out.println("Email of Jason: " + email);
				break;
			}
		}

		driver.quit();


	}
}
