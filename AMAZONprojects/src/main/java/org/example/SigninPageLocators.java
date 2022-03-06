package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPageLocators {
WebDriver driver;
    By signinBox= By.cssSelector("input[type='email']");
    By signinContinue=By.id("continue");
    By passwordBox=By.id("ap_password");
    By submit=By.id("signInSubmit");

    public SigninPageLocators(WebDriver driver) {
        this.driver=driver;
    }


    public WebElement getSignInTypeBox()
    {

        return driver.findElement(signinBox);
    }
    public WebElement getCntinueAfterEnteringEmail()
    {
        return driver.findElement(signinContinue);
    }
  public WebElement getPassword()
  {
      return driver.findElement(passwordBox);
  }
  public WebElement getSubmit()
  {
      return driver.findElement(submit);
  }
}
