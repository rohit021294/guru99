package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Rest {
    Properties prop;


    @BeforeTest
    void getDAta() throws IOException {
       prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\Rohit\\IdeaProjects\\ApiPractice\\src\\test\\java\\SOURCE\\env.properties");
       prop.load(fis);
        prop.getProperty("HOST");
    }

    @Test
    public void metadata() {


        RestAssured.baseURI = prop.getProperty("HOST");

        Response res = given().
                queryParam("key", prop.get("KEY"))
                .body(Payload.getPostData()).
                when().post(Rersources.getAddPlace()).
                then().assertThat().statusCode(200).and().contentType("application/json;charset=UTF-8")
                .and().body("status", equalTo("OK")).extract().response();

        //getting response in string
        String response = res.asString();
        // System.out.println(response);
        // traversing from jason path
        JsonPath js = new JsonPath(response);
        String placeid = js.get("place_id");
         //System.out.println(placeid);

        given().queryParam("key", prop.get("KEY")).

                body("{" +
                        "\"place_id\":\""+placeid+"\"" +
                        "}").
                when().
                post("/maps/api/place/delete/json").
                then().assertThat().statusCode(200).and().body("status", equalTo("OK"));


    }
}
