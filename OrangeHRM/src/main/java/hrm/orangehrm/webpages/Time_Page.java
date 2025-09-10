package hrm.orangehrm.webpages;

package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Time_Page {
	WebDriver driver;
	public void TimeSheets(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(name = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
		private WebElement SelectEmployeeViewButton;
		@FindBy(xpath = "//input[@placeholder='Type for hints...']")
		private WebElement SelecetEmployeeTextfield;
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space']")
		private WebElement industryDB;
		@FindBy(xpath = "//span[text()='Timesheets ']")
		private WebElement SelectEmployeeTimeSheets;
		@FindBy(xpath = "//a[text()='My Timesheets']")
		private WebElement MyTimeSheets;
		@FindBy(xpath = "//a[text()='Employee Timesheets']")
		private WebElement EmployeeTimeSheets;
		@FindBy(xpath = "//span[text()='Attendance ']")
	    private WebElement AttendanceModule;
		@FindBy(xpath = "//a[text()='My Records']")
		private WebElement MyRecords;
		@FindBy(xpath = "//a[text()='Punch In/Out']")
		private WebElement punchINandOUT;
		@FindBy(xpath = "a[text()='Employee Records']")
		private WebElement  EmployeeRecords;
		@FindBy(xpath = "a[text()='Configuration']")
		private WebElement  Configuration;
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
		private WebElement SubmitButton;
		@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
		private WebElement CalendarpopupinAttendance;
		@FindBy(xpath ="//i[@class='oxd-icon bi-clock oxd-time-input--clock'] ")
		private WebElement ClockinAttendance;
		@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
		private WebElement Employeecanchangecurrenttimewhenpunchinginandout;
		@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
		private WebElement Employeecaneditdeleteownattendancerecords;
		@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
		private WebElement Supervisorcanaddeditdeleteattendancerecordsofsubordinates;
		@FindBy(xpath="//span[text()='Reports ']")
		private WebElement Reports;
		@FindBy(xpath="//a[text()='Project Reports']")
		private WebElement ProjectReports;
		@FindBy(xpath="//a[text()='Employee Reports']")
		private WebElement EmployeeReports;
		@FindBy(xpath="//a[text()='Attendance Summary']")
		private WebElement AttendanceSummary;
		@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
		private WebElement ProjectName;;
		@FindBy(xpath = "//span[text()='Project Info ']")
		private WebElement ProjectInfo;
		@FindBy(xpath = "//a[text()='Customers']")
		private WebElement CustomersDropdown;

		@FindBy(xpath = "//a[text()='Projects']")
		private WebElement ProjectsDropdown;
		public void Time( WebElement MyTimeSheets,WebElement EmployeeTimeSheets) {
			
			Select sel= new Select(MyTimeSheets);
			sel.selectByVisibleText("My Timesheets");
			 MyTimeSheets.click();
			 Select sel1= new Select(EmployeeTimeSheets);
				sel1.selectByVisibleText("Employee Timesheets");
				EmployeeTimeSheets.click();
	}
}


	
		
		
