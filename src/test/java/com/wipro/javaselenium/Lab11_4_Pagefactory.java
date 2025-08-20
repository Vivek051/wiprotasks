package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Lab11_4_Pagefactory {
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


	//By sbox =  By.name("search");
	@FindBy(name = "search")
	WebElement sbox;

	//By btn =   By.cssSelector("button.btn.btn-default.btn-lg");
	@FindBy(css ="button.btn.btn-default.btn-lg")
	WebElement btn;

	//By srchItem =	By.name("search");
	@FindBy(name="search")
	WebElement srchItem;

	//By description = By.name("description");
	@FindBy(name="description")
	WebElement description;


	//By submit = By.cssSelector("button.btn.btn-default.btn-lg");
	@FindBy(css = "button.btn.btn-default.btn-lg")
	WebElement submit;

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
	public void searchbox(String item) {

		sbox.clear();
		sbox.sendKeys(item);


	}
	public void buttonclick() {
		btn.click();
	}
	public void searchItem(String item) {

		srchItem.clear();

		srchItem.sendKeys(item);
	}
	public void selectdescription() {
		description.click();
	}
	public void submitpage() {
		submit.click();
	}
}
