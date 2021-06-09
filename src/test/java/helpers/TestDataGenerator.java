package helpers;

import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class TestDataGenerator {
    public static String getString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static Pet generateRandomPet(){
        Faker faker = new Faker();
        Random random = new Random();

        String name = faker.cat().name();
        Category category = new Category(random.nextInt(), faker.cat().breed());
        String[]photoUrls = {faker.internet().image()};
        Tag tag = new Tag(random.nextInt(), faker.animal().name());
        Tag[]tags = {tag};

        return new Pet(name,category,photoUrls,tags, Status.pending);
    }

    public static String getToken() {
        //Credentials credentials = new Credentials("koeluser06@testpro.io","te$t$tudent");
        Credentials credentials = new Credentials("koeluser06@testpro.io","te$t$tudent");
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/me")
                        .header("Content-Type"," application/json")
                        .body(credentials)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        return "Bearer "+jsonPath.getString("token");
    }
}