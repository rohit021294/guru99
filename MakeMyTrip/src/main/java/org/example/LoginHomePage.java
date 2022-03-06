package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginHomePage {
    WebDriver driver;
    By emailIdBox = By.id("username");
    By proceedAfterEnteringEmail = By.xpath("//button[@class='capText font16']");
    By passwordBox = By.id("password");
    By getProceedAfterEnteringPassword = By.xpath("//button[@class='capText font16']");
    By usernameOnPage=By.cssSelector(".chUserInfoName.latoBold");



    public LoginHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement EmailSearchbox() {
        return driver.findElement(emailIdBox);
    }

    public WebElement Continue() {
        return driver.findElement(proceedAfterEnteringEmail);
    }

    public WebElement PasswordBox() {
        return driver.findElement(passwordBox);
    }

    public WebElement Submit()
    {
        return driver.findElement(getProceedAfterEnteringPassword);
    }
    public WebElement getUserName() {return driver.findElement(usernameOnPage);}

















}
