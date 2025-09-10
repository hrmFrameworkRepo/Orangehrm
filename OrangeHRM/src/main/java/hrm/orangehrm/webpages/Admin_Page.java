package hrm.orangehrm.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Page {
	WebDriver driver =null;

	public Admin_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//label[text()='Username']/parent::div/following-sibling::div/child::input")
	private WebElement Username;
	
	@FindBy(xpath = "//label[text()='User Role']/ancestor::div[contains(@class,'oxd-input-group ')]/descendant::div[text()='-- Select --']")
	private WebElement UserRole ;
	
	@FindBy(xpath = "//label[text()='Employee Name']/ancestor::div[contains(@class,'oxd-input-group ')]/descendant::input")
	private WebElement  EmployeeName;
	
	
	@FindBy(xpath = "//label[text()='Status']/ancestor::div[contains(@class,'oxd-input-group ')]/descendant::div[text()='-- Select --']")
	private WebElement Status ;
	
	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement Reset;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement Search;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement Add;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement Usermanagement;
	
	@FindBy(xpath = "//span[text()='Job ']")
	private WebElement job;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement usermanagement;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement usermanagement;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement usermanagement;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement usermanagement;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement usermanagement;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement usermanagement;
}
