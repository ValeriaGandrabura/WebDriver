package Cucumber;

public class CountWords {

    final static String CONTENT_ADDRESS = "//body";

    public static String[] getContent() {
        return WebDrive.getText(CONTENT_ADDRESS).split("[^a-zA-Z]");
    }

}
