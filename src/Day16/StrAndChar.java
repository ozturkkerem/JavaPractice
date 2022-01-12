package Day16;

import java.util.Scanner;

public class StrAndChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // ask for data
        System.out.println("Enter a sentences:");
        String word = scan.nextLine();
        System.out.println("Enter a char:"); // ask for data
        String alphabetEnter = scan.next();

        char alphabet = alphabetEnter.charAt(0);
        int counter = 0;
        int lengthOfWord = word.length();
        char ch = 'a';
        for (int i = 0; i < lengthOfWord - 1; i++) {


            ch = word.charAt(i);

            if (ch == alphabet)
                counter++;
        }
        scan.close();
        System.out.println(counter);
    }
}
