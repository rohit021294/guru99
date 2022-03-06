package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class InspectingVisibleElements extends BaseClass {
    private static Logger log=LogManager.getLogger(InspectingVisibleElements.class.getName());
    @BeforeTest
    public void login() throws IOException {
        driver = invokingDriver();
        log.info("driver is invoked");
        driver.get(prop.getProperty("url"));

    }

    @Test
    public void ISpectingElement()

    {HomePageLanding homePageLanding=new HomePageLanding(driver);
        Assert.assertTrue(homePageLanding.getSearchBox().isDisplayed());
        log.info("get search box is displayed successfully");


    }

    @AfterTest
    public void tryout()
    {
        driver.close();
    }

}
