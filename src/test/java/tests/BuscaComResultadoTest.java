package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BlogPage;

public class BuscaComResultadoTest extends BaseTest {

    @Test
    void deveBuscarComResultado() throws InterruptedException {

        BlogPage page = new BlogPage(driver);

        page.acessarSite();
        Thread.sleep(3000);

        page.clicarLupa();
        Thread.sleep(1000);

        page.buscar("Cartão");

        Thread.sleep(5000); // tempo pra ver resultado
    }
}