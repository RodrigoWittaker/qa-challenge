package api.client;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DogClient {

    public Response listarRacas() {
        return given()
                .when()
                .get("/breeds/list/all");
    }

    public Response buscarImagensPorRaca(String breed) {
        return given()
                .when()
                .get("/breed/" + breed + "/images");
    }

    public Response imagemAleatoria() {
        return given()
                .when()
                .get("/breeds/image/random");
    }
}