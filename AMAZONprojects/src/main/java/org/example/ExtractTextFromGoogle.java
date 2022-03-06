package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExtractTextFromGoogle {
    @Test
    public void extractText() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\chromedriver98\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        String string="rohit";
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("rohit");
        Thread.sleep(2000);
        List<WebElement> elements=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
        {
            for(WebElement e:elements)
            {e.getText();
                System.out.println(e.getText());
            }
        }

    }
}
