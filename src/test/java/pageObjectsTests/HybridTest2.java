package pageObjectsTests;

import adapters.DbAdapter;
import com.github.javafaker.Faker;
import helpers.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static io.restassured.RestAssured.given;

public class HybridTest2 extends BaseTest{
    private int playlistId;
    private String token;
    private Faker faker;
    @BeforeMethod
    public void startUp(){
        token = TestDataGenerator.getToken();
        faker = new Faker();
        String plName = faker.artist().name();
        System.out.println(plName);
        CreatePlaylistRequest pl= new CreatePlaylistRequest(plName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(pl)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        playlistId = jsonPath.getInt("id");
        System.out.println(playlistId);
    }
    @AfterMethod
    public void tearDown(){
        given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void renamePlaylist(){
        String newPlaylistName = faker.artist().name();
        System.out.println(newPlaylistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        mainPage.renamePlaylist(playlistId+"",newPlaylistName);
        String nameFromDb = DbAdapter.getPlaylistName(playlistId);
        Assert.assertEquals(nameFromDb,newPlaylistName);
    }
}
