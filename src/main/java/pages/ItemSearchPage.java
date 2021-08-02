package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemSearchPage {

    private WebDriver driver;
    private By clickAddToCart = By.id("add-to-cart-button");

    public ItemSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShoppingCartPage addToCart() {
        driver.findElement(clickAddToCart).click();
        return new ShoppingCartPage(driver);
    }
}
