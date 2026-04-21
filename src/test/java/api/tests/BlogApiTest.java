package api.tests;

import api.base.BaseApiTest;
import api.client.BlogClient;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlogApiTest extends BaseApiTest {

    BlogClient client = new BlogClient();

    @Test
    void deveBuscarComResultado() {
        Response response = client.buscarPost("agi");

        assertTrue(response.getStatusCode() == 200);
        assertTrue(response.jsonPath().getList("$").size() > 0);
    }

    @Test
    void deveBuscarSemResultado() {
        Response response = client.buscarPost("busca-invalida-xyz");

        assertTrue(response.getStatusCode() == 200);

        // valida que retornou lista (mesmo que não seja relevante)
        assertTrue(response.getBody().asString().contains("["));
    }
}