package Day17;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;


        System.out.println("Please enter the math operator:");
    char ope = scan.next().charAt(0);
    while  (!(ope == '*' ||ope == '/' ||ope == '+' ||ope == '-')) {
        System.out.println("re-enter the operator until user provides a valid operator (+, -, *, /)");
        ope = scan.next().charAt(0);
    }
        switch (ope)
        {
            case '*':
                result= num2*num1;
                break;
            case '/':
                result =num1/num2;
                break;
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;

        }
    scan.close();
        System.out.println(result);
    }





}
