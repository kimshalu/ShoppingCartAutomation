package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports ext;

    public static ExtentReports get(){
        if(ext==null){
            ExtentSparkReporter r = new ExtentSparkReporter("reports/extent.html");
            ext = new ExtentReports();
            ext.attachReporter(r);
        }
        return ext;
    }
}
