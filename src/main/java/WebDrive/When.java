package WebDrive;


import static WebDrive.Given.web;

public class When {
    final static String INPUT_ADDRESS = "//input[@name='search']";



    @cucumber.api.java.en.When("^user enters (.*)$")
    public static void enter_Keyword (final String word){
        web.typeKeys(INPUT_ADDRESS, word);
        web.submit(INPUT_ADDRESS);

    }

}



