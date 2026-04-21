package api.tests;

import api.base.BaseApiTest;
import api.client.DogClient;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogApiTest extends BaseApiTest {

    DogClient client = new DogClient();

    @Test
    void deveListarRacas() {
        Response response = client.listarRacas();

        assertEquals(200, response.getStatusCode());
        assertTrue(response.getBody().asString().contains("bulldog"));
    }

    @Test
    void deveBuscarImagensPorRaca() {
        Response response = client.buscarImagensPorRaca("hound");

        assertEquals(200, response.getStatusCode());
        assertTrue(response.getBody().asString().contains("https"));
    }

    @Test
    void deveRetornarImagemAleatoria() {
        Response response = client.imagemAleatoria();

        assertEquals(200, response.getStatusCode());
        assertTrue(response.getBody().asString().contains("https"));
    }

    // 🔥 NOVO CENÁRIO (IMPORTANTE PRA ENTREVISTA)
    @Test
    void naoDeveRetornarImagensParaRacaInvalida() {
        Response response = client.buscarImagensPorRaca("raca_invalida");

        assertEquals(404, response.getStatusCode());
        assertTrue(response.getBody().asString().contains("error"));
    }
}