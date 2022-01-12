package Day13;

import java.util.Scanner;

public class Sentences {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentences");
        String sentences = scan.nextLine();
        int length = sentences.length();
        System.out.println(  sentences.charAt(0) +" & "+  sentences.charAt(length-1));



    }
}
