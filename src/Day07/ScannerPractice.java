package Day07;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Ask the user to enter an integer number
        System.out.println("enter an integer number");
        int number = sc.nextInt();
        
        //Ask the user to enter a decimal number
        System.out.println("enter a decimal number");
        double number2 = sc.nextDouble();

        //Ask the user to enter a word number
        System.out.println("enter a word");
        String word = sc.next();

        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
        System.out.println("word = " + word);
    }
}
