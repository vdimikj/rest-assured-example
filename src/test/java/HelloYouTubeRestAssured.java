import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class HelloYouTubeRestAssured {


    @Test
    public void greetingsYouTube() {
        given().when()
                .get("http://youtube.com/")
                .then()
                .statusCode(200);
    }
}
