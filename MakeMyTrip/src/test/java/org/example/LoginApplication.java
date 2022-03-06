package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginApplication extends BaseClass{
    private static Logger log= LogManager.getLogger(LoginApplication.class.getName());
    @Test
    public void application() throws IOException {
        driver = invokingDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        HomePageLanding homePageLanding = new HomePageLanding(driver);
        homePageLanding.LoginButton().click();
        LoginHomePage loginHomePage = new LoginHomePage(driver);
        // loginHomePage.EmailSearchbox().click();
        String loginId = prop.getProperty("id");
        loginHomePage.EmailSearchbox().sendKeys(loginId);
        loginHomePage.Continue().click();
        String password = prop.getProperty("password");
        loginHomePage.PasswordBox().sendKeys(password);  //failed the test here
       loginHomePage.Submit().click();
      Assert.assertEquals(loginHomePage.getUserName().getText(),"Hi Rohit");
        Assert.assertTrue(false);

    }
    @AfterTest
    public void teardown()
    {

        log.error("Browser is closed");
    }
}
