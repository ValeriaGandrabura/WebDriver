package Cucumber;

import org.openqa.selenium.WebDriver;

import static Cucumber.OpenWikiSearchPage.getWebDriver;

public class CloseTheBrowser {

    private static WebDriver driver= null;

    public static void closePage() {
        getWebDriver().close();
    }
    public void closeSession () {
        getWebDriver().close();
    }


}
