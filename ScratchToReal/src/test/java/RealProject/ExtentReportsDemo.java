package RealProject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportsDemo {
    ExtentReports extentReports;
    @BeforeTest
            public void configur() {
        String path = System.getProperty("user.dir") + "\\reporta\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("web automation results");
        reporter.config().setDocumentTitle("TEST RESULTS");
        extentReports=new ExtentReports();
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("TESTER","Rohit");


    }
    @Test
    public void invokingExtentReport()
    {
         ExtentTest test=extentReports.createTest("INvokingEXTENTREPORT test");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\IdeaProjects\\RealTimeProject\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/");
       System.out.println(driver.getTitle());
       test.addScreenCaptureFromBase64String("s");
       driver.close();
       test.fail("this test has been failed");
       extentReports.flush();
       //extentReports.createTest("INvokingEXTENTREPORT test");
    }








}
