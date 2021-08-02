package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {

    private WebDriver driver;
    private By searchField = By.id("twotabsearchtextbox");
    private By clickSearchButton = By.id("nav-search-submit-button");

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultPage clickSearchField() {

        driver.findElement(searchField).sendKeys("best baby sunscreen");
        driver.findElement(clickSearchButton).click();
        return new SearchResultPage(driver);
    }
}
