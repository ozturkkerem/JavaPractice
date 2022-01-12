package Day17;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int number = 0;  // get the number from user
        int sum = 0; // sum the number since the number negative

        while (number>= 0) {
            System.out.println("Please enter a number");
            number = scan.nextInt();
            if (number<0)
            break;
            sum += number;
        }
        System.out.println(sum);

scan.close();
    }

}
