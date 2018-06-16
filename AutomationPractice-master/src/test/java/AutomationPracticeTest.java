package test.java;

import main.java.pom.MainPage;
import main.java.pom.enums.Gender;
import main.java.pom.enums.Menu;
import org.junit.Test;

public class AutomationPracticeTest extends BaseTest {

    //It could be also generated but there is no need for that
    private final String PASSWORD = "SomePassword!@#";

    @Test
    public void scenario1Test(){
        new MainPage()
                .clickSignInBtn()
                .fulfillEmailCreate(email)
                .clickCreateAnAccountBtn()
                .chooseGender(Gender.MR)
                .fulfillFirstname("Some")
                .fulfillLastName("Person")
                .fulfillPassword(PASSWORD)
                .selectYear("1991")
                .selectMonth("1")
                .selectDay("25")
                .checkSignUpForNewsletter()
                .checkSpecialOffers()
                .fulfillAddrFirstName("Some")
                .fulfillAddtLastName("Person")
                .fulfillCompany("SuperCompany")
                .fulfillAddresLine1("Some Addr, Some Street 12/10")
                .fulfillCity("BeautifulOne")
                .selectState("Texas")
                .fulfillPostalCode("12445")
                .selectCountry("United States")
                .fulfillAdditionalInfo("Very Large Info")
                .fulfillHomePhone("+48 22 785 78 57")
                .fulfillMobilePhone("123321123")
                .fulfillAddrlAlias("SomeFunnyAlias");
                try {
        			Thread.sleep(5000);
        		} catch (InterruptedException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}

        

    }

    @Test
    public void scenario2Test(){
        new MainPage()
                .clickSignInBtn()
                .fulfillEmailLogin(email)
                .fulfillPassword(PASSWORD)
                .clickSignInBtn()
                .checkPageTitle();
    }

    @Test
    public void scenario3Test(){
        new MainPage()
                .clickSignInBtn()
                .fulfillEmailLogin(email)
                .fulfillPassword(PASSWORD)
                .clickSignInBtn()
                .chooseOptionFromMenu(Menu.WOMEN, "Casual Dresses")
                .addToCart("Printed Dress")
                .clickProceedToCheckoutBtn()
                .checkProductNameAndQuantity("Printed Dress", "1");

    }
}
