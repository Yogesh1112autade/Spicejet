package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;

public class TC02_Login extends BaseClass {
	@Test
	public void Login() {
		HomePage h=new HomePage(driver);
		h.Click_Login();
		
		}
	}


