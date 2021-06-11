package apiMyPetstore;

import helpers.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import myModels.MyCategory;
import myModels.MyPet;
//import org.junit.Test;
//import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class pmyPetStore {
    private Pet myPet;
    private long petId;
    @BeforeMethod
    public void startUp (){
        System.out.println("inside of Before Method");
        myPet = TestDataGenerator.generateRandomPet();// создаем случайное животное
//        Создаем Пост  - создаем животное в магазине
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
        response.print();
        petId = jsonPath.getLong("id");
        System.out.println("Pet ID= " + petId);
        System.out.println("Name=" + myPet.getName());
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("inside of After Method");
        Response response =
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/"+petId)
                .when()
                .delete();
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/"+petId)
                .when()
                .get()
                .then()
                .statusCode(404)
                .extract()
                .response();
        response.print();
    }

    @Test
    public void getPetById (){
        System.out.println("inside of get Pet Method");
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/"+petId)
                .when()
                .get()
                .then()

                .extract().response();
        response.print();
        JsonPath jsonPath = response.jsonPath();
        MyPet responsePet = jsonPath.getObject("$", MyPet.class);
//        System.out.println(responsePet.toString());

        MyCategory responseCategory = jsonPath.getObject("category", MyCategory.class);

//        System.out.println(responseCategory.toString());

//        System.out.println(responsePet.getName());
//        System.out.println(responseCategory.getName());
//        System.out.println(responsePet.getCategory().getName());

        Assert.assertEquals(responsePet.getName(), myPet.getName());
        Assert.assertEquals(responsePet.getCategory().getId(), myPet.getCategory().getId());
        Assert.assertEquals(responsePet.getCategory().getName(), myPet.getCategory().getName());
    }

    @Test
    public void updatePet(){
        System.out.println("inside of updated Pet Method");
        Pet updatePet = TestDataGenerator.generateRandomPet();
        updatePet.setId(petId);
        Response response =
                given()
                    .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header("Content-Type"," application/json")
                        .body(updatePet)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        response.print();

        JsonPath jsonPath = response.jsonPath();
        Pet responsePet = jsonPath.getObject("$",Pet.class);

        Assert.assertEquals(responsePet.getName(),updatePet.getName());
        Assert.assertEquals(responsePet.getCategory().getId(),updatePet.getCategory().getId());
        Assert.assertEquals(responsePet.getCategory().getName(),updatePet.getCategory().getName());


    }



}
