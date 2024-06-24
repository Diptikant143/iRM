package demo;

import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtils.BaseClass;

import GenericUtils.ListnerImplementationClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.LoginPage;
@Listeners(ListnerImplementationClass.class)
public class login extends BaseClass{
	
	
	@Test
	public void LoginPage() {
		
		
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN");
		ListnerImplementationClass.test.assignAuthor("DIPTIKANTA");
		ListnerImplementationClass.test.assignDevice("windows 64");
	
		
		
		
		LoginPage lo=new LoginPage(driver);
		lo.getClickOnAdvanced().click();
		lo.getClickOnUnsafeLink().click();
		
		lo.getUserNameTextField().sendKeys(USERNAME);
		lo.getLohinbtn().click();
		lo.getPasswordtextfield().sendKeys(PASSWORD);
		lo.getLoginbtn2().click();
		lo.getDropdownElement1().click();
		lo.getClickOnIRMSuperAdmin().click();
		lo.getLoginbtn2().click();
		ListnerImplementationClass.test.log(Status.INFO, "LOGIN SUCESSFULLY");


}
}
