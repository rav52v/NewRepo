package main.java.pom.store;

import main.java.pom.userPages.TopMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StorePage extends TopMenu {

    @FindBy(id = "layer_cart")
    private WebElement popup;

    @FindBy(css = ".product_list li")
    private List<WebElement> products;

    public StorePage(){
        super();
    }

    public ProductPopup addToCart(String productName){
        for(WebElement product : products){
            String name = product.findElement(By.cssSelector("div div.right-block h5")).getText();
            if(name.equalsIgnoreCase(productName)){
                hooverOnElement(product);
                product.findElement(By.cssSelector("[title='Add to cart']")).click();
                break;
            }
        }
        turnOffImplcityWait();
        WebDriverWait wait = new WebDriverWait(driver, 15L);
        wait.until(ExpectedConditions.visibilityOf(popup));
        turnOnImplicityWait();
        return new ProductPopup();
    }

}
