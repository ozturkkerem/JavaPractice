package Day12;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.next();;
        int worldLength = word.length();

        if (worldLength == 5)
        {
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }
        else if (worldLength < 5)
            System.out.println("Too short!");
        else
            System.out.println("Too long!");

    }
}
