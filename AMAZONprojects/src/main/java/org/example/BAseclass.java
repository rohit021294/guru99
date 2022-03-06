package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BAseclass {
    WebDriver driver;
    Properties prop;
    public WebDriver invokingDriver() throws IOException {
         prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\Rohit\\IdeaProjects\\AMAZONprojects\\src\\main\\java\\resources\\resources.properties");
        prop.load(fis);
        String browserName=prop.getProperty("automationbrowser");
        if(browserName.equalsIgnoreCase("chrome"))
        {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\chromedriver98\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        return driver;

    }


public String getScreenShotPath(String testCaseNAme,WebDriver driver) throws IOException {
    TakesScreenshot ts=(TakesScreenshot) driver;
    File source=ts.getScreenshotAs(OutputType.FILE);
    String destinationFIle=System.getProperty("user.dir")+"\\reports\\"+testCaseNAme+".png";
    FileUtils.copyFile(source,new File(destinationFIle));
    return destinationFIle;

}
}
