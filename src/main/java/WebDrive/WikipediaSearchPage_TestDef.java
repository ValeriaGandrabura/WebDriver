package WebDrive;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WikipediaSearchPage_TestDef {

    final static String INPUT_ADDRESS = "//input[@name='search']";
//    final static String CONTENT_ADDRESS = "//body";
    final static String ARTICLE_TITLE_ADDRESS = "//h1[@id='firstHeading']";
    final static String URL = "http://www.wikipedia.org";

    static WebDrive web ;


    @Given("^user open Wikipedia Search Page$")
    public void open_Wikipedia_Search_Page (){
        web = new WebDrive();
        web.openPage(URL);
    }


    @When("^user enters (.*)$")
    public static void enter_Keyword (final String word){
        web.typeKeys(INPUT_ADDRESS, word);
        web.submit(INPUT_ADDRESS);
    }

    @Then("^the page title should start with (.*)$")
    public static void expectPage(final String word) {
        String title = web.getText(ARTICLE_TITLE_ADDRESS);
        if (title.equalsIgnoreCase(word)) {
            System.out.println("Success! The page is open!");
        } else {
            System.out.println("The page is wrong, try again");
        }
    }

    @And("^user close browser$")
    public static void close() {
        web.closePage();
        web.closeSession();
    }

}
