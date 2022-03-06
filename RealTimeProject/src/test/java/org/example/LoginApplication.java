package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\RealTimeProject\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.rediff.com/");
        RediffHomepage rediffHomepage=new RediffHomepage(driver);
        rediffHomepage.Sigin().click();
        Thread.sleep(3000);
       RediffLoginPAge rediffLoginPAge=new RediffLoginPAge(driver);
        rediffLoginPAge.Username().sendKeys("HEllo");
        rediffLoginPAge.Password().sendKeys("12345678");
        rediffLoginPAge.SigninClick().click();

    }
}
