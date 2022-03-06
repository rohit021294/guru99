package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;


public class yOUTUBEsECONDeLEMENT extends BAseclass {
@Test
    public void secondTrending() throws IOException, InterruptedException {
    driver = invokingDriver();
    driver.manage().window().maximize();
    driver.get("https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl");
    //driver.findElement(By.xpath("//div[@id='grid-container']/child::ytd-video-renderer[2]/div[@id='dismissible']")).click();
        driver.findElement(By.xpath("//div[@id='contents']/ytd-expanded-shelf-contents-renderer/div[@id='grid-container']/ytd-video-renderer[2]/div[@id='dismissible']/div/div[@id='meta']/div/h3[@class='title-and-badge style-scope ytd-video-renderer'][1]")).click();

//    Thread.sleep(3000);
//    driver.findElement(By.xpath("")).click();
//    driver.close();
}

@Test
    public void flipkart() throws IOException, InterruptedException {
    driver=invokingDriver();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div/div/div[@class='_1oHPGm']/div/div/div/div/div[3]")).click();

}






}
