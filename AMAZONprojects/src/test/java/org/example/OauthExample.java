package org.example;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.given;

public class OauthExample {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\chromedriver98\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyjdss");
//        Thread.sleep(5000);
//       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohitmaurya0212@gmail.com");
//       driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
//       Thread.sleep(3000);
//    driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohitmaurya0212@gmail.com");
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
     String s="https://rahulshettyacademy.com/getCourse.php?state=verifyjdss&code=4%2F0AX4XfWjG6gkbWu9u3RSPl07czI59wjo8a0C2NMaOFEx-UcVL3PajRytA--Cu2SXL68RqCA&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";
     String partialSplit=s.split("code=")[1];
        String code=partialSplit.split("&scope")[0];
        System.out.println(code);





        String accessTokenResponse= given().urlEncodingEnabled(false).
                queryParams("code",code).
                queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").
                queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W").
                queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php").
                queryParams("grant_type","authorization_code").when().
                post("https://www.googleapis.com/oauth2/v4/token").asString();
        JsonPath js=new JsonPath(accessTokenResponse);
        String accessToken=js.getString("access_token");





        String response= given().queryParam("access_token",accessToken).
                when().get("https://rahulshettyacademy.com/getCourse.php").asString();
        System.out.println(response);

















    }
}
