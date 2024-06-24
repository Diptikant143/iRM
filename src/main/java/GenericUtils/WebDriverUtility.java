package GenericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public  class WebDriverUtility {
	/*
	 * author @Deep
	 */
		/**
		 * this method wait for 20 sec for page loading
		 * 
		 */
		public void waitUntilPageLoad(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		/**
		 * this method wait for the element to be visible
		 * 
		 * 
		 */
		
		public void waitForElementVisibility(WebDriver driver,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		/**
		 * This method wait for the element to be clicked
		 *
		 * 
		 */
		public void waitAndClick(WebElement element) throws Throwable {
		int count = 0;
		while(count<40) {
			try {
				element.click();
				break;
			}
			catch(Throwable e) {
				Thread.sleep(1000);
				count++;
			}
		}
		}
		/**
		 * this method enables user to handle dropdown using visible test
		 * 
		 * 
		 */
	public void SelectOption(WebElement element,String option) {
		Select select=new Select(element);
		select.selectByVisibleText(option);
	}
	/**
	 * this method enables user to handle dropdown using index
	 
	 *
	 */
	public void	SelectOption(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * this method will perform mouse over action
	 * 
	 *
	 */
	public void mouseOver(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * this method will perform right click operation
	 *
	 * 
	 */
	public void rightClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * 
	 * 
	 * 
	 */
	public void switchToWindow(WebDriver driver,String partialWinTitle) {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext()) {
			String winId = it.next();
			String title = driver.switchTo().window(winId).getTitle();
			if(title.contains(partialWinTitle))
			{
				break;
			}
		}
			
	}
	/**
	 *  This method helps to switch from one window to another
	 * 
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * this method is used for to accept the pop-up
	 * 
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this method is used to scrolling action in a webpage
	 *
	 * 
	 */
	public void scrollToWebElemt(WebDriver driver,WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
	}
	/**
	 * 
	 * This method is used for scroll the webpage
	 * 
	 */
	public void switchFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
	}
	/**
	 * 
	 *
	 * 
	 */
	public void switchFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * 
	 *
	 * 
	 */
	public void switchFrame(WebDriver driver,String idOrName) {
		driver.switchTo().frame(idOrName);
	}
	/**
	 * 
	 
	 * 
	 
	 * 
	 */
	public String takeScreenshot(WebDriver driver,String screenshotName) throws Throwable {
		String screenshotPath = "./screenshot/"+screenshotName+JavaUtility.getCurrentDate()+".PNG";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotPath);
		Files.copy(src, dest);
		return screenshotPath;
	}
	public String TakesScreenShots(WebDriver driver,String screenshotName)
    {
        String localDateTime= LocalDateTime.now().toString().replace(":","-");
        String filePath = System.getProperty("user.dir")+"/errorshots/"+screenshotName+localDateTime+".png";
        TakesScreenshot ts = (TakesScreenshot)driver;
        File scrFile = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(scrFile.toString()+"--------------------------------------------------------");
File dest = new File(filePath);
        try {
            FileUtils.copyFile(scrFile, dest);
        	
        }catch(Exception e){
            e.printStackTrace();
        }
        //System.out.println(dest.getAbsolutePath());
        return dest.getAbsolutePath();

    }
	/**
	 * 
	 * This method is to take a Screenshot
	 */
	public void pressEnterKey() throws Throwable {
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * 
	 * This method is used for cotrol the TAB option
	 */
	public void maximiseWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
		
		
	}
	
	/**
	 * This mehod is used for maximize the Window
	 *
	 */
	
	

public void uploadFileWithRobot (String imagePath) {
    StringSelection stringSelection = new StringSelection(imagePath);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
    Robot robot = null;
    try {
        robot = new Robot();
    } catch (AWTException e) {
        e.printStackTrace();
    }
    
    robot.delay(2500);
    
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.delay(2500);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.delay(2500);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.delay(150);
    robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
}
}


