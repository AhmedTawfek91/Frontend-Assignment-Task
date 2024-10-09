package StepDefinitions;

import Pages.CartPage;
import Pages.ProductsPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartTest {

    ProductsPage productsPage;
    CartPage cartPage;

    @When("User click Go to cart button")
    public void GO_TO_CART_POSITIVE()
    {
        productsPage = new ProductsPage(TestBase.driver);
        productsPage.clickGoToCartButton();
    }

    @Then("User get the sub total price")
    public void ASSERT_CART_SUB_TOTAL_PRICE()
    {
        cartPage = new CartPage(TestBase.driver);
        String CART_SUB_TOTAL_PRICE = cartPage.getCartSubTotalPrice();
        System.out.println(CART_SUB_TOTAL_PRICE);

    }

}
