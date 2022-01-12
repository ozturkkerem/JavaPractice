package Day12;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        String username ="Cydeo";
        String password = "WoodenSpoon";
        System.out.println("Enter your username");
        String logUsername = scan.next();
        System.out.println("Enter your Password");
        String logPassword = scan.next();

        if (logUsername.equals(username) && logPassword.equals(password))
            System.out.println("Logged in");
        else
            System.out.println("Incorrect username or password");

    }
}
