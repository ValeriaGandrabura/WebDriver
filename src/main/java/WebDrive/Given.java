package WebDrive;



public class Given {

    final static String URL = "http://www.wikipedia.org";


    static WebDrive web ;


    @cucumber.api.java.en.Given("^user open Wikipedia Search Page$")
    public void open_Wikipedia_Search_Page (){
        web = new WebDrive();
        web.openPage(URL);
    }








}
