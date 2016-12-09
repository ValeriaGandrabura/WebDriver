package Cucumber;

import org.openqa.selenium.By;

import static Cucumber.OpenWikiSearchPage.getWebDriver;

public class VerifyExpectedTitle {
    final static String ARTICLE_TITLE_ADDRESS = "//h1[@id='firstHeading']";



    public static String getText (){
        return getWebDriver().findElement(By.xpath(ARTICLE_TITLE_ADDRESS)).getText();
    }

}
