package com.oranhehrm.stepdefinations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    WebDriver driver;

    @Given("Launch the Browser")
    public void launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("Navigate to the URL")
    public void navigate_to_the_url() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter the valid username and password")
    public void enter_the_valid_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
    }

    @When("Enter the invalid username and password")
    public void enter_the_invalid_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("wrongUser");
        driver.findElement(By.name("password")).sendKeys("wrongPass");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Login should be successful")
    public void login_should_be_successful() {
        List<WebElement> isDashboardVisible = driver.findElements(By.xpath("//h6[text()='Dashboard']"));
        if (isDashboardVisible != null) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    @Then("Login should be unsuccessful")
    public void login_should_be_unsuccessful() {
        List<WebElement> isErrorDisplayed = driver.findElements(By.xpath("//p[contains(text(),'Invalid credentials')]"));
        if (isErrorDisplayed != null) {
            System.out.println("Login failed as expected");
        } else {
            System.out.println("Unexpected login success");
        }
    }

    @Then("Verify dashboard")
    public void verify_dashboard() {
        boolean isDashboardVisible = driver.findElements(By.xpath("//h6[text()='Dashboard']")).size() > 0;
        if (isDashboardVisible) {
            System.out.println("Dashboard is visible");
        } else {
            System.out.println("Dashboard not found");
        }
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}