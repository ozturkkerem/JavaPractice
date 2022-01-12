package Day07;
import java.util.Scanner;


public class IdentifyNumber2 {
    public static void main(String[] args) {
        System.out.println("Please write a number in your mind! ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;

        System.out.println(number + " is positive number: " + positive);
        System.out.println(number + " is negative number: " + negative);
        System.out.println(number + " is zero number: " + zero);
    }



}
