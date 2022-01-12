package Day11;
import java.util.Scanner;
public class Browser {
    public static void main(String[] args) {
        System.out.println("Provide a browser name");
        Scanner input = new Scanner(System.in);
        String browserName = input.next();
        // chrome, firefox, opera, safari, edge
        String result = "";
        switch (browserName){

            case "chrome":
                result = "chrome";
            break;

            case "firefox":
                result = "firefox";
                break;

            case "opera":
                result = "opera";
                break;


            case "safari":
                result = "safari";
                break;


            case "edge":
                result = "edge";
                break;


            default:
                result = "Invalid browser";
                break;

        }

        System.out.println("result = " + result);




    }
}
