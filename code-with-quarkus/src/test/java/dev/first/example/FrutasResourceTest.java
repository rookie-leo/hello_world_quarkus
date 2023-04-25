package dev.first.example;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(FrutasResource.class)
public class FrutasResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(is("[{\"id\":1,\"nome\":\"Maçã\",\"qtde\":3},{\"id\":2,\"nome\":\"Uva\",\"qtde\":8},{\"id\":3,\"nome\":\"Banana\",\"qtde\":6}]"));
    }

}