import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {
public static void main(String[] args)
{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\RealTimeProject\\chromedriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
  // driver.findElement("By.cssSelector(\"body.desktop.in.webp:nth-child(2) div.bgGradient.webpSupport div.page-section.sticky-scroll.topSection.appendBottom40 div.landingContainer div.makeFlex.hrtlCenter.prependTop5.appendBottom40 ul.userSection.pushRight li.makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut:nth-child(3) div.autopop__wrap.makeFlex.column.defaultCursor div.paddingLR20 div.login__card.makeFlex.hrtlCenter.cursorPointer.appendBottom10:nth-child(4) div.makeFlex.column.flexOne p.font14.latoBold.blackText.appendBottom5.cursorPointer.makeRelative > label:nth-child(1)\");"))







}
}
