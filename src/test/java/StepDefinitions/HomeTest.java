package StepDefinitions;

import Pages.HomePage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeTest extends TestBase {

    HomePage homePage;

    @When("User search for product")
    public void SearchProduct_POSITIVE() throws InterruptedException {
        homePage = new HomePage(TestBase.driver);
        homePage.writeOnSearchField("toys");
        Thread.sleep(3000);
    }

    @Then("Items of product displayed for user")
    public void ASSERT_HomePage_POSITIVE()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("toys"));
    }
}
