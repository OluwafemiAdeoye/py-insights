package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCartPage {

    private WebDriver driver;
    private By proceedToCheckOutButton = By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");
    private By placeOrderButton = By.xpath("//*[@id=\"placeYourOrder\"]/span/input");

    public ViewCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public ReviewOrderPage proceedToCheckOut() {
        driver.findElement(proceedToCheckOutButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, 360);
//        wait.until((ExpectedConditions.visibilityOf(driver.findElement(placeOrderButton))));
        return new ReviewOrderPage(driver);
    }
}
