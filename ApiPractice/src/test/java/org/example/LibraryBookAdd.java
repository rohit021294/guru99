package org.example;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import static io.restassured.RestAssured.given;

public class LibraryBookAdd {
    @Test(dataProvider = "books")
    public void addBook(String isbn,String aisle) throws IOException
    {RestAssured.baseURI="http://216.10.245.166";
        Response resp=given().
                header("Content-Type","application/json").
                body(Payload.getAddBook(isbn,aisle)).
                when().
                post(Rersources.getGETBookAdd()).
                then().assertThat().statusCode(200).
                extract().response();
        String response = resp.asString();
        // traversing from jason path
        JsonPath js = new JsonPath(response);
       System.out.println(response);

    }


    @Test(dataProvider = "books")
    public void deleteData(String ibsn,String aisle)
    {
        RestAssured.baseURI="http://216.10.245.166";
       Response res= given().body(Payload.deleteBOOK(ibsn,aisle)).when().post(Rersources.deleteBook()).then().
                extract().response();
     String response= res.asString();
     JsonPath js=new JsonPath(response);
     System.out.println(response);
    }


    @DataProvider(name="books")
    public Object[][] bookData()
    {

        return new Object[][]{{"asdfffff","1234444"},{"ghjklllll","1235555"},{"qwettyyyy","098766666"},{"asdfffffdgjh","143234444"},{"jkllll","432155"},{"gfvttyyy","66767666"}};
    }
}
