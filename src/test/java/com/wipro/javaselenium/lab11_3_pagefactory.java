package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class lab11_3_pagefactory {

	WebDriver driver;
	//By desk = By.linkText("Desktops");
	@FindBy(linkText = "Desktops")
	WebElement desk;
	
	//By mac = By.linkText("Mac (1)");
	@FindBy(linkText = "Mac (1)")
	WebElement mac;
	
	
    //By sort =	By.id("input-sort");
	@FindBy(id="input-sort")
	WebElement sort;
    
	//By clck = By.xpath("//button[contains(@onclick,'cart.add')]");
	@FindBy(xpath = "//button[contains(@onclick,'cart.add')]")
	WebElement clck;
	
	
	public void opendesktop() {
		desk.click();
	}
	public void selectmac() {
		mac.click();
	}
	
	public void sortelement() {
		Select srt = new Select(sort);
		srt.selectByIndex(1);
		
	}
	public void clicking() {
		clck.click();
	}

}
