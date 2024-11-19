package GenericUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import pomPages.LoginPage;




public class BaseClass {
public FileUtility fLib = new FileUtility();
public WebDriverUtility wLib= new WebDriverUtility();
public ExcelUtility eLib = new ExcelUtility();
public JavaUtility jLib = new JavaUtility();

public WebDriver driver;

public static WebDriver sdriver=null;
public String USERNAME;
public String PASSWORD;

@BeforeSuite
public void bSuite() {

}


@BeforeClass
public void launchBrowser() throws Throwable {
	//read data from property file
	String BROWSER = fLib.getPropertyKeyValue("Browser");
	String URL = fLib.getPropertyKeyValue("url");
	
	//driver=new ChromeDriver();
	if (BROWSER.equalsIgnoreCase("edge")) {
		
		
		WebDriverManager.edgedriver().setup();
		
        driver = new EdgeDriver();
        
    } else if (BROWSER.equalsIgnoreCase("chrome")) {
    	//WebDriverManager.chromedriver().setup();
    	System.
    	setProperty
    	("webdriver.chrome.driver", "C:\\Users\\DIPTIKANT\\git\\seleniumiRM\\com.framework.seleniumiRM\\chromedriver.exe");
        driver = new ChromeDriver();
        
    } else {
        System.out.println("Invalid browser specified.");
        return;
    }
	System.out.println("===========Browser Launch Sucessfully===========");
	wLib.maximiseWindow(driver);
	wLib.waitUntilPageLoad(driver);
	driver.get(URL);
	
	//driver.get("https://www.google.com/");
	sdriver=driver;
}
@BeforeMethod
public void loginToApp() throws Throwable {
//read data from property file
	 USERNAME = fLib.getPropertyKeyValue("username");
	 PASSWORD = fLib.getPropertyKeyValue("password");
	// login to app
	//Login l= new Login(driver);
	//l.loginToApp(driver);
	//driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
	//driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	//LoginPage loginPage=new LoginPage(driver);
	
	//loginPage.getUserNameTextField().sendKeys(USERNAME);
	
	//loginPage.getLoginbtn().click();
	
	//Thread.sleep(1000);
	//loginPage.getPropasswordTextField().sendKeys(PASSWORD);
	
	//driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
	
	
	//driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c189-7 ng-star-inserted']")).click();
	
	
	//driver.findElement(By.xpath("//span[text()=' TESTINGANA ']")).click();
	
	
	//driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
	System.out.println("=============login sucessfull===========");
}

@AfterMethod
public void logoutApp() {
	//sign out of home page
	//Home h= new Home(driver);
	///h.signOut(driver);
	System.out.println("==========sign out sucessfull==========");
}
@AfterClass
public void closeBrowser() {
	//driver.close();
	System.out.println("=====Browser close sucessfull============");
}
@AfterSuite
public void closeDB() {
	//dLib.closeDB();
	System.out.println("=============DB connection closed sucessfully======");
}
}
