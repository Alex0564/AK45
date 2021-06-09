package ao_koelApi;

import ao_helpers.AO_TestDataGenerator;
import ao_models.AO_CreatePlaylistRequest;
import ao_models.AO_CreatePlaylistResponse;
import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AO_PlaylistTest {
    private int playlistId;
    private String token;
    private String playlistName;
    private String newPlaylistName;

    @BeforeMethod
    public void createNewPlaylist(){
        token = AO_TestDataGenerator.getToken();
        Faker faker = new Faker();
        playlistName = faker.artist().name();
        System.out.println(playlistName);
        AO_CreatePlaylistRequest playlist = new AO_CreatePlaylistRequest(playlistName);
        Response response =
                given()
                   .baseUri("https://bbb.testpro.io/")
                   .basePath("api/playlist")
                   .header("Content-Type","application/json")
                   .header("Authorization",token)
                   .body(playlist)
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
                   .basePath("api/playlist"+playlistId)
                   .header("Authorization",token)
                .when()
                   .delete();
    }
    @Test
    public void testPlaylist(){
        Response response =
                given()
                   .baseUri("https://bbb.testpro.io/")
                   .basePath("api/playlist")
                   .header("Content-Type","application/json")
                   .header("Authorization",token)
                .when()
                   .get()
                .then()
                   .statusCode(200)
                   .extract()
                   .response();
        JsonPath jsonPath = response.jsonPath();
        AO_CreatePlaylistResponse[] playlists = jsonPath.getObject("$", AO_CreatePlaylistResponse[].class);
        int count = 0;
        for(AO_CreatePlaylistResponse playlist: playlists){
            if(playlist.getId()==playlistId && playlist.getName().equals(playlistName)){
                count++;
            }
        }
        Assert.assertEquals(count, 1);

    }

    @Test
    public void renamePlaylist_renameSuccessful(){
        Faker faker = new Faker();
        newPlaylistName = faker.artist().name();
        System.out.println(newPlaylistName);
        AO_CreatePlaylistRequest newPlaylist = new AO_CreatePlaylistRequest(newPlaylistName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist"+playlistId)
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(newPlaylist)
                .when()
                        .put()
                .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        String plName;
        plName = jsonPath.getString("name");
        System.out.println(plName);
        Assert.assertEquals(plName, newPlaylistName);
    }
}
