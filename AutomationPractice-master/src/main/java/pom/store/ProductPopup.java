package main.java.pom.store;

import main.java.pom.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPopup extends BasePage {

    @FindBy(css = "#layer_cart a[title='Proceed to checkout']")
    private WebElement proceedToCheckoutBtn;

    @FindBy(css = "#layer_cart a[title='Continue shopping']")
    private WebElement continueShoppingBtn;

    public ProductPopup(){
        super();
    }


    public StorePage clickContinueShoppingBtn(){
        this.continueShoppingBtn.click();
        return new StorePage();
    }

    public CartPage clickProceedToCheckoutBtn(){
        this.proceedToCheckoutBtn.click();
        return new CartPage();
    }

}
