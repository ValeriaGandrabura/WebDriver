package WebDrive;


import static WebDrive.Given.web;

public class Then {
    final static String ARTICLE_TITLE_ADDRESS = "//h1[@id='firstHeading']";


    @cucumber.api.java.en.Then("^the page title should start with (.*)$")
    public static void expectPage(final String word) {
        String title = web.getText(ARTICLE_TITLE_ADDRESS);
        if (title.equalsIgnoreCase(word)) {
            System.out.println("Success! The page is open!");
        } else {
            System.out.println("The page is wrong, try again");
        }
    }
}
