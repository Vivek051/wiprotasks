package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;



public class Loginpage {

	WebDriver driver;
	public Loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}


	By uname = 	By.id("username");

	By pword = 	By.id("password");
	By loginbutton = By.xpath("//*[@id=\"login\"]/button/i");

	By seach = By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	By submit =By.xpath("//*[@id=\"nav-search-submit-button\"]");
	

	public void EnterUserName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        userField.sendKeys(username);
    }

    public void Enterpassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        passField.sendKeys(password);
    }

    public void Clickonlogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginBtn.click();
    }


	
	
	public void enterusernam(String username) {
		driver.findElement(uname).sendKeys(username);
	}

		
	public void enterpassword(String password)
	{
		driver.findElement(pword).sendKeys(password);
	}
	
	
	public void clickonlogin()
	{
		driver.findElement(loginbutton).click();
	}
	
	public void searchitem(String item) {
		driver.findElement(seach).sendKeys(item);
	}
	public void submititem() {
		driver.findElement(submit).click();
	}
}
	
	

