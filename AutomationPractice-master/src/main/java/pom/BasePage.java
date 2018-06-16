package main.java.pom;

import main.java.utils.Driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public static final long IMPLICITY_WAIT_TIME = 15;

    protected WebDriver driver;

    public BasePage(){
        this.driver = Driver.getInstance();
        PageFactory.initElements(driver, this);
    }

    protected void turnOnImplicityWait(){
        this.driver.manage()
                .timeouts()
                .implicitlyWait(IMPLICITY_WAIT_TIME, TimeUnit.SECONDS);
    }

    protected void turnOffImplcityWait(){
        this.driver.manage()
                .timeouts()
                .implicitlyWait(0, TimeUnit.SECONDS);
    }

    protected void hooverOnElement(WebElement element){
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }

}
