package RealProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    public WebDriver driver;

    By loginTab=By.cssSelector("div.tools:nth-child(2) div.container-fluid nav.pull-right ul:nth-child(1) li:nth-child(4) a:nth-child(1) > span:nth-child(2)");

    public LandingPage(WebDriver driver) {
        this.driver=driver;
    }


    public WebElement login()
    {
        return driver.findElement(loginTab);
    }
}
