package hrm.orangehrm.webpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver=null;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement Username;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;

	public WebElement getUsername() {
		return Username;
	}
	public void setUsername(WebElement username) {
		Username = username;
	}


	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}


	public void login(String Username,String Password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}

}
