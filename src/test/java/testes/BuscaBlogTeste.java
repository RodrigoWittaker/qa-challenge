package testes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BuscaBlogTeste {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {

            driver.get("https://blog.agibank.com.br/");

            wait.until(d ->
                    ((JavascriptExecutor) d)
                            .executeScript("return document.readyState")
                            .equals("complete")
            );

            //  Localiza a lupa
            WebElement lupa = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("a.astra-search-icon")
            ));

            //  FORÇA CLIQUE
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lupa);

            //  AGUARDA INPUT DIRETO (SEM MODAL)
            WebElement campoBusca = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("input.search-field")
            ));

            //  FORÇA DIGITAÇÃO
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].value='cart';", campoBusca
            );

            //  DISPARA ENTER MANUALMENTE
            campoBusca.sendKeys(Keys.ENTER);

            // 🔍 ESPERA RESULTADOS
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("article")
            ));

            int resultados = driver.findElements(By.cssSelector("article")).size();

            if (resultados > 0) {
                System.out.println("TESTE PASSOU ");
            } else {
                System.out.println("TESTE FALHOU ");
            }

        } catch (Exception e) {
            System.out.println("ERRO NO TESTE ");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}