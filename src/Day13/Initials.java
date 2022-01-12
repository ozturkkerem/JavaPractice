package Day13;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first word");
            String word1 = scan.next();
        System.out.println("Enter the second word");
        String word2 = scan.next();

        String word3 = word1.charAt(0) + "." + word2.charAt(0);
        word3 = word3.toUpperCase();
        System.out.println(word3);

    }
}
