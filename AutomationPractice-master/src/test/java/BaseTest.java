package test.java;

import main.java.utils.Driver.Driver;
import org.junit.After;
import org.junit.BeforeClass;

import java.util.Random;

public abstract class BaseTest {

    protected static String email;

    /*
    * I know it can be done via DataProvider from TestNG but currently im using JUnit :)
    * */
    @BeforeClass
    public static void generateDataForTest() {
        String[] postfix = {"some.com", "haha.pl", "ojoj.eu", "nope.de", "like.it", "super.xd", "lubie.to"};
        String[] prefix = {"email", "user", "joke", "test", "tryme", "runas", "cucmber"};

        email = prefix[generateRandom(0, prefix.length)] + "@" + postfix[generateRandom(0, postfix.length)];
    }


    @After
    public void afterTest(){
        Driver.closeDriver();
    }

    private static int generateRandom(int from, int to){
        return from + new Random().nextInt(to-from);
    };
}
