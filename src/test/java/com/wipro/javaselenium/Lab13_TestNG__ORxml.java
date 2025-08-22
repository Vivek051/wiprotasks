package com.wipro.javaselenium;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.testng.annotations.Test;
 
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
 
public class Lab13_TestNG__ORxml {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
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
		Lab16_xml obj = new Lab16_xml(driver);
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
		Thread.sleep(3000);
		System.out.println("Your Account Has Been Created");

	}

	@BeforeMethod
	public void beforeMethod() {
	
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php");
		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		driver.quit();
	}


	@DataProvider
	public Object[][] dp() throws IOException, CsvException, ParserConfigurationException, SAXException {
		String[][] val = new String[2][6];
		File file = new File(projectpath+"\\newdata.xml");
		DocumentBuilderFactory dbfactory =DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();	
		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
		NodeList nlist = doc.getElementsByTagName("user");
		for(int i=0; i<nlist.getLength(); i++) {
			Node node = nlist.item(i);
			if(node.getNodeType()== Node.ELEMENT_NODE) {
				Element element = (Element)node;

				val[i][0] = element.getElementsByTagName("firstname").item(0).getTextContent();
				val[i][1] = element.getElementsByTagName("lastname").item(0).getTextContent();
				val[i][2] = element.getElementsByTagName("email").item(0).getTextContent();
				val[i][3] = element.getElementsByTagName("telephone").item(0).getTextContent();
				val[i][4] = element.getElementsByTagName("password").item(0).getTextContent();
				val[i][5] = element.getElementsByTagName("confirmpassword").item(0).getTextContent();

			}
		
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
