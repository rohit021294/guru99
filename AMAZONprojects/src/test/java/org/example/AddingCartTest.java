package org.example;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddingCartTest extends BAseclass {
  WebDriver driver;



  @Test
  public void newWindowOPenTest() throws IOException {
    driver=invokingDriver();
    driver.get(prop.getProperty("URL"));
    Assert.assertTrue(true);
    driver.close();


  }















}
