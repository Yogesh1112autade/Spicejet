package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel extends BasePage{

	public BookHotel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//input[@id=\"txtHotelCity\"]")
WebElement txtcity;

  @FindBy(xpath="//a[contains(text(),\"Search Now\")]")
  WebElement ClkSearch;
    
    public void Enter_city(String s) {
    	txtcity.sendKeys(s);
    }
    public void Click_Search() {
    	ClkSearch.click();
    	
    }
}
