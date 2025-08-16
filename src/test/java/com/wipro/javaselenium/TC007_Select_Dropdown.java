package com.wipro.javaselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC007_Select_Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		System.out.println("Title :" + driver.getTitle());
		
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();
		
		WebElement sort  = driver.findElement(By.id("input-sort"));
		Select sel = new Select(sort);
		//sel.selectByIndex(5);
		List<WebElement> element  = sel.getOptions();
		for(int i=0; i< element.size(); i++) {
			System.out.println("The Values are: " + element.get(i).getText());
		}
	}
}
