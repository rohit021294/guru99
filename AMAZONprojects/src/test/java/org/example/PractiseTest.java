package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class PractiseTest extends BAseclass{
    @Test
    public void practice() throws IOException
    {
        driver=invokingDriver();
       driver.get(prop.getProperty("URL"));
        // driver.findElement(By.xpath("//a[@aria-label='Headsets']/div/span")).click();
      // String s= driver.findElement(By.xpath("//div[@id='8Dj7jaw6qWbFQzhRcSh6Vg']/div[2]/div[1]/div[1]/a/div[2]/span")).getText();
        driver.findElement(By.xpath("//span[contains(text(),'Headsets')]")).click();
        //System.out.println(s);
        List<WebElement> elements=driver.findElements(By.xpath("//a[@class='a-link-normal s-link-style a-text-normal']"));
        for(WebElement e:elements)
        {
            if(e.getText().contains("BINNUNE Wireless Gaming"))
            {
                e.click();
            }



        }
        driver.navigate().back();
        driver.close();


    }
}
