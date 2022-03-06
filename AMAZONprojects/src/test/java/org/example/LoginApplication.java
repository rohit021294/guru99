package org.example;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LoginApplication extends BAseclass {


    @Test
    public void loginApplication() throws IOException, InterruptedException {
        driver = invokingDriver();
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        HomepageLocators homepageLocators = new HomepageLocators(driver);
        homepageLocators.getSignin().click();
        SigninPageLocators signinPageLocators = new SigninPageLocators(driver);
        signinPageLocators.getSignInTypeBox().sendKeys(prop.getProperty("Emailid"));
        signinPageLocators.getCntinueAfterEnteringEmail().click();
        signinPageLocators.getPassword().sendKeys(prop.getProperty("password"));
        signinPageLocators.getSubmit().click();
          Assert.assertEquals(homepageLocators.getNameBar().getText(),"Hello, rohit");
        Assert.assertTrue(homepageLocators.getNameBar().getText().equalsIgnoreCase("Hello, rohit"));
        System.out.println(homepageLocators.getNameBar().getText());
//        driver.get(prop.getProperty("URL"));
        homepageLocators.getSearchBox().sendKeys("iphone 12 128 gb blue");
        homepageLocators.getSearchClick().click();
//        String parent=driver.getWindowHandle();
//       System.out.println(parent+"     window handle");
        Actions a = new Actions(driver);
        List<WebElement> elements = homepageLocators.getSearchedList();
        for (WebElement e : elements) {
           // System.out.println(e.getText());
            if (e.getText().contains("Apple iPhone 12 Pro Max, 128GB, Pacific Blue - Unlocked (Renewed Premium)")) {
             a.moveToElement(e).keyDown(Keys.CONTROL).click().build().perform();
             a.keyUp(Keys.CONTROL).build().perform();

            }
        }
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it= allWindows.iterator();
        String parent=it.next();
        String child=it.next();
        driver.switchTo().window(child);
        ItemSelectAfterPage itemSelectAfterPage = new ItemSelectAfterPage(driver);
        itemSelectAfterPage.getAddToCart().click();
        homepageLocators.getCart().click();
        Select select = new Select(itemSelectAfterPage.getQuantity());
        select.selectByVisibleText("2");
        Thread.sleep(2000);
        driver.switchTo().window(parent);
        homepageLocators.getCart().click();
        System.out.println(itemSelectAfterPage.getQuantityTextInCart().getText());
        Assert.assertEquals(itemSelectAfterPage.getQuantityTextInCart().getText(), "2");
        System.out.println("MR Shaurya,I hAVE ADDED  SuccessFully 2 blue Iphones to the cart");
        driver.close();
    }
}