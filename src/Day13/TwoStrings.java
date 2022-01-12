package Day13;

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word");
        String sentences1 = scan.next();
        System.out.println("Enter the second word");
        String sentences2 = scan.next();

        if (sentences1.length() > sentences2.length())
            System.out.println(sentences1);
        else
            System.out.println(sentences2);


    }
}
