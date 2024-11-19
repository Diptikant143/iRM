package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.github.dockerjava.api.model.Event;

import GenericUtils.BaseClass;
import GenericUtils.ListnerImplementationClass;
import pomPages.Developerdashboardpage;

@Listeners(ListnerImplementationClass.class)
public class Developerdashboard extends BaseClass {
	
	
	@Test
	public void Devedevperdashboard() throws Throwable {
		
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN");
		ListnerImplementationClass.test.assignAuthor("DIPTIKANTA");
		ListnerImplementationClass.test.assignDevice("windows 64");
		Developerdashboardpage dev=new Developerdashboardpage(driver);
		Robot robot= new Robot();
        dev.getClickOnAdvanced().click();
		
		dev.getClickOnUnsafeLink().click();
 
		dev.getUserNameTextField().sendKeys(USERNAME);
		dev.getLohinbtn().click();		
		dev.getPasswordtextfield().sendKeys(PASSWORD);
		dev.getLohinbtn().click();
		dev.getDropdownElement().click();
		dev.getChooseClient().click();
		dev.getLohinbtn().click();
		ListnerImplementationClass.test.log(Status.INFO, "Login Sucessfully");
		
		//dev.getClickOnhamburgur().click();
//		Thread.sleep(7000);
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		dev.getClickOnsensitiveaccesscheckbox().click();
//		
//		ListnerImplementationClass.test.log(Status.INFO, "Click on Sensitive Access Checkobx");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//	     js.executeScript("window.scrollBy(0,800)");//Scroll Down(+ve)
//	    ListnerImplementationClass.test.log(Status.INFO, "Scrolldown Sucessfully");   
//	    Thread.sleep(3000);
//	   js.executeScript("window.scrollBy(0,-600)");//Scroll Down(-ve)
//	    ListnerImplementationClass.test.log(Status.INFO, "ScrollUp Sucessfully"); 
//	    Thread.sleep(2000);
//	    dev.getClickOnsegregationofdutiescheckbox().click();
//	    
//	    ListnerImplementationClass.test.log(Status.INFO, "Click on Segregation of Duties Checkobx");
//	    js.executeScript("window.scrollBy(0,800)");//Scroll Down(+ve)
//	    Thread.sleep(3000);
//	    js.executeScript("window.scrollBy(0,-700)");//Scroll Down(-ve)
//	    Thread.sleep(2000);
//	    dev.getClickOnrefreshbutton().click();
//	    Thread.sleep(1000);
//	    dev.getClickonRulesConsidered().click();
//	    Thread.sleep(1000);
//	    dev.getDownloadexcel().click();
//	    dev.getClickonFilterdownarrowbutton().click();
//	    dev.getClickonSelectcheckbox().click();
//	    dev.getClickonselectbox().sendKeys("Risk Description");
//	    Thread.sleep(1000);
//	    dev.getClickonselection().click();
//	    
//	    dev.getClickonCrossicon().click();
//	    dev.getClickonbigsearchbox().sendKeys("post journals in General Ledger module.");
//	    Robot rt=new Robot();
//	    rt.keyPress(KeyEvent.VK_ENTER);
//	    rt.keyRelease(KeyEvent.VK_ENTER);
//	    
//	    dev.getClickonclearicon().click();
//	    dev.getClickoncross().click();
//	    
//	    ListnerImplementationClass.test.log(Status.INFO, "Click on High Matcard");
//	    dev.getClickonHighmatcard().click();
//	    dev.getClickonSearchbox().sendKeys("Enter Journals and Post Journals");
//	    rt.keyPress(KeyEvent.VK_ENTER);
//	    rt.keyRelease(KeyEvent.VK_ENTER);
//	    dev.getClickonHighMatcardclearbutton().click();
//		dev.getClickonHighMatcardMaximizeicon().click();
//		
//		//dev.getClickonPaginationarrow(driver).click();;
//		
//		// WebDriverWait wait=new WebDriverWait(driver,20);
//		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[4]"))).click();
//		
//		// js.executeScript("window.scrollBy(0,-1000)");//Scroll Down(-ve)
//	
//		 rt.keyPress(KeyEvent.VK_TAB);
//		 rt.keyRelease(KeyEvent.VK_TAB);
//		 Thread.sleep(1000);
//		 dev.getClickonPagecross().click();
		Thread.sleep(4000);
		
		dev.getClickOnITMatCard().click();
		
	
	
	}

	
	
	
	

}
