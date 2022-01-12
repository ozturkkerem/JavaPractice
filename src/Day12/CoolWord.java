package Day12;
import java.util.Scanner;

public class CoolWord {
    public static void main(String[] args) {
        System.out.println("Enter 3 letter word");
        Scanner scan = new Scanner(System.in);
                String word = scan.next();
        int length = word.length();

        if (length == 3){
            if (word.charAt(1)=='a')
                System.out.println("Cool word");
            else
                System.out.println("okay word");
        }
                else if (length < 3)
            System.out.println("Word is too short");
                else
            System.out.println("word is too long");



    }


}
