package Day09;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Please give an number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if ((number % 3 == 0) && (number %5 == 0)){
            System.out.println("FizzBuzz");
        }
        else if (number % 3 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println("Buzz");
        }

    }
}
