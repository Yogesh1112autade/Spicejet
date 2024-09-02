package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//div[@class=\"css-76zvg2 r-jwli3a r-ubezar\"])[2]")
	WebElement ClkSignUp;
	
	@FindBy(xpath="(//div[@class=\"css-76zvg2 r-jwli3a r-ubezar\"])[1]")
	WebElement ClkLogin;
	
	@FindBy(xpath="(//div[@class=\"css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8\"])[1]")
	WebElement ClkHotels;
	
	public void Click_SignUp() {
		ClkSignUp.click();
	}
	
	public void Click_Login() {
		ClkLogin.click();
	}
	public void Click_Hotel() {
		ClkHotels.click();
	}
}
