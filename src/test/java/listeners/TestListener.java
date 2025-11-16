package listeners;

import base.TestBase;
import org.testng.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.Status;
import utils.ExtentManager;

public class TestListener implements ITestListener {
    ExtentReports rep = ExtentManager.get();
    ThreadLocal<ExtentTest> tl = new ThreadLocal<>();

    public void onTestStart(ITestResult r){
        tl.set(rep.createTest(r.getMethod().getMethodName()));
    }
    public void onTestSuccess(ITestResult r){ tl.get().log(Status.PASS,"Pass");}
    public void onTestFailure(ITestResult r){
        tl.get().log(Status.FAIL,r.getThrowable());
        TestBase tb = (TestBase)r.getInstance();
        String path = tb.takeScreenshot(r.getMethod().getMethodName());
        try{ tl.get().addScreenCaptureFromPath(path);}catch(Exception e){}
    }
    public void onFinish(ITestContext c){ rep.flush();}
}
