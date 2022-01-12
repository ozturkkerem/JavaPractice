package Day16;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive numbers: ");

        int number1 = scan.nextInt();

        int number2 = scan.nextInt();
        scan.close();

        if (number1 > 0 && number2 > 0){
            System.out.println(number1*number2);
        }
        else System.out.println("invalid");
    }
}
