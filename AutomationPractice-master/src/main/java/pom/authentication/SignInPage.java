package main.java.pom.authentication;

import main.java.pom.BasePage;
import main.java.pom.userPages.MyAccountPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(id = "email_create")
    private WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountBtn;

    @FindBy(id = "email")
    private WebElement emailSignIn;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement signInBtn;

    public SignInPage(){
        super();
    }

    public SignInPage fulfillEmailCreate(String email) {
        this.emailCreate.sendKeys(email);
        return this;
    }

    public SignInPage fulfillEmailLogin(String email) {
        this.emailSignIn.sendKeys(email);
        return this;
    }

    public SignInPage fulfillPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public CreateAnAccountPage clickCreateAnAccountBtn(){
        this.createAnAccountBtn.click();
        return new CreateAnAccountPage();
    }

    public MyAccountPage clickSignInBtn(){
        this.signInBtn.click();
        return new MyAccountPage();
    }




}
