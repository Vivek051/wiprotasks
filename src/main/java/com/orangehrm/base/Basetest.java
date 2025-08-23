package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.orangehrm.utilities.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Basetest {

    protected WebDriver driver;
    protected ExtentTest test;
    protected ExtentReports extent;

    @BeforeSuite
    public void setupReport() {
        extent = ExtentManager.getinstance();
    }

    @BeforeMethod
    public void setup() {
        System.out.println(" Launching browser...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Closing browser...");
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void flushReport() {
        System.out.println("Flushing Extent report...");
        if (extent != null) {
            extent.flush();
        }
    }

    // Optional: Getter for driver if you prefer encapsulation
    public WebDriver getDriver() {
        return driver;
    }
}