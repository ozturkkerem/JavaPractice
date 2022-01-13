package day39.browser;

public class Firefox extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing fire fox browser");
    }
}

/*
		2. FireFox extends Browser
					methods:
						openBrowser(): prints
						closeBrowser(): prints "closing fire fox browser"


 */
