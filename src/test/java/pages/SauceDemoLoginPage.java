package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objects.SauceDemoLoginObjects;

public class SauceDemoLoginPage {
	
	WebDriver pageDriver;

	SauceDemoLoginObjects pageElements;
	
	public SauceDemoLoginPage(WebDriver driver) {

		pageDriver = driver;
		pageElements = new SauceDemoLoginObjects(pageDriver);
		//PageFactory.initElements(driver, this);
	}

	public void pageNavigation() {
		// step3: verify if navigation is successful
		String actPageUrl = pageDriver.getCurrentUrl();
		String expPageUrl = "https://www.saucedemo.com/";
		Assert.assertEquals(actPageUrl, expPageUrl);

	}
	public void InvalidLogin(String uName, String pwd) {

		pageDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		// Step 5: Enter User name
		pageElements.getUserName().sendKeys(uName);

		// Step 6: Enter Password
		pageElements.getPassword().sendKeys(pwd);

		// Step 8: Click Login button
		pageElements.getLoginBtn().click();

		// Step 9: Validate if login was successful
		String expErrorMsg = "Epic sadface: Sorry, this user has been locked out.";
		String actErrorMsg = pageElements.getErrorMsg().getText();
		Assert.assertEquals(actErrorMsg, expErrorMsg);
	}
	
	public void ValidLogin(String uName, String pwd) {

		pageDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		// Step 5: Enter User name
		pageElements.getUserName().sendKeys(uName);

		// Step 6: Enter Password
		pageElements.getPassword().sendKeys(pwd);

		// Step 8: Click Login button
		pageElements.getLoginBtn().click();

		String actPageUrl = pageDriver.getCurrentUrl();
		String expPageUrl = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actPageUrl, expPageUrl);
	}


}
