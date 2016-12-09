package Cucumber;

import org.openqa.selenium.By;

import static Cucumber.OpenWikiSearchPage.getWebDriver;

public class SearchKeywords {
    final static String INPUT_ADDRESS = "//input[@name='search']";


    public static void typeKeys( String text) {
        getWebDriver().findElement(By.xpath(INPUT_ADDRESS)).sendKeys(text);
    }

    public static void submit () {
        getWebDriver().findElement(By.xpath(INPUT_ADDRESS)).submit();
    }

}
