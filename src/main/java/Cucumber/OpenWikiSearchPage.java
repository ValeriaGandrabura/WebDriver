package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWikiSearchPage {

    final static String URL = "http://www.wikipedia.org";

    private static WebDriver driver= null;

    public static WebDriver getWebDriver (){

        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void openPage() {
        getWebDriver().get(URL);
    }

}
