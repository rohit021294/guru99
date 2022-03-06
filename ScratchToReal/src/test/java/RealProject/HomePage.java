package RealProject;

import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends BaseClass{
    @Test
    public void basePageNAvigation() throws IOException {
     driver=intializeDriver();
     driver.get("http://www.qaclickacademy.com/");
     LandingPage landingPage=new LandingPage(driver);
     landingPage.login().click();
}
}
