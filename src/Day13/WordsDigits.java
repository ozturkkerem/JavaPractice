package Day13;

import java.util.Scanner;

public class WordsDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        if (word.charAt(0) >= '0' && word.charAt(0) <= '9')
            System.out.println("first character is digit");
        else if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
            System.out.println("first character is an uppercase letter");
        else if (word.charAt(0) >= 'a' && word.charAt(0) <= 'b')
            System.out.println("first character is an lowercase letter");
        else System.out.println("first character is a special character");

        scan.close();

    }
}
