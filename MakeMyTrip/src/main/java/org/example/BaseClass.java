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

public class BaseClass {

        WebDriver driver;
        Properties prop;
    public WebDriver invokingDriver() throws IOException
    {
         prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Rohit\\IdeaProjects\\MakeMyTrip\\src\\main\\java\\resorces\\file.properties");
        prop.load(fis);
       String browserName= prop.getProperty("automatingBrowser");
            if(browserName.equalsIgnoreCase("chrome"))
       {
           System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\RealTimeProject\\chromedriver\\chromedriver.exe");
         driver=new ChromeDriver();
       }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;




    }
    public void getScreenShotPath(String testCasename,WebDriver driver) throws IOException {
        TakesScreenshot ts= (TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        String destination=System.getProperty("user.dir")+"\\screenshot\\"+testCasename+".png";
        FileUtils.copyFile(source,new File(destination));




    }




}