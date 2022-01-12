package Day13;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Xcode {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.charAt(0)== 'x') {
            word = word.substring(1);
            System.out.println(word);
        }
        else
        System.out.println(word);

scan.close();



    }
}
