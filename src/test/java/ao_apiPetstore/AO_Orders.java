package ao_apiPetstore;

import ao_helpers.AO_TestDataGenerator;
import ao_models.AO_Pet;
import ao_models.AO_Store;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AO_Orders {
    private AO_Store order;
    private long orderId;

    @BeforeMethod
    public void beforeMethod() {
        order = AO_TestDataGenerator.generateRandomOrder();
        Response response =
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
        JsonPath jsonPath = response.jsonPath();
        orderId = jsonPath.getLong("id");
        System.out.println(orderId);

    }

    @Test
    public void placeOrdertoTheStore_orderPlaced() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/store/order/" + orderId)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        AO_Store responseOrder = jsonPath.getObject("id", AO_Store.class);

        System.out.println(responseOrder.getId());

    }
}