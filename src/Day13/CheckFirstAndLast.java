package Day13;

import java.util.Scanner;

public class CheckFirstAndLast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.next();

        int length = word.length();

        if(word.charAt(0) == word.charAt(length-1))
            System.out.println("same");
        else
            System.out.println("not same");



    }
}
