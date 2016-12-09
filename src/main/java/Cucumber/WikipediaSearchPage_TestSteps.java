package Cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Cucumber.OpenWikiSearchPage.openPage;

public class WikipediaSearchPage_TestSteps {


    @Given("^User opens Wiki Search Page$")
    public static void openWikipediaSearchPage() {
        openPage();
    }

    @When("^User search (.*)$")
    public static void searchKeyword(String keyword) {
        int[][] results = new int[3][3];

        SearchKeywords.typeKeys(keyword);
        SearchKeywords.submit();

    }

    @Then("^Title page should be the same like (.*)$")
    public static void expectedTitle(String keyword) {
        String title = VerifyExpectedTitle.getText();
        if (title.equalsIgnoreCase(keyword)) {
            System.out.println("Success! The page is open!");
        } else {
            System.out.println("The page is wrong, try again");
        }
    }

    @And("^Count (.*), (.*) and (.*) on page$")
    public static int[] countWords(String word1, String word2, String word3) {
        int[] counts = new int[3];

        for (String word : CountWords.getContent()) {
            if (word.equalsIgnoreCase(word1)) {
                counts[0]++;
            }
            if (word.equalsIgnoreCase(word2)) {
                counts[1]++;
            }
            if (word.equalsIgnoreCase(word3)) {
                counts[2]++;
            }
        }

        return counts;
    }


    @Then("^Successfully write the result$")
    public void successfully_write_the_result() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Close the browser$")
    public static void close_the_browser()  {
        CloseTheBrowser.closePage();
//        .closeSession();
    }

}


