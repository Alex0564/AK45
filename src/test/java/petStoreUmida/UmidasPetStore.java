package petStoreUmida;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UmidasPetStore {
    @Test
    public  void petReturned(){
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/150")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        Pet respPet = jsonPath.getObject("$", Pet.class);
        System.out.println(respPet.getName());

        Category category = jsonPath.getObject("category", Category.class);
        System.out.println(respPet.getCategory());

    }
}
