package TesteRodrigo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class PrimeiroTeste {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Abre o Google
        driver.get("https://www.google.com");

        // Espera campo de busca aparecer
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        // Digita e pesquisa
        driver.findElement(By.name("q"))
                .sendKeys("Selenium WebDriver", Keys.ENTER);

        // Espera resultados aparecerem
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

        // Validação
        boolean resultado = driver.findElement(By.id("search")).isDisplayed();

        if (resultado) {
            System.out.println("TESTE PASSOU ✅");
        } else {
            System.out.println("TESTE FALHOU ❌");
        }

        driver.quit();
    }
}