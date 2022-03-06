package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ExtentReportsNG {
   static ExtentReports extentReports;

    public static ExtentReports getReportObject() {
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
        extentSparkReporter.config().setReportName("web automation report");
        extentSparkReporter.config().setDocumentTitle("Test Results");

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("TESTER", "ROHIT");
        return extentReports;


    }


    public void newWindowOPen() throws IOException {
       // ExtentTest test=extentReports.createTest("new Window open");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\IdeaProjects\\RealTimeProject\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
    }







