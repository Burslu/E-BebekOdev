package api;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
public class SwaggerApiRequest {

    @Test

    public void get(){
     when()
            .get("https://generator.swagger.io/api/gen/clients/java")
            .then()
            .assertThat()
            .statusCode(200);
    }
    @Test

    public void post() throws FileNotFoundException {
        File json = new File("C:\\Users\\iberk\\SeleniumFramework\\src\\test\\java\\api\\Body.json");
        FileInputStream fis = new FileInputStream(json);
       given()
               .body(fis)
               .contentType(ContentType.JSON)
       .when()
               .post("https://generator.swagger.io/api/gen/clients/java")
       .then()
               .statusCode(200);
    }
//    public Map<String, Object> expectedDataSetUpWithAllKeys(Integer userId, String title, Boolean completed){
//        Map<String, Object> expectedData = new HashMap<>();
//        expectedData.put("userId", userId);
//        expectedData.put("title", title);
//        expectedData.put("completed", completed);
//        return expectedData;
//    }
}
