package Day12;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {

        //write a program that can check if the first and last characters of the string are same

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        int length = word.length() -1;

        if (word.charAt(0) == word.charAt(length) )
        System.out.println("same");
        else
        System.out.println("not same");







    }



}
