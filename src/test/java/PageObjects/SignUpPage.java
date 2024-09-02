package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

   @FindBy(xpath="//select[@class='form-control form-select ']")
   WebElement SlTitle;
   
   
   @FindBy(xpath="//input[@id='first_name']")
   WebElement TxtFristName;
   
   @FindBy(xpath="//input[@id='last_name']")
   WebElement TxtLastName;
   
  @FindBy(xpath="//select[@class='form-control form-select']")
  WebElement SLCountry;
  
  @FindBy(xpath="//img[@alt='date']")
  WebElement SLDate;
  
  @FindBy(xpath="//input[@placeholder='+91 01234 56789']")
  WebElement TxtMb;
  
  @FindBy(xpath="//input[@id='email_id']")
  WebElement TxtEmail;
  
  @FindBy(xpath="//input[@id='new-password']")
  WebElement TxtPass;
  
  @FindBy(xpath="//input[@id='c-password']")
  WebElement TxtConPass;
  
  @FindBy(xpath="//input[@id='defaultCheck1']")
  WebElement ClkCheck;
  
  @FindBy(xpath="//button[normalize-space()='Submit']")
  WebElement ClkSubmit;


@FindBy(xpath="//select[@class='react-datepicker__year-select']")
  WebElement SLYear;

@FindBy(xpath="//select[@class='react-datepicker__month-select']") 
WebElement SLMonth;

@FindBy(xpath="//div[contains(@aria-label,'Choose Saturday, December 11th, 1999')]") 
WebElement Sld;


  public void FillInfo(String FName,String LName) {
	  SlTitle.sendKeys("Mr");
	  TxtFristName.sendKeys(FName);
	  TxtLastName.sendKeys(LName);
	  SLCountry.sendKeys("India");
	  SLDate.click();
	  SLYear.sendKeys("1999");
	  SLMonth.sendKeys("December");
	  Sld.click();
	  
  }
  public void FillInfo2(String mb,String email,String pass,String cpass) throws InterruptedException {
	  TxtMb.sendKeys(mb);
	  
 TxtEmail.click();
 
//	  WebDriverWait w =new WebDriverWait(driver,50);
//	  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_id']")));
//	  Actions action =new Actions(driver);
//	  action.moveToElement(TxtEmail).sendKeys(email).build().perform();
	  Actions action =new Actions(driver);
	  action.moveToElement(TxtEmail).build().perform();
	  Thread.sleep(3000);
	 TxtEmail.sendKeys(email);
	 Thread.sleep(3000);
	 TxtPass.click();
	 Thread.sleep(3000);
  action.moveToElement(TxtPass).build().perform();
  
	  TxtPass.sendKeys(pass);
	  Thread.sleep(3000);
	  TxtConPass.sendKeys(cpass);
	  ClkCheck.click();
	  ClkSubmit.click();
	  
  }
}
