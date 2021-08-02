package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class SearchTest extends BaseTests {

    @Test
    public void testSearch() {
        SearchResultPage searchResultPage = homepage.clickSearchField();
        ItemSearchPage itemSearchPage = searchResultPage.clickResult();
        ShoppingCartPage shoppingCartPage = itemSearchPage.addToCart();
        ViewCartPage viewCartPage = shoppingCartPage.viewCart();
        ReviewOrderPage reviewOrderPage = viewCartPage.proceedToCheckOut();
        OrderConfirmationPage orderConfirmationPage = reviewOrderPage.placeOrder();
        assertEquals(orderConfirmationPage.getAlertText(), "Order placed, thanks!",
                "Alert!!! Order not successful.");
    }
}