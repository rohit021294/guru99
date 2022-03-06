package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {
    WebDriver driver;
    public RediffHomepage(WebDriver driver){
        this.driver=driver;
    }
    By Singin=By.className("signin");
    By CreateAccount=By.xpath("//a[@title='Create Rediffmail Account']");
public WebElement Sigin()
{
   return driver.findElement(Singin);
}
public WebElement CreateNewAccount()
{
    return driver.findElement(CreateAccount);
}

}
