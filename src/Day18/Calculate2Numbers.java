package Day18;
import  java.util.Scanner;
public class Calculate2Numbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){


            System.out.println("Please enter the first number:");
            int num1 = scan.nextInt();
            System.out.println("Please enter a math operator");
            String matOpe = scan.next();
            while (!(matOpe.equals("+")||matOpe.equals("-")||matOpe.equals("*")||matOpe.equals("/")))
            {
                System.out.println("Invalid character. Please re enter again");
                matOpe = scan.next();
            }

            System.out.println("Please enter the second number:");
            int num2 = scan.nextInt();

            int result = matOpe.equals("+")? num1+num2: matOpe.equals("-")?num1- num2:matOpe.equals("*")?num1*num2:num1/num2;

            System.out.println(result);

            System.out.println("Do you wanna continue?");
            String a = scan.next();
            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no")))
            {
                System.out.println("Invalid answer, please repeat again");
                a= scan.next();
            }
            if (a.equalsIgnoreCase("no"))
                break;


        }



scan.close();
    }


}
