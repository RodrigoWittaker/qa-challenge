package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage {

    private WebDriver driver;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    private By lupa = By.cssSelector("a.astra-search-icon");
    private By campoBusca = By.cssSelector("input.search-field");

    public void acessarSite() {
        driver.get("https://blogdoagi.com.br/");
    }

    public void clicarLupa() {
        driver.findElement(lupa).click();
    }

    public void buscar(String texto) {
        WebElement campo = driver.findElement(campoBusca);
        campo.clear();
        campo.sendKeys(texto);
        campo.sendKeys(Keys.ENTER);
    }
}