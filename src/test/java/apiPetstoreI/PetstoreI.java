package apiPetstoreI;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import modelsI.Category;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetstoreI {
    @Test
    public void getPetById_petReturned() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/180")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath jsonPath = response.jsonPath();
        Pet responsePet = jsonPath.getObject("$",Pet.class);
//        System.out.println(responsePet.getName());

//        Category responseCategory = jsonPath.getObject("category",Category.class);
//        System.out.println(responseCategory.getName());

        System.out.println(responsePet.getCategory().getName());

    }
}
