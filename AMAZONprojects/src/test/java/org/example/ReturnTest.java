package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReturnTest extends BAseclass {
    WebDriver driver;

    @Test
    public void getReturn() throws IOException {
        driver=invokingDriver();
        driver.get(prop.getProperty("URL"));
        HomepageLocators h=new HomepageLocators(driver);
        h.getReturn().click();
        String text=driver.findElement(By.xpath("//h1")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Sign-In");
        System.out.println("return and orders has been tested");
        driver.close();
    }

    @Test
    public void getItemInCart() throws IOException {
        driver=invokingDriver();
        driver.get(prop.getProperty("URL"));
        HomepageLocators h1=new HomepageLocators(driver);
        h1.getCart().click();
        String s=driver.findElement(By.xpath("//h2")).getText();
        Assert.assertEquals(s,"Your Amazon Cart is empty");
        System.out.println("get card test is tested");
        driver.close();


    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("before test has been executed");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("after test has been executed");
    }

}
