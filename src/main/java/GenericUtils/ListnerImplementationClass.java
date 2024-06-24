   package GenericUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.rmi.server.ExportException;
import java.time.LocalDateTime;

public class ListnerImplementationClass extends BaseClass implements ITestListener
	{
	    public static ExtentTest test;
	    public static ExtentReports report;

	    @Override
	    public void onTestStart(ITestResult result) {
	        test=report.createTest(result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Test case Passed", ExtentColor.GREEN));
	        //test.log(Status.PASS,result.getThrowable());
	    }
	   
	        
	        @Override
	        public void onTestFailure(ITestResult result) {
	            test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"Test case Failed",ExtentColor.RED));
	            test.log(Status.FAIL,result.getThrowable());
	            String path=null;
	            try {

	               path=new WebDriverUtility().TakesScreenShots(BaseClass.sdriver, result.getMethod().getMethodName());
	            	//path=new WebDriverUtility().TakesScreenShots(BaseClass.sdriver, result.getMethod().getMethodName());
	                System.out.println(path);


	            } catch (Throwable e)
	            {
	                e.printStackTrace();
	            }
	    test.addScreenCaptureFromPath(path);


	        }

	        @Override
	        public void onTestSkipped(ITestResult result) {

	            test.log(Status.SKIP,result.getThrowable());
	            test.log(Status.SKIP,result.getMethod().getMethodName());
	        }

	        @Override
	        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	        }

	        @Override
	        public void onStart(ITestContext context) {
	        	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("ExtentReport/extentReport" + LocalDateTime.now().toString().replace(":", "-")+".html").viewConfigurer().viewOrder().as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY}).apply();
	            htmlReporter.config().setReportName("ygcg");
	            htmlReporter.config().setDocumentTitle(" hghv");
	            htmlReporter.config().setTheme(Theme.DARK);
	    
	    report=new ExtentReports();
	    report.attachReporter(htmlReporter);
	            report.setSystemInfo("OS", "Windows 10");
	            report.setSystemInfo("Environment", "Testing Environment");
	            report.setSystemInfo("URL", "https://172.16.10.16:3000/irmbi/dashboard?id=1");
	            report.setSystemInfo("Reporter Name", "Diptikanta");
	        }

	        @Override
	        public void onFinish(ITestContext context) {
	            report.flush();
	        }
	        
	    

	    
	        
}
