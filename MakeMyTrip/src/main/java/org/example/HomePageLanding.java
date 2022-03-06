package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageLanding {
    public WebDriver driver;

    By loginButton=By.cssSelector("body.desktop.in.webp:nth-child(2) div.bgGradient.webpSupport div.page-section.sticky-scroll.topSection.appendBottom40 div.landingContainer div.makeFlex.hrtlCenter.prependTop5.appendBottom40 ul.userSection.pushRight li.makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut:nth-child(3) div.autopop__wrap.makeFlex.column.defaultCursor div.paddingLR20 div.login__card.makeFlex.hrtlCenter.cursorPointer.appendBottom10:nth-child(4) div.makeFlex.column.flexOne p.font14.latoBold.blackText.appendBottom5.cursorPointer.makeRelative > label:nth-child(1)");
    By searchTab=By.cssSelector("a.primaryBtn.font24.latoBold.widgetSearchBtn ");
    public HomePageLanding(WebDriver driver) {
        this.driver=driver;
    }


    public WebElement LoginButton()
    {return driver.findElement(loginButton);

    }
    public WebElement getSearchBox()
    {
        return driver.findElement(searchTab);
    }
}
