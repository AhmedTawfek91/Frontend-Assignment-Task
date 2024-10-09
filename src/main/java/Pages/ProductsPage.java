package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "a-autoid-1-announce")
    WebElement addToCartProductOne;

    @FindBy(id = "a-autoid-8-announce")
    WebElement addToCartProductTwo;

    @FindBy(xpath = "//*[@id=\"ewc-content\"]/div[1]/div/div/div[2]/div[2]/span/h2")
    WebElement subTotalPrice;

    @FindBy(xpath = "//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a")
    WebElement goToCartButton;

    public void clickAddToCartProductOne()
    {
        addToCartProductOne.click();
    }

    public void clickAddToCartProductTwo()
    {
        addToCartProductTwo.click();
    }

    public String getSubTotalPrice()
    {
       return subTotalPrice.getText();
    }

    public void clickGoToCartButton()
    {
        goToCartButton.click();
    }
}
