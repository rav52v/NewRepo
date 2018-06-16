package main.java.tools.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static main.java.pom.BasePage.IMPLICITY_WAIT_TIME;

public class Driver {
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private static WebDriver driver;

    public static WebDriver getInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(BASE_URL);
            driver.manage()
                    .timeouts()
                    .implicitlyWait(IMPLICITY_WAIT_TIME, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
