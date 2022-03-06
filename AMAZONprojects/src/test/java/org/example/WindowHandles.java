package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandles extends BAseclass {
    @Test
    public void windowHAndleApplication() throws IOException, InterruptedException {
        driver = invokingDriver();
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        String key= Keys.chord(Keys.CONTROL, Keys.ENTER);
        driver.findElement(By.partialLinkText("Customer Service")).sendKeys(key);
       // driver.findElement(By.partialLinkText("Sell")).sendKeys(key);
        driver.findElement(By.partialLinkText("Registry")).sendKeys(key);
        driver.findElement(By.partialLinkText("Gift Cards")).sendKeys(key);
        Thread.sleep(5000);
        List<String> tabs= new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(4));
//        Set<String> handles=driver.getWindowHandles();
//        Iterator<String> it=handles.iterator();
//        String parent= it.next();
//        String child=it.next();
//        driver.switchTo().window(child);
        driver.close();



    }
}