package pomPages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class securitycockpitpom {

	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//button[@class='secondary-button small-link']")
	private WebElement clickOnAdvanced;
 
	@FindBy(xpath="//a[@id='proceed-link']")
	private WebElement clickOnUnsafeLink;
	
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-8']")
    private WebElement dropdownElement;
	
	//@FindBy(xpath = "//span[text()=' TESTSAP26TH ']")
	@FindBy(xpath = "//span[text()=' TestFusion11 ']")
    private WebElement chooseClient;
	
	@FindBy(xpath="//span[@class='svg-icon svg-icon-md']")
	private WebElement clickOnhamburgur;
	
	
	@FindBy(xpath="(//span[text()='Setup and Administration'])[3]")
	private WebElement clickOnsetup;
	
	@FindBy(xpath="(//span[text()='Security Cockpit'])[2]")
	private WebElement securityCockpit;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c155-52']")
	private WebElement Clickonuserdownarrey;
	
	
	
	@FindBy(xpath="(//span[@class='mat-option-text'])[3]")
	private WebElement Clickonuseropoup;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement Clickonuserexceldownload;
	
	
	
	@FindBy(xpath="//img[@class='imgAlign']")
	private WebElement Clickonibutton;
	
	
	

	@FindBy(xpath="//span[text()=' T-Codes ']")
	private WebElement Clickonselectoptiontcode;
	
	@FindBy(xpath="//img[@src='assets/media/grid/close-outline.svg']")
	private WebElement ClickonCross;

	public securitycockpitpom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getLohinbtn() {
		return lohinbtn;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getClickOnAdvanced() {
		return clickOnAdvanced;
	}

	public WebElement getClickOnUnsafeLink() {
		return clickOnUnsafeLink;
	}

	public WebElement getDropdownElement() {
		return dropdownElement;
	}

	public WebElement getChooseClient() {
		return chooseClient;
	}

	public WebElement getClickOnhamburgur() {
		return clickOnhamburgur;
	}

	public WebElement getClickOnsetup() {
		return clickOnsetup;
	}

	public void getSecurityCockpit(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", securityCockpit);
		//("arguments[0].scrollIntoView(true);", securityCockpit);
		securityCockpit.click();
		
	}

	public WebElement getSecurityCockpit() {
		return securityCockpit;
	}

	public WebElement getClickonuserdownarrey() {
		return Clickonuserdownarrey;
	}

	public WebElement getClickonuseropoup() {
		return Clickonuseropoup;
	}

	public WebElement getClickonuserexceldownload() {
		return Clickonuserexceldownload;
	}

	
	public WebElement getClickonibutton() {
		return Clickonibutton;
	}

	public WebElement getClickonselectoptiontcode() {
		return Clickonselectoptiontcode;
	}

	public WebElement getClickonCross() {
		return ClickonCross;
	}
	
	
	
	
	
	
		
}
