package apiPetstore;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStore {
    @Test
    public void getPetById_petReturned(){
        Response response =
                given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .basePath("/pet/100")
                .when()
                    .get()
                .then()
                    .statusCode(200)
                    .extract()
                    .response();
        JsonPath jsonPath = response.jsonPath();
        Pet responsePet = jsonPath.getObject("$",Pet.class);

//        Category responseCategory = jsonPath.getObject("category",Category.class);
//        System.out.println(responsePet.getName());
//        System.out.println(responseCategory.getName());
        System.out.println(responsePet.getCategory().getName());
    }
}
