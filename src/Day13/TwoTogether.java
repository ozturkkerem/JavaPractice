package Day13;

import java.util.Scanner;
public class TwoTogether {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two word");
        String word1 = scan.next(), word2 = scan.next();
        int lengthWord1 = word1.length(), lengthWort2 = word2.length();

        if (word1.charAt(lengthWord1-1) == word2.charAt(0)) {
            word2 = word2.substring(1);
            System.out.println(word1 + word2);
        }
        else
            System.out.println(word1+word2);



    }



}
