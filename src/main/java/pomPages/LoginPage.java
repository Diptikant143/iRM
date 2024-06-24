package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextField;
	
	
	
	@FindBy(xpath="//button[@id=\'details-button\']")
	private WebElement clickOnAdvanced;
 
	@FindBy(xpath="//a[@id='proceed-link']")
	private WebElement clickOnUnsafeLink;

	@FindBy(xpath = "//div[@class='mat-select-arrow ng-tns-c155-7']")
    private WebElement dropdownElement1;
	
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement clickOnIRMSuperAdmin;
	
	
	public WebElement getDropdownElement1() {
		return dropdownElement1;
	}



	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement lohinbtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtextfield;
	

	@FindBy(xpath="//span[text()='LOGIN']")
	private WebElement loginbtn2;
	
	

	@FindBy(xpath="//button[@class=\'secondary-button small-link\']")
	private WebElement AdavanceBTN;
	
	
	
	
	
	
	
	
	

	public LoginPage(WebDriver driver) {
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






	public WebElement getLoginbtn2() {
		return loginbtn2;
	}






	public WebElement getAdavanceBTN() {
		return AdavanceBTN;
	}






	public WebElement getClickOnAdvanced() {
		return clickOnAdvanced;
	}






	public WebElement getClickOnUnsafeLink() {
		return clickOnUnsafeLink;
	}






	public WebElement getClickOnIRMSuperAdmin() {
		return clickOnIRMSuperAdmin;
	}



	/*public WebElement getDropdownElement() {
	    //Select dropdown = new Select(dropdownElement);
	    //dropdown.selectByVisibleText(optionText);
	    return dropdown.getFirstSelectedOption();
	}*/


	
	
	
	
	
	

	
	
	
	
	
	
	
	

	
	
	
}