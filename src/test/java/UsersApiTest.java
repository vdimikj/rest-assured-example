import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UsersApiTest {

    @Test
    public void checkUsers() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .body("id",hasSize(10))
                .body("name[0]", equalTo("Leanne Graham"))
                .body("username[0]", equalTo("Bret"))
                .body("email[0]", equalTo("Sincere@april.biz"))
                .body("address[0].city", equalTo("Gwenborough"))
                .body("phone[0]", startsWith("1-770-736-8031"))
                .body("website[0]", equalTo("hildegard.org"))
                .body("company[0].name", equalTo("Romaguera-Crona"));
    }
}
