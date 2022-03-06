package org.example;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BaseClass implements ITestListener {

    public void onTestStart(ITestResult result) {

    }


    public void onTestSuccess(ITestResult result) {

    }


    public void onTestFailure(ITestResult result) {
        WebDriver driver=null;
        String testMethodNAme=result.getMethod().getMethodName();
        try {
            driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("field name").get(result.getInstance());
        } catch (Exception e) {

        }
        try {
            getScreenShotPath(testMethodNAme,driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void onTestSkipped(ITestResult result) {

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }


    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }
    
    public void onFinish(ITestContext context) {

    }
}
