package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginObjects {
	
	WebDriver objDriver;

	public SauceDemoLoginObjects(WebDriver driver) {
		this.objDriver = driver;
		PageFactory.initElements(objDriver, this);
	}
		
	@FindBy(xpath = "//input[@name='user-name']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passWord;
	
	@FindBy(xpath = "//input[@data-test='login-button']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='error-message-container error']/h3")
	private WebElement error;
	
	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return passWord;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(WebElement passWord) {
		this.passWord = passWord;
	}
	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(WebElement error) {
		this.error = error;
	}

	/**
	 * @return the errorMsg
	 */
	public WebElement getErrorMsg() {
		return error;
	}
	

}
