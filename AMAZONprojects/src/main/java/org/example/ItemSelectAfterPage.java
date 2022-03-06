package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemSelectAfterPage {
    WebDriver driver;
    public ItemSelectAfterPage(WebDriver driver)
    {
            this.driver=driver;
    }
    By addToCArt= By.cssSelector("input[id='add-to-cart-button']");
    By quantity=By.xpath("//select[@id='quantity']");
    By quantityINCart=By.xpath("//span[@id='nav-cart-count']");










    public WebElement getAddToCart()
    {
       return driver.findElement(addToCArt);
    }
    public WebElement getQuantity()
    {
        return driver.findElement(quantity);
    }
    public WebElement getQuantityTextInCart()
    {
        return driver.findElement(quantityINCart);
    }





}
