package Day20;
import java.util.Scanner;
public class x {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter a math operator:");
            char operator = scan.next().charAt(0);
            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("Invalid operator. Enter a math operator:");
                operator = scan.next().charAt(0);
            }
            System.out.println("Enter the second number:");
            int num2 = scan.nextInt();
            if (operator == '+') {
                System.out.println(num1 + num2);
            } else if (operator == '-') {
                System.out.println(num1 - num2);
            } else if (operator == '*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 / num2);
            }
            System.out.println("Do you want to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid entry! Please re-enter your answer:");
                System.out.println("Do you want to continue?");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")) {
                System.out.println("Thank you for using Cydeo calculator!");
                break;

            }
          //  scan.close();
        }
    }
    }