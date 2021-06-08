package apiMyPetstore;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import myModels.Category;
import myModels.MyPet;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class pmyPetStore {
    @Test
    public void getPetById (){
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/564")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().response();

//        response.print();

        JsonPath jsonPath = response.jsonPath();
        MyPet responsePet = jsonPath.getObject("$", MyPet.class);
        System.out.println(responsePet.toString());

        Category responseCategory = jsonPath.getObject("category", Category.class);

        System.out.println(responseCategory.toString());

        System.out.println(responsePet.getName());
        System.out.println(responseCategory.getName());
        System.out.println(responsePet.getCategory().getName());


    }

}
