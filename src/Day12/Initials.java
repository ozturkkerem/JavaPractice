package Day12;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write 2 names");
        String str1 = scan.next();
        String str2 = scan.next();

        String result = (str1.charAt(0) +"."+str2.charAt(0)).toUpperCase();

        System.out.println(result);
    }

}
