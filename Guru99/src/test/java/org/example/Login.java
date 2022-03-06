package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Login extends BaseClass {
    @Test
    public void radio() throws InterruptedException, IOException {
        driver=initializingDriver();
        driver.findElement(By.xpath("//b[@class='caret']")).click();
        Thread.sleep(3000);
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
        for(WebElement e:list)
        {
            String string=e.getText();
            if(string.equalsIgnoreCase("Radio & Checkbox Demo"))
            {
                e.click();
                break;
            }

        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@style='margin-left:20px;']/*[text()='Radio']/following-sibling::input[2]")).click();
        Thread.sleep(2000);
    System.out.println(driver.findElement(By.xpath("//div[@style='margin-left:20px;']/*[text()='Radio']/following-sibling::input[2]")).isSelected());
    driver.findElement(By.xpath("//div[@style='margin-left:20px;']/*[text()='Checkbox']/following-sibling::input[3]")).click();
    System.out.println(driver.findElement(By.xpath("//div[@style='margin-left:20px;']/*[text()='Checkbox']/following-sibling::input[3]")).isSelected());
    driver.quit();
    }



    @Test
    public void tableDemo() throws IOException, InterruptedException {
        driver=initializingDriver();
    System.out.println(" fourth row third column");
        driver.findElement(By.xpath("//b[@class='caret']")).click();
        Thread.sleep(3000);
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
        for(WebElement e:list)
        {
            String string=e.getText();
            if(string.equalsIgnoreCase("Table Demo"))
            {
                e.click();
                break;
            }

        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody/tr[4]/td[3]")).click();
        System.out.println(driver.findElement(By.xpath("//tbody/tr[4]/td[3]")).getText());

    }


@Test
    public void accessingLink() throws InterruptedException, IOException
{
    driver=initializingDriver();
    System.out.println(" accessing facebook link");
    driver.findElement(By.xpath("//b[@class='caret']")).click();
    Thread.sleep(3000);
    List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
    for(WebElement e:list)
    {
        String string=e.getText();
        if(string.equalsIgnoreCase("Accessing Link"))
        {
            e.click();
            break;
        }

    }
    Thread.sleep(3000);
    List<WebElement> elements=driver.findElements(By.xpath("//a"));
    for (WebElement e:elements)
    {
       String href=e.getAttribute("href");
      //  System.out.println(href);

        if(e.getAttribute("href").equalsIgnoreCase("http://www.google.com/"))
        {System.out.println(href);
            driver.get(href);
            break;

        }

    }
    driver.quit();

}





    @Test
    public void deleteCustomer() throws IOException, InterruptedException {
        driver = initializingDriver();
        System.out.println(" deleting account and handling alerts");
        driver.findElement(By.xpath("//b[@class='caret']")).click();
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
        for (WebElement e : list) {
            String string = e.getText();
            if (string.equalsIgnoreCase("Delete Customer Form")) {
                e.click();
                break;
            }

        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
        driver.quit();

    }

}