package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class XmlAddDelete extends Rest {

    @Test
    void addPlace()
    {
        RestAssured.baseURI=prop.getProperty("HOST");
        Response res= given().queryParam("key",prop.get("KEY")).
                body(Payload.getPOstdataXml()).log().all().
                when().
                post(Rersources.getAddPLAceXml()).then().assertThat().statusCode(200).and().contentType(ContentType.XML).extract().response();
            String response=res.asString();
            System.out.println(response);
        XmlPath x=new XmlPath(response);
        System.out.println(x.get("place_id"));
    }
}
