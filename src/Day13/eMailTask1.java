package Day13;

import java.util.Scanner;

public class eMailTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int index = email.indexOf("_");
        int at = email.indexOf("@");

        if (index >= 0) {
            String newEmail = email.substring(index + 1, at) + "_" + email.substring(0, index) + email.substring(at);
            System.out.println(newEmail);
            scan.close();
        } else {
            System.out.println(email);
            scan.close();

        }

    }
}
