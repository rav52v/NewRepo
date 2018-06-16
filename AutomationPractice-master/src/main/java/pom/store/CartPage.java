package main.java.pom.store;

import main.java.pom.userPages.TopMenu;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends TopMenu {

    @FindBy(id = "cart_summary")
    private WebElement castSummary;

    @FindBy(css = "#cart_summary tr.cart_item")
    private List<WebElement> addedProducts;

    public CartPage(){
        super();
        turnOffImplcityWait();
        WebDriverWait wait = new WebDriverWait(driver, 15L);
        wait.until(ExpectedConditions.visibilityOfAllElements(addedProducts));
        turnOnImplicityWait();
    }

    public CartPage checkProductNameAndQuantity(String productNameToBe, String quantityToBe){
        for(WebElement product : addedProducts) {
            String name = product.findElement(By.cssSelector(".cart_description .product-name")).getText();
            String quantity = product.findElement(By.cssSelector(".cart_quantity .cart_quantity_input")).getAttribute("value");
            Assert.assertTrue(name.equalsIgnoreCase(productNameToBe));
            Assert.assertTrue(quantity.equalsIgnoreCase(quantityToBe));
        }
        return this;
    }
}
