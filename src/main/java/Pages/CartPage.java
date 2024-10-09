package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"sc-subtotal-amount-buybox\"]/span")
    WebElement cartSubTotalPrice;

    public String getCartSubTotalPrice()
    {
        return cartSubTotalPrice.getText();
    }
}
