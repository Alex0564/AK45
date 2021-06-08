package ao_apiPetstore;

import ao_helpers.AO_TestDataGenerator;
import ao_models.AO_Pet;
import ao_models.AO_Store;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AO_PetStore {
    private AO_Pet pet;
    private long petId;
    private long orderId;
    private AO_Store order;

    @BeforeMethod
    public void beforeMethod(){
        pet = AO_TestDataGenerator.generateRandomPet();
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/")
                        .header("Content-Type", "application/json")
                        .body(pet)
                .when()
                        .post()
                .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        petId = jsonPath.getLong("id");
        System.out.println(petId);

        order = AO_TestDataGenerator.generateRandomOrder();
        Response responseOrder =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/store/order")
                        .header("Content-Type", "application/json")
                        .body(order)
                .when()
                        .post()
                .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPathOrder = responseOrder.jsonPath();
        orderId = jsonPathOrder.getLong("id");
        System.out.println(orderId);

    }

    @AfterMethod
    public void afterMethod(){
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                .when()
                        .delete()
                .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        int x;
        x = jsonPath.getInt("code");
        System.out.println(x);
    }
    @Test
    public void getPetById_petReturned(){
        Response response =
                   given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                   .when()
                        .get()
                   .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        AO_Pet responsePet = jsonPath.getObject("$",AO_Pet.class);

        System.out.println(responsePet.getName());

        Assert.assertEquals(responsePet.getName(),pet.getName());
        Assert.assertEquals(responsePet.getCategory().getId(),pet.getCategory().getId());
        Assert.assertEquals(responsePet.getCategory().getName(),pet.getCategory().getName());
    }

//    @Test
//    public void placeOrdertoTheStore_orderPlaced() {
//
//    }
}
