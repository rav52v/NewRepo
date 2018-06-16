package main.java.pom.authentication;

import main.java.pom.BasePage;
import main.java.pom.enums.Gender;
import main.java.pom.userPages.MyAccountPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage extends BasePage {

    @FindBy(id = "id_gender1")
    private WebElement mrRadioBtn;

    @FindBy(id = "id_gender2")
    private WebElement mrsRadioBtn;

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement dayOfBirth;

    @FindBy(id = "months")
    private WebElement monthOfBirth;

    @FindBy(id = "years")
    private WebElement yearOfBirth;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheckBox;

    @FindBy(id = "optin")
    private WebElement specialOffersCheckbox;

    @FindBy(id = "firstname")
    private WebElement addrFirstName;

    @FindBy(id = "lastname")
    private WebElement addrLastName;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "address2")
    private WebElement addressLine2;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement stateSelect;

    @FindBy(id = "postcode")
    private WebElement postalCode;

    @FindBy(id = "id_country")
    private WebElement countrySelect;

    @FindBy(id = "other")
    private WebElement additionalInformation;

    @FindBy(id = "phone")
    private WebElement homePhone;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone;

    @FindBy(id = "alias")
    private WebElement addressAlias;

    @FindBy(id = "submitAccount")
    private WebElement registerBtn;

    public CreateAnAccountPage(){
        super();
    }

    public CreateAnAccountPage chooseGender(Gender gender) {
        if(gender == Gender.MR) {
            mrRadioBtn.click();
        } else {
            mrsRadioBtn.click();
        }
        return this;
    }

    public CreateAnAccountPage fulfillFirstname(String firstName) {
        this.firstName.sendKeys(firstName);
        return this;
    }

    public CreateAnAccountPage fulfillLastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public CreateAnAccountPage fulfillPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public CreateAnAccountPage fulfillEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
        return this;
    }

    public CreateAnAccountPage selectYear(String year) {
        Select yearSelect = new Select(yearOfBirth);
        yearSelect.selectByValue(year);
        return this;
    }

    public CreateAnAccountPage selectMonth(String month) {
        Select monthSelect = new Select(monthOfBirth);
        monthSelect.selectByValue(month);
        return this;
    }

    public CreateAnAccountPage selectDay(String day) {
        Select daySelect = new Select(dayOfBirth);
        daySelect.selectByValue(day);
        return this;
    }

    public CreateAnAccountPage checkSignUpForNewsletter(){
        this.newsletterCheckBox.click();
        return this;
    }

    public CreateAnAccountPage checkSpecialOffers(){
        this.specialOffersCheckbox.click();
        return this;
    }

    public CreateAnAccountPage fulfillAddrFirstName(String firstName){
    	   this.addrFirstName.clear();
        this.addrFirstName.sendKeys(firstName);
        return this;
    }

    public CreateAnAccountPage fulfillAddtLastName(String lastName) {
    	this.addrLastName.clear();
        this.addrLastName.sendKeys(lastName);
        return this;
    }

    public CreateAnAccountPage fulfillCompany(String company) {
        this.company.sendKeys(company);
        return this;
    }

    public CreateAnAccountPage fulfillAddresLine1(String addrLine1) {
        this.address.clear();
        this.address.sendKeys(addrLine1);
        return this;
    }

    public CreateAnAccountPage fulfillAddresLine2(String addLine2) {
        this.addressLine2.sendKeys(addLine2);
        return this;
    }

    public CreateAnAccountPage fulfillCity(String city) {
        this.city.sendKeys(city);
        return this;
    }

    public CreateAnAccountPage selectState(String state) {
        Select stateSelect = new Select(this.stateSelect);
        stateSelect.selectByVisibleText(state);
        return this;
    }

    public CreateAnAccountPage fulfillPostalCode(String postalCode){
        this.postalCode.sendKeys(postalCode);
        return this;
    }

    public CreateAnAccountPage selectCountry(String country){
        Select countrySelect = new Select(this.countrySelect);
        countrySelect.selectByVisibleText(country);
        return this;
    }

    public CreateAnAccountPage fulfillAdditionalInfo(String text) {
        this.additionalInformation.sendKeys(text);
        return this;
    }

    public CreateAnAccountPage fulfillHomePhone(String homePhoneNumber){
        this.homePhone.sendKeys(homePhoneNumber);
        return this;
    }

    public CreateAnAccountPage fulfillMobilePhone(String mobilePhoneNumber){
        this.mobilePhone.sendKeys(mobilePhoneNumber);
        return this;
    }

    public CreateAnAccountPage fulfillAddrlAlias(String addrAlias){
    	this.addressAlias.clear();
        this.addressAlias.sendKeys(addrAlias);
        return this;
    }

    public MyAccountPage clickRegisterBtn(){
        this.registerBtn.click();
        return new MyAccountPage();
    }


}
