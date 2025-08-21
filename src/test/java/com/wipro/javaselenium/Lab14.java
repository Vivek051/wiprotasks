package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lab14 {
	WebDriver driver;

	public Lab14(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	By account = By.linkText("My Account");
	By reg = By.linkText("Register");
	By fname = By.id("input-firstname");
	By lname = By.id("input-lastname");
	By email = By.id("input-email");
	By telephone = By.id("input-telephone");
	By pword = By.id("input-password");
	By cpword = By.id("input-confirm");
	By policy = By.name("agree");
	By click = By.cssSelector("input.btn.btn-primary");

	public void myaccouunt() {
		driver.findElement(account).click();

	}

	public void register() {
		driver.findElement(reg).click();
		System.out.println("Register Account...");

	}
	public void firstname(String name) {
		driver.findElement(fname).sendKeys(name);

	}
	public void lastname(CharSequence name) {
		driver.findElement(lname).sendKeys(name);

	}
	public void enteremail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	public void Entertelephone(String num) {
		driver.findElement(telephone).sendKeys(num);
	}
	public void password(CharSequence pass) {
		driver.findElement(pword).sendKeys(pass);
	}
	public void confirmpassword(CharSequence cpass) {
		driver.findElement(cpword).sendKeys(cpass);
	}
	public void checkpolicy() {
		driver.findElement(policy).click();
	}
	public void  selectclick() {
		driver.findElement(click).click();
	}

}
