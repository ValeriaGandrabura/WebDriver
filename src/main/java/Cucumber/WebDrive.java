package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Cucumber.OpenWikiSearchPage.URL;
import static Cucumber.SearchKeywords.INPUT_ADDRESS;

public class WebDrive {

    private static WebDriver driver= null;

    final static String ARTICLE_TITLE_ADDRESS = "//h1[@id='firstHeading']";

    public static WebDriver getWebDriver (){

        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void openPage() {
        getWebDriver().get(URL);
    }

    public void closePage() {
        getWebDriver().close();
    }

    public void typeKeys( String text) {
        getWebDriver().findElement(By.xpath(INPUT_ADDRESS)).sendKeys(text);
    }

    public static String getText (String address){
        return getWebDriver().findElement(By.xpath(address)).getText();
    }

    public void submit () {
        getWebDriver().findElement(By.xpath(INPUT_ADDRESS)).submit();
    }

    public void closeSession () {
        driver = null;
    }


//    public String getCurrentURL(){
//        return getWebDriver().getCurrentUrl();
//    }


}