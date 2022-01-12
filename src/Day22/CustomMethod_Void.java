package Day22;
import java.util.Scanner;
public class CustomMethod_Void {

    public static void main(String[] args) {

        System.out.println("What is the age: ");
        Scanner scan = new Scanner(System.in);
        checkIfEligible(scan.nextInt());







    }


    public static void checkIfEligible(int  age){

        System.out.println("Hello World!");
        if (age>17)
            System.out.println("Eligible");
else System.out.println("Not Eligible");

    }


}
