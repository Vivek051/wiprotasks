package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_findElements{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		if(driver.findElement(By.id("email_create")).isDisplayed())
		{
			System.out.println("email create is displayed");
		driver.findElement(By.id("email_create")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("assfsdf@gmail.com");
		driver.findElement(By.id("email_create")).sendKeys(Keys.TAB);
		driver.findElement(By.id("email_create")).sendKeys(Keys.ENTER);
		
	}

		else
		{
			System.out.println("email create is not displayed");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.id("id_gender2")).click();
		
		if(	driver.findElement(By.id("id_gender2")).isSelected())
		{
			System.out.println("gender2 is selected");
		}
		else
		{
			System.out.println("gender2 is not selected");
		}
		{
		
	}
		
			
			
		

		if(driver.findElement(By.id("customer_firstname")).isDisplayed())
		{
			System.out.println("name is created");
		driver.findElement(By.id("customer_firstname")).clear();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Yanda");
		driver.findElement(By.id("customer_firstname")).sendKeys(Keys.TAB);
		driver.findElement(By.id("customer_firstname")).sendKeys(Keys.ENTER);
		}
		//else {
		
			//	System.out.println("name is not created");
			//}
			
			Thread.sleep(3000);
			driver.findElement(By.id("customer_firstname")).click();
			
			if(	driver.findElement(By.id("customer_firstname")).isSelected())
			{

				System.out.println("firstname is written");
			}
			//else
			//{
				//System.out.println("lastname is not written ");
			//}
			
			

			if(driver.findElement(By.id("customer_lastname")).isDisplayed())
			{
				System.out.println("name is created");
			driver.findElement(By.id("customer_lastname")).clear();
			
			driver.findElement(By.id("customer_lastname")).sendKeys("Chitralekha");
			driver.findElement(By.id("customer_lastname")).sendKeys(Keys.TAB);
			driver.findElement(By.id("customer_lastname")).sendKeys(Keys.ENTER);
			}
			//else {
			
					//System.out.println("name is not created");
				//}
				
				Thread.sleep(3000);
				driver.findElement(By.id("customer_lastname")).click();
				
				if(	driver.findElement(By.id("customer_lastname")).isSelected())
				{

					System.out.println("lastname is written");
				}
			
			
			
			
			
			
			

			if(driver.findElement(By.id("passwd")).isDisplayed())
			{
				System.out.println("name is created");
			driver.findElement(By.id("passwd")).clear();
			
			driver.findElement(By.id("passwd")).sendKeys("abcd@123");
			driver.findElement(By.id("passwd")).sendKeys(Keys.TAB);
			driver.findElement(By.id("passwd")).sendKeys(Keys.ENTER);
			}
			else {
			
					System.out.println("name is not created");
				}
				
				Thread.sleep(3000);
				driver.findElement(By.id("passwd")).click();
				
				if(	driver.findElement(By.id("passwd")).isSelected())
				{

					System.out.println("lastname is written");
				}
				//else
				//{
					//System.out.println("lastname is not written ");
				//} 
}
}