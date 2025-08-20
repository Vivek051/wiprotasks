package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab11_4_POM {
	WebDriver driver;
	public Lab11_4_POM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By desk = By.linkText("Desktops");
	By mac = By.linkText("Mac (1)");
	By sort =	By.id("input-sort");
	By clck = By.xpath("//button[contains(@onclick,'cart.add')]");
	By sbox =  By.name("search");
	By btn =   By.cssSelector("button.btn.btn-default.btn-lg");
    By srchItem =	By.name("search");
    By description = By.name("description");
    By submit = By.cssSelector("button.btn.btn-default.btn-lg");
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
	public void searchbox(String item) {
		
	        driver.findElement(sbox).clear();
	        driver.findElement(sbox).sendKeys(item);
	    

	}
	public void buttonclick() {
		driver.findElement(btn).click();
	}
	public void searchItem(String item) {
		
		driver.findElement(srchItem).clear();
		
		driver.findElement(srchItem).sendKeys(item);
	}
	public void selectdescription() {
		driver.findElement(description).click();
	}
	public void submitpage() {
		driver.findElement(submit).click();
	}
}

