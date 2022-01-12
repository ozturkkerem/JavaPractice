package Day10;
import java.util.Scanner;

public class Http {
    public static void main(String[] args) {
        System.out.println("code: ");
        Scanner input = new Scanner(System.in);
        int c = input.nextInt(); // get the ode from user

        String codeSays = (c == 200)? "OK" : (c == 201)? "Created" : (c == 202)? "Accepted": (c == 301)? "Moved Permanently" : (c == 303)? "See Other" :
                (c == 304)? "not Modified" : (c == 307)? "Temporary Redirect" : (c == 400)? "Bad Request" : (c == 401)? "Unauthorized" : (c == 403)? "Forbidden"
                        :(c == 404)? "Not Found" : (c == 410)? "Gone" : (c == 500)? "Internal Server Error" : (c == 503)? "Service Unavailable" : "Invalid Number";

        System.out.println(codeSays);
    }
}
