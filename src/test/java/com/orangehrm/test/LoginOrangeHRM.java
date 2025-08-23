package com.orangehrm.test;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.orangehrm.base.Basetest;
import com.orangehrm.pages.Loginpage;
import com.orangehrm.utilities.Excelutilities;
import com.orangehrm.utilities.Screenshot;

public class LoginOrangeHRM extends Basetest {
    WebDriver driver;
    Loginpage login;

    static String projectpath = System.getProperty("user.dir");

    @Test(dataProvider = "loginData")
    public void verifylogin(String username, String password) throws IOException, ParserConfigurationException, SAXException {
        test = extent.createTest("Login with the user: " + username);
        login = new Loginpage(driver); // ✅ Correct constructor usage
        login.enterusernam(username);
        login.enterpassword(password);
        login.clickonlogin();

        String actualtitle = driver.getTitle();
        if (actualtitle.equalsIgnoreCase("OrangeHR")) {
            test.pass("Login Successful and title is matched: " + actualtitle);
        } else {
            String screenpath = Screenshot.Capture(driver, "Login_Failed_" + username);
            test.fail("Login Unsuccessful and title is not matched: " + actualtitle)
                .addScreenCaptureFromPath(screenpath); // ✅ Semicolon added
        }
    }

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() throws IOException {
        String path = "C:\\Users\\vivek\\wipro\\wiproprogramming\\data.xlsx";
        return Excelutilities.getdata(path, "datasheet");
    }
}