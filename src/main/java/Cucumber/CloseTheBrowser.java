package Cucumber;

import static Cucumber.OpenWikiSearchPage.getWebDriver;

public class CloseTheBrowser {

    public static void closePage() {
        getWebDriver().close();
    }
    public void closeSession () {
        OpenWikiSearchPage.getWebDriver() = null;
    }


}
