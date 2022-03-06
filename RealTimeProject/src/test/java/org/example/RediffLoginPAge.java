package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPAge {

WebDriver driver;
public RediffLoginPAge(WebDriver driver)
{
    this.driver=driver;
}

  By username= By.id("login1");
By password=By.id("password");
By signin=By.className("signinbtn");


public WebElement Username()
{
    return driver.findElement(username);
}
public WebElement Password()
{
    return driver.findElement(password);
}
public WebElement SigninClick()
{
    return driver.findElement(signin);
}







}
