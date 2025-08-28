package com.orangehrm.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.orangehrm.base.Basetest;
import com.orangehrm.pages.Loginpage;
import com.orangehrm.utilities.Excelutilities;
import com.orangehrm.utilities.Screenshot;

public class LoginOrangeHRM extends Basetest {
	Loginpage login;

	static String projectpath = System.getProperty("user.dir");

	@Test(dataProvider = "loginData1")
	public void verifylogin(String username, String password) throws IOException, ParserConfigurationException, SAXException {
		navigateurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		test = extent.createTest("Login with the user: " + username);
		login = new Loginpage(driver); 
		login.EnterUserName(username);
		login.Enterpassword(password);
		login.Clickonlogin();

		String actualtitle = driver.getTitle();
		if (actualtitle.equalsIgnoreCase("OrangeHR")) {
			test.pass("Login Successful and title is matched: " + actualtitle);
		} else {
			String screenpath = Screenshot.Capture(driver, "Login_Failed_" + username);
			test.fail("Login Unsuccessful and title is not matched: " + actualtitle)
			.addScreenCaptureFromPath(screenpath); 
		}
	}
	@Test
	public void question1_google() throws IOException
	{
		navigateurl("https://www.google.com/");
		test=extent.createTest("Verify the title of the google page");
		String actualtitle=driver.getTitle();
		if(actualtitle.equalsIgnoreCase("Google"))
		{
			test.pass("Google title is matched");
		}
		else
		{
			String screenpath=Screenshot.Capture(driver, "Title mismatched");
			test.fail("Google title is not matched:"+actualtitle)
			.addScreenCaptureFromPath(screenpath);

		}

	}
	@Test(dataProvider = "loginData")
	public void Question2(String username, String pass) throws InterruptedException {
		navigateurl("https://the-internet.herokuapp.com/login");
		test = extent.createTest("Verify Login Success..");
		login = new Loginpage(driver);
		login.enterusernam(username);
		login.enterpassword(pass);
		login.clickonlogin();
		WebElement msg = driver.findElement(By.id("flash"));
		String msgtxt = msg.getText();
		Thread.sleep(3000);

		if(msgtxt.contains("You logged into a secure area!")) {
			System.out.println("Welcome to the Secure Area. When you are done click logout below.");
		} else {
			System.out.println(" Your username is invalid!");

		}
	}
	@Test
	public void Question3() throws InterruptedException {

		navigateurl("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		test = extent.createTest("Verify first five items");
		login = new Loginpage(driver); 
		login.searchitem("laptop");
		login.submititem();

		List<WebElement> productTitle = driver.findElements(By.cssSelector("span.a-size-medium.a-text-normal"));
		if (productTitle.size() >= 5) {
			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1) + productTitle.get(i).getText());
			}
		} else {
			System.out.println("Invalid data");
		}
		driver.quit();
	}

	@Test
	public void Question4() throws InterruptedException {

		navigateurl("https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(3000);
		test = extent.createTest("Verify Sorting dropdown");
		WebElement sel = driver.findElement(By.name("my-select"));
		Select sort = new Select(sel);
		List<WebElement> element = sort.getOptions(); 

		System.out.println("The Values are: " + element.get(1).getText());
	}

	@Test
	public void Question5() throws InterruptedException {

		navigateurl("https://the-internet.herokuapp.com/javascript_alerts");
		test = extent.createTest("Verify Alert message");
		System.out.println("Title :" + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert salert = driver.switchTo().alert();
		salert.accept();
		Thread.sleep(3000);
		WebElement res = driver.findElement(By.id("result"));
		String msg = res.getText();
		if(msg != null) {
			System.out.println("The Message : " + msg);
		} else {
			System.out.println("Not verified");
		}
	}
	@Test
	public void Question6() throws InterruptedException {

		navigateurl("https://the-internet.herokuapp.com/checkboxes");
		test = extent.createTest("Verify checkbox selected");
		System.out.println("Title :" + driver.getTitle());
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		Thread.sleep(3000);
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}else if(!checkbox2.isSelected()) {
			checkbox2.click();
		}
		System.out.println("Both the Check boxes are Checked");

	}
	@Test
	public void Question7() {

		navigateurl("https://the-internet.herokuapp.com/tables");
		test = extent.createTest("Verify Candidate data");
		System.out.println("Title :" + driver.getTitle());
		List <WebElement> name= driver.findElements(By.xpath("//*[@id='table1']/tbody/tr/td[2]"));
		if(name != null) {
			for(WebElement names : name) {
				System.out.println("Name : " + names.getText());
			}
		}
		//		List <WebElement> name1= driver.findElements(By.xpath("//*[@id='table1']/tbody/tr/td[3]"));
		//		if(name.contains("Jason")) {
		//			System.out.println("Email : " + driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[3]")).getText());
		//			
		//		}
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
		for (WebElement row : rows) {
			String fullName = row.findElement(By.xpath("td[2]")).getText();
			if (fullName.contains("Jason")) {
				String email = row.findElement(By.xpath("td[3]")).getText();
				System.out.println("Email of Jason: " + email);
				break;
			}
		}

		driver.quit();
	}
	@Test
	  public void Question8() {
		navigateurl("https://the-internet.herokuapp.com/windows");
		test = extent.createTest("Verify multiple Window Handlig");
			driver.findElement(By.linkText("Click Here")).click();
			//WebElement msg = driver.findElement(By.xpath("/html/body/div/h3"));
			Set <String> mwindows = driver.getWindowHandles();
			for(String cwindow : mwindows) {
				driver.switchTo().window(cwindow);
				System.out.println("url is : " +driver.getTitle());

			}
			driver.close();
			driver.quit();
	  }

	 @Test
	  public void Question9() throws IOException {
		  
			navigateurl("https://www.wikipedia.org/");
			test = extent.createTest("Capture Home page Screenshot");
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String dest = projectpath +"\\homepage.png";
			File destfile = new File(dest);
			FileUtils.copyFile(src,destfile);
	  }
	@DataProvider(name = "loginData")
	public Object[][] loginDataProvider() throws IOException {
		String path = "C:\\Users\\vivek\\wipro\\wiproprogramming\\data3.xlsx";
		return Excelutilities.getdata(path, "Sheet1");
	}
	@DataProvider(name = "loginData1")
	public Object[][] loginDataProvider1() throws IOException {
		String path = "C:\\Users\\vivek\\wipro\\wiproprogramming\\data3.xlsx";
		return Excelutilities.getdata(path, "Sheet2");
	}
	
}