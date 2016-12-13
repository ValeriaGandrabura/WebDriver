package WebDrive;

import static WebDrive.Given.web;

public class And {

    @cucumber.api.java.en.And("^user close browser$")
    public static void close() {
        web.closePage();
        web.closeSession();
    }

}
