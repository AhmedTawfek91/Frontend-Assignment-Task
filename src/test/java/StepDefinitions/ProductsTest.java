package StepDefinitions;

import Pages.ProductsPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsTest extends TestBase {

    ProductsPage productsPage;

    @When("User add products to cart")
    public void add_Product_TO_Cart_POSITIVE() throws InterruptedException {
        productsPage = new ProductsPage(TestBase.driver);
        productsPage.clickAddToCartProductOne();
        Thread.sleep(3000);
        productsPage.clickAddToCartProductTwo();
        Thread.sleep(3000);
    }

    @Then("User get the added products sub total price")
    public void ASSERT_SubTotalPrice()
    {
        productsPage = new ProductsPage(TestBase.driver);
        String SUB_TOTAL_PRICE = productsPage.getSubTotalPrice();
        System.out.println(SUB_TOTAL_PRICE);
    }
}
