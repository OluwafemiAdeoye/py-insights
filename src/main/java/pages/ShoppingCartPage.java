package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    private WebDriver driver;
    private By clickCartButton = By.id("hlb-view-cart-announce");

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public ViewCartPage viewCart() {
        driver.findElement(clickCartButton).click();
        return new ViewCartPage(driver);
    }
}
