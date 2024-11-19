package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Developerdashboardpage {
	
	
	
	
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
	
	//@FindBy(xpath = "//div[@class='mat-select-trigger ng-tns-c155-8']")
	@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c146-8']")
    private WebElement dropdownElement;
	
	//@FindBy(xpath = "//span[text()=' TESTSAP26TH ']")
	//@FindBy(xpath = "//span[text()=' TEST30TH ']")
	@FindBy(xpath = "//span[text()=' testsap01 ']")
    private WebElement chooseClient;
	
	@FindBy(xpath="//span[@class='svg-icon svg-icon-md']")
	private WebElement clickOnhamburgur;
	
	@FindBy(xpath="(//*[@class='cardconatiner ng-tns-c687-38'])[1]")
	private WebElement clickOnITMatCard;
	
	@FindBy(xpath="/html[1]/body[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-irmbi-dashboard[1]/div[1]/irm-bi[1]/div[1]/app-irmbi-editor-dashboard-tab-render[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-uicomponent[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/gridster[1]/gridster-item[1]/app-irmbi-object-wrapper[1]/div[1]/div[2]/app-irmbi-excutive-object[1]/div[1]/div[2]/input[1]")
	private WebElement clickOnsensitiveaccesscheckbox;
	
	@FindBy(xpath="(//input[@name='singleSelect'])[1]")
	private WebElement clickOnsegregationofdutiescheckbox;
	
	@FindBy(xpath="//img[@class='refreshButton ng-tns-c668-25']")
	private WebElement clickOnrefreshbutton;
	
	@FindBy(xpath="(//div[@class='cards skyblue-dark ng-tns-c663-29'])[1]")
	private WebElement clickOnProcuretopayTab;
	
	@FindBy(xpath="(//div[@role='button'])[9]")
	private WebElement clickOnCriticalmatcard;
	
	@FindBy(xpath="(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt'])[19]")
	private WebElement clickOnAscendingorder;
	
	@FindBy(xpath="//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	private WebElement clickOnDescendingorder;
	
	@FindBy(xpath="(//button[@icon='pi pi-filter-slash'])[4]")
	private WebElement clickOnClearbutton;
	
	@FindBy(xpath="(//input[@type='text'])[22]")
	private WebElement clickOnSearch;
	
	@FindBy(xpath="(//button[@icon='pi pi-filter-slash'])[4]")
	private WebElement clickOnClearoption;
	
	@FindBy(xpath="(//span[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[6]")
	private WebElement clickonPaginationicon;
	
	@FindBy(xpath="(//button[@type='button'])[47]")
	private WebElement clickonexceldownload;
	
	@FindBy(xpath="(//span[@class='p-multiselect-trigger-icon pi pi-chevron-down'])[4]")
	private WebElement clickfilterdropdown;
	
	@FindBy(xpath="//div[@role='checkbox']")
	private WebElement clickfiltercheckbox;
	
	@FindBy(xpath="//div[@role='checkbox']")
	private WebElement clickfiltercheckboxagain;
	
	@FindBy(xpath="//span[@class='p-multiselect-close-icon pi pi-times']")
	private WebElement clickfiltercross;
	
	@FindBy(xpath="(//input[@type='text'])[20]")
	private WebElement clickonsearchone;
	
	@FindBy(xpath="(//button[@icon='pi pi-filter-slash'])[4]")
	private WebElement clickonclearoption;
	
	@FindBy(xpath="(//input[@type='text'])[22]")
	private WebElement clicksearchboxthree;
	
	@FindBy(xpath="(//button[@label='Clear'])[4]")
	private WebElement clickonclearall;
	
	@FindBy(xpath="//img[@src='assets/media/grid/close-outline.svg']")
	private WebElement clickoncrossbutton;
	
	@FindBy(xpath="(//div[@role='button'])[19]")
	private WebElement clickonsensitive;
	
	
	@FindBy(xpath="(//div[@role='button'])[7]")
	private WebElement clickonRulesConsidered;
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-file-excel'])[4]")
	private WebElement Downloadexcel;
	
	@FindBy(xpath="(//span[@class='p-multiselect-trigger-icon pi pi-chevron-down'])[4]")
	private WebElement ClickonFilterdownarrowbutton;
	
	
	@FindBy(xpath="//div[@role='checkbox']")
	private WebElement ClickonSelectcheckbox;
	
	@FindBy(xpath="//input[@role='textbox']")
	private WebElement Clickonselectbox;
	

	@FindBy(xpath="//div[@aria-checked='false']")
	private WebElement Clickonselection;
	
	@FindBy(xpath="//span[@class='p-multiselect-close-icon pi pi-times']")
	private WebElement ClickonCrossicon;
	
	

	@FindBy(xpath="(//input[@class='p-inputtext p-component p-element ng-star-inserted'])[5]")
	private WebElement Clickonbigsearchbox;
	
	@FindBy(xpath="(//button[@icon='pi pi-filter-slash'])[4]")
	private WebElement Clickonclearicon;
	
	
	@FindBy(xpath="//img[@src='assets/media/grid/close-outline.svg']")
	private WebElement Clickoncross;
	
	@FindBy(xpath="(//div[@role='button'])[12]")
	private WebElement ClickonHighmatcard;
	
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement ClickonSearchbox;
	
	

	@FindBy(xpath="(//button[@icon='pi pi-filter-slash'])[4]")
	private WebElement ClickonHighMatcardclearbutton;
	
	
	@FindBy(xpath="//img[@src='assets/media/grid/maximizewindow.png']")
	private WebElement ClickonHighMatcardMaximizeicon;
	
	
	@FindBy(xpath="(//span[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[4]")
	private WebElement ClickonPaginationarrow;
	
	
	
	@FindBy(xpath="//img[@src='assets/media/grid/close-outline.svg']")
	private WebElement ClickonPagecross;

	
	
	
	public Developerdashboardpage(WebDriver driver) {
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

	public WebElement getClickOnsensitiveaccesscheckbox() {
		return clickOnsensitiveaccesscheckbox;
	}

	public WebElement getClickOnsegregationofdutiescheckbox() {
		return clickOnsegregationofdutiescheckbox;
	}

	public WebElement getClickOnrefreshbutton() {
		return clickOnrefreshbutton;
	}

	public WebElement getClickOnProcuretopayTab() {
		return clickOnProcuretopayTab;
	}

	public WebElement getClickOnCriticalmatcard() {
		return clickOnCriticalmatcard;
	}

	public WebElement getClickOnAscendingorder() {
		return clickOnAscendingorder;
	}

	public WebElement getClickOnDescendingorder() {
		return clickOnDescendingorder;
	}

	public WebElement getClickOnClearbutton() {
		return clickOnClearbutton;
	}

	public WebElement getClickOnSearch() {
		return clickOnSearch;
	}

	public WebElement getClickOnClearoption() {
		return clickOnClearoption;
	}

	public WebElement getClickonPaginationicon() {
		return clickonPaginationicon;
	}

	public WebElement getClickonexceldownload() {
		return clickonexceldownload;
	}

	public WebElement getClickfilterdropdown() {
		return clickfilterdropdown;
	}

	public WebElement getClickfiltercheckbox() {
		return clickfiltercheckbox;
	}

	public WebElement getClickfiltercheckboxagain() {
		return clickfiltercheckboxagain;
	}

	public WebElement getClickfiltercross() {
		return clickfiltercross;
	}

	public WebElement getClickonsearchone() {
		return clickonsearchone;
	}

	public WebElement getClickonclearoption() {
		return clickonclearoption;
	}

	public WebElement getClicksearchboxthree() {
		return clicksearchboxthree;
	}

	public WebElement getClickonclearall() {
		return clickonclearall;
	}

	public WebElement getClickoncrossbutton() {
		return clickoncrossbutton;
	}

	public WebElement getClickonsensitive() {
		return clickonsensitive;
	}

	public WebElement getClickonRulesConsidered() {
		return clickonRulesConsidered;
	}

	public WebElement getDownloadexcel() {
		return Downloadexcel;
	}

	public WebElement getClickonFilterdownarrowbutton() {
		return ClickonFilterdownarrowbutton;
	}

	public WebElement getClickonSelectcheckbox() {
		return ClickonSelectcheckbox;
	}

	public WebElement getClickonselectbox() {
		return Clickonselectbox;
	}

	public WebElement getClickonselection() {
		return Clickonselection;
	}

	public WebElement getClickonCrossicon() {
		return ClickonCrossicon;
	}

	public WebElement getClickonbigsearchbox() {
		return Clickonbigsearchbox;
	}

	public WebElement getClickonclearicon() {
		return Clickonclearicon;
	}

	public WebElement getClickoncross() {
		return Clickoncross;
	}

	public WebElement getClickonHighmatcard() {
		return ClickonHighmatcard;
	}

	public WebElement getClickonSearchbox() {
		return ClickonSearchbox;
	}

	public WebElement getClickonHighMatcardclearbutton() {
		return ClickonHighMatcardclearbutton;
	}

	public WebElement getClickonHighMatcardMaximizeicon() {
		return ClickonHighMatcardMaximizeicon;
	}

	public WebElement getClickonPaginationarrow(WebDriver driver) {
		 WebDriverWait wait=new WebDriverWait(driver,00);
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("ClickonPaginationarrow"))).toString();
		return ClickonPaginationarrow;
	}

	public WebElement getClickonPaginationarrow() {
		return ClickonPaginationarrow;
	}

	public WebElement getClickonPagecross() {
		return ClickonPagecross;
	}

	public WebElement getClickOnITMatCard() {
		return clickOnITMatCard;
	}
	
	public void mouseOverClickOnITMatCard(WebDriver driver,WebElement clickOnITMatCard) {
		Actions act=new Actions(driver);
		act.moveToElement(clickOnITMatCard).perform();
	}
	

	
		
	}


	



	
	
	
	


