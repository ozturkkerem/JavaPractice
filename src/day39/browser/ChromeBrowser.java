package day39.browser;

public class ChromeBrowser extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome method");
    }
}




/*
	1. ChromeBrowser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"
 */