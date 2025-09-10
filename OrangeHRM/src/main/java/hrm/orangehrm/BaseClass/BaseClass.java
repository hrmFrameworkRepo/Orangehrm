package hrm.orangehrm.BaseClass;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import hrm.orange.genericutility.Fileutility_Excell;
import hrm.orange.genericutility.Fileutility_propertyfile;
import hrm.orange.webdriver.JavaUtility;
import hrm.orange.webdriver.Utilityclass;
import hrm.orange.webdriver.WebdriverUtility;
import hrm.orangehrm.DatabaseUtility.Database_Utility;
import hrm.orangehrm.webpages.HomePage;
import hrm.orangehrm.webpages.LoginPage;

public class BaseClass {
	WebDriver driver = null;

	// creating object for utility files
	Fileutility_propertyfile flib = new Fileutility_propertyfile();
	Fileutility_Excell elib = new Fileutility_Excell();
	JavaUtility jlib = new JavaUtility();
	WebdriverUtility wlib = new WebdriverUtility();
	Database_Utility dlib = new Database_Utility();
	public static WebDriver sdriver = null;

	@BeforeSuite
	public void config_BS() throws SQLException {
		System.out.println("connect to database");
		dlib.getDbconnection();
	}

	// @Parameters("BROWSER")
	@BeforeClass
	public void config_BC(String browser) throws Exception {
		System.out.println("launch the browser");
		String BROWSER = flib.getdataFromPropertiesFile("browser");
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		sdriver = driver;
		Utilityclass.setDriver(driver);
	}

	@BeforeMethod
	public void config_BM() throws Exception {
		System.out.println("login");
		String URL = flib.getdataFromPropertiesFile("URL");
		String USERNAME = flib.getdataFromPropertiesFile("USERNAME");
		String PASSWORD = flib.getdataFromPropertiesFile("PASSWORD");
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);

	}

	@AfterMethod
	public void config_AM() {
		System.out.println("logout");
		HomePage hp = new HomePage(driver);
		hp.logout();
	}

	@AfterClass
	public void config_AC() {
		System.out.println("Close the browser");
		driver.quit();

	}

	@AfterSuite
	public void config_AS() {
		System.out.println("close the database");
		dlib.closeDbconnection();

	}

}
