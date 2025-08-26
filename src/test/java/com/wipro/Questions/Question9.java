package com.wipro.Questions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question9 {
 WebDriver driver; 
 String projectpath=System.getProperty("user.dir")  ;

 @Test
  public void f() throws IOException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = projectpath +"\\homepage.png";
		File destfile = new File(dest);
		FileUtils.copyFile(src,destfile);
  }
}
