package day39.browser;

public class os {
    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        Safari safari = new Safari();
        Firefox firefox = new Firefox();
        Opera opera = new Opera();

        chrome.openBrowser();
        chrome.closeBrowser();
        safari.openBrowser();
        safari.closeBrowser();
        firefox.closeBrowser();
        firefox.openBrowser();
        opera.openBrowser();
        opera.closeBrowser();


    }
}
