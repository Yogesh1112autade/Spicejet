package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
//import PageObjects.SignUpPage;
import PageObjects.SignUpPage;

public class TC01_SignUp extends BaseClass{
	
	@Test
	public void SignUp() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.Click_SignUp();
		
//		String n=driver.getWindowHandle();
//		System.out.println(n); 
//		driver.switchTo().window(n);
//		
		 Set<String> windows=driver.getWindowHandles();
         //Iterate them
         Iterator<String> it =windows.iterator();
         String parentId=it.next();
         String ChildId=it.next();
         driver.switchTo().window(ChildId);
         
		SignUpPage s=new SignUpPage(driver);
		s.FillInfo(p.getProperty("fistName"),p.getProperty("lastName"));
		s.FillInfo2(p.getProperty("MbNo"),p.getProperty("Email"),p.getProperty("Pass"),p.getProperty("CPass"));
		
	}

}
