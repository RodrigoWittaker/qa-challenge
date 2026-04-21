package api.client;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BlogClient {

    public Response buscarPost(String texto) {
        return given()
                .queryParam("s", texto)
                .when()
                .get("/wp-json/wp/v2/posts")
                .then()
                .extract()
                .response();
    }
}