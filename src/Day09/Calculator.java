package Day09;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        //Get the numbers and operator from user
        System.out.println("Please write 2 number  and a math operator");
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        char operator = input.next().charAt(0);
        System.out.println(operator);
        double output = 0;

        //do the math
        if (operator == '+'){
            output = n1 + n2;
        }
        else if(operator == '-'){
            output = n1 - n2;
        }
        else if (operator == '*'){
            output = n1 * n2;
        }
        else if (operator == '/'){
            output = n1 / n2;
        }
        else{
            System.out.println("invalid operator");
        }
        System.out.println(output);
    }
}
