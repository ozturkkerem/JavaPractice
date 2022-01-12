package Day12;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 words:");
        String str1 = scan.next(), str2 = scan.next(), str3 = scan.next();
        int strLength1 = str1.length(), strLength2 = str2.length(), strLength3 = str3.length();

        if (strLength1 == strLength2 && strLength3 == strLength1 )
            System.out.println("All words are same length");
        else if (strLength1 == strLength2 || strLength1 == strLength3 || strLength2 == strLength3 )
            System.out.println("Not Same nor Different lengths");
        else
            System.out.println("All different length");

    }
}
