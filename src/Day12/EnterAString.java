package Day12;

import java.util.Scanner;

public class EnterAString {
    public static void main(String[] args) {
        System.out.println("Please write a string");
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();

        int length = str1.length();

        if (length == 0)
        System.out.println("string is empty");
        else if (length > 3)
            System.out.println(""+str1.charAt(length-3)+str1.charAt(length-2)+str1.charAt(length-1));
        else
            System.out.println(str1);



    }
}
