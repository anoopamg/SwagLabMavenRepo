package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import pages.SauceDemoLoginPage;

public class SauceDemoLoginTC extends BaseClass{
	
	@Test
	public void verifyNavigation() throws InterruptedException {	
		SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
		login.pageNavigation();			
	}
	
	@Test
	public void InvalidLoginTest() throws FilloException {
		SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
		Recordset recordset = connection.executeQuery("select * from Credentials where TestCaseName='InvalidLogin'");
		recordset.next();
		String userName = recordset.getField("UserName");
		String password = recordset.getField("Password");
		login.InvalidLogin(userName, password);
	}
	
	@Test
	public void ValidLoginTest()  throws FilloException {
		SauceDemoLoginPage login = new SauceDemoLoginPage(driver);
		Recordset recordset = connection.executeQuery("select * from Credentials where TestCaseName='ValidLogin'");
		recordset.next();
		String userName = recordset.getField("UserName");
		String password = recordset.getField("Password");
		login.ValidLogin(userName, password);
	}

}
