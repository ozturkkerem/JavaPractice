package Day13;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String email = scan.next();
    int index = email.lastIndexOf("_");
    int at = email.lastIndexOf("@");
    int dot = email.lastIndexOf(".");
    scan.close();
    String firstName = email.substring(0,index), lastName = email.substring(index+1,at), domain = email.substring(at+1, dot);
        System.out.println("First name: " + firstName +"\nLast name: " +lastName + "\nDomain: " + domain);

    }

}
