package Day13;

import java.util.Scanner;

public class Ly_Really {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = scan.next();

        int length = word.length();

            if (word.charAt(length-2) == ('l') && word.charAt(length-1) == 'y')
        System.out.println("really???");
            else
        System.out.println("never mind");

        System.out.println("----------------------------------------");
            scan.close();



    }
}
