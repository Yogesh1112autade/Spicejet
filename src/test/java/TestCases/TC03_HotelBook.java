package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.BookHotel;

public class TC03_HotelBook extends BaseClass{
	
	@Test
	public void BookHotel() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.Click_Hotel();
		
		Set<String> Windows=driver.getWindowHandles();
		Iterator<String> it=Windows.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		BookHotel b=new BookHotel(driver);
		b.Enter_city(p.getProperty("city"));
		b.Click_Search();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		b.Enter_city(p.getProperty("city1"));
		
	}

}
