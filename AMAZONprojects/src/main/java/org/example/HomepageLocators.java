package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomepageLocators {
    WebDriver driver;
By homepageSignin=By.cssSelector("h1[class='a-spacing-small']");
By singin= By.id("nav-link-accountList-nav-line-1");
By searchBox=By.cssSelector("input[id='twotabsearchtextbox']");
By searchClick=By.cssSelector("div[class='nav-search-submit nav-sprite']");
By singInName=By.cssSelector("span[id='nav-link-accountList-nav-line-1']");
By searchedList= By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']");
 //By searchedList=By.cssSelector("div[class='s-main-slot s-result-list s-search-results sg-row']");
By cart=By.xpath("//a[@id='nav-cart']");
By menuMain= By.cssSelector("div[id='nav-main'] div[class='nav-left']");
By signout=By.xpath("//a[text()='Sign Out']");
By returnAndOrder=By.id("nav-orders");


    public HomepageLocators(WebDriver driver) {
        this.driver=driver;
    }
    public WebElement getHomePageSignInText()
    {
        return driver.findElement(homepageSignin);
    }

public WebElement getReturn(){return driver.findElement(returnAndOrder);}
    public WebElement getSignin()
{
    return driver.findElement(singin);
}
public WebElement getSearchBox()
{
    return driver.findElement(searchBox);
}
public WebElement getSearchClick()
{
    return driver.findElement(searchClick);
}
public WebElement getNameBar()
{
    return driver.findElement(singInName);
}
public List<WebElement> getSearchedList()
{
    return driver.findElements(searchedList);
}
public WebElement getCart()
{
    return driver.findElement(cart);
}
public WebElement getMAinMenuAll()
{
    return driver.findElement(menuMain);
}
public WebElement getSignOut()
{
    return driver.findElement(signout);
}


}
