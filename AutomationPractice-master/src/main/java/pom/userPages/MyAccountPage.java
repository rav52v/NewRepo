package main.java.pom.userPages;

import main.java.pom.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends TopMenu {

    @FindBy(css = ".page-heading")
    private WebElement pageHeading;

    public MyAccountPage(){
        super();
    }

    public void checkPageTitle(){
        Assert.assertTrue(pageHeading.getText().equalsIgnoreCase("MY ACCOUNT"));
    }
}
