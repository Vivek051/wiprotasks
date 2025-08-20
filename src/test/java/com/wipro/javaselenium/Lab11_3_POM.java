package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Lab11_3_POM {

	WebDriver driver;
	public Lab11_3_POM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By desk = By.linkText("Desktops");
	By mac = By.linkText("Mac (1)");
    By sort =	By.id("input-sort");
    By clck = By.xpath("//button[contains(@onclick,'cart.add')]");
	
	public void opendesktop() {
		driver.findElement(desk).click();
	}
	public void selectmac() {
		driver.findElement(mac).click();
	}
	
	public void sortelement() {
		Select srt = new Select(driver.findElement(sort));
		srt.selectByIndex(1);
		
	}
	public void clicking() {
		driver.findElement(clck).click();
	}

}
