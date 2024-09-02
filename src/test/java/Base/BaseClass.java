package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public Properties p;
	@BeforeMethod
	public void setup() throws IOException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		FileReader file=new FileReader("C:\\Users\\Dell\\Desktop\\Work Place\\SpiceJet\\src\\config.properties");
		p=new Properties();
		p.load(file);
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		//Thread.sleep(3000);
		//driver.quit();
	}

}
