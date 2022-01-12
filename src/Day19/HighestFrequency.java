package Day19;

import java.util.Scanner;
public class HighestFrequency {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
    String str = scan.next();
        int max = 0;
        char highC = ' ';
    for (int i = 0; i < str.length(); i++){

        String ch = str.charAt(i)+"";
        int count = 0;

        for (int j = 0; j< str.length(); j++){

            String each = str.charAt(j)+"";

            if (ch.equals(each))
                count++;

        }

        if (count > max) {
            max = count;
            highC = str.charAt(i);
        }

    }

        System.out.println(highC);


    }

}
