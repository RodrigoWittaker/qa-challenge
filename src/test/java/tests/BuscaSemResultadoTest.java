package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BlogPage;

public class BuscaSemResultadoTest extends BaseTest {

    @Test
    void deveBuscarSemResultado() throws InterruptedException {

        BlogPage page = new BlogPage(driver);

        page.acessarSite();
        Thread.sleep(3000);

        page.clicarLupa();
        Thread.sleep(1000);

        page.buscar("Busca invalida");

        Thread.sleep(5000);
    }
}