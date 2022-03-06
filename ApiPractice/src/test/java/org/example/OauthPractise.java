package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.given;

public class OauthPractise {
    public static void main(String[] args)
    {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\ApiPractice\\chromedriver\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
            driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyjdss");
                    String accessTokenResponse= given().queryParams("code","").
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
