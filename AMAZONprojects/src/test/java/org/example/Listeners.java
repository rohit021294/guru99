package org.example;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import resources.ExtentReportsNG;

import java.io.IOException;


public class Listeners extends BAseclass implements ITestListener

{
    ExtentTest test;
  ExtentReports extent= ExtentReportsNG.getReportObject();
ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
    public void onTestStart(ITestResult result) {

         test=extent.createTest(result.getMethod().getMethodName());
         extentTest.set(test);

    }


    public void onTestSuccess(ITestResult result) {

        extentTest.get().log(Status.PASS,"test passed");
    }


    public void onTestFailure(ITestResult result) {
        extentTest.get().fail(result.getThrowable());
        WebDriver driver=null;
       String testMethodName= result.getMethod().getMethodName();
        try {
           driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
        } catch (Exception e) {

        }
        try {
            extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver),result.getMethod().getMethodName());
            getScreenShotPath(testMethodName,driver);
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
        extent.flush();
    }
}
