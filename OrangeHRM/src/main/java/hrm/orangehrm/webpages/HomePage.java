package hrm.orangehrm.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author KTM
 * Contains Login page elements and business libraries like login(
 */
public class HomePage {
	WebDriver driver =null;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Amministrazione']")
      private WebElement Admin;
	
	@FindBy(xpath="//span[text()='PIM']")
    private WebElement Pim;
	
	@FindBy(xpath="//span[text()='Leave']")
    private WebElement Leave;
	
	@FindBy(xpath="//span[text()='Time']")
    private WebElement Time;
	
	@FindBy(xpath="//span[text()='Recruitment']")
    private WebElement Recruitment;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAdmin() {
		return Admin;
	}

	public void setAdmin(WebElement admin) {
		Admin = admin;
	}

	public WebElement getPim() {
		return Pim;
	}

	public void setPim(WebElement pim) {
		Pim = pim;
	}

	public WebElement getLeave() {
		return Leave;
	}

	public void setLeave(WebElement leave) {
		Leave = leave;
	}

	public WebElement getTime() {
		return Time;
	}

	public void setTime(WebElement time) {
		Time = time;
	}

	public WebElement getRecruitment() {
		return Recruitment;
	}

	public void setRecruitment(WebElement recruitment) {
		Recruitment = recruitment;
	}

	
	
}
