package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    private WebDriver driver;
    private By clickFirstResult = By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div/div[1]/h2/a/span");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public ItemSearchPage clickResult() {
        driver.findElement(clickFirstResult).click();
        return new ItemSearchPage(driver);
    }
}
