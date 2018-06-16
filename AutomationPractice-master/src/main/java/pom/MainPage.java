package main.java.pom;

import main.java.pom.authentication.SignInPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(css = ".login")
    private WebElement signIn;

    public MainPage(){
        super();
    }

    public SignInPage clickSignInBtn(){
        signIn.click();
        return new SignInPage();
    }

}
