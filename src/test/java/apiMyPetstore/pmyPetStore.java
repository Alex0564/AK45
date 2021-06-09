package apiMyPetstore;

import helpers.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import myModels.MyCategory;
import myModels.MyPet;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.given;

public class pmyPetStore {
    private MyPet myPet;
    private long petId;
    @BeforeMethod
    public void startUp (){
        System.out.println("inside of Before Method");
        myPet = TestDataGenerator.myGenerateRandomPet();// создаем случайное животное

//        Создаем колл типа Пост  - создаем животное в магазине
        Response response =
                given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .basePath("/pet")
                    .body(myPet)
                    .header("Content-Type", "application/json" )// "Content-Type" отвечает в каком виде вернется Response body:json или xml
                .when()
                    .post()
                .then()
                    .statusCode(200)
                    .extract().response();
        JsonPath jsonPath = response.jsonPath();
        petId = jsonPath.getLong("id");
        System.out.println(petId);
        System.out.println("Name=" + myPet.getName());
    }

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

        MyCategory responseCategory = jsonPath.getObject("category", MyCategory.class);

        System.out.println(responseCategory.toString());

        System.out.println(responsePet.getName());
        System.out.println(responseCategory.getName());
        System.out.println(responsePet.getCategory().getName());


    }

}
