package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
WebDriver driver;
Properties properties;

public WebDriver initializingDriver() throws IOException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\Guru99\\chromedriver98\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/V4/manager/Managerhomepage.php");
    return driver;


}
}
