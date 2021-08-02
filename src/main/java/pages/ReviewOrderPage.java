package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewOrderPage {

    private WebDriver driver;
    private By placeOrderButton = By.xpath("//*[@id=\"placeYourOrder\"]/span/input");

    public ReviewOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public OrderConfirmationPage placeOrder() {
        driver.findElement(placeOrderButton).click();
        return new OrderConfirmationPage(driver);
    }
}
