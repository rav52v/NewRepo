package main.java.pom.userPages;

import main.java.pom.BasePage;
import main.java.pom.enums.Menu;
import main.java.pom.store.StorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TopMenu extends BasePage {

    @FindBy(css = ".shopping_cart")
    private WebElement shoppingCart;

    @FindBy(css = "#block_top_menu [title='Women']")
    private WebElement women;

    @FindBy(css = "#block_top_menu [title='Dresses']")
    private WebElement dresses;

    @FindBy(css = "#block_top_menu [title='T-shirts']")
    private WebElement t_shirts;

    public TopMenu() {
        super();
    }


    public StorePage chooseOptionFromMenu(Menu menu, String option){
        WebElement menuOption = hooverOnMenuElement(menu);
        menuOption.findElement(By.xpath("..")).findElement(By.linkText(option)).click();
        return new StorePage();
    }


    private WebElement hooverOnMenuElement(Menu menu){
        switch (menu){
            case WOMEN:
                hooverOnElement(women);
                return women;
            case DRESSES:
                hooverOnElement(dresses);
                return dresses;
            case T_SHIRTS:
                hooverOnElement(t_shirts);
                return t_shirts;
        }
        return null;
    }



}
