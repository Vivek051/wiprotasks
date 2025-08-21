package com.wipro.javaselenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Labb14_TestNG {
	WebDriver driver;
	@Parameters("browser")

	@Test(dataProvider = "dp")
	public void f(String fname, String lname ,String email,String num,String pass, String cpass) throws InterruptedException {
		String title=driver.getTitle();
        Thread.sleep(3000);

		System.out.println("The Title is:"+title);
		if(title.equals("Your store")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not matched");
		}

		Thread.sleep(3000);
		Lab14 obj = new Lab14(driver);
		obj.myaccouunt();
		obj.register();
		obj.firstname(fname);
		obj.lastname(lname);
		obj.enteremail(email);
		obj.Entertelephone(num);
		obj.password(pass);
		obj.confirmpassword(cpass);
		obj.checkpolicy();
		obj.selectclick();
		System.out.println("Your Account Has Been Created");

	}
	
	
	
	@Parameters("browser")

	@BeforeMethod
	public void beforeMethod(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php");
			System.out.println("Application launched successfully");
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php");
			System.out.println("Application launched successfully");
		} else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php");
			System.out.println("Application launched successfully");
		}

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		driver.quit();
	}


	@DataProvider
	public Object[][] dp() throws IOException {
		String[][] val = new String[2][6];
		String projectpath = System.getProperty("user.dir");
		File file1 = new File(projectpath+"\\UserDetails.xlsx");
		FileInputStream fs = new FileInputStream(file1);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet worksheet = workbook.getSheetAt(0);
		int rowcount = worksheet.getPhysicalNumberOfRows();
		System.out.println("rows: " + rowcount);

		for(int i=0; i<rowcount; i++) {
			val[i][0] = worksheet.getRow(i).getCell(0).getStringCellValue();
			val[i][1]=worksheet.getRow(i).getCell(1).getStringCellValue();
			val[i][2] = worksheet.getRow(i).getCell(2).getStringCellValue();
			val[i][3]=worksheet.getRow(i).getCell(3).toString();
			val[i][4] = worksheet.getRow(i).getCell(4).getStringCellValue();
			val[i][5]=worksheet.getRow(i).getCell(5).getStringCellValue();
		}
		return val;
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}


}
