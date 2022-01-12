package Day10;
import java.util.Scanner;
public class BiggerNum {
    public static void main(String[] args) {

        System.out.println("Please write three numbers");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt(), number2 = input.nextInt(), number3 = input.nextInt();

        String output = ((number1 > number2) && (number1 > number3))? "n1 is bigger" : ((number2 > number1) && (number2 > number3))? "n2 is bigger" :
                "n3 is bigger";

        System.out.println(output);
    }
}
