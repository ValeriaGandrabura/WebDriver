package WebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrive {

    private static WebDriver driver= null;

    public static WebDriver getWebDriver (){

        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void openPage(String URL) {
        getWebDriver().get(URL);
    }

    public void closePage() {
        getWebDriver().close();
    }

    public void typeKeys(String address, String text) {
        getWebDriver().findElement(By.xpath(address)).sendKeys(text);
    }

    public String getText (String address){
        return getWebDriver().findElement(By.xpath(address)).getText();
    }

    public void submit (String address) {
        getWebDriver().findElement(By.xpath(address)).submit();
    }

    public void closeSession () {
        driver = null;
    }


//    public String getCurrentURL(){
//        return getWebDriver().getCurrentUrl();
//    }


}