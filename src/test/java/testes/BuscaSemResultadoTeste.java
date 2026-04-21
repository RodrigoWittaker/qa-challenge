package testes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BuscaSemResultadoTeste {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    void deveBuscarSemResultado() throws InterruptedException {

        driver.get("https://blog.agibank.com.br/");

        wait.until(d ->
                ((JavascriptExecutor) d)
                        .executeScript("return document.readyState")
                        .equals("complete")
        );

        WebElement lupa = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("a.astra-search-icon")
        ));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lupa);

        WebElement campoBusca = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("input.search-field")
        ));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value='busca invalida';", campoBusca
        );

        campoBusca.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        int resultados = driver.findElements(By.cssSelector("article")).size();

        Assertions.assertEquals(0, resultados);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}